package xoh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k NO_TABS;
    public static final k WITH_TABS;

    static {
        k kVar = new k("WITH_TABS", 0);
        WITH_TABS = kVar;
        k kVar2 = new k("NO_TABS", 1);
        NO_TABS = kVar2;
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
