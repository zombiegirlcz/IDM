package zm3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BUSINESS;
    public static final k INDIVIDUAL;
    public static final k JUNIOR;

    static {
        k kVar = new k("INDIVIDUAL", 0);
        INDIVIDUAL = kVar;
        k kVar2 = new k("BUSINESS", 1);
        BUSINESS = kVar2;
        k kVar3 = new k("JUNIOR", 2);
        JUNIOR = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
