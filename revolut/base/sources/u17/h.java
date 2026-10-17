package u17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f276357a;

    public h(t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f276357a = currenciesLocalization;
    }

    public final ActionsView.Item b(Set currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return g.a(currencies.size(), "CURRENCIES_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new u1.g(this, currencies, 4), new an.l(7, currencies));
    }
}
