package fdl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t ALL;
    public static final t FIVE_YEARS;
    public static final t TEN_YEARS;

    @NotNull
    private final String value;

    static {
        t tVar = new t("FIVE_YEARS", 0, "5Y");
        FIVE_YEARS = tVar;
        t tVar2 = new t("TEN_YEARS", 1, "10Y");
        TEN_YEARS = tVar2;
        t tVar3 = new t("ALL", 2, "MAX");
        ALL = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public t(String str, int i, String str2) {
        this.value = str2;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
