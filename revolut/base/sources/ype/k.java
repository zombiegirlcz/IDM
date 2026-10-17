package ype;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k DEFAULT;
    public static final k MISSING_TIN_REQUEST;

    static {
        k kVar = new k("DEFAULT", 0);
        DEFAULT = kVar;
        k kVar2 = new k("MISSING_TIN_REQUEST", 1);
        MISSING_TIN_REQUEST = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
