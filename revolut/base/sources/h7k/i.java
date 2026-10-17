package h7k;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.retail.feature.payments.payment_links.core.R$string;
import com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload;
import gqh.o;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.t;
import rp0.y;
import yji.n;
import zh9.u0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f149915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k61.a f149916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j7k.a f149917n;
    public final tqi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f01.a f149918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f149919q;

    public i(j60.a bottomDialogExtension, k61.a transferInteractor, j7k.a dialogMapper, tqi.g shareNavigationCommandFactory, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(shareNavigationCommandFactory, "shareNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f149915l = bottomDialogExtension;
        this.f149916m = transferInteractor;
        this.f149917n = dialogMapper;
        this.o = shareNavigationCommandFactory;
        this.f149918p = uiKitResources;
        this.f149919q = new TwinHorizontalButtonDelegate();
    }

    @Override // yji.n
    public final void D2() {
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f149919q;
        this.f149915l.d(u.c(twinHorizontalButtonDelegate));
        Continuation continuation = null;
        n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new gul.n(this, continuation, 22), 3);
        n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new o(this, continuation, 20), 3);
    }

    public final void Z2(TransferLinkDetails.Active transferLinkDetails, j action) {
        Intrinsics.checkNotNullParameter(transferLinkDetails, "paymentLink");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = b.f149908a[action.ordinal()];
        if (i == 1) {
            T2(new d(this, transferLinkDetails, null), new yi5.b(27));
            return;
        }
        j7k.a aVar = this.f149917n;
        j60.a aVar2 = this.f149915l;
        if (i == 2) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
            aVar2.x(new y(u.c(new um0("PL_DECLINE_CONFIRMATION_ID", new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_payment_links_action_decline_confirmation_positive, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.payments_payment_links_action_decline_confirmation_negative, null, null, 14), false, null, null, 56), (Object) new AcceptPaymentLinkAction$DialogPayload(transferLinkDetails), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.payments_payment_links_action_decline_confirmation_title, v.k(j7k.a.a(transferLinkDetails), j7k.a.b(transferLinkDetails)), null, 12), new TextLocalisedClause(R$string.payments_payment_links_action_decline_confirmation_description, u.c(j7k.a.b(transferLinkDetails)), null, 12), null, 28), null, null, null, null, 1020));
        } else if (i == 3) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
            aVar2.x(new y(u.c(new um0("PL_CANCEL_CONFIRMATION_ID", new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_positive, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_negative, null, null, 14), false, null, null, 56), (Object) new AcceptPaymentLinkAction$DialogPayload(transferLinkDetails), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_description, null, null, 14), null, 28), null, null, null, null, 1020));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            A2(u0.b(this.o.f(0, "", this.f149918p.b(new TextLocalisedClause(R$string.payments_payment_links_share_template, v.k(new MoneyClause(transferLinkDetails.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), transferLinkDetails.f60355c), null, 12)).toString())));
        }
    }
}
