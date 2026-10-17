package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCService;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class RepeatLastMessageCommand extends RPCCommand {
    /* JADX WARN: Illegal instructions before constructor call */
    public RepeatLastMessageCommand() {
        SecurityMode securityMode = SecurityMode.NONE;
        super(Constants.REPEAT_LAST_MESSAGE_COMMAND, securityMode, securityMode);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand, com.youTransactor.uCube.AbstractTask
    public void start() {
        RPCService.sendFirst(this);
    }
}
