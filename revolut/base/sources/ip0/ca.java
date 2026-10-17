package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ca {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ca[] $VALUES;
    public static final ca ASSET;
    public static final ca PROGRESS;

    static {
        ca caVar = new ca("PROGRESS", 0);
        PROGRESS = caVar;
        ca caVar2 = new ca("ASSET", 1);
        ASSET = caVar2;
        ca[] caVarArr = {caVar, caVar2};
        $VALUES = caVarArr;
        $ENTRIES = vc.s.n(caVarArr);
    }

    public static ca valueOf(String str) {
        return (ca) Enum.valueOf(ca.class, str);
    }

    public static ca[] values() {
        return (ca[]) $VALUES.clone();
    }
}
