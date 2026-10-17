package yja;

import aii.r;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALREADY_SHOWN;
    public static final b CLOSE_CLICK;
    public static final b NEXT_CLICK;
    public static final b NOT_FOUND;

    static {
        b bVar = new b("NOT_FOUND", 0);
        NOT_FOUND = bVar;
        b bVar2 = new b("ALREADY_SHOWN", 1);
        ALREADY_SHOWN = bVar2;
        b bVar3 = new b("CLOSE_CLICK", 2);
        CLOSE_CLICK = bVar3;
        b bVar4 = new b("NEXT_CLICK", 3);
        NEXT_CLICK = bVar4;
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
