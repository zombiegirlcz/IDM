package vt9;

import io3.l;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291932a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f291932a = iArr;
    }
}
