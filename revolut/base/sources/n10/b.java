package n10;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DISPOSABLE;
    public static final b PHYSICAL;
    public static final b VIRTUAL;

    static {
        b bVar = new b("PHYSICAL", 0);
        PHYSICAL = bVar;
        b bVar2 = new b("VIRTUAL", 1);
        VIRTUAL = bVar2;
        b bVar3 = new b("DISPOSABLE", 2);
        DISPOSABLE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
