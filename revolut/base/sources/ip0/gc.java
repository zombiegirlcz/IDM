package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class gc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ gc[] $VALUES;
    public static final gc ACTIVE;
    public static final gc ERROR;

    static {
        gc gcVar = new gc("ACTIVE", 0);
        ACTIVE = gcVar;
        gc gcVar2 = new gc("ERROR", 1);
        ERROR = gcVar2;
        gc[] gcVarArr = {gcVar, gcVar2};
        $VALUES = gcVarArr;
        $ENTRIES = vc.s.n(gcVarArr);
    }

    public static gc valueOf(String str) {
        return (gc) Enum.valueOf(gc.class, str);
    }

    public static gc[] values() {
        return (gc[]) $VALUES.clone();
    }
}
