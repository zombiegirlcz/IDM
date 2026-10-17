package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;

/* JADX INFO: loaded from: classes17.dex */
public class PowerOffCommand extends RPCCommand {
    public PowerOffCommand() {
        super(Constants.POWER_OFF);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        return true;
    }
}
