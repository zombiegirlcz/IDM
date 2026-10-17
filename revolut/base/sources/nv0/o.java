package nv0;

import aw0.hb;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219382a;

    static {
        int[] iArr = new int[hb.values().length];
        try {
            iArr[hb.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hb.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hb.Default.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f219382a = iArr;
    }
}
