package rrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f256817b;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TOTAL_ASSETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.TOTAL_ASSETS_AI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.NOTE_WONT_VERIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.VALUES_NOT_VERIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.VALUES_NOT_VERIFIED_PROPERTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f256816a = iArr;
        int[] iArr2 = new int[vzi.d.values().length];
        try {
            iArr2[vzi.d.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vzi.d.AI_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vzi.d.STATIC_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vzi.d.MIXED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f256817b = iArr2;
    }
}
