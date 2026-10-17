package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;

/* JADX INFO: loaded from: classes17.dex */
public class WaitCardCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f107746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f107747n;
    public byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f107748p;

    public WaitCardCommand(byte[] bArr) {
        super(Constants.CARD_WAIT_INSERTION_COMMAND);
        this.f107747n = 0;
        this.f107746m = bArr;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = this.f107746m;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length] = (byte) this.f107747n;
        return bArr2;
    }

    public byte getActivatedReader() {
        return this.o;
    }

    public int getTimeout() {
        return this.f107747n;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        byte b4 = this.response.getData()[0];
        this.o = b4;
        if (b4 == 17) {
            byte b5 = this.response.getData()[1];
            this.f107748p = new byte[this.response.getData()[2]];
            byte[] data = this.response.getData();
            byte[] bArr = this.f107748p;
            System.arraycopy(data, 3, bArr, 0, bArr.length);
        }
        return true;
    }

    public void setTimeout(int i) {
        this.f107747n = i;
    }

    public WaitCardCommand(byte[] bArr, int i) {
        this(bArr);
        setTimeout(i);
    }
}
