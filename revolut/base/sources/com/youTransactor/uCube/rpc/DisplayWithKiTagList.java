package com.youTransactor.uCube.rpc;

/* JADX INFO: loaded from: classes17.dex */
public class DisplayWithKiTagList {
    public byte correctionKeyAction;
    public byte displayWay;
    public byte firstDigitTimeout;
    public byte interDigitTimeout;
    public byte item;
    public byte maxKey;
    public byte minKey;
    public byte scenario;
    public byte totalDigitTimeout;

    public DisplayWithKiTagList(byte b4, byte b5, byte b7, byte b13, byte b15, byte b17, byte b40) {
        this.minKey = b4;
        this.maxKey = b5;
        this.firstDigitTimeout = b7;
        this.interDigitTimeout = b13;
        this.totalDigitTimeout = b15;
        this.correctionKeyAction = b17;
        this.displayWay = b40;
    }

    public DisplayWithKiTagList(byte b4, byte b5, byte b7, byte b13, byte b15, byte b17, byte b40, byte b61, byte b64) {
        this.minKey = b4;
        this.maxKey = b5;
        this.firstDigitTimeout = b7;
        this.interDigitTimeout = b13;
        this.totalDigitTimeout = b15;
        this.correctionKeyAction = b17;
        this.displayWay = b40;
        this.scenario = b61;
        this.item = b64;
    }
}
