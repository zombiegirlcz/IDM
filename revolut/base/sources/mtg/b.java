package mtg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MARGIN;
    public static final b ROBO;
    public static final b TAA;
    public static final b TRADING;

    static {
        b bVar = new b("TRADING", 0);
        TRADING = bVar;
        b bVar2 = new b("ROBO", 1);
        ROBO = bVar2;
        b bVar3 = new b("MARGIN", 2);
        MARGIN = bVar3;
        b bVar4 = new b("TAA", 3);
        TAA = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
