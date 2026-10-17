package ybe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import dce.k0;
import efm.r;
import i9e.f;
import ip0.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import vz1.g;
import xwd.o;
import y65.n;
import y66.q;
import y99.x;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f312286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f312287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb2.b f312288c;

    public d(a9e.b commonSubscriptionMapper, g apmPaymentsAuthorisationsRepository, sb2.b paymentAuthorisationFrequencyMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(paymentAuthorisationFrequencyMapper, "paymentAuthorisationFrequencyMapper");
        this.f312286a = commonSubscriptionMapper;
        this.f312287b = apmPaymentsAuthorisationsRepository;
        this.f312288c = paymentAuthorisationFrequencyMapper;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!model.e) {
            return null;
        }
        f fVar = (f) this.f312286a;
        return fVar.c(v.k(fVar.x(), new ActionsView.Item("ID_DEACTIVATE_ACTION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_block_future_payments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return (List) iii.c.f(model.f312284c, new x(29), new n(17), new q(this, model, 4));
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        r map = e.c(this.f312287b.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), kotlin.coroutines.g.f186406a).map(new ya6.f(new k0(subscriptionContent, 4), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        r map = e.c(mo3.a.g(this.f312287b.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), null, null, 3), kotlin.coroutines.g.f186406a).map(new ya6.f(new o(this, 11, subscriptionContent, subscriptionContent), 8));
        Intrinsics.checkNotNullExpressionValue(map, "with(...)");
        return map;
    }
}
