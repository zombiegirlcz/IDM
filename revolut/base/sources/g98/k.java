package g98;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.junior.card_request.impl.R$string;
import com.revolut.feature.junior_card.api.navigation.CardRequestReviewConfig;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements hc8.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic8.b f141507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f141508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te8.e f141509c;
    public final jla.h d;
    public final jt0.b e;

    public k(ic8.b cardRequestInteractor, hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor, jla.h productCatalogueInteractor, jt0.b juniorProductAccountResolver) {
        Intrinsics.checkNotNullParameter(cardRequestInteractor, "cardRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorProductAccountResolver, "juniorProductAccountResolver");
        this.f141507a = cardRequestInteractor;
        this.f141508b = juniorProfileInteractor;
        this.f141509c = juniorAccountInteractor;
        this.d = productCatalogueInteractor;
        this.e = juniorProductAccountResolver;
    }

    public static final ActionWidgetDelegate.Model h(k kVar, JuniorBankingProfile juniorBankingProfile, jc8.a aVar) {
        String str = juniorBankingProfile.f77103j;
        String str2 = juniorBankingProfile.f77099b;
        return new ActionWidgetDelegate.Model(j6.a.q("JUNIOR_PENDING_ACTION_CARD_REQUEST", str), new TextLocalisedClause(aVar.e ? R$string.junior_card_request_pending_action_review_card_virtual_title : R$string.junior_card_request_pending_action_review_card_title, u.c(str2), null, 12), new TextLocalisedClause(R$string.junior_card_request_pending_action_review_card_message_with_name, u.c(str2), null, 12), new m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D182", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.junior_card_request_pending_action_review_card_action_review_card_request, null, null, 14), null, false), null, new b(str, aVar), null, false, 7488);
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof b;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return rd0.e.e(q.Q(new ae8.c(bla.b.b(this.d, "YOUTH"), 10), new eh9.j((Continuation) null, this, params, 11)), h0.f322473a, new i(3, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                return j49.c.f171322a;
            }
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior.card_request.impl.delegate.JuniorCardRequestActionsDelegateImpl.JuniorCardRequestParcel");
        b bVar = (b) obj2;
        String str = bVar.f141496a;
        jc8.a aVar2 = bVar.f141497b;
        return new j49.b(new BridgeDestination(new FeatureCommand(new CardRequestReviewConfig.Review(str, null, aVar2.e ? jc8.c.VIRTUAL : jc8.c.PHYSICAL, aVar2.f172748a, 2))));
    }
}
