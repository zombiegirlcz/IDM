package cqi;

import rp0.p;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108137b;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.PROGRAMMATICALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108136a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f108137b = iArr2;
    }
}
