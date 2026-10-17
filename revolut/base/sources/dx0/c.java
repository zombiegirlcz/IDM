package dx0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c DEFAULT;
    public static final c SHOWCASE;
    public static final c TRANSPARENT;

    @NotNull
    private final b iconsAppearance;

    @NotNull
    private final Color navigationBarColor;
    private final Boolean navigationBarContrastEnforced;

    @NotNull
    private final Color navigationBarDividerColor;

    static {
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorBackground);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorGreyTone5);
        Boolean bool = Boolean.TRUE;
        b bVar = b.THEME;
        c cVar = new c("DEFAULT", 0, solid, solid2, bool, bVar);
        DEFAULT = cVar;
        int i = R$attr.uikit_colorTransparent;
        c cVar2 = new c("TRANSPARENT", 1, new Color.Solid(i), new Color.Solid(i), Boolean.FALSE, bVar);
        TRANSPARENT = cVar2;
        c cVar3 = new c("SHOWCASE", 2, new Color.Solid(i), new Color.Solid(i), bool, b.LIGHT);
        SHOWCASE = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new a();
    }

    public c(String str, int i, Color.Solid solid, Color.Solid solid2, Boolean bool, b bVar) {
        this.navigationBarColor = solid;
        this.navigationBarDividerColor = solid2;
        this.navigationBarContrastEnforced = bool;
        this.iconsAppearance = bVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final b a() {
        return this.iconsAppearance;
    }

    public final Color b() {
        return this.navigationBarColor;
    }

    public final Boolean c() {
        return this.navigationBarContrastEnforced;
    }

    public final Color d() {
        return this.navigationBarDividerColor;
    }
}
