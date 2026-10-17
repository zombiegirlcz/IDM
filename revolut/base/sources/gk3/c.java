package gk3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CITY;

    @NotNull
    public static final b Companion;
    public static final c FLAT;
    public static final c HOUSE_NUMBER;
    public static final c LANDMARK;
    public static final c NEIGHBOURHOOD;
    public static final c POSTCODE;
    public static final c REGION;
    public static final c STR;
    public static final c STR1;
    public static final c STR2;
    public static final c STR_TYPE;
    public static final c UNKNOWN;

    static {
        c cVar = new c("STR1", 0);
        STR1 = cVar;
        c cVar2 = new c("STR2", 1);
        STR2 = cVar2;
        c cVar3 = new c("STR", 2);
        STR = cVar3;
        c cVar4 = new c("STR_TYPE", 3);
        STR_TYPE = cVar4;
        c cVar5 = new c("HOUSE_NUMBER", 4);
        HOUSE_NUMBER = cVar5;
        c cVar6 = new c("FLAT", 5);
        FLAT = cVar6;
        c cVar7 = new c("NEIGHBOURHOOD", 6);
        NEIGHBOURHOOD = cVar7;
        c cVar8 = new c("CITY", 7);
        CITY = cVar8;
        c cVar9 = new c("REGION", 8);
        REGION = cVar9;
        c cVar10 = new c("POSTCODE", 9);
        POSTCODE = cVar10;
        c cVar11 = new c("LANDMARK", 10);
        LANDMARK = cVar11;
        c cVar12 = new c("UNKNOWN", 11);
        UNKNOWN = cVar12;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
