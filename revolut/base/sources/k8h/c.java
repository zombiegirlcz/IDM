package k8h;

import xzg.q;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f182161b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.COMMODITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f182160a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.COMMODITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[a.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f182161b = iArr2;
    }
}
