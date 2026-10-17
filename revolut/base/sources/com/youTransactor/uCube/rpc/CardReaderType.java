package com.youTransactor.uCube.rpc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public enum CardReaderType {
    ICC("ICC", "Chip"),
    NFC("NFC", "NFC");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f107607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107608b;

    CardReaderType(String str, String str2) {
        this.f107607a = b;
        this.f107608b = str2;
    }

    public byte getCode() {
        return this.f107607a;
    }

    public String getLabel() {
        return this.f107608b;
    }

    public static String getLabel(byte b4) {
        HashMap map = new HashMap();
        CardReaderType cardReaderType = ICC;
        map.put(Byte.valueOf(cardReaderType.f107607a), cardReaderType.f107608b);
        CardReaderType cardReaderType2 = NFC;
        map.put(Byte.valueOf(cardReaderType2.f107607a), cardReaderType2.f107608b);
        return (String) map.get(Byte.valueOf(b4));
    }
}
