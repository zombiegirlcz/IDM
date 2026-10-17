package rrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f256813b;

    static {
        int[] iArr = new int[vzi.f.values().length];
        try {
            iArr[vzi.f.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vzi.f.INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vzi.f.MONEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vzi.f.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f256812a = iArr;
        int[] iArr2 = new int[vzi.e.values().length];
        try {
            iArr2[vzi.e.TEXT_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vzi.e.AMOUNT_PICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_MODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_BOTTOM_SHEET.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_DATE_PICKER.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_NATIVE_DATE_PICKER.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[vzi.e.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f256813b = iArr2;
    }
}
