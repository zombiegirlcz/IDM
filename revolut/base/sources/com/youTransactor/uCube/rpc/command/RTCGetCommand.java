package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class RTCGetCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Date f107703m;

    public RTCGetCommand() {
        super(Constants.RTC_GET, SecurityMode.NONE, SecurityMode.SIGNED);
    }

    public Date getDate() {
        return this.f107703m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage != null && rPCMessage.getData() != null && this.response.getData().length >= 1) {
            byte[] bArr = new byte[7];
            System.arraycopy(this.response.getData(), 0, bArr, 0, 7);
            try {
                this.f107703m = new SimpleDateFormat("yyyyMMddhhmmss", Locale.ENGLISH).parse(Tools.bytesToHex(bArr));
                return true;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
