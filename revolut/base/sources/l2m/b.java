package l2m;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKIIdentificationResultReasonResponse;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191827a;

    static {
        int[] iArr = new int[JPKIIdentificationResultReasonResponse.values().length];
        try {
            iArr[JPKIIdentificationResultReasonResponse.SIGNATURE_INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JPKIIdentificationResultReasonResponse.CERTIFICATE_INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JPKIIdentificationResultReasonResponse.CERTIFICATE_EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JPKIIdentificationResultReasonResponse.CERTIFICATE_REVOKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f191827a = iArr;
    }
}
