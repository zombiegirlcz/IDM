package dq5;

import bq5.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116917a;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f116917a = iArr;
    }
}
