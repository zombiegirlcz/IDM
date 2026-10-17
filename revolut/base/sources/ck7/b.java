package ck7;

import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24786a;

    static {
        int[] iArr = new int[CFACReimbursementType.values().length];
        try {
            iArr[CFACReimbursementType.DOC_PROOF_REIMBURSEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CFACReimbursementType.NO_PROOF_REIMBURSEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24786a = iArr;
    }
}
