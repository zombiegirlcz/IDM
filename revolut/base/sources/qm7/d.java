package qm7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247778a;

    static {
        int[] iArr = new int[Answer.ClaimsState.values().length];
        try {
            iArr[Answer.ClaimsState.NO_CLAIMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Answer.ClaimsState.ONE_CLAIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Answer.ClaimsState.TWO_CLAIMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Answer.ClaimsState.THREE_AND_MORE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Answer.ClaimsState.WINDSCREEN_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f247778a = iArr;
    }
}
