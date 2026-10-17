package oee;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DELIVERED_PRIORITY_NOT_ACTIVATED;
    public static final d ETA_TODAY_PRIORITY_NOT_ACTIVATED;
    public static final d ETA_TODAY_STANDARD_NOT_ACTIVATED;

    static {
        d dVar = new d("ETA_TODAY_STANDARD_NOT_ACTIVATED", 0);
        ETA_TODAY_STANDARD_NOT_ACTIVATED = dVar;
        d dVar2 = new d("DELIVERED_PRIORITY_NOT_ACTIVATED", 1);
        DELIVERED_PRIORITY_NOT_ACTIVATED = dVar2;
        d dVar3 = new d("ETA_TODAY_PRIORITY_NOT_ACTIVATED", 2);
        ETA_TODAY_PRIORITY_NOT_ACTIVATED = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
