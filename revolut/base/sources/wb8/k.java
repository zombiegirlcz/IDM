package wb8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k P14D;
    public static final k P1D;
    public static final k P1M;
    public static final k P1W;
    public static final k P1Y;
    public static final k P2W;
    public static final k P7D;

    static {
        k kVar = new k("P1D", 0);
        P1D = kVar;
        k kVar2 = new k("P7D", 1);
        P7D = kVar2;
        k kVar3 = new k("P1W", 2);
        P1W = kVar3;
        k kVar4 = new k("P2W", 3);
        P2W = kVar4;
        k kVar5 = new k("P14D", 4);
        P14D = kVar5;
        k kVar6 = new k("P1M", 5);
        P1M = kVar6;
        k kVar7 = new k("P1Y", 6);
        P1Y = kVar7;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7};
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
