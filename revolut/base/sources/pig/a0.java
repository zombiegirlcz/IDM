package pig;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesProviderSummary;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import hfg.t0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pgg.b f236475a;

    public a0(TravelMilesTransferScreenContract$InputData inputData, agg.d travelMilesFormatter, agg.a milesCalculator, pgg.b integerMoneyInputFilter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelMilesFormatter, "travelMilesFormatter");
        Intrinsics.checkNotNullParameter(milesCalculator, "milesCalculator");
        Intrinsics.checkNotNullParameter(integerMoneyInputFilter, "integerMoneyInputFilter");
        this.f236475a = integerMoneyInputFilter;
    }

    public static LayeredImage a() {
        List listK = zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_gradient_background, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_16_revpoints, Integer.valueOf(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_INSIDE, 60));
        Float fValueOf = Float.valueOf(24.0f);
        return new LayeredImage(listK, fValueOf, fValueOf, 8);
    }

    public static t0 b(j jVar) {
        TravelMilesProviderSummary travelMilesProviderSummary;
        t0 t0Var;
        TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) jVar.f236482b.getContent();
        return (travelMilesAccountV2 == null || (travelMilesProviderSummary = travelMilesAccountV2.f94087c) == null || (t0Var = travelMilesProviderSummary.d) == null) ? t0.MILES : t0Var;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(t1.u(domainState.d, domainState.e, domainState.f236482b), new pb2.v(25, domainState, this), new pch.f(23), new ox2.d(this, domainState, 12));
    }
}
