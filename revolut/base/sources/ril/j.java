package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j FRANCE_BANK_AGREEMENT;
    public static final j FRANCE_BANK_MIGRATION_AGREEMENT;
    public static final j GERMANY_BANK_AGREEMENT;
    public static final j GERMANY_BANK_MIGRATION_AGREEMENT;
    public static final j ITALY_BANK_AGREEMENT;
    public static final j ITALY_BANK_MIGRATION_AGREEMENT;
    public static final j MEXICO_BANK_AGREEMENT;

    static {
        j jVar = new j("FRANCE_BANK_MIGRATION_AGREEMENT", 0);
        FRANCE_BANK_MIGRATION_AGREEMENT = jVar;
        j jVar2 = new j("FRANCE_BANK_AGREEMENT", 1);
        FRANCE_BANK_AGREEMENT = jVar2;
        j jVar3 = new j("GERMANY_BANK_AGREEMENT", 2);
        GERMANY_BANK_AGREEMENT = jVar3;
        j jVar4 = new j("GERMANY_BANK_MIGRATION_AGREEMENT", 3);
        GERMANY_BANK_MIGRATION_AGREEMENT = jVar4;
        j jVar5 = new j("ITALY_BANK_AGREEMENT", 4);
        ITALY_BANK_AGREEMENT = jVar5;
        j jVar6 = new j("ITALY_BANK_MIGRATION_AGREEMENT", 5);
        ITALY_BANK_MIGRATION_AGREEMENT = jVar6;
        j jVar7 = new j("MEXICO_BANK_AGREEMENT", 6);
        MEXICO_BANK_AGREEMENT = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
