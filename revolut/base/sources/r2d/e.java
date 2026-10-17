package r2d;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.externalcard.ExternalCardMappingKt;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.instruments.trend.collections.api.feedwidget.InstrumentsTrendCollectionsFeedWidgetContext;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.mainscreen.impl.R$string;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.revolutpay.order_tracking.api.widgets.RevolutPayWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.wealth.api.ui.delegates.mosttraded.widget.MostTradedFeedWidgetContext;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import ru5.z;
import tof.a3;
import tof.i7;
import tof.p6;
import up5.a0;
import up5.g0;
import v20.f0;
import v6l.b1;
import v6l.h0;
import wf6.j0;
import zhm.a1;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f251101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f251102c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f251100a = i;
        this.f251101b = obj2;
        this.f251102c = obj3;
        this.d = obj4;
    }

    @Override // kfm.a
    public final void run() {
        Pair pair;
        Object obj2 = null;
        switch (this.f251100a) {
            case 0:
                ((f) this.f251101b).f251104b.a(new dsh.o((FavouritesWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 1:
                ((r88.n) this.f251101b).f252399b.a(new dsh.o((HomeFeedWidgetContext.Junior) this.d, ((q0) this.f251102c).f55476b));
                return;
            case 2:
                z zVar = (z) this.f251101b;
                yji.l.j2(zVar, zVar.e1(zVar.f257444x.a((a3) this.f251102c, (i7) this.d, ((ru5.j) zVar.t2()).f257419g)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                return;
            case 3:
                ((s28.j) this.f251101b).f259270b.a(new dsh.o((InvestWidgetContext) this.d, (String) this.f251102c));
                return;
            case 4:
                ((s3d.k) this.f251101b).f259652a.a(new dsh.o((FavouritesWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 5:
                ((s9h.b) this.f251101b).f261181b.a(new dsh.o((MostTradedFeedWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 6:
                ((saj.i) this.f251101b).f261433a.a(new dsh.o((CryptoWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 7:
                ((t28.f) this.f251101b).f267456b.a(new dsh.o((InvestWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 8:
                ((t57.b) this.f251101b).f268045b.a(new dsh.o((FreelancerWidgetContext) this.d, ((BaseDraggableWidgetDelegate.a) this.f251102c).a()));
                return;
            case 9:
                ((tpb.e) this.f251101b).f273330a.a(new dsh.o((HomeFeedWidgetContext.Savings) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 10:
                ((ts5.p) this.f251101b).f273987b.a(new dsh.o((CryptoWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 11:
                twl.d dVar = (twl.d) this.f251101b;
                twl.p pVar = (twl.p) this.f251102c;
                a3 a3Var = (a3) this.d;
                int i = twl.l.f275060a[dVar.ordinal()];
                if (i == 1) {
                    pair = new Pair(Integer.valueOf(R.string.card_suspicious_title), Integer.valueOf(R.string.card_suspicious_description_full));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(R$string.junior_transactions_fraud_sherlock_promo_title_format), Integer.valueOf(R$string.junior_transactions_fraud_sherlock_promo_subtitle));
                }
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                k3l.b bVar = pVar.k;
                p6 p6Var = a3Var.A.f272780b;
                String str = p6Var != null ? p6Var.f272992b : null;
                if (str == null) {
                    str = "";
                }
                ((k3l.d) bVar).O(new StatusViewConfiguration.Warning("SUSPICIOUS_TRANSACTION_STATUS_VIEW", new TextLocalisedClause(iIntValue, zhm.u.c(str), null, 12), new TextLocalisedClause(iIntValue2, null, null, 14), new TextLocalisedClause(R.string.card_suspicious_review_action, null, null, 14), null, null, 1008));
                return;
            case 12:
                u21.k kVar = (u21.k) this.f251101b;
                ue0.c cVar = (ue0.c) this.f251102c;
                String str2 = (String) this.d;
                ArrayList arrayListA = u21.k.a(cVar);
                ne0.j jVar = kVar.f276537c;
                if (arrayListA == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListA) {
                    if (!Intrinsics.f(((t61.g) obj3).f268137a, str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayListA.size() != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(ExternalCardMappingKt.toEntity((t61.g) it8.next()));
                    }
                    u21.k.g(cVar, arrayList2);
                    jVar.f("external_cards", arrayList);
                    kVar.f.c(null, (1 & 2) == 0, new u21.b(4));
                }
                jVar.remove("external_cards" + str2);
                cVar.I0("external_cards" + str2);
                return;
            case 13:
                ((uh7.l) this.f251101b).d.a(new dsh.o((InstrumentsTrendCollectionsFeedWidgetContext) this.d, (String) this.f251102c));
                return;
            case 14:
                uhl.d dVar2 = (uhl.d) this.f251101b;
                uhl.e eVar = (uhl.e) this.f251102c;
                Set set = (Set) this.d;
                if (dVar2.f280274b.isEmpty()) {
                    return;
                }
                synchronized (eVar) {
                    ue0.c cVar2 = eVar.f280275a;
                    Map mapL = r0.l(uhl.e.d(set), eVar.b());
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(String.class);
                    companion.getClass();
                    cVar2.G(mapL, "TRADING_EVENTS_HISTORY_REFETCH_CURSORS", wim.z.d(o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(o0.b(Long.TYPE)))));
                    Unit unit = Unit.f186387a;
                }
                Set set2 = dVar2.f280274b;
                synchronized (eVar) {
                    eVar.f280275a.G(a1.l(eVar.c(), set2), "TRADING_EVENTS_HISTORY_REFETCHED_PORTFOLIO_IDS", wim.z.d(o0.c(Set.class, KTypeProjection.Companion.a(o0.b(String.class)))));
                }
                return;
            case 15:
                g0 g0Var = (g0) this.f251101b;
                up5.d step = (up5.d) this.f251102c;
                xi0.b bVar2 = (xi0.b) this.d;
                a0 a0Var = (a0) g0Var.f281892a;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(step, "step");
                ((up5.e) a0Var.f281852b).D0().set(step);
                g0Var.f281893b.b(com.revolut.retail.core.navigation.a.c(g0Var.b(step, bVar2, false), new FinishCommand(null, null, null, 7)));
                return;
            case 16:
                ((upb.f) this.f251101b).f281948b.a(new dsh.o((HomeFeedWidgetContext.Savings) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 17:
                uu9.c cVar3 = (uu9.c) this.f251101b;
                ipa.g gVar = (ipa.g) this.f251102c;
                ipa.c cVar4 = (ipa.c) this.d;
                cVar3.f283176a.b(gVar);
                cVar3.f283176a.b(cVar4);
                return;
            case 18:
                ((f0) this.f251101b).u.j((String) this.f251102c, (UUID) this.d);
                return;
            case 19:
                b1 b1Var = (b1) this.f251101b;
                String str3 = (String) this.f251102c;
                String str4 = (String) this.d;
                Iterator it9 = b1Var.g().iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (Intrinsics.f(((u6l.j) next).getId(), str4)) {
                            obj2 = next;
                        }
                    }
                }
                u6l.j jVar2 = (u6l.j) obj2;
                if (jVar2 != null) {
                    b1Var.f286432n.j(h0.a.f286452a, b1Var.r(b1Var.p(zhm.u.c(u6l.j.a(jVar2, str3, null, null, null, null, -5)), false)));
                    return;
                }
                return;
            case 20:
                b1 b1Var2 = (b1) this.f251101b;
                h93.f0 f0Var = (h93.f0) this.f251102c;
                String str5 = (String) this.d;
                ArrayList arrayListF1 = d0.f1(b1Var2.g());
                arrayListF1.removeIf(new akl.p(new uo7.k(str5, 25), 27));
                arrayListF1.add(u6l.k.e(f0Var));
                b1Var2.f286432n.k(h0.a.f286452a, b1Var2.r(b1Var2.p(arrayListF1, true)));
                return;
            case 21:
                ((v88.f) this.f251101b).f286729b.a(new dsh.o((HomeFeedWidgetContext.Junior) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 22:
                ((vbc.g) this.f251101b).f287497a.a(new dsh.o((RevolutPayWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 23:
                ((vc7.d) this.f251101b).f287651b.a(new dsh.o((HomeFeedWidgetContext.Personal) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 24:
                ((w21.o) this.f251102c).f293933c.G(new p21.a((String) this.f251101b, false), w21.o.b((String) this.d), wim.z.d(o0.b(p21.a.class)));
                return;
            case 25:
                ((wc7.g) this.f251101b).f296359b.a(new dsh.o((InsuranceWidgetContext) this.d, (String) this.f251102c));
                return;
            case 26:
                j0 j0Var = (j0) this.f251101b;
                jf0.c cVar5 = (jf0.c) this.f251102c;
                String str6 = (String) this.d;
                sri.m mVar = j0Var.f296993a;
                Intrinsics.h(str6);
                mVar.c(j0.b(str6, cVar5));
                return;
            case 27:
                ((ws5.i) this.f251101b).f299668b.a(new dsh.o((CryptoWidgetContext) this.d, ((q0) ((BaseDraggableWidgetDelegate.a) this.f251102c)).f55476b));
                return;
            case 28:
                ((x28.k) this.f251101b).f302529a.a(new dsh.o((InvestWidgetContext) this.d, (String) this.f251102c));
                return;
            default:
                xra.h hVar = (xra.h) this.f251101b;
                List list = (List) this.f251102c;
                String str7 = (String) this.d;
                w4l.f fVar = hVar.f308316h;
                Unit unit2 = Unit.f186387a;
                Intrinsics.h(list);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (!Intrinsics.f(((CardOwner) obj4).getF81490a(), str7)) {
                        arrayList3.add(obj4);
                    }
                }
                fVar.j(unit2, arrayList3);
                return;
        }
    }
}
