package xlk;

import hha.w;
import jgk.y;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307045b;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.FEATURES_FOR_YOU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.EVERYDAY_BENEFITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.TRAVEL_BENEFITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.INSURANCE_BENEFITS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w.INVESTMENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w.TRAVEL_SAVINGS_AND_PROTECTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f307044a = iArr;
        int[] iArr2 = new int[y.values().length];
        try {
            iArr2[y.FEATURES_FOR_YOU.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[y.TOP_FEATURES.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f307045b = iArr2;
    }
}
