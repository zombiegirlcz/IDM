package qk7;

import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246971a;

    static {
        int[] iArr = new int[CFACClaimStatus.values().length];
        try {
            iArr[CFACClaimStatus.DECLINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CFACClaimStatus.IN_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CFACClaimStatus.SUBMITTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CFACClaimStatus.SUBMITTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CFACClaimStatus.SUBMISSION_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CFACClaimStatus.PAID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f246971a = iArr;
    }
}
