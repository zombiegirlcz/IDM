package cgi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AFTER;
    public static final b ANYTIME;
    public static final b BEFORE;
    public static final b WINDOW;

    static {
        b bVar = new b("BEFORE", 0);
        BEFORE = bVar;
        b bVar2 = new b("WINDOW", 1);
        WINDOW = bVar2;
        b bVar3 = new b("AFTER", 2);
        AFTER = bVar3;
        b bVar4 = new b("ANYTIME", 3);
        ANYTIME = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
