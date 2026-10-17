package sm7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264386a;

    static {
        int[] iArr = new int[Answer.CurrentInsuranceState.values().length];
        try {
            iArr[Answer.CurrentInsuranceState.NO_INSURANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f264386a = iArr;
    }
}
