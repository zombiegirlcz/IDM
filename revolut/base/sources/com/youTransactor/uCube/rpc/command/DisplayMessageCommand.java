package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
public class DisplayMessageCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f107677n;
    public byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f107678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f107679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f107680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f107681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107682t;

    public DisplayMessageCommand() {
        super(Constants.DISPLAY_WITHOUT_KI_COMMAND);
        this.f107676m = 0;
        this.f107677n = (byte) 0;
        this.o = (byte) 0;
        this.f107678p = (byte) 0;
        this.f107679q = (byte) 0;
        this.f107680r = (byte) 0;
        this.f107682t = 1;
        setInputSecurityMode(SecurityMode.SIGNED_NOT_CHECKED);
        setOutputSecurityMode(SecurityMode.SIGNED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte bMin = (byte) Math.min(this.f107681s.length, 254);
        byte[] bArr = new byte[bMin + 9];
        bArr[0] = (byte) this.f107676m;
        bArr[1] = this.f107677n;
        bArr[2] = this.o;
        bArr[3] = (byte) this.f107682t;
        bArr[4] = this.f107680r;
        bArr[5] = (byte) (bMin + 1);
        System.arraycopy(this.f107681s, 0, bArr, 6, bMin);
        bArr[bMin + 6] = 0;
        bArr[bMin + 7] = this.f107678p;
        bArr[bMin + 8] = this.f107679q;
        return bArr;
    }

    public int getTimeout() {
        return this.f107676m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean isValidResponse() {
        if (this.response.getStatus() != 0) {
            return this.response.getStatus() == -2 && this.f107676m > 0;
        }
        return true;
    }

    public void setAbortKey(byte b4) {
        this.f107677n = b4;
    }

    public void setClearConfig(byte b4) {
        this.o = b4;
    }

    public void setFont(byte b4) {
        this.f107680r = b4;
    }

    public void setNumberOfLine(int i) {
        this.f107682t = i;
    }

    public void setTimeout(int i) {
        this.f107676m = i;
    }

    public void setXPosition(byte b4) {
        this.f107678p = b4;
    }

    public void setYPosition(byte b4) {
        this.f107679q = b4;
    }

    public DisplayMessageCommand(String str) {
        this();
        this.f107681s = str.getBytes(StandardCharsets.ISO_8859_1);
    }

    public DisplayMessageCommand(String str, String str2) {
        this();
        try {
            this.f107681s = str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public DisplayMessageCommand(String str, boolean z) {
        this();
        if (z) {
            this.f107681s = Tools.hexStringToByteArray(str);
        } else {
            this.f107681s = str.getBytes(StandardCharsets.ISO_8859_1);
        }
    }
}
