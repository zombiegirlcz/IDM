package oh3;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorRequestConsentScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.CantSendRequestDialogContent;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.HowItWorksItemContent;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentConfiguration;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.shops.api.model.AdvertisingInfo;
import com.revolut.feature.shops.api.model.Header;
import com.revolut.feature.shops.api.model.Instruction;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import dfj.y1;
import eid.k;
import eid.p;
import eid.q;
import hs3.n;
import ip0.pb0;
import ip0.qs;
import ip0.um0;
import ip0.wj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mid.m;
import oi4.j;
import ojk.z;
import zhm.a0;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225274a;

    public /* synthetic */ a(int i) {
        this.f225274a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f225274a) {
            case 0:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = groups.iterator();
                while (it8.hasNext()) {
                    a0.x(((k1j.b) it8.next()).f180284c, arrayList);
                }
                return arrayList;
            case 1:
                com.revolut.domain.models.topup.methods.b topUpMethods = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(topUpMethods, "topUpMethods");
                aim.e eVarB = u.b();
                eVarB.addAll(topUpMethods.f60525a);
                eVarB.addAll(topUpMethods.f60526b);
                aim.e eVarA = u.a(eVarB);
                ArrayList arrayList2 = new ArrayList(w.t(eVarA, 10));
                ListIterator listIterator = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        return arrayList2;
                    }
                    arrayList2.add(new AddMoneyMethod.TopUp((TopupMethod) bVar.next()));
                }
                break;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                aim.e eVarB2 = u.b();
                eVarB2.addAll(list);
                eVarB2.addAll(list2);
                return u.a(eVarB2);
            case 3:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.u;
                if (obj3 instanceof n) {
                    return (n) obj3;
                }
                return null;
            case 4:
                SelectableDelegate.Model item = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimSetupOptionsScreen.W;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = ((RowDelegate.Model) item.f53305b).u;
                if (obj4 instanceof EsimProfile) {
                    return (EsimProfile) obj4;
                }
                return null;
            case 5:
                SpousalConsentInitiatorRequestConsentScreenConfig spousalConsentInitiatorRequestConsentScreenConfig = (SpousalConsentInitiatorRequestConsentScreenConfig) obj2;
                if (!(spousalConsentInitiatorRequestConsentScreenConfig instanceof SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks)) {
                    throw new NoWhenBranchMatchedException();
                }
                SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks howItWorks = (SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks) spousalConsentInitiatorRequestConsentScreenConfig;
                HowItWorksItemContent howItWorksItemContent = new HowItWorksItemContent(howItWorks.f66412a, howItWorks.f66413b);
                SpousalConsentInitiatorRequestConsentScreenConfig.HowItWorks.ErrorDialog errorDialog = howItWorks.f66414c;
                return new RequestConsentConfiguration(howItWorksItemContent, new CantSendRequestDialogContent(errorDialog.f66415a, errorDialog.f66416b, errorDialog.f66417c, errorDialog.d));
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0Var = new pb0("LOADING_ITEM_ID_1");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                List listC = u.c(pb0Var);
                List listK = v.k(new pb0("LOADING_ITEM_ID_2"), new pb0("LOADING_ITEM_ID_3"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new j(i2b.a.o(listC, listK), false);
            case 7:
                eid.a it10 = (eid.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                eid.b header = it10.getHeader();
                Intrinsics.checkNotNullParameter(header, "<this>");
                Header header2 = new Header(header.getIcon(), header.getTitle());
                List<eid.c> instructions = it10.getInstructions();
                ArrayList arrayList3 = new ArrayList(w.t(instructions, 10));
                for (eid.c cVar : instructions) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList3.add(new Instruction(cVar.getIcon(), cVar.getTitle(), cVar.getDescription()));
                }
                return new AdvertisingInfo(header2, arrayList3);
            case 8:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List<aid.a> list3 = it11;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (aid.a aVar : list3) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    arrayList4.add(new mid.j(aVar.f5231a, aVar.f5232b));
                }
                return arrayList4;
            case 9:
                p component = (p) obj2;
                Intrinsics.checkNotNullParameter(component, "component");
                return xam.a.t(component);
            case 10:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                List<k> list5 = list4;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                for (k kVar : list5) {
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    arrayList5.add(new ShopsCategory(kVar.getId(), kVar.getName()));
                }
                return arrayList5;
            case 11:
                q it12 = (q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                List components = it12.getComponents();
                ArrayList arrayList6 = new ArrayList(w.t(components, 10));
                Iterator it13 = components.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(xam.a.t((p) it13.next()));
                }
                return new m(arrayList6);
            case 12:
                eid.d it14 = (eid.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Intrinsics.checkNotNullParameter(it14, "<this>");
                return new shd.b(it14.getWebhook(), it14.getPromoCode());
            case 13:
                Map.Entry it15 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Integer.valueOf(bfj.a.a(((y1) it15.getValue()).f114160a));
            case 14:
                fij.p it16 = (fij.p) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Integer.valueOf(bfj.a.a(it16.f135452b));
            case 15:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr2 = ArticleWebViewScreen.S;
                Intrinsics.checkNotNullParameter(context, "context");
                UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(context);
                uIKitLinearLayoutManager.f98538b = false;
                return uIKitLinearLayoutManager;
            case 16:
                oj2.e update = (oj2.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oj2.e.a(update, new Data(null, null, true, 3, null), null, 2);
            case 17:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.TRUE;
            case 18:
                s69.a article = (s69.a) obj2;
                Intrinsics.checkNotNullParameter(article, "article");
                return article.f260153a;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new wj("ARTICLE_LOADING_ROW_ID"));
            case 20:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, d0.I0((List) pair2.f186385a));
            case 21:
                return Boolean.FALSE;
            case 22:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.u;
            case 23:
                um0 it18 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj5 = it18.d;
                if (obj5 instanceof z) {
                    return (z) obj5;
                }
                return null;
            case 24:
                um0 it19 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj6 = it19.d;
                if (obj6 instanceof z) {
                    return (z) obj6;
                }
                return null;
            case 25:
                ListSubheaderDelegate.Model it20 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f52715m;
            case 26:
                CenteredContentTileDelegate.Model it21 = (CenteredContentTileDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.i;
            case 27:
                qs model = (qs) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj7 = model.i;
                PlanScreenElementView.HeroCard heroCard = obj7 instanceof PlanScreenElementView.HeroCard ? (PlanScreenElementView.HeroCard) obj7 : null;
                if (heroCard != null) {
                    return new ojk.u(heroCard.d.f81005a);
                }
                return null;
            case 28:
                qs model2 = (qs) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj8 = model2.i;
                PlanScreenElementView.HeroCard heroCard2 = obj8 instanceof PlanScreenElementView.HeroCard ? (PlanScreenElementView.HeroCard) obj8 : null;
                if (heroCard2 != null) {
                    return new ojk.u(heroCard2.e.f81066c.f81005a);
                }
                return null;
            default:
                BigTileDelegate.Model it22 = (BigTileDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f51742s;
        }
    }

    public /* synthetic */ a(oi4.q qVar) {
        this.f225274a = 6;
    }
}
