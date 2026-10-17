package iq5;

import wk5.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f167801b;

    static {
        int[] iArr = new int[ko5.c.values().length];
        try {
            iArr[ko5.c.SCREENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ko5.c.FAILED_SCREENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f167800a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.EXCHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f167801b = iArr2;
    }
}
