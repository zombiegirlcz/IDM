package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class lw {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ lw[] $VALUES;
    public static final lw ACCENT;
    private final int colorAttr;

    static {
        lw lwVar = new lw(R$attr.uikit_colorAccent_20);
        ACCENT = lwVar;
        lw[] lwVarArr = {lwVar};
        $VALUES = lwVarArr;
        $ENTRIES = vc.s.n(lwVarArr);
    }

    public lw(int i) {
        this.colorAttr = i;
    }

    public static lw valueOf(String str) {
        return (lw) Enum.valueOf(lw.class, str);
    }

    public static lw[] values() {
        return (lw[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorAttr;
    }
}
