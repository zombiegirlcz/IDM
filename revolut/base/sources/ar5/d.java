package ar5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COMPATIBLE_ADDRESSES;
    public static final d INCOMPATIBLE_ADDRESSES;

    static {
        d dVar = new d("COMPATIBLE_ADDRESSES", 0);
        COMPATIBLE_ADDRESSES = dVar;
        d dVar2 = new d("INCOMPATIBLE_ADDRESSES", 1);
        INCOMPATIBLE_ADDRESSES = dVar2;
        d[] dVarArr = {dVar, dVar2};
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
