package z0h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMMON;
    public static final b RBSA;
    public static final b RL_EEA;
    public static final b RL_UK;
    public static final b RPAPL;
    public static final b RPNZPL;
    public static final b RTJI;
    public static final b RTSPL;
    public static final b US;

    static {
        b bVar = new b("RL_UK", 0);
        RL_UK = bVar;
        b bVar2 = new b("RL_EEA", 1);
        RL_EEA = bVar2;
        b bVar3 = new b("RTSPL", 2);
        RTSPL = bVar3;
        b bVar4 = new b("RPAPL", 3);
        RPAPL = bVar4;
        b bVar5 = new b("RPNZPL", 4);
        RPNZPL = bVar5;
        b bVar6 = new b("RBSA", 5);
        RBSA = bVar6;
        b bVar7 = new b("RTJI", 6);
        RTJI = bVar7;
        b bVar8 = new b("US", 7);
        US = bVar8;
        b bVar9 = new b("COMMON", 8);
        COMMON = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
