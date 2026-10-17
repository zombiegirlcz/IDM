package ibd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BILL_POCKET;
    public static final b GROUP_VAULT;
    public static final b JOINT;
    public static final b JOINT_SAVINGS;
    public static final b JOINT_VAULT;
    public static final b JUNIOR;
    public static final b JUNIOR_SAVINGS;
    public static final b JUNIOR_VAULT;
    public static final b PERSONAL;
    public static final b PERSONAL_VAULT;
    public static final b PRO;
    public static final b PRO_VAULT;
    public static final b SAVINGS;
    public static final b UNKNOWN;

    static {
        b bVar = new b("PERSONAL", 0);
        PERSONAL = bVar;
        b bVar2 = new b("PERSONAL_VAULT", 1);
        PERSONAL_VAULT = bVar2;
        b bVar3 = new b("GROUP_VAULT", 2);
        GROUP_VAULT = bVar3;
        b bVar4 = new b("BILL_POCKET", 3);
        BILL_POCKET = bVar4;
        b bVar5 = new b("SAVINGS", 4);
        SAVINGS = bVar5;
        b bVar6 = new b("JOINT", 5);
        JOINT = bVar6;
        b bVar7 = new b("JOINT_VAULT", 6);
        JOINT_VAULT = bVar7;
        b bVar8 = new b("JOINT_SAVINGS", 7);
        JOINT_SAVINGS = bVar8;
        b bVar9 = new b("PRO", 8);
        PRO = bVar9;
        b bVar10 = new b("PRO_VAULT", 9);
        PRO_VAULT = bVar10;
        b bVar11 = new b("JUNIOR", 10);
        JUNIOR = bVar11;
        b bVar12 = new b("JUNIOR_VAULT", 11);
        JUNIOR_VAULT = bVar12;
        b bVar13 = new b("JUNIOR_SAVINGS", 12);
        JUNIOR_SAVINGS = bVar13;
        b bVar14 = new b("UNKNOWN", 13);
        UNKNOWN = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
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
