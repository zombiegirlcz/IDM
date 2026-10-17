package mha;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final q Companion;
    public static final r DEFAULT;
    public static final r HU_HIGHER_FREE_ATM;
    public static final r SEPA_PLUS;

    @NotNull
    private final String rawName;

    static {
        r rVar = new r("DEFAULT", 0, "default");
        DEFAULT = rVar;
        r rVar2 = new r("HU_HIGHER_FREE_ATM", 1, "hu-higher-free-atm");
        HU_HIGHER_FREE_ATM = rVar2;
        r rVar3 = new r("SEPA_PLUS", 2, "sepa-plus");
        SEPA_PLUS = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
        Companion = new q();
    }

    public r(String str, int i, String str2) {
        this.rawName = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final String b() {
        return this.rawName;
    }
}
