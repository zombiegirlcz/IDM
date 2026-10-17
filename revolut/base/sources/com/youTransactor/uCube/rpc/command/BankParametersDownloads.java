package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class BankParametersDownloads extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f107658m;

    /* JADX WARN: Illegal instructions before constructor call */
    public BankParametersDownloads(byte[] bArr) {
        SecurityMode securityMode = SecurityMode.SIGNED;
        super(Constants.BANK_PARAMETERS_DOWNLOADS, securityMode, securityMode);
        this.f107658m = bArr;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        return this.f107658m;
    }
}
