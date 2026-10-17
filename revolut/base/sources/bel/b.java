package bel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMMODITIES;
    public static final b CREDIT;
    public static final b CRYPTO;
    public static final b JOINT;
    public static final b JOINT_SAVINGS;
    public static final b JOINT_VAULT;
    public static final b PERSONAL;
    public static final b PRO;
    public static final b SAVINGS;
    public static final b UNKNOWN;
    public static final b VAULT;

    static {
        b bVar = new b("PERSONAL", 0);
        PERSONAL = bVar;
        b bVar2 = new b("CREDIT", 1);
        CREDIT = bVar2;
        b bVar3 = new b("CRYPTO", 2);
        CRYPTO = bVar3;
        b bVar4 = new b("SAVINGS", 3);
        SAVINGS = bVar4;
        b bVar5 = new b("PRO", 4);
        PRO = bVar5;
        b bVar6 = new b("COMMODITIES", 5);
        COMMODITIES = bVar6;
        b bVar7 = new b("VAULT", 6);
        VAULT = bVar7;
        b bVar8 = new b("JOINT", 7);
        JOINT = bVar8;
        b bVar9 = new b("JOINT_SAVINGS", 8);
        JOINT_SAVINGS = bVar9;
        b bVar10 = new b("JOINT_VAULT", 9);
        JOINT_VAULT = bVar10;
        b bVar11 = new b("UNKNOWN", 10);
        UNKNOWN = bVar11;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
