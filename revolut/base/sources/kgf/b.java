package kgf;

import io3.l;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f183978a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f183978a = iArr;
    }
}
