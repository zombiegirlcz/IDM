package mhg;

import hfg.e0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f205569a;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.ECONOMY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.PREMIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.FIRST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f205569a = iArr;
    }
}
