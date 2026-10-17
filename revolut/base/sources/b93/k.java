package b93;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CREATED_DATE;
    public static final k LAST_USED;
    public static final k VIRTUAL_FIRST;

    static {
        k kVar = new k("CREATED_DATE", 0);
        CREATED_DATE = kVar;
        k kVar2 = new k("LAST_USED", 1);
        LAST_USED = kVar2;
        k kVar3 = new k("VIRTUAL_FIRST", 2);
        VIRTUAL_FIRST = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
