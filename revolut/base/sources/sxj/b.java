package sxj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LOGGED_IN;
    public static final b LOGGED_OUT;
    public static final b NEVER_LOGGED_IN;

    static {
        b bVar = new b("NEVER_LOGGED_IN", 0);
        NEVER_LOGGED_IN = bVar;
        b bVar2 = new b("LOGGED_IN", 1);
        LOGGED_IN = bVar2;
        b bVar3 = new b("LOGGED_OUT", 2);
        LOGGED_OUT = bVar3;
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
