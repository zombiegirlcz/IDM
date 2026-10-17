package s47;

import ds6.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259799a;

    static {
        int[] iArr = new int[f0.values().length];
        try {
            iArr[f0.INBOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f0.OUTBOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f259799a = iArr;
    }
}
