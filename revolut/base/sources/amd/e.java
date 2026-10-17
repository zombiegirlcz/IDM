package amd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CREDIT_CARDS;
    public static final e CRYPTO;
    public static final e CUSTOM_ASSET_COLLECTIBLE;
    public static final e CUSTOM_ASSET_FINE_ART_AND_ANTIQUE;
    public static final e CUSTOM_ASSET_JEWELLERY;
    public static final e CUSTOM_ASSET_OTHER;
    public static final e CUSTOM_ASSET_PROPERTY;
    public static final e CUSTOM_ASSET_UNKNOWN;
    public static final e CUSTOM_ASSET_VEHICLE;
    public static final e CUSTOM_ASSET_WATCH;
    public static final e INVEST;
    public static final e JOINT;
    public static final e JOINT_SAVINGS;
    public static final e LINKED_ACCOUNT;
    public static final e LINKED_CREDIT_CARDS;
    public static final e LOANS;
    public static final e PAY_LATER;
    public static final e PERSONAL;
    public static final e POCKETS;
    public static final e PRO;
    public static final e SAVINGS;

    static {
        e eVar = new e("PERSONAL", 0);
        PERSONAL = eVar;
        e eVar2 = new e("JOINT", 1);
        JOINT = eVar2;
        e eVar3 = new e("PRO", 2);
        PRO = eVar3;
        e eVar4 = new e("POCKETS", 3);
        POCKETS = eVar4;
        e eVar5 = new e("LINKED_ACCOUNT", 4);
        LINKED_ACCOUNT = eVar5;
        e eVar6 = new e("SAVINGS", 5);
        SAVINGS = eVar6;
        e eVar7 = new e("JOINT_SAVINGS", 6);
        JOINT_SAVINGS = eVar7;
        e eVar8 = new e("INVEST", 7);
        INVEST = eVar8;
        e eVar9 = new e("CRYPTO", 8);
        CRYPTO = eVar9;
        e eVar10 = new e("CREDIT_CARDS", 9);
        CREDIT_CARDS = eVar10;
        e eVar11 = new e("PAY_LATER", 10);
        PAY_LATER = eVar11;
        e eVar12 = new e("LOANS", 11);
        LOANS = eVar12;
        e eVar13 = new e("LINKED_CREDIT_CARDS", 12);
        LINKED_CREDIT_CARDS = eVar13;
        e eVar14 = new e("CUSTOM_ASSET_PROPERTY", 13);
        CUSTOM_ASSET_PROPERTY = eVar14;
        e eVar15 = new e("CUSTOM_ASSET_VEHICLE", 14);
        CUSTOM_ASSET_VEHICLE = eVar15;
        e eVar16 = new e("CUSTOM_ASSET_FINE_ART_AND_ANTIQUE", 15);
        CUSTOM_ASSET_FINE_ART_AND_ANTIQUE = eVar16;
        e eVar17 = new e("CUSTOM_ASSET_COLLECTIBLE", 16);
        CUSTOM_ASSET_COLLECTIBLE = eVar17;
        e eVar18 = new e("CUSTOM_ASSET_WATCH", 17);
        CUSTOM_ASSET_WATCH = eVar18;
        e eVar19 = new e("CUSTOM_ASSET_JEWELLERY", 18);
        CUSTOM_ASSET_JEWELLERY = eVar19;
        e eVar20 = new e("CUSTOM_ASSET_OTHER", 19);
        CUSTOM_ASSET_OTHER = eVar20;
        e eVar21 = new e("CUSTOM_ASSET_UNKNOWN", 20);
        CUSTOM_ASSET_UNKNOWN = eVar21;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
