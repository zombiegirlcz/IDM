package i18;

import j18.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157589b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.PRICE_MOVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.REVOLUT_RECOMMENDATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.EXTERNAL_SUGGESTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.FUNDAMENTAL_METRIC_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.PRICE_TARGET_CHANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.EARNING_CALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f157588a = iArr;
        int[] iArr2 = new int[o18.b.values().length];
        try {
            iArr2[o18.b.PRICE_MOVEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[o18.b.REVOLUT_RECOMMENDATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[o18.b.EXTERNAL_SUGGESTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[o18.b.FUNDAMENTAL_METRIC_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[o18.b.PRICE_TARGET_CHANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[o18.b.EARNING_CALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[o18.b.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        f157589b = iArr2;
    }
}
