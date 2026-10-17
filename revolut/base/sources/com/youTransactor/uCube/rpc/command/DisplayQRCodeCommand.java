package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class DisplayQRCodeCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f107683m;

    public DisplayQRCodeCommand() {
        super(Constants.DISPLAY_QR_CODE_COMMAND);
        setInputSecurityMode(SecurityMode.SIGNED_NOT_CHECKED);
        setOutputSecurityMode(SecurityMode.SIGNED);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArrStringToBytesASCII = Tools.stringToBytesASCII(this.f107683m);
        byte bMin = (byte) Math.min(bArrStringToBytesASCII.length, 254);
        byte[] bArr = new byte[bMin + 5];
        bArr[0] = 0;
        bArr[1] = -126;
        int i = bMin + 1;
        bArr[2] = (byte) (i / 256);
        bArr[3] = (byte) (i % 256);
        System.arraycopy(bArrStringToBytesASCII, 0, bArr, 4, bArrStringToBytesASCII.length);
        bArr[bMin + 4] = 0;
        return bArr;
    }

    public DisplayQRCodeCommand(String str) {
        this();
        this.f107683m = str;
    }
}
