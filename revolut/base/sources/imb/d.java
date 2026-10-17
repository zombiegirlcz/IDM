package imb;

import ncd.g;
import ncd.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f162340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f162341c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ncd.e.values().length];
        try {
            iArr[ncd.e.RATE_PROMINENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.e.UNIFORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f162339a = iArr;
        int[] iArr2 = new int[com.revolut.feature.shared.savings.models.product.b.values().length];
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.b.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.b.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f162340b = iArr2;
        int[] iArr3 = new int[h.values().length];
        try {
            iArr3[h.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[h.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[h.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[h.PERSONAL_UNDER_18.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[h.PERSONAL_JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f162341c = iArr3;
        int[] iArr4 = new int[g.values().length];
        try {
            iArr4[g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[g.SAVINGS_MMF.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[g.SAVINGS_FIXED_TERM.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
