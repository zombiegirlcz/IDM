package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.log.LogManager;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class RTCSetCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f107704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f107705n;

    public RTCSetCommand(Date date) {
        super(Constants.RTC_SET, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        Locale locale = Locale.FRANCE;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ssmmhh", locale);
        String str = simpleDateFormat.format(date);
        this.f107704m = str;
        String str2 = simpleDateFormat2.format(date);
        this.f107705n = str2;
        LogManager.d("date : " + date.toString() + " converted date :" + str + " time: " + str2);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[8];
        System.arraycopy(Tools.hexStringToByteArray(this.f107704m), 0, bArr, 0, 4);
        System.arraycopy(Tools.hexStringToByteArray(this.f107705n), 0, bArr, 4, 3);
        bArr[7] = 0;
        return bArr;
    }
}
