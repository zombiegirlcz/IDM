package ugg;

import hfg.b0;
import u2f.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f280034b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b0.REV_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b0.GIFT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f280033a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.PARTNER_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l.REV_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l.GIFT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f280034b = iArr2;
    }
}
