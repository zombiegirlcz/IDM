package ksf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CATEGORY;
    public static final b PREDEFINED_CATEGORY;
    public static final b PREDEFINED_REASON;
    public static final b REASON;

    static {
        b bVar = new b("CATEGORY", 0);
        CATEGORY = bVar;
        b bVar2 = new b("REASON", 1);
        REASON = bVar2;
        b bVar3 = new b("PREDEFINED_CATEGORY", 2);
        PREDEFINED_CATEGORY = bVar3;
        b bVar4 = new b("PREDEFINED_REASON", 3);
        PREDEFINED_REASON = bVar4;
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
