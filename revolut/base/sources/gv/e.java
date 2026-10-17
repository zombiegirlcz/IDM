package gv;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e SHUTTER_BUTTON_CLICKED;
    public static final e SUCCESS_DETECTION;

    static {
        e eVar = new e("SHUTTER_BUTTON_CLICKED", 0);
        SHUTTER_BUTTON_CLICKED = eVar;
        e eVar2 = new e("SUCCESS_DETECTION", 1);
        SUCCESS_DETECTION = eVar2;
        e[] eVarArr = {eVar, eVar2};
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
