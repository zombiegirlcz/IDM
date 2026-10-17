package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hc[] $VALUES;
    public static final hc ACTIVE;
    public static final hc ERROR;

    static {
        hc hcVar = new hc("ACTIVE", 0);
        ACTIVE = hcVar;
        hc hcVar2 = new hc("ERROR", 1);
        ERROR = hcVar2;
        hc[] hcVarArr = {hcVar, hcVar2};
        $VALUES = hcVarArr;
        $ENTRIES = vc.s.n(hcVarArr);
    }

    public static hc valueOf(String str) {
        return (hc) Enum.valueOf(hc.class, str);
    }

    public static hc[] values() {
        return (hc[]) $VALUES.clone();
    }
}
