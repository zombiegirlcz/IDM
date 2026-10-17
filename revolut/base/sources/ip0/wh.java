package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class wh {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wh[] $VALUES;
    public static final wh ACTIVE;
    public static final wh DISABLED;
    public static final wh INACTIVE;

    static {
        wh whVar = new wh("ACTIVE", 0);
        ACTIVE = whVar;
        wh whVar2 = new wh("INACTIVE", 1);
        INACTIVE = whVar2;
        wh whVar3 = new wh("DISABLED", 2);
        DISABLED = whVar3;
        wh[] whVarArr = {whVar, whVar2, whVar3};
        $VALUES = whVarArr;
        $ENTRIES = vc.s.n(whVarArr);
    }

    public static wh valueOf(String str) {
        return (wh) Enum.valueOf(wh.class, str);
    }

    public static wh[] values() {
        return (wh[]) $VALUES.clone();
    }
}
