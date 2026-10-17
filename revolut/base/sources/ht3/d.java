package ht3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ITEM_BUTTON;
    public static final d PRIMARY_BUTTON;
    public static final d SECONDARY_BUTTON;

    static {
        d dVar = new d("PRIMARY_BUTTON", 0);
        PRIMARY_BUTTON = dVar;
        d dVar2 = new d("SECONDARY_BUTTON", 1);
        SECONDARY_BUTTON = dVar2;
        d dVar3 = new d("ITEM_BUTTON", 2);
        ITEM_BUTTON = dVar3;
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
