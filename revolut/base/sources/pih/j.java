package pih;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j AvailableToWithdraw;
    public static final j UnsettledBuys;
    public static final j UnsettledSells;

    static {
        j jVar = new j("AvailableToWithdraw", 0);
        AvailableToWithdraw = jVar;
        j jVar2 = new j("UnsettledSells", 1);
        UnsettledSells = jVar2;
        j jVar3 = new j("UnsettledBuys", 2);
        UnsettledBuys = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
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
