package y89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FRANCE_BANK_AGREEMENT;
    public static final a FRANCE_BANK_MIGRATION_AGREEMENT;
    public static final a GERMANY_BANK_AGREEMENT;
    public static final a GERMANY_BANK_MIGRATION_AGREEMENT;
    public static final a ITALY_BANK_AGREEMENT;
    public static final a ITALY_BANK_MIGRATION_AGREEMENT;
    public static final a MEXICO_BANK_AGREEMENT;

    static {
        a aVar = new a("FRANCE_BANK_AGREEMENT", 0);
        FRANCE_BANK_AGREEMENT = aVar;
        a aVar2 = new a("FRANCE_BANK_MIGRATION_AGREEMENT", 1);
        FRANCE_BANK_MIGRATION_AGREEMENT = aVar2;
        a aVar3 = new a("GERMANY_BANK_AGREEMENT", 2);
        GERMANY_BANK_AGREEMENT = aVar3;
        a aVar4 = new a("GERMANY_BANK_MIGRATION_AGREEMENT", 3);
        GERMANY_BANK_MIGRATION_AGREEMENT = aVar4;
        a aVar5 = new a("ITALY_BANK_AGREEMENT", 4);
        ITALY_BANK_AGREEMENT = aVar5;
        a aVar6 = new a("ITALY_BANK_MIGRATION_AGREEMENT", 5);
        ITALY_BANK_MIGRATION_AGREEMENT = aVar6;
        a aVar7 = new a("MEXICO_BANK_AGREEMENT", 6);
        MEXICO_BANK_AGREEMENT = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
