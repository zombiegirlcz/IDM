package s7k;

import b8d.d0;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.h;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByTransferLink;
import com.revolut.retail.feature.payments.payment_links.core.R$string;
import com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload;
import efm.r;
import j49.i;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import rp0.y;
import s65.o;
import s6e.g;
import u7k.n;
import u7k.q;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements g7k.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k61.a f260863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7k.d f260864b;

    public d(k61.a transferInteractor, t7k.a transferLinkResourcesMapper, l7k.d shareDialogProvider, n dialogMapper) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferLinkResourcesMapper, "transferLinkResourcesMapper");
        Intrinsics.checkNotNullParameter(shareDialogProvider, "shareDialogProvider");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f260863a = transferInteractor;
        this.f260864b = shareDialogProvider;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof TransferLinkDetails;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r25, j60.a r26, kotlin.coroutines.Continuation r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r3 instanceof s7k.b
            if (r4 == 0) goto L1b
            r4 = r3
            s7k.b r4 = (s7k.b) r4
            int r5 = r4.f260860x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f260860x = r5
            goto L22
        L1b:
            s7k.b r4 = new s7k.b
            gim.c r3 = (gim.c) r3
            r4.<init>(r0, r3)
        L22:
            java.lang.Object r3 = r4.v
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f260860x
            r7 = 3
            r8 = 0
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L3e
            if (r6 != r9) goto L36
            j60.a r1 = r4.u
            yhm.o.b(r3)
            goto L71
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            yhm.o.b(r3)
            boolean r3 = r1 instanceof com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model
            if (r3 == 0) goto La7
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r1 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r1
            java.lang.Object r3 = r1.i
            boolean r6 = r3 instanceof com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload
            if (r6 == 0) goto La7
            java.lang.String r1 = r1.f52613a
            java.lang.String r6 = "PL_CANCEL_CONFIRMATION_ID_PRIMARY"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r1 == 0) goto La1
            com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload r3 = (com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload) r3
            com.revolut.domain.models.moneyrequest.TransferLinkDetails$Active r1 = r3.f102179a
            java.lang.String r1 = r1.f60354b
            k61.a r3 = r0.f260863a
            k61.i r3 = (k61.i) r3
            pfm.t r1 = r3.c(r1)
            r4.u = r2
            r4.f260860x = r9
            java.lang.Object r1 = nim.a.a(r1, r4)
            if (r1 != r5) goto L70
            return r5
        L70:
            r1 = r2
        L71:
            j60.a.v(r1, r8, r10, r7)
            j49.g r1 = new j49.g
            nii.j0 r11 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_success_title
            r3 = 14
            r12.<init>(r2, r10, r10, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_success_description
            r13.<init>(r2, r10, r10, r3)
            r22 = 0
            r23 = 4092(0xffc, float:5.734E-42)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.<init>(r11)
            return r1
        La1:
            j60.a.v(r2, r8, r10, r7)
            j49.a r1 = j49.a.f171320a
            return r1
        La7:
            j49.c r1 = j49.c.f171322a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s7k.d.e(java.lang.Object, j60.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        r rVarG = ((k61.i) this.f260863a).g(false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r rVarPublish = rVarG.publish(new onh.b(new d0(new Data(f0.f322471a, null, false, 6, null), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
        r map = m70.a.e(rVarPublish, new s6d.r(12), new s6d.r(13)).map(new o(new g(this, 16), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return e.b(map);
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        FeatureConfig byCode;
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.domain.models.moneyrequest.TransferLinkDetails");
        TransferLinkDetails transferLinkDetails = (TransferLinkDetails) obj2;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            if (transferLinkDetails.getF60366h()) {
                return new j49.b(this.f260864b.a(transferLinkDetails));
            }
        } else {
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
                TransferLinkDetails.Active transferLink = transferLinkDetails instanceof TransferLinkDetails.Active ? (TransferLinkDetails.Active) transferLinkDetails : null;
                if (transferLink == null) {
                    throw new IllegalStateException("Cancelling of non active transfers links is not supported");
                }
                Intrinsics.checkNotNullParameter(transferLink, "transferLink");
                rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_title, v.k(new MoneyClause(transferLink.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), q.b(transferLink)), null, 12), new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_description, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("PL_CANCEL_CONFIRMATION_ID_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_positive, null, null, 14), false, null, null, new AcceptPaymentLinkAction$DialogPayload(transferLink), null, 744);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("PL_CANCEL_CONFIRMATION_ID_SECONDARY", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_negative, null, null, 14), false, null, null, new AcceptPaymentLinkAction$DialogPayload(transferLink), null, 744);
                yp0.b.r(model2, 0, 0, 0, 0, 15);
                return new j49.d(new y(v.k(model, model2), tVar2, null, null, null, null, 1020));
            }
            if (!(aVar instanceof h) && !Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a)) {
                if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = a.f260858a[transferLinkDetails.getF60365g().ordinal()];
                if (i == 1) {
                    byCode = new PaymentLinksFeatureConfig.AcceptPaymentLink.ByCode(transferLinkDetails.getD());
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    byCode = new PaymentLinksFeatureConfig$Details$ByTransferLink(transferLinkDetails);
                }
                return new j49.b(new BridgeDestination(new FeatureCommand(byCode)));
            }
        }
        return j49.c.f171322a;
    }
}
