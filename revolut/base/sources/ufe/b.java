package ufe;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CC_BUILDER;
    public static final b CC_SECURED;
    public static final b CREDIT;
    public static final b CREDIT_CARD;
    public static final b CURRENCY;

    @NotNull
    public static final a Companion;
    public static final b JOINT;
    public static final b JOINT_POCKET;
    public static final b JOINT_SAVINGS;
    public static final b LINKED;
    public static final b LOAN;
    public static final b PERSONAL_POCKET;
    public static final b PERSONAL_SAVINGS;
    public static final b PRO;
    public static final b PRO_POCKET;
    public static final b REVPOINTS_POCKET;
    public static final b UNKNOWN;
    public static final b YOUTH;
    public static final b YOUTH_CURRENCY;
    public static final b YOUTH_SAVINGS;

    static {
        b bVar = new b("CREDIT", 0);
        CREDIT = bVar;
        b bVar2 = new b("CREDIT_CARD", 1);
        CREDIT_CARD = bVar2;
        b bVar3 = new b("CC_SECURED", 2);
        CC_SECURED = bVar3;
        b bVar4 = new b("CC_BUILDER", 3);
        CC_BUILDER = bVar4;
        b bVar5 = new b("CURRENCY", 4);
        CURRENCY = bVar5;
        b bVar6 = new b("JOINT", 5);
        JOINT = bVar6;
        b bVar7 = new b("JOINT_POCKET", 6);
        JOINT_POCKET = bVar7;
        b bVar8 = new b("JOINT_SAVINGS", 7);
        JOINT_SAVINGS = bVar8;
        b bVar9 = new b("LINKED", 8);
        LINKED = bVar9;
        b bVar10 = new b("LOAN", 9);
        LOAN = bVar10;
        b bVar11 = new b("PERSONAL_POCKET", 10);
        PERSONAL_POCKET = bVar11;
        b bVar12 = new b("PERSONAL_SAVINGS", 11);
        PERSONAL_SAVINGS = bVar12;
        b bVar13 = new b("PRO", 12);
        PRO = bVar13;
        b bVar14 = new b("PRO_POCKET", 13);
        PRO_POCKET = bVar14;
        b bVar15 = new b("REVPOINTS_POCKET", 14);
        REVPOINTS_POCKET = bVar15;
        b bVar16 = new b("YOUTH", 15);
        YOUTH = bVar16;
        b bVar17 = new b("YOUTH_SAVINGS", 16);
        YOUTH_SAVINGS = bVar17;
        b bVar18 = new b("YOUTH_CURRENCY", 17);
        YOUTH_CURRENCY = bVar18;
        b bVar19 = new b("UNKNOWN", 18);
        UNKNOWN = bVar19;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
