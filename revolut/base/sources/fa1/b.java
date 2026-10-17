package fa1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCOUNT_UNAVAILABLE;
    public static final b ACTIVITY_COUNT_LIMIT_EXCEEDED;
    public static final b CARD_EXPIRED;
    public static final b CONTACT_CARD_ISSUER;

    @NotNull
    public static final a Companion;
    public static final b DO_NOT_HONOUR;
    public static final b INSUFFICIENT_FUNDS;
    public static final b PICK_UP_CARD;
    public static final b PIN_DATA_REQUIRED;
    public static final b PIN_INCORRECT;
    public static final b PIN_TRIES_EXCEEDED;
    public static final b PIN_VERIFICATION_FAILED;
    public static final b STRONG_CUSTOMER_AUTHENTICATION_REQUIRED;
    public static final b TECHNICAL_ERROR;
    public static final b TRANSIENT_ERROR;
    public static final b UNKNOWN;

    @NotNull
    private final String key;

    static {
        b bVar = new b("CARD_EXPIRED", 0, "CARD_EXPIRED");
        CARD_EXPIRED = bVar;
        b bVar2 = new b("ACCOUNT_UNAVAILABLE", 1, "ACCOUNT_UNAVAILABLE");
        ACCOUNT_UNAVAILABLE = bVar2;
        b bVar3 = new b("CONTACT_CARD_ISSUER", 2, "CONTACT_CARD_ISSUER");
        CONTACT_CARD_ISSUER = bVar3;
        b bVar4 = new b("DO_NOT_HONOUR", 3, "DO_NOT_HONOUR");
        DO_NOT_HONOUR = bVar4;
        b bVar5 = new b("INSUFFICIENT_FUNDS", 4, "INSUFFICIENT_FUNDS");
        INSUFFICIENT_FUNDS = bVar5;
        b bVar6 = new b("PICK_UP_CARD", 5, "PICK_UP_CARD");
        PICK_UP_CARD = bVar6;
        b bVar7 = new b("PIN_INCORRECT", 6, "PIN_INCORRECT");
        PIN_INCORRECT = bVar7;
        b bVar8 = new b("PIN_TRIES_EXCEEDED", 7, "PIN_TRIES_EXCEEDED");
        PIN_TRIES_EXCEEDED = bVar8;
        b bVar9 = new b("PIN_VERIFICATION_FAILED", 8, "PIN_VERIFICATION_FAILED");
        PIN_VERIFICATION_FAILED = bVar9;
        b bVar10 = new b("STRONG_CUSTOMER_AUTHENTICATION_REQUIRED", 9, "STRONG_CUSTOMER_AUTHENTICATION_REQUIRED");
        STRONG_CUSTOMER_AUTHENTICATION_REQUIRED = bVar10;
        b bVar11 = new b("TECHNICAL_ERROR", 10, "TECHNICAL_ERROR");
        TECHNICAL_ERROR = bVar11;
        b bVar12 = new b("TRANSIENT_ERROR", 11, "TRANSIENT_ERROR");
        TRANSIENT_ERROR = bVar12;
        b bVar13 = new b("ACTIVITY_COUNT_LIMIT_EXCEEDED", 12, "ACTIVITY_COUNT_LIMIT_EXCEEDED");
        ACTIVITY_COUNT_LIMIT_EXCEEDED = bVar13;
        b bVar14 = new b("PIN_DATA_REQUIRED", 13, "PIN_DATA_REQUIRED");
        PIN_DATA_REQUIRED = bVar14;
        b bVar15 = new b("UNKNOWN", 14, "UNKNOWN");
        UNKNOWN = bVar15;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.key = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
