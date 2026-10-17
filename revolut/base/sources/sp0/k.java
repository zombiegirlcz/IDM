package sp0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k HORIZONTAL;
    public static final k VERTICAL;

    static {
        k kVar = new k("VERTICAL", 0);
        VERTICAL = kVar;
        k kVar2 = new k("HORIZONTAL", 1);
        HORIZONTAL = kVar2;
        k[] kVarArr = {kVar, kVar2};
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
