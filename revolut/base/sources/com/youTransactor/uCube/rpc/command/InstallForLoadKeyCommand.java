package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;

/* JADX INFO: loaded from: classes17.dex */
public class InstallForLoadKeyCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f107700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f107701n;

    public InstallForLoadKeyCommand() {
        super(Constants.INSTALL_FOR_LOAD_KEY_COMMAND);
    }

    public byte[] getCaProd() {
        return this.f107700m;
    }

    public byte[] getFullData() {
        return this.response.getData();
    }

    public byte[] getkKek() {
        return this.f107701n;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        byte[] data = this.response.getData();
        int iMakeShort = Tools.makeShort(data[0], data[1]);
        if (iMakeShort <= 0) {
            return false;
        }
        byte[] bArr = new byte[iMakeShort];
        this.f107700m = bArr;
        System.arraycopy(data, 2, bArr, 0, iMakeShort);
        int i = iMakeShort + 3;
        byte b4 = data[iMakeShort + 2];
        int i2 = iMakeShort + 4;
        int iMakeShort2 = Tools.makeShort(b4, data[i]);
        if (iMakeShort2 <= 0) {
            this.f107700m = null;
            return false;
        }
        byte[] bArr2 = new byte[iMakeShort2];
        this.f107701n = bArr2;
        System.arraycopy(data, i2, bArr2, 0, iMakeShort2);
        return true;
    }
}
