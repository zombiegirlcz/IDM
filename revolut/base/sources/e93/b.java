package e93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MAESTRO;
    public static final b MC;
    public static final b MULTIBANCO;
    public static final b UNKNOWN;
    public static final b VISA;

    static {
        b bVar = new b("MC", 0);
        MC = bVar;
        b bVar2 = new b("VISA", 1);
        VISA = bVar2;
        b bVar3 = new b("MAESTRO", 2);
        MAESTRO = bVar3;
        b bVar4 = new b("MULTIBANCO", 3);
        MULTIBANCO = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
