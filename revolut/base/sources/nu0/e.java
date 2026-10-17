package nu0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PAUSE;
    public static final e PLAY;
    private final int resId;

    static {
        e eVar = new e("PLAY", 0, R$drawable.uikit_icn_24_play);
        PLAY = eVar;
        e eVar2 = new e("PAUSE", 1, R$drawable.uikit_icn_24_pause);
        PAUSE = eVar2;
        e[] eVarArr = {eVar, eVar2};
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
