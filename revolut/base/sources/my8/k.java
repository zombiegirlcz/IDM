package my8;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmy8/k;", "", "ONFIDO", "AML_DATA_COLLECTION", "ONFIDO_DOCUMENT_PROCESSING_AND_SHARING", "INCODE_DOCUMENT_PROCESSING", "MX_INE_DOCUMENT_PROCESSING", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @lg.b("AML_DATA_COLLECTION")
    public static final k AML_DATA_COLLECTION;

    @lg.b("INCODE_DOCUMENT_PROCESSING")
    public static final k INCODE_DOCUMENT_PROCESSING;

    @lg.b("MX_INE_DOCUMENT_PROCESSING")
    public static final k MX_INE_DOCUMENT_PROCESSING;

    @lg.b("ONFIDO")
    public static final k ONFIDO;

    @lg.b("ONFIDO_DOCUMENT_PROCESSING_AND_SHARING")
    public static final k ONFIDO_DOCUMENT_PROCESSING_AND_SHARING;

    static {
        k kVar = new k("ONFIDO", 0);
        ONFIDO = kVar;
        k kVar2 = new k("AML_DATA_COLLECTION", 1);
        AML_DATA_COLLECTION = kVar2;
        k kVar3 = new k("ONFIDO_DOCUMENT_PROCESSING_AND_SHARING", 2);
        ONFIDO_DOCUMENT_PROCESSING_AND_SHARING = kVar3;
        k kVar4 = new k("INCODE_DOCUMENT_PROCESSING", 3);
        INCODE_DOCUMENT_PROCESSING = kVar4;
        k kVar5 = new k("MX_INE_DOCUMENT_PROCESSING", 4);
        MX_INE_DOCUMENT_PROCESSING = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
