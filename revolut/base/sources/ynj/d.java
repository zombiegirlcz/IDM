package ynj;

import dej.f3;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315481b;

    static {
        int[] iArr = new int[f3.values().length];
        try {
            iArr[f3.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f3.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f3.NON_ELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f3.ELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f3.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f315480a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.BORDERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c.NOT_BORDERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f315481b = iArr2;
    }
}
