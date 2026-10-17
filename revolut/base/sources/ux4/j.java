package ux4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CREDIT_CARD;
    public static final j LOAN;
    public static final j MORTGAGE;
    public static final j OVERDRAFT;
    public static final j PAY_LATER;

    static {
        j jVar = new j("CREDIT_CARD", 0);
        CREDIT_CARD = jVar;
        j jVar2 = new j("LOAN", 1);
        LOAN = jVar2;
        j jVar3 = new j("MORTGAGE", 2);
        MORTGAGE = jVar3;
        j jVar4 = new j("PAY_LATER", 3);
        PAY_LATER = jVar4;
        j jVar5 = new j("OVERDRAFT", 4);
        OVERDRAFT = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
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
