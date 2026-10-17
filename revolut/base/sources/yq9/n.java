package yq9;

import ar9.x;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316022a;

    static {
        int[] iArr = new int[x.values().length];
        f316022a = iArr;
        try {
            iArr[x.MARK_AS_PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f316022a[x.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
