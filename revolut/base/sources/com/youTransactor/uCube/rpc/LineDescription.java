package com.youTransactor.uCube.rpc;

/* JADX INFO: loaded from: classes17.dex */
public class LineDescription {
    public byte font;
    public String text;
    public byte xPos;
    public byte yPos;

    public LineDescription(String str) {
        this.text = str;
        this.font = (byte) 0;
        this.xPos = (byte) 0;
        this.yPos = (byte) 0;
    }

    public LineDescription(String str, byte b4, byte b5, byte b7) {
        this.text = str;
        this.font = b4;
        this.xPos = b5;
        this.yPos = b7;
    }
}
