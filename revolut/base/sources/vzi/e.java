package vzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AMOUNT_PICKER;
    public static final e DROPDOWN_BOTTOM_SHEET;
    public static final e DROPDOWN_DATE_PICKER;
    public static final e DROPDOWN_MODAL;
    public static final e DROPDOWN_NATIVE_DATE_PICKER;
    public static final e TEXT_LINE;
    public static final e UNKNOWN;

    static {
        e eVar = new e("AMOUNT_PICKER", 0);
        AMOUNT_PICKER = eVar;
        e eVar2 = new e("TEXT_LINE", 1);
        TEXT_LINE = eVar2;
        e eVar3 = new e("DROPDOWN_MODAL", 2);
        DROPDOWN_MODAL = eVar3;
        e eVar4 = new e("DROPDOWN_BOTTOM_SHEET", 3);
        DROPDOWN_BOTTOM_SHEET = eVar4;
        e eVar5 = new e("DROPDOWN_DATE_PICKER", 4);
        DROPDOWN_DATE_PICKER = eVar5;
        e eVar6 = new e("DROPDOWN_NATIVE_DATE_PICKER", 5);
        DROPDOWN_NATIVE_DATE_PICKER = eVar6;
        e eVar7 = new e("UNKNOWN", 6);
        UNKNOWN = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
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
