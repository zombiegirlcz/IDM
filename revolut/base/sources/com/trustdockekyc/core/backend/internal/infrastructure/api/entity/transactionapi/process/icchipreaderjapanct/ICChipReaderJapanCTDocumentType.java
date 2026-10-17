package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import a3m.g;
import androidx.annotation.Keep;
import k1m.i;
import k2m.a;
import k2m.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "La3m/g;", "toModel", "()La3m/g;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/a", "DRIVERS_LICENSE", "RESIDENCE_CARD", "SPECIAL_PERMANENT_RESIDENT_CERTIFICATE", "INDIVIDUAL_NUMBER_CARD", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ICChipReaderJapanCTDocumentType[] $VALUES;

    @NotNull
    public static final a Companion;

    @i(name = "drivers_license")
    public static final ICChipReaderJapanCTDocumentType DRIVERS_LICENSE = new ICChipReaderJapanCTDocumentType("DRIVERS_LICENSE", 0);

    @i(name = "residence_card")
    public static final ICChipReaderJapanCTDocumentType RESIDENCE_CARD = new ICChipReaderJapanCTDocumentType("RESIDENCE_CARD", 1);

    @i(name = "special_permanent_resident_certificate")
    public static final ICChipReaderJapanCTDocumentType SPECIAL_PERMANENT_RESIDENT_CERTIFICATE = new ICChipReaderJapanCTDocumentType("SPECIAL_PERMANENT_RESIDENT_CERTIFICATE", 2);

    @i(name = "individual_number_card")
    public static final ICChipReaderJapanCTDocumentType INDIVIDUAL_NUMBER_CARD = new ICChipReaderJapanCTDocumentType("INDIVIDUAL_NUMBER_CARD", 3);

    private static final /* synthetic */ ICChipReaderJapanCTDocumentType[] $values() {
        return new ICChipReaderJapanCTDocumentType[]{DRIVERS_LICENSE, RESIDENCE_CARD, SPECIAL_PERMANENT_RESIDENT_CERTIFICATE, INDIVIDUAL_NUMBER_CARD};
    }

    static {
        ICChipReaderJapanCTDocumentType[] iCChipReaderJapanCTDocumentTypeArr$values = $values();
        $VALUES = iCChipReaderJapanCTDocumentTypeArr$values;
        $ENTRIES = s.n(iCChipReaderJapanCTDocumentTypeArr$values);
        Companion = new a();
    }

    private ICChipReaderJapanCTDocumentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ICChipReaderJapanCTDocumentType valueOf(String str) {
        return (ICChipReaderJapanCTDocumentType) Enum.valueOf(ICChipReaderJapanCTDocumentType.class, str);
    }

    public static ICChipReaderJapanCTDocumentType[] values() {
        return (ICChipReaderJapanCTDocumentType[]) $VALUES.clone();
    }

    @NotNull
    public final g toModel() {
        int i = b.f180612a[ordinal()];
        if (i == 1) {
            return g.DRIVERS_LICENSE;
        }
        if (i == 2) {
            return g.RESIDENCE_CARD;
        }
        if (i == 3) {
            return g.SPECIAL_PERMANENT_RESIDENT_CERTIFICATE;
        }
        if (i == 4) {
            return g.INDIVIDUAL_NUMBER_CARD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
