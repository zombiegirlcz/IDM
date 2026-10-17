package k8a;

import com.revolut.feature.pix.api.model.TokenVerificationRequest;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182102a;

    static {
        int[] iArr = new int[TokenVerificationRequest.Operation.values().length];
        try {
            iArr[TokenVerificationRequest.Operation.CREATE_ALIAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenVerificationRequest.Operation.CONFIRM_CLAIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TokenVerificationRequest.Operation.DENY_CLAIM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f182102a = iArr;
    }
}
