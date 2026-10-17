package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DisplayChoiceCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f107669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f107670n;
    public byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f107672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107675t;
    public byte u;

    public DisplayChoiceCommand() {
        super(Constants.DISPLAY_LISTBOX_WITHOUT_KI_COMMAND);
        this.o = (byte) 60;
        this.f107671p = -1;
        this.f107672q = false;
        this.f107673r = 0;
        this.f107674s = 0;
        this.f107675t = 0;
        this.u = (byte) 0;
        setInputSecurityMode(SecurityMode.SIGNED_NOT_CHECKED);
        setOutputSecurityMode(SecurityMode.SIGNED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        int i;
        List list = this.f107669m;
        if (list == null || list.isEmpty() || this.f107669m.size() > 10) {
            return super.createPayload();
        }
        byte[] bArr = new byte[200];
        byte length = 0;
        for (int i2 = 0; i2 < this.f107669m.size(); i2++) {
            length = (byte) (((String) this.f107669m.get(i2)).length() + 1 + length);
        }
        bArr[0] = this.o;
        bArr[1] = (byte) this.f107673r;
        String str = this.f107670n;
        int i3 = 3;
        if (str == null) {
            bArr[2] = 1;
            bArr[3] = 0;
            i = 4;
        } else {
            bArr[2] = (byte) (str.length() + 1);
            byte[] bArrArray = StandardCharsets.UTF_8.encode(CharBuffer.wrap(this.f107670n)).array();
            int i5 = 0;
            while (i5 < this.f107670n.length()) {
                bArr[i3] = bArrArray[i5];
                i5++;
                i3++;
            }
            i = i3 + 1;
            bArr[i3] = 0;
        }
        bArr[i] = (byte) this.f107675t;
        bArr[i + 1] = this.u;
        int i6 = i + 3;
        bArr[i + 2] = (byte) this.f107674s;
        int i21 = i + 4;
        bArr[i6] = length;
        int i22 = 0;
        while (i22 < this.f107669m.size()) {
            byte[] bArrArray2 = StandardCharsets.UTF_8.encode(CharBuffer.wrap((CharSequence) this.f107669m.get(i22))).array();
            int i32 = 0;
            while (i32 < ((String) this.f107669m.get(i22)).length()) {
                bArr[i21] = bArrArray2[i32];
                i32++;
                i21++;
            }
            bArr[i21] = 0;
            i22++;
            i21++;
        }
        return Arrays.copyOfRange(bArr, 0, i21);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public RPCCommandStatus getCommandStatusValue() {
        return this.f107672q ? RPCCommandStatus.CANCELED : RPCCommandStatus.SUCCESS;
    }

    public int getSelectedIndex() {
        return this.f107671p;
    }

    public String getSelectedItem() {
        int i;
        List list = this.f107669m;
        if (list == null || (i = this.f107671p) < 0 || i >= list.size()) {
            return null;
        }
        return (String) this.f107669m.get(this.f107671p);
    }

    public byte getTimeout() {
        return this.o;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean isValidResponse() {
        return this.response.getStatus() == 0 || this.response.getStatus() == -114;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        try {
            this.f107671p = this.response.getData()[0] - 1;
        } catch (Exception unused) {
            this.f107671p = -1;
            this.f107672q = true;
        }
        return true;
    }

    public void setChoiceList(List<String> list) {
        this.f107669m = list;
    }

    public void setScrollKeyLabel(byte b4) {
        this.u = b4;
    }

    public void setScrollKeyLabelFont(int i) {
        this.f107675t = i;
    }

    public void setTextFont(int i) {
        this.f107674s = i;
    }

    public void setTimeout(int i) {
        this.o = (byte) i;
    }

    public void setTitle(String str) {
        this.f107670n = str;
    }

    public void setTitleFont(int i) {
        this.f107673r = i;
    }

    public DisplayChoiceCommand(List<String> list) {
        this();
        setChoiceList(list);
    }

    public DisplayChoiceCommand(List<String> list, int i, String str) {
        this();
        setChoiceList(list);
        setTimeout(i);
        setTitle(str);
    }
}
