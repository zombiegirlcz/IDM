package lk7;

import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196296a;

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
        f196296a = iArr;
    }
}
