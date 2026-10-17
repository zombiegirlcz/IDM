package bfk;

import hha.w;
import zek.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f15009b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.EVERYDAY_BENEFITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.TRAVEL_BENEFITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.INSURANCE_BENEFITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.INVESTMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.TRAVEL_SAVINGS_AND_PROTECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.FEATURES_FOR_YOU.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f15008a = iArr;
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.EVERYDAY_BENEFITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w.TRAVEL_BENEFITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w.INSURANCE_BENEFITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[w.INVESTMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[w.TRAVEL_SAVINGS_AND_PROTECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[w.FEATURES_FOR_YOU.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[w.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        f15009b = iArr2;
    }
}
