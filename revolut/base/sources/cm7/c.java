package cm7;

import kl7.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25156a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.TEMPORARY_CERTIFICATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.ANNUAL_CERTIFICATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f25156a = iArr;
    }
}
