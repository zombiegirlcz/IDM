package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;
    public static final p1 CAR_HAS_VALID_NCT;
    public static final p1 CAR_NCT_BOOKED;
    public static final p1 CAR_NEVER_LEFT_UK_IE;
    public static final p1 CAR_OWNER;
    public static final p1 CAR_PRIVATE_TAX_ITEM;
    public static final p1 CAR_RIGHT_HAND_DRIVE;
    public static final p1 CAR_ROAD_WORTHY;
    public static final p1 CLAIM_DATE;
    public static final p1 CLAIM_EXCEEDS_AMOUNT;
    public static final p1 CLAIM_NOT_SETTLED;
    public static final p1 CLAIM_TYPE;
    public static final p1 PENALTY_BY_JUDGE;
    public static final p1 PENALTY_FOR_SPECIFIC_REASONS;

    static {
        p1 p1Var = new p1("CLAIM_DATE", 0);
        CLAIM_DATE = p1Var;
        p1 p1Var2 = new p1("CLAIM_TYPE", 1);
        CLAIM_TYPE = p1Var2;
        p1 p1Var3 = new p1("CLAIM_NOT_SETTLED", 2);
        CLAIM_NOT_SETTLED = p1Var3;
        p1 p1Var4 = new p1("CLAIM_EXCEEDS_AMOUNT", 3);
        CLAIM_EXCEEDS_AMOUNT = p1Var4;
        p1 p1Var5 = new p1("PENALTY_BY_JUDGE", 4);
        PENALTY_BY_JUDGE = p1Var5;
        p1 p1Var6 = new p1("PENALTY_FOR_SPECIFIC_REASONS", 5);
        PENALTY_FOR_SPECIFIC_REASONS = p1Var6;
        p1 p1Var7 = new p1("CAR_RIGHT_HAND_DRIVE", 6);
        CAR_RIGHT_HAND_DRIVE = p1Var7;
        p1 p1Var8 = new p1("CAR_HAS_VALID_NCT", 7);
        CAR_HAS_VALID_NCT = p1Var8;
        p1 p1Var9 = new p1("CAR_OWNER", 8);
        CAR_OWNER = p1Var9;
        p1 p1Var10 = new p1("CAR_PRIVATE_TAX_ITEM", 9);
        CAR_PRIVATE_TAX_ITEM = p1Var10;
        p1 p1Var11 = new p1("CAR_NEVER_LEFT_UK_IE", 10);
        CAR_NEVER_LEFT_UK_IE = p1Var11;
        p1 p1Var12 = new p1("CAR_ROAD_WORTHY", 11);
        CAR_ROAD_WORTHY = p1Var12;
        p1 p1Var13 = new p1("CAR_NCT_BOOKED", 12);
        CAR_NCT_BOOKED = p1Var13;
        p1[] p1VarArr = {p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, p1Var8, p1Var9, p1Var10, p1Var11, p1Var12, p1Var13};
        $VALUES = p1VarArr;
        $ENTRIES = vc.s.n(p1VarArr);
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }
}
