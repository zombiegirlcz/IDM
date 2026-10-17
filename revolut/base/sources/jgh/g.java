package jgh;

import jel.e0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174049a;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.NORTH_AMERICA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.EUROPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.ASIA_PACIFIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.DIVERSIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e0.REST_OF_THE_WORLD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f174049a = iArr;
    }
}
