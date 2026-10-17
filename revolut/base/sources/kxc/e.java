package kxc;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AMOUNT;
    public static final e CUSTOMER_NAME;
    public static final e DATE;
    public static final e SENDER_NAME;
    public static final e SPECIAL_REQUIREMENT;
    private final int iconDrawable;

    static {
        e eVar = new e("CUSTOMER_NAME", 0, R$drawable.uikit_icn_24_profile);
        CUSTOMER_NAME = eVar;
        e eVar2 = new e("AMOUNT", 1, R$drawable.uikit_icn_24_cash);
        AMOUNT = eVar2;
        e eVar3 = new e("DATE", 2, R$drawable.uikit_icn_24_calendar_date);
        DATE = eVar3;
        e eVar4 = new e("SENDER_NAME", 3, R$drawable.uikit_icn_24_bank);
        SENDER_NAME = eVar4;
        e eVar5 = new e("SPECIAL_REQUIREMENT", 4, R$drawable.uikit_icn_24_statement);
        SPECIAL_REQUIREMENT = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, int i2) {
        this.iconDrawable = i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.iconDrawable;
    }
}
