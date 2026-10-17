package xv0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BEGIN;
    public static final k END;

    static {
        k kVar = new k("BEGIN", 0);
        BEGIN = kVar;
        k kVar2 = new k("END", 1);
        END = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
