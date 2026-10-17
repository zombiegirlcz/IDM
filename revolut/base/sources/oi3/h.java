package oi3;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import sri.m;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i49.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f225430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f225431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f225432c;
    public final j d;
    public final emg.a e;
    public final gte.a f;

    public h(sh3.a checkoutInteractor, y63.h cardScreenExpandableDialogMapper, l80.e dateProvider, m navigator, j preorderWidgetProvider, emg.a adoptionJourneyInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(cardScreenExpandableDialogMapper, "cardScreenExpandableDialogMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preorderWidgetProvider, "preorderWidgetProvider");
        Intrinsics.checkNotNullParameter(adoptionJourneyInteractor, "adoptionJourneyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f225430a = checkoutInteractor;
        this.f225431b = dateProvider;
        this.f225432c = navigator;
        this.d = preorderWidgetProvider;
        this.e = adoptionJourneyInteractor;
        this.f = featureToggleInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.f(data.f54722b.f51590a, "CHECKOUT_PREORDER_WIDGET_ID");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r10, j60.a r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof oi3.e
            if (r0 == 0) goto L13
            r0 = r12
            oi3.e r0 = (oi3.e) r0
            int r1 = r0.f225423w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225423w = r1
            goto L1a
        L13:
            oi3.e r0 = new oi3.e
            gim.c r12 = (gim.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225423w
            j49.a r3 = j49.a.f171320a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r12)
            goto L7b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r12)
            boolean r12 = r10 instanceof com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model
            r2 = 0
            if (r12 == 0) goto L3e
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r10 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r10
            goto L3f
        L3e:
            r10 = r2
        L3f:
            j49.c r12 = j49.c.f171322a
            if (r10 != 0) goto L44
            goto L9d
        L44:
            java.lang.String r5 = r10.f52613a
            java.lang.String r6 = "CANCEL_CARD_ORDER_NEGATIVE_BUTTON_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            r7 = 3
            r8 = 0
            if (r6 == 0) goto L54
            j60.a.v(r11, r8, r2, r7)
            return r3
        L54:
            java.lang.String r6 = "CANCEL_CARD_ORDER_POSITIVE_BUTTON_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L9d
            java.lang.Object r10 = r10.i
            boolean r5 = r10 instanceof com.revolut.feature.checkout.models.CheckoutOrder
            if (r5 == 0) goto L65
            com.revolut.feature.checkout.models.CheckoutOrder r10 = (com.revolut.feature.checkout.models.CheckoutOrder) r10
            goto L66
        L65:
            r10 = r2
        L66:
            if (r10 == 0) goto L8d
            com.revolut.core.model.account.AccountId$Personal r11 = com.revolut.core.model.account.AccountId.Personal.f51414a
            sh3.a r12 = r9.f225430a
            ei3.m r12 = (ei3.m) r12
            pfm.h r10 = r12.h(r10, r11)
            r0.f225423w = r4
            java.lang.Object r10 = nim.a.a(r10, r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_screen.api.navigation.CardsListFeatureConfig$CardsList r11 = new com.revolut.feature.card_screen.api.navigation.CardsListFeatureConfig$CardsList
            n63.g r12 = n63.g.OrderCancelled
            r11.<init>(r12)
            r10.<init>(r11)
            sri.m r11 = r9.f225432c
            r11.c(r10)
            return r3
        L8d:
            j60.a.v(r11, r8, r2, r7)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r11 = rd0.d.f253311a
            rd0.c r11 = rd0.c.ERROR
            java.lang.String r0 = "checkoutOrder should not be null at this point, check parcel data"
            java.lang.String r1 = "PreorderPendingActionsDelegateImpl"
            rd0.d.a(r11, r1, r0, r2, r10)
        L9d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: oi3.h.e(java.lang.Object, j60.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new g(rd0.e.e(rd0.e.b(m70.a.g(sh3.a.c(this.f225430a, null, AccountId.Personal.f51414a, Boolean.valueOf(((jte.d) this.f).c(KycApi$FeatureToggle.KycPreOrderInformation.f77464c)), 1), null, null, 3)), h0.f322473a, new n28.b(3, 17, null)), this, 0);
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        ActionWidgetDelegate.Model model = tVar.f54722b;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            Object obj2 = model.f51596l;
            CheckoutOrder checkoutOrder = obj2 instanceof CheckoutOrder ? (CheckoutOrder) obj2 : null;
            if (checkoutOrder != null) {
                return new j49.b(new BridgeDestination(new FeatureCommand(new ResumeCheckoutFeatureConfig(new Checkout.Order(checkoutOrder), AccountId.Personal.f51414a, (NaviCommand) null, 12))));
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PreorderPendingActionsDelegateImpl", "primary click; checkoutOrder should not be null at this point, check parcel data", null, h0Var);
            return new j49.b(new CardsCarouselFlowDestination(null, null, null, null, null, null, 63));
        }
        boolean zF = Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a);
        j49.c cVar = j49.c.f171322a;
        if (!zF) {
            if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                return cVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Object obj3 = model.f51596l;
        CheckoutOrder checkoutOrder2 = obj3 instanceof CheckoutOrder ? (CheckoutOrder) obj3 : null;
        if (checkoutOrder2 != null) {
            return new j49.d(y63.h.a(checkoutOrder2));
        }
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PreorderPendingActionsDelegateImpl", "checkoutOrder should not be null at this point, check parcel data", null, h0Var2);
        return cVar;
    }
}
