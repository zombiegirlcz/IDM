package k2m;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentType;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180612a;

    static {
        int[] iArr = new int[ICChipReaderJapanCTDocumentType.values().length];
        try {
            iArr[ICChipReaderJapanCTDocumentType.DRIVERS_LICENSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ICChipReaderJapanCTDocumentType.RESIDENCE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ICChipReaderJapanCTDocumentType.SPECIAL_PERMANENT_RESIDENT_CERTIFICATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ICChipReaderJapanCTDocumentType.INDIVIDUAL_NUMBER_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f180612a = iArr;
    }
}
