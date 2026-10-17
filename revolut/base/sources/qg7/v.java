package qg7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import ip0.a3;
import ip0.q10;
import ip0.s7;
import ip0.t10;
import ip0.um0;
import ip0.w60;
import ip0.x60;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.serialization.json.JsonElement;
import qlm.t0;
import qlm.v1;
import zh9.i0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245694a;

    public /* synthetic */ v(int i) {
        this.f245694a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zh9.i iVar;
        zh9.h hVar;
        boolean z = false;
        String str = null;
        str = null;
        str = null;
        switch (this.f245694a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new i(zhm.u.c(new x60("LOTTERY_LOADING_PROMPT_ITEM_ID", w60.CIRCLE_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))));
            case 1:
                qgf.h it8 = (qgf.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.d;
            case 2:
                Intrinsics.checkNotNullParameter((cz3.d) obj2, "it");
                return Unit.f186387a;
            case 3:
                qhb.a update = (qhb.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return qhb.a.a(update, new Data(null, null, true, 3, null));
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(new t10("LIST_ID_EMAIL_DRAFT", q10.f165912a));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str2 = (String) pair.f186385a;
                List list = (List) pair.f186386b;
                if (d0.W(str2)) {
                    return list;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String strE = jli.g.e(lowerCase);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    ChooserScreenContract$Model chooserScreenContract$Model = (ChooserScreenContract$Model) obj3;
                    String[] elements = {chooserScreenContract$Model.f65904b, chooserScreenContract$Model.f, chooserScreenContract$Model.e, chooserScreenContract$Model.f65906g};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    ArrayList arrayListZ = zhm.d0.Z(kotlin.collections.d.y0(elements));
                    if (!arrayListZ.isEmpty()) {
                        Iterator it9 = arrayListZ.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                String lowerCase2 = ((String) it9.next()).toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (d0.J(jli.g.e(lowerCase2), strE, false)) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            case 6:
                List models = (List) obj2;
                Intrinsics.checkNotNullParameter(models, "models");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : models) {
                    if (((ChooserScreenContract$Model) obj4).f65908j) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 7:
                LargeActionButtonDelegate.Model buttonModel = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                Object obj5 = buttonModel.i;
                Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.String");
                return new Pair((String) obj5, Boolean.TRUE);
            case 8:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return Boolean.valueOf(command instanceof FinishCommand);
            case 9:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f53228a;
            case 10:
                um0 buttonModel2 = (um0) obj2;
                Intrinsics.checkNotNullParameter(buttonModel2, "buttonModel");
                Object obj6 = buttonModel2.d;
                Intrinsics.i(obj6, "null cannot be cast to non-null type kotlin.String");
                return new Pair((String) obj6, Boolean.FALSE);
            case 11:
                um0 buttonModel3 = (um0) obj2;
                Intrinsics.checkNotNullParameter(buttonModel3, "buttonModel");
                Object obj7 = buttonModel3.d;
                Intrinsics.i(obj7, "null cannot be cast to non-null type kotlin.String");
                return new Pair((String) obj7, Boolean.TRUE);
            case 12:
                od0.i payLaterCard = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(payLaterCard, "payLaterCard");
                return payLaterCard.d() ? efm.d0.m(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(((f0) payLaterCard.c()).f150110a, 6, z, z), 15))) : efm.d0.m(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, null, null, null, null, null, null, 16383)));
            case 13:
                od0.i managementOpt = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(managementOpt, "managementOpt");
                i0 i0Var = (i0) managementOpt.f224257a;
                if (i0Var != null && (iVar = i0Var.f322286b) != null && (hVar = iVar.f) != null) {
                    str = hVar.f322267a;
                }
                if (str != null) {
                    return new FeatureCommand(new PayLaterHomeFeatureConfig(str));
                }
                throw new IllegalStateException("There is no active pay later facility");
            case 14:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                List<dej.n> list2 = events;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                for (dej.n nVar : list2) {
                    arrayList3.add(new qij.g(nVar, nVar.k));
                }
                return arrayList3;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((ReferralCampaignV4) obj2, "it");
                return pwa.n.CRYPTO_INTERNAL;
            case 17:
                ReferralCampaignV4 campaign = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                List list3 = campaign.z;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it11 = list3.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            if (((Upsell) it11.next()).f81780a == Upsell.Type.CRYPTO) {
                                z = true;
                            }
                        }
                    }
                }
                od0.h hVar2 = od0.i.Companion;
                pwa.n nVar2 = z ? pwa.n.STANDARD : null;
                hVar2.getClass();
                return od0.h.a(nVar2);
            case 18:
                int i = TrustedMerchantsActivity.C0;
                Intrinsics.checkNotNullParameter((FullScreenStateDelegate.Model) obj2, "it");
                return Unit.f186387a;
            case 19:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (Unit) it12.getContent();
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("ID_EXCHANGE_AMOUNT_ITEM", 0, 0, 0, 0, false, null, 126);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(new a3("loading_1"), new a3("loading_2"), new a3("loading_3"));
                yp0.b.k(listK, R$attr.uikit_dp24, 0, 0, 0, 30);
                return listK;
            case 24:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return te0.w.T(user, wi0.b.f297756l, wi0.b.l2) ? qjk.j.f246909a : !te0.w.S(user, wi0.b.p0) ? qjk.k.f246910a : qjk.i.f246908a;
            case 25:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(te0.w.Z(it13));
            case 26:
                olm.a buildClassSerialDescriptor = (olm.a) obj2;
                qk0.f fVar = qk0.f.f246935a;
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                zhm.f0 f0Var = zhm.f0.f322471a;
                buildClassSerialDescriptor.a("key", v1.f247719b, f0Var, false);
                buildClassSerialDescriptor.a("value", JsonElement.INSTANCE.serializer().getDescriptor(), f0Var, false);
                buildClassSerialDescriptor.a("localModificationTimeMillis", nlm.a.c(t0.f247706a).getDescriptor(), f0Var, false);
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, zhm.f0.f322471a, new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 28:
                ql6.m mVar = (ql6.m) obj2;
                return ql6.m.a(mVar, zi0.c.P(mVar.f247211a.getD(), false, null, 3), null, 11);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
        }
    }

    public /* synthetic */ v(Object obj2, int i) {
        this.f245694a = i;
    }
}
