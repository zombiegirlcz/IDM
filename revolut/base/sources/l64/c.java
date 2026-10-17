package l64;

import iu3.h;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192354a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.REVOLUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f192354a = iArr;
    }
}
