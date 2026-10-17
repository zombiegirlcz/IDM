package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class GetPlainTagCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f107687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map f107688n;

    public GetPlainTagCommand() {
        super(Constants.GET_PLAIN_TAG_VALUE_COMMAND, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        int[] iArr = this.f107687m;
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

    public Map<Integer, byte[]> getResult() {
        return this.f107688n;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean isValidResponse() {
        return this.response.getStatus() == 0 || this.response.getStatus() == -94;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        int[] iArr = this.f107687m;
        if (iArr != null) {
            if (iArr.length == 1) {
                HashMap map = new HashMap();
                this.f107688n = map;
                map.put(Integer.valueOf(this.f107687m[0]), this.response.getData());
            } else {
                this.f107688n = TLV.parse(this.response.getData());
            }
        }
        return true;
    }

    public void setRequestedTagList(int[] iArr) {
        this.f107687m = iArr;
    }

    public GetPlainTagCommand(int[] iArr) {
        this();
        this.f107687m = iArr;
    }
}
