package cee;

import tde.q;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23479a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.Bell.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.ArrowRightLeft.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f23479a = iArr;
    }
}
