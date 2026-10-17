package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class GetEMVParametersCommand extends RPCCommand {
    public GetEMVParametersCommand() {
        super(Constants.BANK_PARAMETERS_GET, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
    }
}
