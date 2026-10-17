package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;

/* JADX INFO: loaded from: classes17.dex */
public class ExitSecureSessionCommand extends RPCCommand {
    public ExitSecureSessionCommand() {
        super(Constants.EXIT_SECURED_SESSION);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public RPCCommandStatus getCommandStatusValue() {
        return RPCCommandStatus.SUCCESS;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean isValidResponse() {
        return this.response.getStatus() == 0 || this.response.getStatus() == -287 || this.response.getStatus() == -179;
    }
}
