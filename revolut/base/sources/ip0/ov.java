package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f165731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f165732c;

    static {
        int[] iArr = new int[aw0.v1.values().length];
        try {
            iArr[aw0.v1.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aw0.v1.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f165730a = iArr;
        int[] iArr2 = new int[jv.values().length];
        try {
            iArr2[jv.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jv.EMPHASISED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f165731b = iArr2;
        int[] iArr3 = new int[gv.values().length];
        try {
            iArr3[gv.BOTTOM_TO_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[gv.LEFT_TO_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[gv.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f165732c = iArr3;
    }
}
