package com.github.devnied.emvnfccard.enums;

import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes16.dex */
public enum CommandEnum {
    SELECT(0, Constants.TAG_GPI_VERSION, 4, 0),
    READ_RECORD(0, 178, 0, 0),
    GPO(128, 168, 0, 0),
    GET_DATA(128, 202, 0, 0),
    GET_RESPONSE(0, 12, 0, 0);


    /* JADX INFO: renamed from: cla, reason: collision with root package name */
    private final int f37241cla;
    private final int ins;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final int f37242p1;
    private final int p2;

    CommandEnum(int i, int i2, int i3, int i5) {
        this.f37241cla = i;
        this.ins = i2;
        this.f37242p1 = i3;
        this.p2 = i5;
    }

    public int getCla() {
        return this.f37241cla;
    }

    public int getIns() {
        return this.ins;
    }

    public int getP1() {
        return this.f37242p1;
    }

    public int getP2() {
        return this.p2;
    }
}
