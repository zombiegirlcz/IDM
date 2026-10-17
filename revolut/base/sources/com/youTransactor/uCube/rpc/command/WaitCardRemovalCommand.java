package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;

/* JADX INFO: loaded from: classes17.dex */
public class WaitCardRemovalCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107749m;

    public WaitCardRemovalCommand() {
        super(Constants.CARD_WAIT_REMOVAL_COMMAND);
        this.f107749m = 30;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        return new byte[]{17, (byte) this.f107749m};
    }

    public int getTimeout() {
        return this.f107749m;
    }

    public void setTimeout(int i) {
        if (i < 0 || i > 255) {
            return;
        }
        this.f107749m = i;
    }
}
