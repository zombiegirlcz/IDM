package eda;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL_ADDED;
    public static final d CAN_BE_ADDED;
    public static final d DISABLED;

    static {
        d dVar = new d("DISABLED", 0);
        DISABLED = dVar;
        d dVar2 = new d("CAN_BE_ADDED", 1);
        CAN_BE_ADDED = dVar2;
        d dVar3 = new d("ALL_ADDED", 2);
        ALL_ADDED = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
