package g6d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AU;
    public static final b EU;
    public static final b Generic;
    public static final b NZ;
    public static final b UAE;

    static {
        b bVar = new b("AU", 0);
        AU = bVar;
        b bVar2 = new b("NZ", 1);
        NZ = bVar2;
        b bVar3 = new b("EU", 2);
        EU = bVar3;
        b bVar4 = new b("UAE", 3);
        UAE = bVar4;
        b bVar5 = new b("Generic", 4);
        Generic = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
