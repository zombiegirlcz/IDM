package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class InstallForLoadCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f107698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f107699n;
    public byte o;

    public InstallForLoadCommand() {
        super(Constants.INSTALL_FOR_LOAD_COMMAND, SecurityMode.SIGNED_CIPHERED, SecurityMode.SIGNED);
        this.o = (byte) -1;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = this.f107698m;
        int length = bArr.length;
        byte[] bArr2 = this.f107699n;
        byte[] bArr3 = new byte[length + (bArr2 != null ? bArr2.length : 0) + 3];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        int length2 = this.f107698m.length;
        int i = length2 + 1;
        bArr3[length2] = this.o;
        byte[] bArr4 = this.f107699n;
        if (bArr4 == null) {
            bArr3[i] = 0;
            bArr3[length2 + 2] = 0;
            return bArr3;
        }
        bArr3[i] = 1;
        bArr3[length2 + 2] = 0;
        System.arraycopy(bArr4, 0, bArr3, length2 + 3, bArr4.length);
        return bArr3;
    }

    public void setCipheredKey(byte[] bArr) {
        this.f107699n = bArr;
    }

    public void setEncryptionMethod(byte b4) {
        this.o = b4;
    }

    public void setOptionalParameterLength(short s2) {
    }

    public void setSignature(byte[] bArr) {
        this.f107698m = bArr;
    }
}
