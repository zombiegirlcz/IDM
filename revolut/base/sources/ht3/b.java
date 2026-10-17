package ht3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCENT;
    public static final b FLAT;
    public static final b SEMI_ACCENT;

    static {
        b bVar = new b("ACCENT", 0);
        ACCENT = bVar;
        b bVar2 = new b("SEMI_ACCENT", 1);
        SEMI_ACCENT = bVar2;
        b bVar3 = new b("FLAT", 2);
        FLAT = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
