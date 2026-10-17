package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;

/* JADX INFO: loaded from: classes17.dex */
public class EnterSecureSessionCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f107685m;

    public EnterSecureSessionCommand() {
        super(Constants.ENTER_SECURED_SESSION);
    }

    public byte[] getKsn() {
        return this.f107685m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null) {
            return true;
        }
        this.f107685m = rPCMessage.getData();
        return true;
    }
}
