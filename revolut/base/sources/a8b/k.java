package a8b;

import r5b.q;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2154a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2154a = iArr;
    }
}
