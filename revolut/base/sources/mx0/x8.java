package mx0;

import androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.IntRect;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WideCardDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.SliderLabelsView;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardActivity;
import com.revolut.feature.card_payment_method.impl.flows.selector.flow.CardPaymentMethodSelectorFlow;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreen;
import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlow;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreen;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlow;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreen;
import com.revolut.retail.feature.esim.impl.R$array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class x8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210108b;

    public /* synthetic */ x8(Object obj2, int i) {
        this.f210107a = i;
        this.f210108b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f210107a;
        int i2 = 13;
        Continuation continuation = null;
        Object obj2 = this.f210108b;
        switch (i) {
            case 0:
                return LightboxGalleryView.g0((LightboxGalleryView) obj2);
            case 1:
                com.revolut.core.ui_kit.views.o oVar = (com.revolut.core.ui_kit.views.o) obj2;
                List listD1 = zhm.d0.d1(oVar.f59570h);
                int size = listD1.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Function0) listD1.get(i3)).invoke();
                }
                Function0 function0 = oVar.f59569g;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 2:
                return ((ProfileCardView) obj2).k;
            case 3:
                int i5 = SliderLabelsView.f58870h;
                ((SliderLabelsView) obj2).invalidate();
                return Unit.f186387a;
            case 4:
                my0.b bVar = (my0.b) obj2;
                return zhm.v.k((HeaderDelegate) bVar.f210278a.getValue(), new PaymentLinkWidgetDelegate(), new PaymentLinkWidgetLoadingDelegate(), (ActionsDelegate) bVar.f210279b.getValue(), (ListSubheaderDelegate) bVar.f210280c.getValue(), (RowDelegate) bVar.d.getValue(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new ActionsLoadingDelegate());
            case 5:
                return ((l80.f) ((mz7.a) obj2).f210720a).g().withTimeAtStartOfDay().plusDays(1);
            case 6:
                mzh.e eVar = (mzh.e) obj2;
                eVar.f210769l.getClass();
                return Boolean.valueOf(((jte.d) eVar.f210770m).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c));
            case 7:
                return PhysicalCameraInfoAdapter.camera2CameraInfo_delegate$lambda$0((PhysicalCameraInfoAdapter) obj2);
            case 8:
                return ZslControlImpl.streamConfigurationMap_delegate$lambda$0((ZslControlImpl) obj2);
            case 9:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0((AnnotatedString) obj2);
            case 10:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$2$0((ContextMenuState) obj2);
            case 11:
                return ((LegacyTextFieldState) obj2).getLayoutResult();
            case 12:
                return CoreTextFieldKt.CoreTextField$lambda$4$0((Orientation) obj2);
            case 13:
                return TextFieldDelegate.Companion.notifyFocusedRect$lambda$0((TextDelegate) obj2);
            case 14:
                return TextLinkScope.textRange$lambda$0$2((IntRect) obj2);
            case 15:
                KProperty[] kPropertyArr = TravelExperiencesBookingDetailsScreen.f0;
                return (n1g.f) ((z0g.c) ((TravelExperiencesBookingDetailsScreen) obj2).f93016d0.getValue()).f318333l.get();
            case 16:
                n30.b0 b0Var = (n30.b0) obj2;
                wkm.l lVarQ = vkm.q.Q(com.google.crypto.tink.shaded.protobuf.t1.d(mo3.a.e(com.google.crypto.tink.shaded.protobuf.t1.E(b0Var.f211611b.d.c(Unit.f186387a, true)), new n0c.v(20), new n0c.v(21)), 300L), new mk0.f(continuation, b0Var, i2));
                CoroutineScope coroutineScope = b0Var.f211612c;
                vkm.d2.Companion.getClass();
                return vkm.q.M(lVarQ, coroutineScope, new vkm.h2(500L, 0L), 1);
            case 17:
                OrderNewCardActivity orderNewCardActivity = (OrderNewCardActivity) obj2;
                return new z4l.j(7, zhm.v.k(orderNewCardActivity.B0, orderNewCardActivity.A0, orderNewCardActivity.z0, orderNewCardActivity.C0, orderNewCardActivity.D0, orderNewCardActivity.E0, new WideCardDelegate(0), new FixedTabsLoadingDelegate(), new NewProductLoadingDelegate(), new ProductSelectionLoadingDelegate(), new RowLoadingDelegate(), orderNewCardActivity.H0, orderNewCardActivity.I0), false);
            case 18:
                lk0.g gVar = (lk0.g) ((n3e.c) obj2).f211991b.f();
                if (gVar != null) {
                    rfm.u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 19:
                return (n43.a) ((c43.j) ((CardPaymentMethodSelectorFlow) obj2).P.getValue()).d.get();
            case 20:
                n97.k kVar = (n97.k) obj2;
                Map map = kVar.f213601a;
                if (map.isEmpty()) {
                    return null;
                }
                Set setKeySet = map.keySet();
                if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                    return null;
                }
                Iterator it8 = setKeySet.iterator();
                while (it8.hasNext()) {
                    if (kVar.n((String) it8.next()).isEnabled()) {
                        return o97.m.SMART_TILE;
                    }
                }
                return null;
            case 21:
                KProperty[] kPropertyArr2 = BlockSubscriptionScreen.Z;
                return (n9e.i) ((i9e.k) ((BlockSubscriptionScreen) obj2).W.getValue()).f159692c.get();
            case 22:
                return (ncb.a) ((lcb.b) ((RetailPrivacyFlow) obj2).P.getValue()).d.get();
            case 23:
                return (nd3.k) ((yc3.h) ((YourCashbackFlow) obj2).P.getValue()).d.get();
            case 24:
                com.revolut.feature.cashback.impl.ui.yourcashback.b bVar2 = (com.revolut.feature.cashback.impl.ui.yourcashback.b) obj2;
                bVar2.l2(new com.revolut.feature.cashback.impl.ui.yourcashback.a(bVar2, null), new yi5.b(26));
                return Unit.f186387a;
            case 25:
                KProperty[] kPropertyArr3 = PriceTargetsFaqLeafScreen.f100160b0;
                return (ndj.d) ((fdj.d) ((PriceTargetsFaqLeafScreen) obj2).f100161a0.getValue()).f133965c.get();
            case 26:
                VatInputScreen vatInputScreen = (VatInputScreen) obj2;
                return zhm.v.k(vatInputScreen.V, vatInputScreen.W);
            case 27:
                return (nfe.a) ((lfe.a) ((RetailSuspiciousTransactionContainerFlow) obj2).P.getValue()).f194855b.get();
            case 28:
                return (ni4.e) ((dw3.v6) ((SpousalConsentInitiatorPopupScreen) obj2).O.getValue()).f120021l.get();
            default:
                int[] intArray = ((nij.b) obj2).f216258a.getResources().getIntArray(R$array.esim_background_country_colors_default);
                Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
                return nij.b.b(kotlin.collections.d.t0(intArray));
        }
    }
}
