package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class GetSecuredTagCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f107689m;

    public GetSecuredTagCommand() {
        super(Constants.GET_SECURED_TAG_VALUE_COMMAND, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED_CIPHERED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        int[] iArr = this.f107689m;
        if (iArr == null) {
            return super.createPayload();
        }
        byte[] bArr = new byte[Constants.MAX_RPC_PACKET_SIZE];
        int iWriteTagID = 0;
        for (int i : iArr) {
            iWriteTagID += TLV.writeTagID(i, bArr, iWriteTagID);
        }
        return Arrays.copyOf(bArr, iWriteTagID);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        return true;
    }

    public void setRequestedTagList(int[] iArr) {
        this.f107689m = iArr;
    }

    public GetSecuredTagCommand(int[] iArr) {
        this();
        this.f107689m = iArr;
    }
}
