package wba;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296093a;

    static {
        int[] iArr = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f296093a = iArr;
    }
}
