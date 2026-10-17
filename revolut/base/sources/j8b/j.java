package j8b;

import iel.l;
import iel.n;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f172166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f172167b;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.MARTIN_LUTHER_KING_JR_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.WASHINGTONS_BIRTHDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.GOOD_FRIDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.MEMORIAL_DAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.INDEPENDENCE_DAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.LABOR_DAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.THANKSGIVING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l.CHRISTMAS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l.JUNETEENTH.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l.UNKNOWN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f172166a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.DELISTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[n.LISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[n.NEW_LISTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[n.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[n.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        f172167b = iArr2;
    }
}
