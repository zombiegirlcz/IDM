package hqb;

import android.graphics.drawable.GradientDrawable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.lm;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0882a Companion = new C0882a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lm f154655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lm f154656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lm f154657c;
    public static final lm d;

    /* JADX INFO: renamed from: hqb.a$a, reason: collision with other inner class name */
    public static final class C0882a {
        private C0882a() {
        }
    }

    static {
        int i = R$attr.uikit_colorPlanUltraDark_30;
        int i2 = R$attr.uikit_colorTransparent;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        f154655a = new lm(new UiKitGradient(new int[]{R$attr.uikit_colorPlanUltraDark_40, R$attr.uikit_colorPlanUltraLight_40, R$attr.uikit_colorPlanUltraMid_40, R$attr.uikit_colorPlanUltraLightBlue_40}, new float[]{0.2f, 0.5f, 0.8f, 1.0f}, GradientDrawable.Orientation.BL_TR), new UiKitGradient(i, i2));
        f154656b = new lm(new UiKitGradient(R$attr.uikit_colorPlanPremiumMid_40, R$attr.uikit_colorPlanPremiumLight_40, 0), new UiKitGradient(R$attr.uikit_colorPlanPremiumMid_30, R$attr.uikit_colorTransparent));
        f154657c = new lm(new UiKitGradient(R$attr.uikit_colorPlanMetalDark_40, R$attr.uikit_colorPlanMetalLight_40, 0), new UiKitGradient(R$attr.uikit_colorPlanMetalDark_30, R$attr.uikit_colorTransparent));
        d = new lm(new UiKitGradient(R$attr.uikit_colorForeground_10, R$attr.uikit_colorForeground, 0), new UiKitGradient(R$attr.uikit_colorForeground_20, R$attr.uikit_colorForeground_10));
    }

    public static HighlightTileDelegate.Model a(pjb.b upgrade) {
        int i;
        Pair pair;
        lm lmVar;
        Intrinsics.checkNotNullParameter(upgrade, "upgrade");
        TextClause textClause = new TextClause(upgrade.f236721c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        pjb.a aVar = upgrade.e;
        int[] iArr = b.f154658a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 2:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_lock_opened;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_lock_opened;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        qkb.a aVar2 = new qkb.a(upgrade.d);
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_chevron_right), Integer.valueOf(R$attr.uikit_colorGreyTone20));
                break;
            case 5:
            case 6:
                pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_chevron_right), Integer.valueOf(R$attr.uikit_colorForeground));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ResourceImage resourceImage2 = new ResourceImage(((Number) pair.f186385a).intValue(), (Integer) null, (Integer) null, Integer.valueOf(((Number) pair.f186386b).intValue()), (List) null, (ImageTransformations) null, (Clause) null, 246);
        switch (iArr[aVar.ordinal()]) {
            case 1:
                lmVar = f154655a;
                break;
            case 2:
                lmVar = f154657c;
                break;
            case 3:
                lmVar = f154656b;
                break;
            case 4:
            case 6:
                lmVar = null;
                break;
            case 5:
                lmVar = d;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new HighlightTileDelegate.Model("SAVINGS_BANNER_ITEM_ID", textClause, resourceImage, true, aVar2, null, resourceImage2, null, lmVar, 840);
    }
}
