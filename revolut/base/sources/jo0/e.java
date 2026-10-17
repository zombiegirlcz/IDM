package jo0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DAY;
    public static final e NIGHT;
    public static final e SYSTEM;
    private final int resId;

    static {
        e eVar = new e("DAY", 0, R$drawable.internal_theme_mode_light);
        DAY = eVar;
        e eVar2 = new e("NIGHT", 1, R$drawable.internal_theme_mode_dark);
        NIGHT = eVar2;
        e eVar3 = new e("SYSTEM", 2, R$drawable.internal_theme_mode_system);
        SYSTEM = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, int i2) {
        this.resId = i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.resId;
    }
}
