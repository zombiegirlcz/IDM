package mx0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class i1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 SIZE_100_100;
    public static final i1 SIZE_120_120;
    public static final i1 SIZE_24_24;
    public static final i1 SIZE_32_32;
    public static final i1 SIZE_36_36;
    public static final i1 SIZE_40_40;
    public static final i1 SIZE_44_44;
    public static final i1 SIZE_48_48;
    public static final i1 SIZE_56_56;
    public static final i1 SIZE_64_64;
    public static final i1 SIZE_72_72;
    public static final i1 SIZE_80_80;
    private final float avatarBorderWidth;
    private final float avatarSize;

    @NotNull
    private final os0.a badgeSize;

    @NotNull
    private final cv0.a tagStyle;

    static {
        os0.a aVar = os0.a.PROFILE_AVATAR;
        cv0.a aVar2 = cv0.a.SIZE_24;
        i1 i1Var = new i1("SIZE_24_24", 0, 24.0f, 24.0f, aVar, aVar2);
        SIZE_24_24 = i1Var;
        os0.a aVar3 = os0.a.SMALL;
        i1 i1Var2 = new i1("SIZE_32_32", 1, 32.0f, 2.0f, aVar3, aVar2);
        SIZE_32_32 = i1Var2;
        i1 i1Var3 = new i1("SIZE_36_36", 2, 36.0f, 2.0f, aVar3, aVar2);
        SIZE_36_36 = i1Var3;
        i1 i1Var4 = new i1("SIZE_40_40", 3, 40.0f, 2.0f, aVar3, aVar2);
        SIZE_40_40 = i1Var4;
        i1 i1Var5 = new i1("SIZE_44_44", 4, 44.0f, 2.0f, aVar3, aVar2);
        SIZE_44_44 = i1Var5;
        i1 i1Var6 = new i1("SIZE_48_48", 5, 48.0f, 2.0f, aVar3, aVar2);
        SIZE_48_48 = i1Var6;
        i1 i1Var7 = new i1("SIZE_56_56", 6, 56.0f, 2.5f, aVar3, aVar2);
        SIZE_56_56 = i1Var7;
        os0.a aVar4 = os0.a.MEDIUM;
        i1 i1Var8 = new i1("SIZE_64_64", 7, 64.0f, 2.5f, aVar4, aVar2);
        SIZE_64_64 = i1Var8;
        i1 i1Var9 = new i1("SIZE_72_72", 8, 72.0f, 2.5f, aVar3, aVar2);
        SIZE_72_72 = i1Var9;
        i1 i1Var10 = new i1("SIZE_80_80", 9, 80.0f, 3.0f, aVar4, aVar2);
        SIZE_80_80 = i1Var10;
        i1 i1Var11 = new i1("SIZE_100_100", 10, 100.0f, 4.0f, aVar4, aVar2);
        SIZE_100_100 = i1Var11;
        i1 i1Var12 = new i1("SIZE_120_120", 11, 120.0f, 3.0f, aVar4, cv0.a.SIZE_28);
        SIZE_120_120 = i1Var12;
        i1[] i1VarArr = {i1Var, i1Var2, i1Var3, i1Var4, i1Var5, i1Var6, i1Var7, i1Var8, i1Var9, i1Var10, i1Var11, i1Var12};
        $VALUES = i1VarArr;
        $ENTRIES = vc.s.n(i1VarArr);
    }

    public i1(String str, int i, float f, float f4, os0.a aVar, cv0.a aVar2) {
        this.avatarSize = f;
        this.avatarBorderWidth = f4;
        this.badgeSize = aVar;
        this.tagStyle = aVar2;
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }

    public final float a() {
        return this.avatarBorderWidth;
    }

    public final float b() {
        return this.avatarSize;
    }

    public final os0.a c() {
        return this.badgeSize;
    }

    public final cv0.a d() {
        return this.tagStyle;
    }
}
