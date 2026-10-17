package qdh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Africa;
    public static final a Antarctica;
    public static final a Asia;
    public static final a Europe;
    public static final a NorthAmerica;
    public static final a Oceania;
    public static final a SouthAmerica;
    public static final a UNSPECIFIED;

    @NotNull
    private final String regionName;

    static {
        a aVar = new a("Africa", 0, "AF");
        Africa = aVar;
        a aVar2 = new a("Asia", 1, "AS");
        Asia = aVar2;
        a aVar3 = new a("Europe", 2, "EU");
        Europe = aVar3;
        a aVar4 = new a("NorthAmerica", 3, "NA");
        NorthAmerica = aVar4;
        a aVar5 = new a("SouthAmerica", 4, "SA");
        SouthAmerica = aVar5;
        a aVar6 = new a("Oceania", 5, "OC");
        Oceania = aVar6;
        a aVar7 = new a("Antarctica", 6, "AN");
        Antarctica = aVar7;
        a aVar8 = new a("UNSPECIFIED", 7, "UNSPECIFIED");
        UNSPECIFIED = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.regionName = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.regionName;
    }
}
