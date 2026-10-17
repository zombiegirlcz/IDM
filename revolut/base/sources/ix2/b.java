package ix2;

import mxl.k;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169329a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.BASE_COLOR_MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.NORMAL_MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.ROUGHNESS_MAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.METALLIC_MAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f169329a = iArr;
    }
}
