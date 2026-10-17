package hnk;

import hha.u0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154133a;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.VAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.CENTRAL_GOOD_AND_SERVICES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u0.INTEGRATED_GOOD_AND_SERVICES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u0.STATE_GOOD_AND_SERVICES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u0.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f154133a = iArr;
    }
}
