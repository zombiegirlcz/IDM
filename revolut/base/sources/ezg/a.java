package ezg;

import fzg.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130938a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.BY_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.BY_TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.BY_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f130938a = iArr;
    }
}
