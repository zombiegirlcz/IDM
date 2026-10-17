package tj1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACCOUNT_SWITCHER_DISCOVERY_PRODUCT;
    public static final e ACCOUNT_SWITCHER_PRODUCT;
    public static final e ADD_NEW_WIDGET_PRODUCT;
    public static final e TAB;
    public static final e UNKNOWN;
    public static final e WIDGET;

    static {
        e eVar = new e("UNKNOWN", 0);
        UNKNOWN = eVar;
        e eVar2 = new e("TAB", 1);
        TAB = eVar2;
        e eVar3 = new e("WIDGET", 2);
        WIDGET = eVar3;
        e eVar4 = new e("ACCOUNT_SWITCHER_PRODUCT", 3);
        ACCOUNT_SWITCHER_PRODUCT = eVar4;
        e eVar5 = new e("ADD_NEW_WIDGET_PRODUCT", 4);
        ADD_NEW_WIDGET_PRODUCT = eVar5;
        e eVar6 = new e("ACCOUNT_SWITCHER_DISCOVERY_PRODUCT", 5);
        ACCOUNT_SWITCHER_DISCOVERY_PRODUCT = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
