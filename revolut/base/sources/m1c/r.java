package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r METAL;
    public static final r PLUS;
    public static final r PREMIUM;
    public static final r PRIVATE;
    public static final r STANDARD;
    public static final r ULTRA;
    public static final r UNKNOWN;

    static {
        r rVar = new r("STANDARD", 0);
        STANDARD = rVar;
        r rVar2 = new r("PLUS", 1);
        PLUS = rVar2;
        r rVar3 = new r("PREMIUM", 2);
        PREMIUM = rVar3;
        r rVar4 = new r("METAL", 3);
        METAL = rVar4;
        r rVar5 = new r("ULTRA", 4);
        ULTRA = rVar5;
        r rVar6 = new r("PRIVATE", 5);
        PRIVATE = rVar6;
        r rVar7 = new r("UNKNOWN", 6);
        UNKNOWN = rVar7;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
