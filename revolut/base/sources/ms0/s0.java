package ms0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 ACCENT;
    public static final s0 REGULAR;

    @NotNull
    private final LargeActionButton.ButtonStyle buttonStyle;

    static {
        s0 s0Var = new s0("REGULAR", 0, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Solid(R$attr.uikit_colorGreyTone10), 0, R$attr.uikit_colorForeground, BitmapDescriptorFactory.HUE_RED, null, null, 58));
        REGULAR = s0Var;
        s0 s0Var2 = new s0("ACCENT", 1, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0, 0, BitmapDescriptorFactory.HUE_RED, new Color.Solid(R$attr.uikit_colorAccentNeutral_60), null, 46));
        ACCENT = s0Var2;
        s0[] s0VarArr = {s0Var, s0Var2};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public s0(String str, int i, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        this.buttonStyle = defaultFilledButton;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final LargeActionButton.ButtonStyle a() {
        return this.buttonStyle;
    }
}
