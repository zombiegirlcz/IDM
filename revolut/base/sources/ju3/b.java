package ju3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DEFAULT;
    public static final b INVISIBLE;
    public static final b QUICK_READ_ACTION_SUPPORT;

    static {
        b bVar = new b("INVISIBLE", 0);
        INVISIBLE = bVar;
        b bVar2 = new b("QUICK_READ_ACTION_SUPPORT", 1);
        QUICK_READ_ACTION_SUPPORT = bVar2;
        b bVar3 = new b("DEFAULT", 2);
        DEFAULT = bVar3;
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
