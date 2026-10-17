package vzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COLLECTIBLE;
    public static final b FINE_ART_AND_ANTIQUE;
    public static final b JEWELLERY;
    public static final b OTHER;
    public static final b PROPERTY;
    public static final b UNKNOWN;
    public static final b VEHICLE;
    public static final b WATCH;

    static {
        b bVar = new b("PROPERTY", 0);
        PROPERTY = bVar;
        b bVar2 = new b("VEHICLE", 1);
        VEHICLE = bVar2;
        b bVar3 = new b("FINE_ART_AND_ANTIQUE", 2);
        FINE_ART_AND_ANTIQUE = bVar3;
        b bVar4 = new b("COLLECTIBLE", 3);
        COLLECTIBLE = bVar4;
        b bVar5 = new b("WATCH", 4);
        WATCH = bVar5;
        b bVar6 = new b("JEWELLERY", 5);
        JEWELLERY = bVar6;
        b bVar7 = new b("OTHER", 6);
        OTHER = bVar7;
        b bVar8 = new b("UNKNOWN", 7);
        UNKNOWN = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
