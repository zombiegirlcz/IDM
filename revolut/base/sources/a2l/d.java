package a2l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d EMAIL;
    public static final d NUMERIC;
    public static final d TEXT;
    public static final d UNKNOWN;

    static {
        d dVar = new d("TEXT", 0);
        TEXT = dVar;
        d dVar2 = new d("NUMERIC", 1);
        NUMERIC = dVar2;
        d dVar3 = new d("EMAIL", 2);
        EMAIL = dVar3;
        d dVar4 = new d("UNKNOWN", 3);
        UNKNOWN = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
