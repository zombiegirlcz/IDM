package nzi;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CASH;
    public static final f CREDIT_CARDS;
    public static final f CRYPTO;
    public static final f INSTALMENTS;
    public static final f INVESTMENTS;
    public static final f LINKED_BANK_CASH;
    public static final f LINKED_BANK_CREDIT;
    public static final f LINKED_BANK_SAVINGS;
    public static final f LINKED_INVESTMENTS;
    public static final f LOANS;
    public static final f OTHER_ASSETS;
    public static final f SAVINGS;

    @NotNull
    private final String key;

    static {
        f fVar = new f("CASH", 0, "cash");
        CASH = fVar;
        f fVar2 = new f("SAVINGS", 1, "savings");
        SAVINGS = fVar2;
        f fVar3 = new f("CRYPTO", 2, "crypto");
        CRYPTO = fVar3;
        f fVar4 = new f("INVESTMENTS", 3, "investments");
        INVESTMENTS = fVar4;
        f fVar5 = new f("LINKED_INVESTMENTS", 4, "linked_investments");
        LINKED_INVESTMENTS = fVar5;
        f fVar6 = new f("LINKED_BANK_CASH", 5, "linked_bank_cash");
        LINKED_BANK_CASH = fVar6;
        f fVar7 = new f("LINKED_BANK_CREDIT", 6, "linked_bank_credit");
        LINKED_BANK_CREDIT = fVar7;
        f fVar8 = new f("LINKED_BANK_SAVINGS", 7, "linked_bank_savings");
        LINKED_BANK_SAVINGS = fVar8;
        f fVar9 = new f("CREDIT_CARDS", 8, "credit_cards");
        CREDIT_CARDS = fVar9;
        f fVar10 = new f("LOANS", 9, "loans");
        LOANS = fVar10;
        f fVar11 = new f("INSTALMENTS", 10, "instalments");
        INSTALMENTS = fVar11;
        f fVar12 = new f("OTHER_ASSETS", 11, "custom_assets");
        OTHER_ASSETS = fVar12;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.key = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
