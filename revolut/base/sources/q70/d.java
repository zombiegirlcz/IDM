package q70;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CITY_MAPPER;
    public static final d GOOGLE_MAPS;
    public static final d PETAL;
    public static final d WAZE;

    static {
        d dVar = new d("CITY_MAPPER", 0);
        CITY_MAPPER = dVar;
        d dVar2 = new d("GOOGLE_MAPS", 1);
        GOOGLE_MAPS = dVar2;
        d dVar3 = new d("WAZE", 2);
        WAZE = dVar3;
        d dVar4 = new d("PETAL", 3);
        PETAL = dVar4;
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
