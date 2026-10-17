package ly2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.room.util.DBUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.w2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.card_input.common.CardInputContract$ScreenMode;
import com.revolut.feature.card_input.common.CardInputContract$StatusViewPayload;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.navigation.CardSubtypePickerDestination;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.travel_trips.navigation.TravelTripsItineraryDestination;
import com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import dsh.o;
import fa1.o;
import grl.k9;
import h93.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jy2.n;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import le.u1;
import lki.s;
import ma1.t;
import ma1.x;
import mjf.b0;
import mx0.mb;
import mx0.nb;
import mx0.o5;
import mx0.ob;
import mx0.y9;
import n33.n2;
import n33.r2;
import n33.s2;
import n33.t0;
import nif.k0;
import prl.r;
import qc0.f1;
import tof.hc;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f200639c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f200637a = i;
        this.f200638b = obj2;
        this.f200639c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, java.util.Map] */
    @Override // kfm.a
    public final void run() {
        View childAt;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        String str;
        ArrayList arrayListF0;
        int i = this.f200637a;
        int i2 = -1;
        int i3 = 1;
        int i5 = 0;
        Object obj2 = null;
        js0.b bVar = null;
        Object obj3 = this.d;
        Object obj4 = this.f200639c;
        Object obj5 = this.f200638b;
        switch (i) {
            case 0:
                l lVar = (l) obj4;
                f0 f0Var = (f0) obj3;
                NaviCommand naviCommand = (NaviCommand) ((od0.i) obj5).f224257a;
                jy2.h hVar = lVar.k;
                k3l.b bVar2 = lVar.f200652r;
                jy2.b bVar3 = (jy2.b) hVar;
                jy2.k kVar = bVar3.f179307a;
                jy2.k kVar2 = bVar3.f179307a;
                n nVar = (n) kVar;
                te0.j jVar = nVar.f179323n;
                KProperty[] kPropertyArr = n.f179315r;
                if (((CardInputContract$ScreenMode) jVar.getValue(nVar, kPropertyArr[13]).get()) == CardInputContract$ScreenMode.ACTIVATION) {
                    ((k3l.d) bVar2).O(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(R$string.card_activate_card_success_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_activate_card_success_dialog_description, null, null, 14), new CardInputContract$StatusViewPayload(f0Var, naviCommand), new SuccessType.ResultAction(new TextLocalisedClause(R$string.card_activate_card_success_dialog_primary_button, null, null, 14), new TextLocalisedClause(R$string.card_activate_card_success_dialog_secondary_button, null, null, 14)), 1904));
                    return;
                }
                n nVar2 = (n) kVar2;
                Integer num = (Integer) ((od0.i) nVar2.f.getValue(nVar2, kPropertyArr[4]).get()).f224257a;
                n nVar3 = (n) kVar2;
                ((k3l.d) bVar2).O(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(((Number) nVar3.e.getValue(nVar3, kPropertyArr[3]).get()).intValue(), null, null, 14), null, new CardInputContract$StatusViewPayload(f0Var, naviCommand), (num == null || naviCommand == null) ? SuccessType.Simple.f104398a : new SuccessType.ResultAction(new TextLocalisedClause(num.intValue(), null, null, 14), null), 1908));
                return;
            case 1:
                ((m28.f) obj5).f201728a.a(new o((InvestWidgetContext) obj3, ((q0) obj4).f55476b));
                return;
            case 2:
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar4 = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) obj5;
                bVar4.x2(new li8.n(bVar4, 20, (oyf.b) obj4, (lk0.g) obj3));
                return;
            case 3:
                w4l.k kVar3 = (w4l.k) obj5;
                m78.d dVar = (m78.d) obj4;
                String str2 = (String) obj3;
                if (Intrinsics.f(kVar3, w4l.i.f294643c)) {
                    ((b0) dVar.f203338b).t(new hc(str2, null));
                    return;
                } else {
                    if (!Intrinsics.f(kVar3, w4l.h.f294642c) && !Intrinsics.f(kVar3, w4l.j.f294644c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 4:
                ((m7e.f) obj5).f203404b.a(new o((HomeFeedWidgetContext.GroupPocket) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 5:
                ((m88.h) obj5).f203455b.a(new o((HomeFeedWidgetContext.Junior) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 6:
                x xVar = (x) obj3;
                ea1.b.a("Payment for order " + ((String) obj5) + " finished", fa1.k.INFO);
                fa1.l lVar2 = (fa1.l) ((Ref$ObjectRef) obj4).f186409a;
                if ((lVar2 != null ? lVar2.f133190a : null) instanceof o.h) {
                    ((t) xVar.f203914b).b().q(new ofm.i(mfm.f.d, mfm.f.e, i5));
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) obj5;
                mif.b bVar5 = (mif.b) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(((k0) it8.next()).f215881a);
                    }
                    bVar5.b(arrayList3);
                }
                if (!arrayList2.isEmpty()) {
                    bVar5.a(arrayList2);
                }
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                bVar5.f205789a.onNext(Unit.f186387a);
                return;
            case 8:
                iv9.n nVar4 = (iv9.n) obj5;
                gv9.c cVar = ((mv9.k) obj4).f209188b;
                iv9.a aVar = (iv9.a) obj3;
                if (nVar4 != null) {
                    gv9.j jVar2 = (gv9.j) cVar;
                    DBUtil.performBlocking(jVar2.f147114a, false, true, new g31.e(jVar2, 12, aVar, nVar4));
                    return;
                } else {
                    gv9.j jVar3 = (gv9.j) cVar;
                    jVar3.getClass();
                    aVar.getClass();
                    DBUtil.performBlocking(jVar3.f147114a, false, true, new gv9.d(jVar3, aVar, i3));
                    return;
                }
            case 9:
                View view = (View) obj5;
                y9 y9Var = (y9) obj4;
                s sVar = (s) obj3;
                Object tag2 = view.getTag(R$id.internal_modal_embedded_state_tag);
                o5 o5Var = tag2 instanceof o5 ? (o5) tag2 : null;
                if ((o5Var != null ? o5Var.f209886a : null) instanceof mb) {
                    int childCount = y9Var.getChildCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 < childCount) {
                            childAt = y9Var.getChildAt((y9Var.getChildCount() - i6) - 1);
                            Intrinsics.h(childAt);
                            if (!(c6d.b.A(childAt).f209886a instanceof nb)) {
                                i6++;
                            }
                        } else {
                            childAt = null;
                        }
                    }
                    if (childAt != null) {
                        y9Var.a(childAt, true);
                        ob obVar = c6d.b.A(childAt).f209886a;
                        nb nbVar = obVar instanceof nb ? (nb) obVar : null;
                        if (nbVar == null) {
                            throw new IllegalArgumentException("newTop expected to have RequestedShowState.Show");
                        }
                        bVar = nbVar.f209862a;
                    }
                    view.animate().cancel();
                    if (childAt != null && (viewPropertyAnimatorAnimate3 = childAt.animate()) != null) {
                        viewPropertyAnimatorAnimate3.cancel();
                    }
                    kge.d dVar2 = y9Var.f210127c;
                    com.revolut.core.ui_kit.views.o oVar = (com.revolut.core.ui_kit.views.o) dVar2.f183974b;
                    if (c6d.b.b((y9) dVar2.f183975c) == 0) {
                        ViewGroup contentWrapper$ui_kit_components_release = oVar.getContentWrapper$ui_kit_components_release();
                        if (contentWrapper$ui_kit_components_release != null) {
                            contentWrapper$ui_kit_components_release.setVisibility(0);
                        }
                        ViewGroup contentWrapper$ui_kit_components_release2 = oVar.getContentWrapper$ui_kit_components_release();
                        if (contentWrapper$ui_kit_components_release2 != null && (viewPropertyAnimatorAnimate2 = contentWrapper$ui_kit_components_release2.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null) {
                            viewPropertyAnimatorAlpha2.start();
                        }
                        oVar.getEmbeddedContentActivator$ui_kit_components_release().e(dVar2);
                    }
                    if (childAt != null) {
                        childAt.setVisibility(0);
                    }
                    if (childAt != null && (viewPropertyAnimatorAnimate = childAt.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorAlpha.withEndAction(bVar)) != null) {
                        viewPropertyAnimatorWithEndAction.start();
                    }
                    view.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new b0.d(view, 15, y9Var, sVar)).start();
                    return;
                }
                return;
            case 10:
                r2 r2Var = (r2) obj5;
                e13.a aVar2 = (e13.a) obj4;
                n2 n2Var = (n2) obj3;
                v60.i iVar = r2Var.f211802p;
                t0 t0Var = (t0) r2Var.d;
                zn3.a aVarD = t0Var.d();
                s2 s2Var = (s2) r2Var.e;
                AccountId accountIdA = com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) s2Var.w0().get());
                NaviCommand naviCommandC = t0Var.c();
                if (n2Var == null || (str = n2Var.f211770b) == null) {
                    te0.e eVarA0 = s2Var.A0();
                    od0.i.Companion.getClass();
                    str = (String) ((od0.i) te0.w.M(eVarA0, od0.i.f224256b)).f224257a;
                }
                String strE = r2Var.e(str);
                pi3.h hVarD = n2Var != null ? n2Var.f211769a : r2Var.d();
                te0.e eVarX0 = s2Var.x0();
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137496c;
                companion.getClass();
                AnalyticsProduct.Companion.a(k9Var);
                iVar.onNext(u0.f(new CardSubtypePickerDestination(aVar2, aVarD, accountIdA, naviCommandC, strE, hVarD, (AnalyticsProduct) te0.w.M(eVarX0, new AnalyticsProduct.Retail(k9Var)))));
                return;
            case 11:
                ((n88.c) obj5).f213279b.a(new dsh.o((HomeFeedWidgetContext.Junior) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 12:
                ((nj5.i) obj5).f216379c.a(new dsh.o((CryptoWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 13:
                ((ns5.h) obj5).f218758a.a(new dsh.o((CryptoWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 14:
                nzc.d dVar3 = (nzc.d) obj5;
                w4l.f fVar = dVar3.e;
                Unit unit = Unit.f186387a;
                fVar.k(unit, (jzc.t) obj4);
                dVar3.f221021h.k(unit, (jzc.o) obj3);
                return;
            case 15:
                ((o28.h) obj5).f.a(new dsh.o((InvestWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 16:
                o3d.e eVar = (o3d.e) obj5;
                yji.n.P2(eVar, eVar.o2(new ugd.d((FavouritesAssetTypeKey) obj3, (Pair) obj4)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                return;
            case 17:
                ((o69.i) obj5).f222537a.a(new dsh.o((NearbyRewardsWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 18:
                ((o88.d) obj5).f222962b.a(new dsh.o((HomeFeedWidgetContext.Junior) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 19:
                ((os5.e) obj5).f229235b.a(new dsh.o((CryptoWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 20:
                BaseDraggableWidgetDelegate.a aVar3 = (BaseDraggableWidgetDelegate.a) obj5;
                ovj.e eVar2 = (ovj.e) obj4;
                TripItineraryWidgetContext tripItineraryWidgetContext = (TripItineraryWidgetContext) obj3;
                if (!(aVar3 instanceof w2)) {
                    if (aVar3 instanceof q0) {
                        eVar2.f230238b.a(new dsh.o(tripItineraryWidgetContext, ((q0) aVar3).f55476b));
                        return;
                    }
                    return;
                } else {
                    eVar2.getClass();
                    Object obj6 = ((w2) aVar3).d;
                    String str3 = obj6 instanceof String ? (String) obj6 : null;
                    if (str3 == null) {
                        return;
                    }
                    eVar2.b(new TravelTripsItineraryDestination(str3));
                    return;
                }
            case 21:
                pc7.e eVar3 = (pc7.e) obj4;
                HomeFeedWidgetContext.Personal personal = (HomeFeedWidgetContext.Personal) obj3;
                q0 q0Var = (q0) ((BaseDraggableWidgetDelegate.a) obj5);
                if (Intrinsics.f(q0Var.f55477c.d, new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.home_feed_widget_atms_map_empty_title, null, null, 14))) {
                    eVar3.f234827a.b(new fc7.d(zj2.a.a(eVar3.f234829c, null, 3)));
                    return;
                } else {
                    eVar3.f234828b.a(new dsh.o(personal, q0Var.f55476b));
                    return;
                }
            case 22:
                r0 r0Var = (r0) obj3;
                ue0.c cVar2 = ((r) obj5).f239350c;
                String strA = f4l.a.a((bfl.g) obj4);
                Object obj7 = mrl.j.f208164a;
                Intrinsics.checkNotNullParameter(r0Var, "<this>");
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar2, a0.d.s("TUTORIAL_SHOWN_", strA, "_", u1.g(r0Var, mrl.j.f208164a)), Boolean.TRUE);
                return;
            case 23:
                String str4 = (String) obj4;
                f1 f1Var = (f1) obj3;
                List list = ((BackendFlow) obj5).e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : list) {
                    if (obj8 instanceof StoriesScreen) {
                        arrayList4.add(obj8);
                    }
                }
                Iterator it9 = arrayList4.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (Intrinsics.f(((StoriesScreen) next).f63663a, str4)) {
                            obj2 = next;
                        }
                    }
                }
                if (((StoriesScreen) obj2) != null) {
                    f1Var.k().remove(str4);
                    return;
                }
                return;
            case 24:
                ((qc7.h) obj5).f244602c.a(new dsh.o((CardsWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 25:
                ((qpb.h) obj5).f248339b.a(new dsh.o((VaultWidgetContext) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 26:
                ((qxj.d) obj5).f250102b.a(new dsh.o((HomeFeedWidgetContext.Junior) obj3, ((q0) ((BaseDraggableWidgetDelegate.a) obj4)).f55476b));
                return;
            case 27:
                r21.h hVar2 = (r21.h) obj5;
                BeneficiarySpecialPurpose beneficiarySpecialPurpose = (BeneficiarySpecialPurpose) obj4;
                String str5 = (String) obj3;
                List list2 = (List) hVar2.f251039c.get(z92.f.k(beneficiarySpecialPurpose));
                if (list2 == null) {
                    return;
                }
                w4l.f fVar2 = hVar2.e;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj9 : list2) {
                    if (!Intrinsics.f(((f5j.a) obj9).f132329a, str5)) {
                        arrayList5.add(obj9);
                    }
                }
                fVar2.j(beneficiarySpecialPurpose, arrayList5);
                return;
            case 28:
                List list3 = (List) obj5;
                f5j.a aVar4 = (f5j.a) obj4;
                r21.h hVar3 = (r21.h) obj3;
                Intrinsics.h(list3);
                Iterator it10 = list3.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        if (Intrinsics.f(((f5j.a) it10.next()).f132329a, aVar4.f132329a)) {
                            i2 = i5;
                        } else {
                            i5++;
                        }
                    }
                }
                if (i2 >= 0) {
                    arrayListF0 = d0.f1(list3);
                    arrayListF0.set(i2, aVar4);
                } else {
                    arrayListF0 = d0.F0(aVar4, list3);
                }
                hVar3.d.j(Unit.f186387a, arrayListF0);
                return;
            default:
                List list4 = (List) obj5;
                r21.h hVar4 = (r21.h) obj4;
                String str6 = (String) obj3;
                Intrinsics.h(list4);
                Iterator it11 = list4.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (Intrinsics.f(((f5j.a) it11.next()).f132329a, str6)) {
                            i2 = i5;
                        } else {
                            i5++;
                        }
                    }
                }
                if (i2 >= 0) {
                    ArrayList arrayListF1 = d0.f1(list4);
                    arrayListF1.remove(i2);
                    hVar4.d.j(Unit.f186387a, arrayListF1);
                    return;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("deletedBeneficiaryId = ", str6));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return;
                }
        }
    }
}
