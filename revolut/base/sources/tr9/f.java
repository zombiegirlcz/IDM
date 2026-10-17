package tr9;

import oq9.b0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273770a;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.MARK_AS_PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273770a = iArr;
    }
}
