package bfi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOOKED;
    public static final a CHECKOUT;
    public static final a PROPERTIES_AVAILABILITY;
    public static final a PROPERTY_DETAILS;
    public static final a ROOMS;

    static {
        a aVar = new a("PROPERTIES_AVAILABILITY", 0);
        PROPERTIES_AVAILABILITY = aVar;
        a aVar2 = new a("PROPERTY_DETAILS", 1);
        PROPERTY_DETAILS = aVar2;
        a aVar3 = new a("ROOMS", 2);
        ROOMS = aVar3;
        a aVar4 = new a("CHECKOUT", 3);
        CHECKOUT = aVar4;
        a aVar5 = new a("BOOKED", 4);
        BOOKED = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
