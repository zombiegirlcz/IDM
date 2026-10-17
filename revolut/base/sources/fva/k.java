package fva;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k GROUP_VAULT;
    public static final k JOINT_SAVINGS;
    public static final k JOINT_VAULT;
    public static final k JUNIOR_SAVINGS;
    public static final k JUNIOR_VAULT;
    public static final k PERSONAL_VAULT;
    public static final k PRO_VAULT;
    public static final k SAVINGS;

    static {
        k kVar = new k("SAVINGS", 0);
        SAVINGS = kVar;
        k kVar2 = new k("JUNIOR_SAVINGS", 1);
        JUNIOR_SAVINGS = kVar2;
        k kVar3 = new k("JOINT_SAVINGS", 2);
        JOINT_SAVINGS = kVar3;
        k kVar4 = new k("PERSONAL_VAULT", 3);
        PERSONAL_VAULT = kVar4;
        k kVar5 = new k("JUNIOR_VAULT", 4);
        JUNIOR_VAULT = kVar5;
        k kVar6 = new k("JOINT_VAULT", 5);
        JOINT_VAULT = kVar6;
        k kVar7 = new k("GROUP_VAULT", 6);
        GROUP_VAULT = kVar7;
        k kVar8 = new k("PRO_VAULT", 7);
        PRO_VAULT = kVar8;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
