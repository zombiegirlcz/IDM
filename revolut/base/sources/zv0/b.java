package zv0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COLLAPSED;
    public static final b EXPANDED;
    public static final b HALF_EXPANDED;
    public static final b HIDDEN;

    static {
        b bVar = new b("EXPANDED", 0);
        EXPANDED = bVar;
        b bVar2 = new b("HALF_EXPANDED", 1);
        HALF_EXPANDED = bVar2;
        b bVar3 = new b("COLLAPSED", 2);
        COLLAPSED = bVar3;
        b bVar4 = new b("HIDDEN", 3);
        HIDDEN = bVar4;
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
