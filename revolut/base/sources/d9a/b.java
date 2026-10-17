package d9a;

import com.revolut.feature.pix.api.model.AliasRegistrationResult;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112357a;

    static {
        int[] iArr = new int[AliasRegistrationResult.FailureReason.values().length];
        try {
            iArr[AliasRegistrationResult.FailureReason.CLAIM_UNSUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AliasRegistrationResult.FailureReason.TAX_ID_UNDER_ANALYSIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AliasRegistrationResult.FailureReason.TAX_ID_NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AliasRegistrationResult.FailureReason.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112357a = iArr;
    }
}
