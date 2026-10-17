package com.onfido.api.client.data;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/onfido/api/client/data/PoaDocumentType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "BANK_BUILDING_SOCIETY_STATEMENT", "UTILITY_BILL", "COUNCIL_TAX_LETTER", "BENEFITS_LETTER", "ADDRESS_CARD", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final class PoaDocumentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PoaDocumentType[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String id;
    public static final PoaDocumentType BANK_BUILDING_SOCIETY_STATEMENT = new PoaDocumentType("BANK_BUILDING_SOCIETY_STATEMENT", 0, "bank_building_society_statement");
    public static final PoaDocumentType UTILITY_BILL = new PoaDocumentType("UTILITY_BILL", 1, "utility_bill");
    public static final PoaDocumentType COUNCIL_TAX_LETTER = new PoaDocumentType("COUNCIL_TAX_LETTER", 2, "council_tax");
    public static final PoaDocumentType BENEFITS_LETTER = new PoaDocumentType("BENEFITS_LETTER", 3, "benefit_letters");
    public static final PoaDocumentType ADDRESS_CARD = new PoaDocumentType("ADDRESS_CARD", 4, "address_certificate");

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/PoaDocumentType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/PoaDocumentType;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.onfido.api.client.data.PoaDocumentType$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends u implements Function0<KSerializer> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KSerializer invoke() {
                return PoaDocumentType$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PoaDocumentType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PoaDocumentType[] $values() {
        return new PoaDocumentType[]{BANK_BUILDING_SOCIETY_STATEMENT, UTILITY_BILL, COUNCIL_TAX_LETTER, BENEFITS_LETTER, ADDRESS_CARD};
    }

    static {
        PoaDocumentType[] poaDocumentTypeArr$values = $values();
        $VALUES = poaDocumentTypeArr$values;
        $ENTRIES = s.n(poaDocumentTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }

    private PoaDocumentType(String str, int i, String str2) {
        this.id = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PoaDocumentType valueOf(String str) {
        return (PoaDocumentType) Enum.valueOf(PoaDocumentType.class, str);
    }

    public static PoaDocumentType[] values() {
        return (PoaDocumentType[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
