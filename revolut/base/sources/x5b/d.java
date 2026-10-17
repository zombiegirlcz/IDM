package x5b;

import r5b.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302927a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.BULLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.NUMBERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f302927a = iArr;
    }
}
