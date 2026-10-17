package uyl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i EDITOR;
    public static final i EDITOR_ALPHANUMERIC;
    public static final i EDITOR_AMOUNT;
    public static final i EDITOR_DISABLED;
    public static final i EDITOR_HINT_ONLY;
    public static final i EDITOR_HINT_ONLY_DISABLED;
    public static final i PICKER;
    public static final i PICKER_DISABLED;
    public static final i PICKER_SINGLE_ELEMENT;

    static {
        i iVar = new i("EDITOR", 0);
        EDITOR = iVar;
        i iVar2 = new i("PICKER", 1);
        PICKER = iVar2;
        i iVar3 = new i("PICKER_SINGLE_ELEMENT", 2);
        PICKER_SINGLE_ELEMENT = iVar3;
        i iVar4 = new i("EDITOR_HINT_ONLY", 3);
        EDITOR_HINT_ONLY = iVar4;
        i iVar5 = new i("EDITOR_HINT_ONLY_DISABLED", 4);
        EDITOR_HINT_ONLY_DISABLED = iVar5;
        i iVar6 = new i("PICKER_DISABLED", 5);
        PICKER_DISABLED = iVar6;
        i iVar7 = new i("EDITOR_DISABLED", 6);
        EDITOR_DISABLED = iVar7;
        i iVar8 = new i("EDITOR_ALPHANUMERIC", 7);
        EDITOR_ALPHANUMERIC = iVar8;
        i iVar9 = new i("EDITOR_AMOUNT", 8);
        EDITOR_AMOUNT = iVar9;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
