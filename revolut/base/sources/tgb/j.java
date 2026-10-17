package tgb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ACTIVE;
    public static final j AT_RISK;
    public static final j CLAIMABLE;
    public static final j COMING;
    public static final j EXPIRING;
    public static final j LOCKED;
    public static final j UNLOCKED;

    static {
        j jVar = new j("CLAIMABLE", 0);
        CLAIMABLE = jVar;
        j jVar2 = new j("ACTIVE", 1);
        ACTIVE = jVar2;
        j jVar3 = new j("COMING", 2);
        COMING = jVar3;
        j jVar4 = new j("EXPIRING", 3);
        EXPIRING = jVar4;
        j jVar5 = new j("AT_RISK", 4);
        AT_RISK = jVar5;
        j jVar6 = new j("LOCKED", 5);
        LOCKED = jVar6;
        j jVar7 = new j("UNLOCKED", 6);
        UNLOCKED = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
