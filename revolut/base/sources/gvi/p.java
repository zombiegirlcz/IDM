package gvi;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import h93.x;
import h93.y;
import ip0.nb0;
import ip0.pb0;
import ip0.yi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147195a;

    public /* synthetic */ p(int i) {
        this.f147195a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AirportLoungesDisclaimer airportLoungesDisclaimer;
        switch (this.f147195a) {
            case 0:
                return h.a((h) obj2, null, null, false, 3);
            case 1:
                return h.a((h) obj2, null, null, false, 3);
            case 2:
                return h.a((h) obj2, null, null, false, 3);
            case 3:
                return h.a((h) obj2, null, null, false, 3);
            case 4:
                fwc.i it8 = (fwc.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!it8.f138604a.isEmpty());
            case 5:
                h93.l it9 = (h93.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f150150a;
            case 6:
                y it10 = (y) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.f150170a == x.PENDING_ACTIVATION);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                do3.n nVar = (do3.n) pair.f186385a;
                List listK = ((e7l.f) pair.f186386b).a1;
                if (listK == null) {
                    wi0.b.Companion.getClass();
                    listK = v.k(wi0.b.X0, wi0.b.J2, wi0.b.f297771r, wi0.b.f297788x1, wi0.b.k, wi0.b.W, wi0.b.f297750h0, wi0.b.f297760n0);
                }
                return Boolean.valueOf(!listK.contains(do3.q.y(nVar)));
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 9:
                Boolean it11 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                it11.booleanValue();
                return it11;
            case 10:
                cx2.a countersWithLimit = (cx2.a) obj2;
                Intrinsics.checkNotNullParameter(countersWithLimit, "countersWithLimit");
                return new gx2.p(countersWithLimit);
            case 11:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new gx2.o(cards);
            case 12:
                k3l.j it12 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 instanceof k3l.g);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", false, 0, false, 30);
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 15:
                List contactList = (List) obj2;
                Intrinsics.checkNotNullParameter(contactList, "contactList");
                List<f5j.a> list = contactList;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (f5j.a aVar : list) {
                    arrayList.add(new PayIdBeneficiary(new ApmIdentifier.Uuid(aVar.f132329a), n61.j.c(aVar), aVar));
                }
                return arrayList;
            case 16:
                f5j.a it13 = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new PayIdBeneficiary(new ApmIdentifier.Uuid(it13.f132329a), n61.j.c(it13), it13);
            case 17:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                zxa.d dVar = (zxa.d) d0.d0(it14);
                if (dVar == null) {
                    return null;
                }
                RowDelegate.Model model = new RowDelegate.Model("YOUR_REWARD_ROW_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_revolut, R$attr.uikit_colorBlack, R$attr.uikit_colorWhite), null, null, false, null, false, 62), new TextLocalisedClause(R$string.referrals_invite_campaign_salary_reward_section_item_title, null, null, 14), null, 0, new TimeClause(dVar.f326095b, new TimeClause.Format.Pretty(0), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar.f326096c, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(new yi());
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(new yi());
            case 20:
                gyi.a currentState = (gyi.a) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                svi.r rVarJ2 = gyi.d0.J2(currentState);
                if (rVarJ2 == null || (airportLoungesDisclaimer = currentState.e) == null) {
                    return null;
                }
                return new Pair(rVarJ2, airportLoungesDisclaimer);
            case 21:
                gyi.a update = (gyi.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return gyi.a.a(update, null, null, null, null, null, new AnimationRequest(false), 31);
            case 22:
                List petRenewalDetailsList = (List) obj2;
                Intrinsics.checkNotNullParameter(petRenewalDetailsList, "petRenewalDetailsList");
                return petRenewalDetailsList.size() == 1 ? new gz7.f((gz7.c) d0.b0(petRenewalDetailsList)) : new gz7.e(petRenewalDetailsList);
            case 23:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("LOADING_ACTIVE_ITEM_ID", i), false, 0, false, 28));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 24:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayListP2.add(nb0.b(pb0.Companion, a0.d.n("LOADING_COMPLETED_ITEM_ID_", i2), false, 0, false, 28));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(nb0.b(pb0.Companion, "LOADING_ARCHIVED_ITEM_ID_0", true, 0, false, 28));
                return d0.E0(yp0.b.g(arrayList2, gzb.e.a(), null, 0, 0, 126), arrayListP2);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 26:
                gzg.n it15 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f148109b;
            case 27:
                gzg.n it16 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f148114l;
            case 28:
                gzg.n update2 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return gzg.n.a(update2, null, null, null, null, !update2.f148112h, null, null, null, 8063);
            default:
                TotalValueChartPoint it17 = (TotalValueChartPoint) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f95006b;
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f147195a = i;
    }
}
