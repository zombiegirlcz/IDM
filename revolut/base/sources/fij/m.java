package fij;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m implements o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ALL;
    public static final m COUNTRY;
    public static final m GLOBAL;
    public static final m REGIONAL;

    @NotNull
    private final String value;

    static {
        m mVar = new m("GLOBAL", 0, "ID_TAB_DATA_PLANS_GLOBAL");
        GLOBAL = mVar;
        m mVar2 = new m("REGIONAL", 1, "ID_TAB_DATA_PLANS_REGION");
        REGIONAL = mVar2;
        m mVar3 = new m("COUNTRY", 2, "ID_TAB_DATA_PLANS_COUNTRY");
        COUNTRY = mVar3;
        m mVar4 = new m("ALL", 3, "ID_TAB_DATA_PLANS_ALL");
        ALL = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public m(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @Override // fij.o
    public final String getValue() {
        return this.value;
    }
}
