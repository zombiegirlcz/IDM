package zme;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DISCLOSURE_MANDATORY;
    public static final b DISCLOSURE_OPTIONAL;
    public static final b MANDATORY;

    static {
        b bVar = new b("DISCLOSURE_OPTIONAL", 0);
        DISCLOSURE_OPTIONAL = bVar;
        b bVar2 = new b("DISCLOSURE_MANDATORY", 1);
        DISCLOSURE_MANDATORY = bVar2;
        b bVar3 = new b("MANDATORY", 2);
        MANDATORY = bVar3;
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
