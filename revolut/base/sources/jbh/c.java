package jbh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static Image a(vel.f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        if ((performanceAsset instanceof vel.c) || (performanceAsset instanceof vel.e)) {
            return new InstrumentImage(performanceAsset.a(), 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone20));
        }
        if (performanceAsset instanceof vel.d) {
            return new CurrencyImage(((vel.d) performanceAsset).f288352a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (!(performanceAsset instanceof vel.b)) {
            throw new NoWhenBranchMatchedException();
        }
        vel.a aVar = ((vel.b) performanceAsset).f288347a;
        return new PairedImage(new CurrencyImage(aVar.f288344a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(aVar.f288345b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
    }
}
