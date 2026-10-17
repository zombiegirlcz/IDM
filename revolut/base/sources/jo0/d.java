package jo0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DAY;
    public static final d NIGHT;
    public static final d SYSTEM;
    public static final d TRANSPARENT_DARK;
    public static final d TRANSPARENT_LIGHT;
    public static final d TRANSPARENT_SYSTEM;
    private final int resId;

    static {
        d dVar = new d("DAY", 0, R$drawable.internal_theme_switcher_item_day);
        DAY = dVar;
        d dVar2 = new d("NIGHT", 1, R$drawable.internal_theme_switcher_item_night);
        NIGHT = dVar2;
        d dVar3 = new d("SYSTEM", 2, R$drawable.internal_theme_switcher_item_system);
        SYSTEM = dVar3;
        d dVar4 = new d("TRANSPARENT_DARK", 3, R$drawable.internal_theme_switcher_item_transparent_dark);
        TRANSPARENT_DARK = dVar4;
        d dVar5 = new d("TRANSPARENT_LIGHT", 4, R$drawable.internal_theme_switcher_item_transparent_light);
        TRANSPARENT_LIGHT = dVar5;
        d dVar6 = new d("TRANSPARENT_SYSTEM", 5, R$drawable.internal_theme_switcher_item_transparent_system);
        TRANSPARENT_SYSTEM = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, int i2) {
        this.resId = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.resId;
    }
}
