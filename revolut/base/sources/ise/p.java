package ise;

import com.revolut.domain.models.transactions.CardholderType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f168227c;

    static {
        int[] iArr = new int[j8l.a.values().length];
        try {
            iArr[j8l.a.JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j8l.a.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j8l.a.FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f168225a = iArr;
        int[] iArr2 = new int[CardholderType.values().length];
        try {
            iArr2[CardholderType.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardholderType.JUNIOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f168226b = iArr2;
        int[] iArr3 = new int[m0.values().length];
        try {
            iArr3[m0.REQUESTED_FOR_ONE_STEP_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[m0.REQUESTED_FOR_TWO_STEP_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[m0.NOT_REQUESTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f168227c = iArr3;
    }
}
