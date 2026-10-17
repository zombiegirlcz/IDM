package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;

/* JADX INFO: loaded from: classes17.dex */
public class CancelCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f107661m;

    public CancelCommand() {
        super(Constants.CANCEL_COMMAND);
        this.f107661m = false;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        return this.f107661m ? new byte[]{-1, -2} : super.createPayload();
    }

    public void setWithMessage(boolean z) {
        this.f107661m = z;
    }
}
