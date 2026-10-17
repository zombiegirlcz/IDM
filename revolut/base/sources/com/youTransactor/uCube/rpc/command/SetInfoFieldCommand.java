package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class SetInfoFieldCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f107706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f107707n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107708p;

    public SetInfoFieldCommand() {
        super(Constants.SET_INFO_FIELD_COMMAND);
        this.f107707n = false;
        this.f107708p = -1;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        int length;
        byte[] bArrStringToBytesASCII;
        byte[] bArr = new byte[255];
        if (this.f107707n) {
            bArr[0] = -58;
            bArr[1] = 1;
            bArr[2] = this.f107706m;
            length = 3;
        } else {
            length = 0;
        }
        String str = this.o;
        if (str != null && (bArrStringToBytesASCII = Tools.stringToBytesASCII(str)) != null) {
            int i = length + 1;
            bArr[length] = -31;
            int i2 = length + 2;
            bArr[i] = (byte) bArrStringToBytesASCII.length;
            System.arraycopy(bArrStringToBytesASCII, 0, bArr, i2, bArrStringToBytesASCII.length);
            length = i2 + bArrStringToBytesASCII.length;
        }
        int i3 = this.f107708p;
        if (i3 >= 0) {
            bArr[length] = -4;
            int i5 = length + 2;
            bArr[length + 1] = 1;
            length += 3;
            bArr[i5] = (byte) i3;
        }
        return Arrays.copyOfRange(bArr, 0, length);
    }

    public void setMerchantLocale(String str) {
        this.o = str;
    }

    public void setMode(int i) {
        this.f107708p = i;
    }

    public void setPowerTimeout(byte b4) {
        this.f107706m = b4;
        this.f107707n = true;
    }
}
