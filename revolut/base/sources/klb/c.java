package klb;

import mcd.d;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f185417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f185418c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.STRIKETHROUGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f185416a = iArr;
        int[] iArr2 = new int[com.revolut.feature.shared.savings.models.info_sheets.a.values().length];
        try {
            iArr2[com.revolut.feature.shared.savings.models.info_sheets.a.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.info_sheets.a.CENTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f185417b = iArr2;
        int[] iArr3 = new int[mcd.a.values().length];
        try {
            iArr3[mcd.a.GREY_TON_50.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[mcd.a.GREY_TON_100.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[mcd.a.PERFORMANCE_POSITIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[mcd.a.ACCENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[mcd.a.ORANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[mcd.a.FOREGROUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[mcd.a.GREEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[mcd.a.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f185418c = iArr3;
        int[] iArr4 = new int[mcd.b.values().length];
        try {
            iArr4[mcd.b.INFO_OUTLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[mcd.b.DOCUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[mcd.b.CHEVRON_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[mcd.b.CASH.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[mcd.b.BALANCE_SHEET.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[mcd.b.LIGHTNING.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[mcd.b.CALENDAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[mcd.b.PLAN_ULTRA.ordinal()] = 8;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[mcd.b.PLAN_METAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[mcd.b.PLAN_PLUS.ordinal()] = 10;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[mcd.b.SALARY.ordinal()] = 11;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[mcd.b.STUDENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[mcd.b.UNKNOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused25) {
        }
        d = iArr4;
    }
}
