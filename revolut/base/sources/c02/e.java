package c02;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CASH_WITHDRAWAL;
    public static final e POS_PURCHASE;
    public static final e POS_RETURN;
    public static final e WEB_PURCHASE;
    public static final e WEB_RETURN;

    @NotNull
    private final String serializedName;

    static {
        e eVar = new e("POS_PURCHASE", 0, "POS_PURCHASE");
        POS_PURCHASE = eVar;
        e eVar2 = new e("POS_RETURN", 1, "POS_RETURN");
        POS_RETURN = eVar2;
        e eVar3 = new e("WEB_PURCHASE", 2, "WEB_PURCHASE");
        WEB_PURCHASE = eVar3;
        e eVar4 = new e("WEB_RETURN", 3, "WEB_RETURN");
        WEB_RETURN = eVar4;
        e eVar5 = new e("CASH_WITHDRAWAL", 4, "CASH_WITHDRAWAL");
        CASH_WITHDRAWAL = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
