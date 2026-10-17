package g27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu6.b f139943a;

    public y(qu6.b acquiringOrderMapper, ct6.c freelancerBannerFactory, a0 pageDetailsMapper, jr6.t salesListItemMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderMapper, "acquiringOrderMapper");
        Intrinsics.checkNotNullParameter(freelancerBannerFactory, "freelancerBannerFactory");
        Intrinsics.checkNotNullParameter(pageDetailsMapper, "pageDetailsMapper");
        Intrinsics.checkNotNullParameter(salesListItemMapper, "salesListItemMapper");
        this.f139943a = acquiringOrderMapper;
    }

    public static ActionsView.Item a(OrderInitiationPage orderInitiationPage) {
        return new ActionsView.Item("ACTION_ID_MARK_AS_COMPETED", null, false, null, null, new TextLocalisedClause(R$string.freelancer_payment_links_details_action_mark_as_completed, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, orderInitiationPage, null, 24478);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f139920a, new g1k.k(5), new g0c.h(12), new fyg.b(this, domainState, 4));
    }
}
