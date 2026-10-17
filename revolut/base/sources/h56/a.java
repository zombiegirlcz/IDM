package h56;

import ael.k;
import b59.d;
import cfl.u;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.model.DeFiWallet;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.AnalyticsTrackingConsentFlowContract$Step;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroPieChartItem;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreenContent;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$TemplateIntroPage;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import h30.q;
import h6j.f;
import h8d.o;
import ha1.s;
import ha1.v;
import hae.l;
import hee.j;
import iel.i;
import ip0.p10;
import ip0.rv;
import ip0.t10;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import sa1.t;
import tof.a3;
import tof.v6;
import ue0.e;
import ufm.p;
import vkm.j2;
import wk5.m;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149507b;

    public /* synthetic */ a(DeFiAssetDetails deFiAssetDetails, q qVar) {
        this.f149506a = 0;
        this.f149507b = deFiAssetDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f149506a;
        int i2 = 16;
        int i3 = 15;
        int i5 = 10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f149507b;
        switch (i) {
            case 0:
                DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) obj3;
                e16.b account = (e16.b) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                List list = account.d;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((DeFiWallet) it8.next()).f71643b);
                }
                Set walletChainTypes = d0.i1(arrayList);
                xi0.b currency = deFiAssetDetails.f71665a.getCurrency();
                ArrayList supportedBlockchains = deFiAssetDetails.f71667c;
                Intrinsics.checkNotNullParameter(supportedBlockchains, "supportedBlockchains");
                Intrinsics.checkNotNullParameter(walletChainTypes, "walletChainTypes");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : supportedBlockchains) {
                    if (walletChainTypes.contains(m.a((wk5.a) obj4))) {
                        arrayList2.add(obj4);
                    }
                }
                DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
                return new jbj.b(currency, arrayList2, new jbj.a(defiCurrency.f71672b, defiCurrency.f));
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (d) ((h59.c) obj3).f149516c.get("MARKET_ALERT_SETTINGS_MEMORY_KEY");
            case 2:
                u giaMarginProductOnboardingStatus = (u) obj2;
                Intrinsics.checkNotNullParameter(giaMarginProductOnboardingStatus, "giaMarginProductOnboardingStatus");
                return Boolean.valueOf(((Set) ((zq.a) obj3).f324336c).contains(giaMarginProductOnboardingStatus));
            case 3:
                h6j.d update = (h6j.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = !((h6j.d) ((j2) ((f) obj3).o.f22677a).getValue()).f149750a;
                update.getClass();
                return new h6j.d(z);
            case 4:
                StackDestination nextDestination = (StackDestination) obj2;
                Intrinsics.checkNotNullParameter(nextDestination, "nextDestination");
                ((h72.c) obj3).f149838a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(nextDestination), 2))));
                return Boolean.TRUE;
            case 5:
                fkg.a aVar = (fkg.a) obj3;
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                List list2 = events;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof iel.a) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((iel.a) it9.next()).i());
                }
                List list3 = (List) e.M(arrayList4);
                if (list3 != null) {
                    return nim.a.w(rd0.e.c(((k) ((ybl.b) aVar.f135824b)).l(d0.i1(list3)), g.f186406a), new fvk.q(events, 19));
                }
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(new kp3.c((i) it10.next()));
                }
                return zi0.c.j(arrayList5);
            case 6:
                return h8d.m.a((h8d.m) obj2, (o) obj3, null, null, false, 14);
            case 7:
                PortfolioRevealIntroScreenContract$TemplateIntroPage portfolioRevealIntroScreenContract$TemplateIntroPage = (PortfolioRevealIntroScreenContract$TemplateIntroPage) obj3;
                Intrinsics.checkNotNullParameter((h8f.g) obj2, "$this$update");
                String str = portfolioRevealIntroScreenContract$TemplateIntroPage.f91467a;
                String str2 = portfolioRevealIntroScreenContract$TemplateIntroPage.f91468b;
                TemplateIntroScreenContent templateIntroScreenContent = portfolioRevealIntroScreenContract$TemplateIntroPage.f91469c;
                TemplateIntroScreenContent.PieChart pieChart = templateIntroScreenContent instanceof TemplateIntroScreenContent.PieChart ? (TemplateIntroScreenContent.PieChart) templateIntroScreenContent : null;
                return new h8f.g(str, str2, pieChart != null ? new h8f.e(pieChart) : null);
            case 8:
                TemplateIntroPieChartItem item = (TemplateIntroPieChartItem) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                double d = item.f91252b;
                ((h8f.m) obj3).getClass();
                BigDecimal bigDecimalMultiply = BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(100L));
                String plainString = (bigDecimalMultiply.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalMultiply.stripTrailingZeros()).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                return com.google.android.gms.internal.mlkit_vision_face.a.o(plainString, "% ", item.f91251a);
            case 9:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                ((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b) obj3).B2();
                return Boolean.TRUE;
            case 10:
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b bVar = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b) obj3;
                o92.f outputData = (o92.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                bVar.H2(bVar.f62651q, new a(outputData, 11));
                return Unit.f186387a;
            case 11:
                h92.d update2 = (h92.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return h92.d.a(update2, ((o92.f) obj3).f223064a, null, 2);
            case 12:
                String transferId = (String) obj2;
                Intrinsics.checkNotNullParameter(transferId, "transferId");
                return (TransferRequest) ((h9f.d) obj3).f150242b.get(h9f.d.a(transferId));
            case 13:
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.b bVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.b) obj3;
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                bVar2.l2(new h54.o(bVar2, throwable2, objArr == true ? 1 : 0, i5), new yi5.b(26));
                return Boolean.TRUE;
            case 14:
                v vVar = (v) obj3;
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                sa1.d dVar = vVar.f150392a;
                byte[] payload = vVar.f150393b.a(it11);
                ((sa1.q) dVar).getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                RPCCommand rPCCommand = new RPCCommand();
                rPCCommand.setInputSecurityMode(SecurityMode.SIGNED_CIPHERED);
                rPCCommand.setOutputSecurityMode(SecurityMode.SIGNED);
                rPCCommand.setPayload(payload);
                return pw5.a.g(t.b(rPCCommand, null, 3));
            case 15:
                r10.d dVar2 = (r10.d) obj3;
                Boolean hasPermission = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasPermission, "hasPermission");
                boolean zBooleanValue = hasPermission.booleanValue();
                od0.i iVar = od0.i.f224256b;
                if (!zBooleanValue) {
                    od0.i.Companion.getClass();
                    return efm.d0.m(iVar);
                }
                p pVarT = new ufm.i(((z39.b) ((w39.b) dVar2.f250818a)).f319221b.e(), new s(13, new ha1.k(i2)), 1).t(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
                od0.i.Companion.getClass();
                return e.F(pVarT, iVar);
            case 16:
                List juniorProfilesWithExtraData = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorProfilesWithExtraData, "juniorProfilesWithExtraData");
                return d0.P0(d0.d1(juniorProfilesWithExtraData), new fad.i(new fad.i((ha8.i) obj3, i3), i2));
            case 17:
                com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.a aVar2 = (com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.a) obj3;
                qog.d output = (qog.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof qog.c) {
                    aVar2.C2(new ha9.d(((qog.c) output).f248209a));
                } else if (Intrinsics.f(output, qog.a.f248207a)) {
                    aVar2.C2(ha9.c.f150476a);
                } else {
                    if (!Intrinsics.f(output, qog.b.f248208a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.w2(aVar2.f78385q, AnalyticsTrackingConsentFlowContract$Step.LearnMore.f78383a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                return Unit.f186387a;
            case 18:
                l lVar = (l) obj3;
                whf.p transactionsContent = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                List list4 = transactionsContent.f297646a;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list4) {
                    v6 v6Var = ((a3) obj6).f;
                    if (v6Var == v6.COMPLETED || v6Var == v6.PENDING) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                Iterator it12 = arrayList6.iterator();
                while (it12.hasNext()) {
                    arrayList7.add(((a3) it12.next()).k);
                }
                return new ufm.i(lVar.f150500s.a(arrayList7, lVar.o.f89204c), new s(27, new gae.b(transactionsContent, 1)), 1);
            case 19:
                com.revolut.feature.wealth.impl.ui.flows.add_money.b bVar3 = (com.revolut.feature.wealth.impl.ui.flows.add_money.b) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                yji.l.a1(bVar3, bVar3.X1(new y0(null, new z(new TextLocalisedClause(R$string.wealth_add_money_error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new gqh.o(bVar3, objArr2 == true ? 1 : 0, 25), 3);
                return Boolean.TRUE;
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) obj3;
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                eVar.H2(eVar.f67685r, new ab4.q(it13, i3));
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it13, h0Var3);
                return Boolean.TRUE;
            case 21:
                return hb4.e.a((hb4.e) obj2, null, new Data((qy3.c) obj3, null, false, 6, null), 1);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rv rvVar = new rv("LOADING_ITEM_ID1", null, 62);
                yp0.b.l(rvVar, 0, 0, 0, 0, null, false, 63);
                t10 t10Var = new t10("LOADING_ITEM_ID2", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                return new hbg.v(zhm.v.k(rvVar, t10Var), ((hbg.l) obj3).f150707h, f0.f322471a);
            case 23:
                wk5.a filteredBlockchain = (wk5.a) obj2;
                Intrinsics.checkNotNullParameter(filteredBlockchain, "filteredBlockchain");
                return nim.a.v(rd0.e.b(((ap5.b) ((r10.w) obj3).f250865a).e(true, ho5.a.ADDRESS_TYPE, false)), new bcj.i(filteredBlockchain, 9));
            case 24:
                int i6 = ((hd2.d) ((j2) ((hd2.c) obj3).f151378q.f22677a).getValue()).f151379a - 1;
                ((hd2.d) obj2).getClass();
                return new hd2.d(i6);
            case 25:
                return hea.o.a((hea.o) obj2, null, false, null, null, null, null, null, null, false, null, null, false, ((kn2.a) obj3).e, null, false, 28671);
            case 26:
                return hea.o.a((hea.o) obj2, null, false, null, null, null, null, null, null, false, null, (hea.d) obj3, false, null, null, false, 31743);
            case 27:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a(updateState, null, null, null, ((uce.b) obj3).f279035a, false, false, 55);
            case 28:
                j updateState2 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return j.a(updateState2, null, null, ((b8a.a) ((y7a.w) obj3)).f13146a, null, false, false, 59);
            default:
                hek.b bVar4 = (hek.b) obj3;
                Boolean isPodNomineeEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isPodNomineeEnabled, "isPodNomineeEnabled");
                if (isPodNomineeEnabled.booleanValue()) {
                    bVar4.f151714a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) PodNomineesDestination.f102578a, false, (Integer) null, 0, 61)));
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f149506a = i;
        this.f149507b = obj2;
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f149506a = i;
        this.f149507b = obj3;
    }
}
