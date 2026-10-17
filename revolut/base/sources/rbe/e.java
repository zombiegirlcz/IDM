package rbe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import i9e.f;
import ip0.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6d.h;
import r7i.r;
import vz1.g;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends abe.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f253034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f253035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f253036c;
    public final l80.e d;
    public final sb2.b e;

    public e(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, g apmPaymentsAuthorisationsRepository, l80.e dateProvider, sb2.b paymentAuthorisationFrequencyMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(paymentAuthorisationFrequencyMapper, "paymentAuthorisationFrequencyMapper");
        this.f253034a = commonSubscriptionMapper;
        this.f253035b = paymentFromItemMapper;
        this.f253036c = apmPaymentsAuthorisationsRepository;
        this.d = dateProvider;
        this.e = paymentAuthorisationFrequencyMapper;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!model.e) {
            return null;
        }
        f fVar = (f) this.f253034a;
        return fVar.c(v.k(fVar.x(), new ActionsView.Item("ID_DEACTIVATE_ACTION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.mandate_details_action_cancel_future_payments_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return (List) iii.c.f(model.f253027c, new r(21), new h(28), new c(this, model, 0));
    }

    @Override // abe.a
    public final efm.r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        efm.r map = rd0.e.c(this.f253036c.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), kotlin.coroutines.g.f186406a).map(new r83.d(24, new b(subscriptionContent, this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final efm.r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        efm.r map = rd0.e.c(this.f253036c.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), kotlin.coroutines.g.f186406a).map(new r83.d(23, new b(subscriptionContent, this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "with(...)");
        return map;
    }
}
