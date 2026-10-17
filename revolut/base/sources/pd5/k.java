package pd5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k DEFI;
    public static final k MEME;
    public static final k NONE;
    public static final k STABLECOIN;
    public static final k STAKING;
    public static final k WRAPPED;

    static {
        k kVar = new k("STAKING", 0);
        STAKING = kVar;
        k kVar2 = new k("STABLECOIN", 1);
        STABLECOIN = kVar2;
        k kVar3 = new k("DEFI", 2);
        DEFI = kVar3;
        k kVar4 = new k("WRAPPED", 3);
        WRAPPED = kVar4;
        k kVar5 = new k("MEME", 4);
        MEME = kVar5;
        k kVar6 = new k("NONE", 5);
        NONE = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
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
