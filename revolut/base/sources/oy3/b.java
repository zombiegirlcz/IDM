package oy3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b INDIGO;
    public static final b PINK;
    public static final b TEAL;
    public static final b TERRACOTTA;
    public static final b YELLOW;

    static {
        b bVar = new b("TERRACOTTA", 0);
        TERRACOTTA = bVar;
        b bVar2 = new b("PINK", 1);
        PINK = bVar2;
        b bVar3 = new b("INDIGO", 2);
        INDIGO = bVar3;
        b bVar4 = new b("TEAL", 3);
        TEAL = bVar4;
        b bVar5 = new b("YELLOW", 4);
        YELLOW = bVar5;
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
