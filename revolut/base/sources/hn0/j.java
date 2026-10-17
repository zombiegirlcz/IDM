package hn0;

import rm0.r;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154022a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.V1_PKCS1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.V2_OAEP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f154022a = iArr;
    }
}
