package grd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f146014b;

    static {
        int[] iArr = new int[jrd.a.values().length];
        try {
            iArr[jrd.a.YEAR_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jrd.a.MONTH_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f146013a = iArr;
        int[] iArr2 = new int[vzi.e.values().length];
        try {
            iArr2[vzi.e.AMOUNT_PICKER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_BOTTOM_SHEET.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_DATE_PICKER.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vzi.e.DROPDOWN_NATIVE_DATE_PICKER.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vzi.e.TEXT_LINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vzi.e.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f146014b = iArr2;
    }
}
