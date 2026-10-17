package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class zh {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ zh[] $VALUES;
    public static final zh DISABLED;
    public static final zh ENABLED;

    static {
        zh zhVar = new zh("ENABLED", 0);
        ENABLED = zhVar;
        zh zhVar2 = new zh("DISABLED", 1);
        DISABLED = zhVar2;
        zh[] zhVarArr = {zhVar, zhVar2};
        $VALUES = zhVarArr;
        $ENTRIES = vc.s.n(zhVarArr);
    }

    public static zh valueOf(String str) {
        return (zh) Enum.valueOf(zh.class, str);
    }

    public static zh[] values() {
        return (zh[]) $VALUES.clone();
    }
}
