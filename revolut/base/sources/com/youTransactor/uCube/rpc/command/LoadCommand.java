package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class LoadCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinkedList f107702m;

    public LoadCommand() {
        super(Constants.LOAD_COMMAND, SecurityMode.SIGNED_CIPHERED, SecurityMode.SIGNED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        LinkedList linkedList = this.f107702m;
        if (linkedList == null || linkedList.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) this.f107702m.remove(0);
        byte[] bArr2 = new byte[bArr.length + 3];
        bArr2[0] = this.f107702m.isEmpty() ? (byte) 1 : (byte) 0;
        bArr2[1] = (byte) (bArr.length / 256);
        bArr2[2] = (byte) (bArr.length % 256);
        System.arraycopy(bArr, 0, bArr2, 3, bArr.length);
        return bArr2;
    }

    public int getBlockListSize() {
        LinkedList linkedList = this.f107702m;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand, com.youTransactor.uCube.rpc.IRPCMessageHandler
    public void processMessage(RPCMessage rPCMessage) {
        LinkedList linkedList;
        if (rPCMessage == null || rPCMessage.getStatus() != 0 || (linkedList = this.f107702m) == null || linkedList.isEmpty()) {
            super.processMessage(rPCMessage);
        } else {
            this.i = null;
            start();
        }
    }

    public void setBlockList(List<byte[]> list) {
        this.f107702m = new LinkedList(list);
    }

    public LoadCommand(List<byte[]> list) {
        this();
        setBlockList(list);
    }
}
