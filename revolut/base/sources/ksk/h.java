package ksk;

import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.internal.views.quiz.QuizCardContentView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FullscreenQuizView$QuizSelection;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalanceGroup;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dej.c1;
import dej.g1;
import dej.h1;
import efm.r;
import io3.k;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.sw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jtd.n;
import jtd.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.d0;
import ksk.i;
import ku1.j0;
import kv5.o;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189481a;

    public /* synthetic */ h(int i) {
        this.f189481a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        int i;
        rt5.d dVar;
        int i2 = this.f189481a;
        od0.i iVar = od0.i.f224256b;
        switch (i2) {
            case 0:
                i.a aVar = i.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("ABOUT_ISSUER_LOADING_HEADER", 0, 0, 30);
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it8 = intRangeO.iterator();
                while (it8.f289625c) {
                    arrayList.add(new s7(a0.d.n("ABOUT_ISSUER_LOADING_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return i2b.a.q(guVar, arrayList);
            case 1:
                p it9 = (p) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it9);
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 3:
                List planOffers = (List) obj2;
                Intrinsics.checkNotNullParameter(planOffers, "planOffers");
                od0.h hVar = od0.i.Companion;
                Iterator it10 = planOffers.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next = it10.next();
                        c1 c1Var = (c1) next;
                        if ((c1Var.d instanceof g1.a) && (c1Var.f113506c instanceof h1.a)) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 5:
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                od0.h hVar2 = od0.i.Companion;
                n nVar = new n(pricingPlan);
                hVar2.getClass();
                return od0.h.a(nVar);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.h hVar3 = od0.i.Companion;
                n nVar2 = new n(null);
                hVar3.getClass();
                return od0.h.a(nVar2);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 8:
                InputChecklistDelegate.Model item = (InputChecklistDelegate.Model) obj2;
                QuizCardContentView.Companion aVar2 = QuizCardContentView.INSTANCE;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = item.i;
                if (obj4 instanceof FullscreenQuizView$QuizSelection) {
                    return (FullscreenQuizView$QuizSelection) obj4;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                sw swVar = new sw("MAP_LIST_ID");
                yp0.b.l(swVar, 0, 0, 0, 0, null, false, 63);
                return swVar;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "ID_PAYMENT_FROM_LOADING_ITEM", false, 0, false, 30);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return j0.a();
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return hu8.a.b();
            case 13:
                return ((StatusBarNotification) obj2).getNotification().extras.getParcelableArray("android.messages");
            case 14:
                Parcelable[] it11 = (Parcelable[]) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return r.fromIterable(kotlin.collections.d.v0(it11));
            case 15:
                Parcelable messageBundle = (Parcelable) obj2;
                Intrinsics.checkNotNullParameter(messageBundle, "messageBundle");
                return (Bundle) messageBundle;
            case 16:
                kuc.e it12 = (kuc.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f189770a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return kuc.b.f189767a;
            case 18:
                od0.i optionalAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                return (TradingAccount) optionalAccount.c();
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 20:
                List challenges = (List) obj2;
                Intrinsics.checkNotNullParameter(challenges, "challenges");
                List<d0j.h> list = challenges;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (d0j.h challenge : list) {
                    Intrinsics.checkNotNullParameter(challenge, "challenge");
                    String str = challenge.f110399a;
                    TextClause textClause = new TextClause(challenge.f110401c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str2 = challenge.e;
                    if (d0.W(str2)) {
                        str2 = null;
                    }
                    UrlMedia urlMedia = str2 != null ? new UrlMedia(str2) : null;
                    d0j.g gVar = challenge.i;
                    arrayList2.add(new SmallCardDelegate.Model(str, null, textClause, null, urlMedia, null, (gVar == null || (i = gVar.f110397b) <= 0) ? null : Float.valueOf(gVar.f110396a / i), new RewardsHubChallengeDetailsParams(challenge.f110400b, challenge.f110399a), null, 1043418));
                }
                return arrayList2;
            case 21:
                CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(cryptoCommodityPositions, "cryptoCommodityPositions");
                ArrayList<CryptoCommodityPosition> arrayList3 = cryptoCommodityPositions.f71383b;
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                for (CryptoCommodityPosition cryptoCommodityPosition : arrayList3) {
                    arrayList4.add(new rt5.b(cryptoCommodityPosition.f71379a, cryptoCommodityPosition.d));
                }
                return arrayList4;
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                List list3 = (List) rVar.f314203c;
                List<CombinedPocketsBalance> list4 = pocketBalancesWithSum.f71384a;
                ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                for (CombinedPocketsBalance combinedPocketsBalance : list4) {
                    Intrinsics.checkNotNullParameter(combinedPocketsBalance, "<this>");
                    dj0.d dVar2 = combinedPocketsBalance.f71373a;
                    dj0.d dVar3 = combinedPocketsBalance.f71374b;
                    xi0.b bVar = combinedPocketsBalance.e;
                    CombinedPocketsBalanceGroup combinedPocketsBalanceGroup = combinedPocketsBalance.f71375c;
                    io3.d dVar4 = combinedPocketsBalanceGroup.f71376a.f163163a;
                    String str3 = dVar4.f163145a;
                    dj0.d dVar5 = combinedPocketsBalanceGroup.f71377b;
                    dj0.d dVar6 = combinedPocketsBalanceGroup.f71378c;
                    k kVar = dVar4.f;
                    k kVar2 = k.ACTIVE;
                    rt5.d dVar7 = new rt5.d(str3, dVar5, dVar6, kVar == kVar2, null);
                    CombinedPocketsBalanceGroup combinedPocketsBalanceGroup2 = combinedPocketsBalance.d;
                    if (combinedPocketsBalanceGroup2 != null) {
                        io3.d dVar8 = combinedPocketsBalanceGroup2.f71376a.f163163a;
                        dVar = new rt5.d(dVar8.f163145a, combinedPocketsBalanceGroup2.f71377b, combinedPocketsBalanceGroup2.f71378c, dVar8.f == kVar2, null);
                    } else {
                        dVar = null;
                    }
                    arrayList5.add(new rt5.f(dVar2, dVar3, bVar, dVar7, dVar));
                }
                return new rt5.h(arrayList5, list2, list3);
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 24:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List<qta.a> list5 = rates;
                ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
                for (qta.a aVar3 : list5) {
                    arrayList6.add(new rt5.g(aVar3.e, aVar3.f249039a, aVar3.f249040b));
                }
                return arrayList6;
            case 25:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list6 = pockets;
                ArrayList arrayList7 = new ArrayList(w.t(list6, 10));
                Iterator it13 = list6.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(z92.f.l((io3.d) it13.next()));
                }
                return arrayList7;
            case 26:
                io3.d it14 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                xi0.a aVar4 = xi0.b.Companion;
                String str4 = it14.f163147c;
                aVar4.getClass();
                return Boolean.valueOf(cp5.d.z(xi0.a.a(str4)));
            case 27:
                io3.d it15 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(o.f.contains(it15.f));
            case 28:
                io3.d it16 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.i != 0 || it16.f163151l > 0);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(nb0.a(pb0.Companion, "LOADING_STATE_ID", false, 6));
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f189481a = i;
    }
}
