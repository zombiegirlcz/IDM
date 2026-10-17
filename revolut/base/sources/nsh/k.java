package nsh;

import op0.q;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218879a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.DYNAMIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218879a = iArr;
    }
}
