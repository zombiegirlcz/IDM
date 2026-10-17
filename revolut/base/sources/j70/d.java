package j70;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d HIGH;
    public static final d LOW;
    public static final d MEDIUM;
    public static final d UNDEFINED;

    static {
        d dVar = new d("UNDEFINED", 0);
        UNDEFINED = dVar;
        d dVar2 = new d("LOW", 1);
        LOW = dVar2;
        d dVar3 = new d("MEDIUM", 2);
        MEDIUM = dVar3;
        d dVar4 = new d("HIGH", 3);
        HIGH = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
