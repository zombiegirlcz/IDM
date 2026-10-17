package ty0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DEFAULT;
    public static final b FORCE_EVERYTHING;
    public static final b FORCE_LINKS;

    static {
        b bVar = new b("DEFAULT", 0);
        DEFAULT = bVar;
        b bVar2 = new b("FORCE_EVERYTHING", 1);
        FORCE_EVERYTHING = bVar2;
        b bVar3 = new b("FORCE_LINKS", 2);
        FORCE_LINKS = bVar3;
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
