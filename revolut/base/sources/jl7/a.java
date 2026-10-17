package jl7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f175611a;

    static {
        int[] iArr = new int[Answer.PenaltyPoints.values().length];
        try {
            iArr[Answer.PenaltyPoints.ONE_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Answer.PenaltyPoints.TWO_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Answer.PenaltyPoints.THREE_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Answer.PenaltyPoints.FOUR_POINTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Answer.PenaltyPoints.FIVE_POINTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Answer.PenaltyPoints.SIX_POINTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Answer.PenaltyPoints.NO_POINTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Answer.PenaltyPoints.SEVEN_AND_MORE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f175611a = iArr;
    }
}
