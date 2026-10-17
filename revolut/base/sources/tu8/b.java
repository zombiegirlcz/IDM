package tu8;

import my8.k;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274533a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.ONFIDO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.AML_DATA_COLLECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.ONFIDO_DOCUMENT_PROCESSING_AND_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.INCODE_DOCUMENT_PROCESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.MX_INE_DOCUMENT_PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f274533a = iArr;
    }
}
