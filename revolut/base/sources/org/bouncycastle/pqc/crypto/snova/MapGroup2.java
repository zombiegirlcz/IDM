package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
class MapGroup2 {

    /* JADX INFO: renamed from: f11, reason: collision with root package name */
    public final byte[][][][] f228881f11;

    /* JADX INFO: renamed from: f12, reason: collision with root package name */
    public final byte[][][][] f228882f12;

    /* JADX INFO: renamed from: f21, reason: collision with root package name */
    public final byte[][][][] f228883f21;

    public MapGroup2(SnovaParameters snovaParameters) {
        int m3 = snovaParameters.getM();
        int v = snovaParameters.getV();
        int o = snovaParameters.getO();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.f228881f11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, v, v, lsq);
        this.f228882f12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, v, o, lsq);
        this.f228883f21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, o, v, lsq);
    }
}
