package lt0;

import aw0.z3;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f199746b;

    static {
        int[] iArr = new int[z3.values().length];
        try {
            iArr[z3.ALWAYS_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z3.HIDE_WHEN_CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f199745a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f199746b = iArr2;
    }
}
