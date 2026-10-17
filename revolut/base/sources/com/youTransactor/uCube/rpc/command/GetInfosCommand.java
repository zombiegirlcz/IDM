package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class GetInfosCommand extends RPCCommand {
    public GetInfosCommand(int... iArr) {
        super(Constants.GET_INFO_COMMAND, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED_CIPHERED);
        this.i = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.i[i] = (byte) iArr[i];
        }
    }

    @Deprecated
    public byte[] getTlv() {
        return getResponseData();
    }
}
