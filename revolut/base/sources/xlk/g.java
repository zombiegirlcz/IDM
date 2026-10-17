package xlk;

import hha.w;
import hha.y;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307035a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.FEATURES_FOR_YOU.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w.EVERYDAY_BENEFITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w.TRAVEL_SAVINGS_AND_PROTECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w.TRAVEL_BENEFITS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w.INVESTMENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[w.INSURANCE_BENEFITS.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr3 = new int[y.values().length];
        try {
            iArr3[y.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        f307035a = iArr3;
    }
}
