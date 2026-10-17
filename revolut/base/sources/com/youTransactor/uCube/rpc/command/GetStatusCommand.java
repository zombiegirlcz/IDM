package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import com.youTransactor.uCube.rpc.TerminalStatus;

/* JADX INFO: loaded from: classes17.dex */
public class GetStatusCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TerminalStatus f107690m;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetStatusCommand() {
        SecurityMode securityMode = SecurityMode.NONE;
        super(Constants.GET_STATUS_COMMAND, securityMode, securityMode);
    }

    public TerminalStatus getTerminalStatus() {
        return this.f107690m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null || rPCMessage.getData() == null || this.response.getData().length < 1) {
            return false;
        }
        byte b4 = this.response.getData()[0];
        if (b4 == 1) {
            this.f107690m = TerminalStatus.processOnGoing;
        } else if (b4 == 0) {
            this.f107690m = TerminalStatus.noProcessOnGoing;
        } else {
            this.f107690m = TerminalStatus.unknown;
        }
        return true;
    }
}
