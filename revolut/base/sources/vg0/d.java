package vg0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DISCOURAGED;
    public static final d PREFERRED;
    public static final d REQUIRED;

    static {
        d dVar = new d("DISCOURAGED", 0);
        DISCOURAGED = dVar;
        d dVar2 = new d("PREFERRED", 1);
        PREFERRED = dVar2;
        d dVar3 = new d("REQUIRED", 2);
        REQUIRED = dVar3;
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
