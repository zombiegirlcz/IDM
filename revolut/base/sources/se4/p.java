package se4;

import yy3.x;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262117a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f262117a = iArr;
    }
}
