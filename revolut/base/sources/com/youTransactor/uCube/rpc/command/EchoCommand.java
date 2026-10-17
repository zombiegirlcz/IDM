package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class EchoCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f107684m;

    /* JADX WARN: Illegal instructions before constructor call */
    public EchoCommand() {
        SecurityMode securityMode = SecurityMode.NONE;
        super(Constants.ECHO, securityMode, securityMode);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        return this.f107684m;
    }

    public void setData(byte[] bArr) {
        this.f107684m = bArr;
    }
}
