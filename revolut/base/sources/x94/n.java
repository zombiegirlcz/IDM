package x94;

import ip0.yo0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303558b;

    static {
        int[] iArr = new int[yo0.values().length];
        try {
            iArr[yo0.LOADING_FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f303557a = iArr;
        int[] iArr2 = new int[ju3.d.values().length];
        try {
            iArr2[ju3.d.BOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ju3.d.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f303558b = iArr2;
    }
}
