package i7b;

import android.graphics.drawable.GradientDrawable;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.lm;
import ip0.tm;
import kotlin.enums.EnumEntries;
import ngm.n;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final k Companion;
    public static final l METAL;
    public static final l PLUS;
    public static final l PREMIUM;
    public static final l PRIVATE;
    public static final l ULTRA;
    private final tm appearance;

    static {
        l lVar = new l("PLUS", 0, null);
        PLUS = lVar;
        int i = R$attr.uikit_colorPlanPremiumMid_30;
        int i2 = R$attr.uikit_colorTransparent;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        l lVar2 = new l("PREMIUM", 1, new lm(new UiKitGradient(R$attr.uikit_colorPlanPremiumMid_40, R$attr.uikit_colorPlanPremiumLight_40, 0), new UiKitGradient(i, i2)));
        PREMIUM = lVar2;
        l lVar3 = new l("METAL", 2, new lm(new UiKitGradient(R$attr.uikit_colorPlanMetalDark_40, R$attr.uikit_colorPlanMetalLight_40, 0), new UiKitGradient(R$attr.uikit_colorPlanMetalDark_30, R$attr.uikit_colorTransparent)));
        METAL = lVar3;
        l lVar4 = new l("ULTRA", 3, n.d());
        ULTRA = lVar4;
        l lVar5 = new l("PRIVATE", 4, n.d());
        PRIVATE = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, lm lmVar) {
        this.appearance = lmVar;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final tm a() {
        return this.appearance;
    }
}
