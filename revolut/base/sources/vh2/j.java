package vh2;

import aii.r;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlayer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.data.model.Data;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.address.models.CountryState;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview.AuthorizationWebViewScreen;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.rfi_tool.impl.domain.model.Content;
import com.revolut.feature.rfi_tool.impl.domain.model.ContentType;
import com.revolut.feature.rfi_tool.impl.domain.model.EndDialog;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$RfiToolFlowState;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$FlowState;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.user_declarations.shared.flows.income.screen.a;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import d67.s;
import fej.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jv0.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lbl.a;
import nu0.g;
import nu0.l;
import skm.k0;
import vha.h1;
import vha.t0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289281b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f289280a = i;
        this.f289281b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v21, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? pendingContents;
        List list;
        Object cVar;
        r bVar;
        int i;
        long j2;
        switch (this.f289280a) {
            case 0:
                n nVar = (n) this.f289281b;
                nVar.l2(new rf9.h(15, null, nVar, ((Boolean) obj2).booleanValue()), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                vh3.d dVar = (vh3.d) this.f289281b;
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                zh3.g gVar = dVar.f289306b;
                gVar.getClass();
                pfm.h hVar = new pfm.h(new z6l.a(gVar, 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar.D(it8);
            case 2:
                h1 h1Var = (h1) this.f289281b;
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List pockets = (List) kVar.f288454a;
                bia.b proAccountInfo = (bia.b) kVar.f288455b;
                List onHoldAccounts = (List) kVar.f288456c;
                dj0.d pendingAmount = (dj0.d) kVar.d;
                Set hiddenAccountsIds = (Set) kVar.e;
                t0 t0Var = h1Var.f289371c;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Intrinsics.checkNotNullParameter(proAccountInfo, "proAccountInfo");
                Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
                Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
                Intrinsics.checkNotNullParameter(hiddenAccountsIds, "hiddenAccountsIds");
                if (com.revolut.feature.freelancer.common.models.a.c(proAccountInfo.f15458c)) {
                    return f0.f322471a;
                }
                if (proAccountInfo.f15458c instanceof FreelancerAccountOnboardingState.Pending) {
                    return u.c(t0Var.a(proAccountInfo));
                }
                List<io3.d> list2 = pockets;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (io3.d dVar2 : list2) {
                    arrayList.add(t0Var.e(dVar2, proAccountInfo, onHoldAccounts, pendingAmount, hiddenAccountsIds.contains(dVar2.f163145a)));
                }
                return arrayList.isEmpty() ? u.c(t0.d(proAccountInfo.f15456a.f115083b)) : pockets.size() > 1 ? d0.F0(t0Var.c(proAccountInfo, onHoldAccounts, pendingAmount), arrayList) : arrayList;
            case 3:
                vhg.f fVar = (vhg.f) this.f289281b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return fVar.b(5, 0);
            case 4:
                vi1.p pVar = (vi1.p) this.f289281b;
                sh1.n config = (sh1.n) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList<wi0.b> arrayList2 = config.o;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (wi0.b bVar2 : arrayList2) {
                    arrayList3.add(new sh1.m(((lj1.a) pVar.f289514a).b(bVar2.f297794a), bVar2.f297794a));
                }
                return arrayList3;
            case 5:
                vi1.r rVar = (vi1.r) this.f289281b;
                List countryStates = (List) obj2;
                Intrinsics.checkNotNullParameter(countryStates, "countryStates");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : countryStates) {
                    if (((CountryState) obj3).getSupported()) {
                        arrayList4.add(obj3);
                    }
                }
                rVar.f289517b.set(arrayList4);
                return arrayList4;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a) this.f289281b;
                ti4.i outputData = (ti4.i) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof ti4.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.C2(pu.e.f239785a);
                return Unit.f186387a;
            case 7:
                xid.d dVar3 = (xid.d) this.f289281b;
                ShopsBidFlowContract$FlowState update = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Double dValueOf = Double.valueOf(((xid.f) dVar3).f306329a);
                update.getClass();
                return new ShopsBidFlowContract$FlowState(dValueOf, true);
            case 8:
                return ((vif.e) this.f289281b).f289594a.getLastTransactions(null, 100, (String) obj2);
            case 9:
                vj1.b bVar3 = (vj1.b) this.f289281b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) bVar3.f289630b.get("ADVISED_COMPONENTS_KEY");
            case 10:
                vja.d dVar4 = (vja.d) this.f289281b;
                d67.u result = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, s.f111464a)) {
                    yp.b bVar4 = dVar4.f289663m;
                    Intrinsics.checkNotNullParameter(ui0.b.Companion, "<this>");
                    dVar4.A2(bVar4.b(new ui0.b("com.revolut.junior", null)));
                }
                return Unit.f186387a;
            case 11:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.f289281b;
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, d.a.f134638a)) {
                    cVar2.l2(new uxe.l(cVar2, null, 25), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.C2(a.C0617a.f101205a);
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.alipay.impl.ui.qr.a aVar2 = (com.revolut.feature.alipay.impl.ui.qr.a) this.f289281b;
                xk1.f result2 = (xk1.f) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof xk1.e) {
                    aVar2.C2(new vk1.j(((xk1.e) result2).f306596a));
                } else {
                    if (!Intrinsics.f(result2, xk1.d.f306595a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ali.b bVar5 = aVar2.f61074q;
                    Intrinsics.checkNotNullParameter(bVar5, "<this>");
                    bVar5.f6270b.k(ali.j.f6279a);
                }
                return Unit.f186387a;
            case 13:
                ukc.a aVar3 = (ukc.a) this.f289281b;
                RfiToolFlowContract$RfiToolFlowState update2 = (RfiToolFlowContract$RfiToolFlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ukc.d dVar5 = aVar3.d;
                if (dVar5 != null) {
                    ArrayList arrayList5 = dVar5.f280724a;
                    pendingContents = new ArrayList();
                    for (Object obj4 : arrayList5) {
                        if (((Content) obj4).f85000b != ContentType.UNKNOWN) {
                            pendingContents.add(obj4);
                        }
                    }
                } else {
                    pendingContents = f0.f322471a;
                }
                EndDialog endDialog = dVar5 != null ? dVar5.f280726c : null;
                boolean z = dVar5 != null ? dVar5.f280725b : false;
                update2.getClass();
                Intrinsics.checkNotNullParameter(pendingContents, "pendingContents");
                return new RfiToolFlowContract$RfiToolFlowState(pendingContents, endDialog, z);
            case 14:
                return Long.valueOf(k0.e(((kotlin.time.b) ((jcj.n) this.f289281b).invoke(obj2)).f187924a));
            case 15:
                AuthorizationWebViewScreen authorizationWebViewScreen = (AuthorizationWebViewScreen) this.f289281b;
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "it");
                vm6.f fVar2 = (vm6.f) authorizationWebViewScreen.Q.getValue();
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                fVar2.C2(new vm6.d(url2));
                return Unit.f186387a;
            case 16:
                RoboTransaction roboTransaction = (RoboTransaction) this.f289281b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new glc.i((RoboPortfolioInfo) pair.f186385a, roboTransaction, (PortfolioRecurringOrder) ((od0.i) pair.f186386b).f224257a);
            case 17:
                vmh.f fVar3 = (vmh.f) this.f289281b;
                vmh.g update3 = (vmh.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data = update3.f290585a;
                return (data == null || (list = (List) data.getContent()) == null || !(list.contains(fVar3) ^ true)) ? update3.f290586b == fVar3 ? vmh.g.a(update3, null, null, false, 5) : vmh.g.a(update3, null, fVar3, false, 5) : update3;
            case 18:
                vmh.k kVar2 = (vmh.k) this.f289281b;
                Set it9 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return d0.P0(it9, kVar2.o);
            case 19:
                vmi.d dVar6 = (vmi.d) this.f289281b;
                OAuthAuthorizeParams params = (OAuthAuthorizeParams) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (ymi.i) dVar6.f290600b.get(vmi.d.c(params));
            case 20:
                gte.a aVar4 = ((vnb.h) this.f289281b).f290786g;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                hha.d dVar7 = (hha.d) pair2.f186386b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list3) {
                    SavingsProductData savingsProductData = (SavingsProductData) obj5;
                    if (ocd.a.b(savingsProductData) && Intrinsics.f(savingsProductData.f86683a.i, dVar7.f152287a) && ocd.c.i(savingsProductData)) {
                        arrayList6.add(obj5);
                    }
                }
                SavingsProductData savingsProductDataA = opg.a.a(arrayList6);
                if (((jte.d) aVar4).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c)) {
                    return new vnb.d(list3);
                }
                if (savingsProductDataA != null) {
                    cVar = new vnb.a(savingsProductDataA);
                } else {
                    if (!((jte.d) aVar4).c(SavingsApi$Toggles.SavingsDiscoverMorePromoteIAS.f83079c) || !ocd.c.h(list3)) {
                        return new vnb.b(list3);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (ocd.a.b((SavingsProductData) obj6)) {
                            arrayList7.add(obj6);
                        }
                    }
                    cVar = new vnb.c(arrayList7);
                }
                return cVar;
            case 21:
                TaxExemptionAggregate taxExemptionAggregate = (TaxExemptionAggregate) this.f289281b;
                vne.c update4 = (vne.c) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                String strK = kotlin.jvm.internal.s.k(taxExemptionAggregate);
                Data exemptions = update4.f290797a;
                Intrinsics.checkNotNullParameter(exemptions, "exemptions");
                return new vne.c(exemptions, strK);
            case 22:
                com.revolut.feature.user_declarations.shared.flows.income.a aVar5 = (com.revolut.feature.user_declarations.shared.flows.income.a) this.f289281b;
                com.revolut.feature.user_declarations.shared.flows.income.screen.a outputData2 = (com.revolut.feature.user_declarations.shared.flows.income.screen.a) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (Intrinsics.f(outputData2, a.C0580a.f94631a)) {
                    bVar = a.C1100a.f193707a;
                } else {
                    if (!(outputData2 instanceof xng.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xng.i iVar = (xng.i) outputData2;
                    bVar = new lbl.b(iVar.f307496a, iVar.f307497b);
                }
                aVar5.C2(bVar);
                return Unit.f186387a;
            case 23:
                okl.d dVar8 = (okl.d) this.f289281b;
                vni.e result3 = (vni.e) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof vni.c) {
                    dVar8.invoke(new vnl.a(((vni.c) result3).f290815a));
                } else {
                    if (!(result3 instanceof vni.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar8.invoke(vnl.c.f290821a);
                }
                return Unit.f186387a;
            case 24:
                of8.b bVar6 = (of8.b) this.f289281b;
                return vo8.p.a((vo8.p) obj2, null, null, null, null, null, i2b.a.h(bVar6.f224753j), false, bVar6.f224756n.f235520a == of8.a.ENABLED, null, null, 863);
            case 25:
                ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) this.f289281b;
                ScreenerSelectedFilter it10 = (ScreenerSelectedFilter) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.getF105167a() == screenerSelectedFilter.getF105167a());
            case 26:
                y yVar = (y) this.f289281b;
                nu0.e playState = (nu0.e) obj2;
                Intrinsics.checkNotNullParameter(playState, "playState");
                int i2 = vq0.d.f291284a[playState.ordinal()];
                if (i2 == 1) {
                    ((UiKitPlayerView) yVar).i();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((UiKitPlayerView) yVar).h();
                }
                return Unit.f186387a;
            case 27:
                vq0.e eVar = (vq0.e) this.f289281b;
                vq0.b bVar7 = eVar.i;
                Handler handler = eVar.f291286g;
                nu0.g progressEvent = (nu0.g) obj2;
                Intrinsics.checkNotNullParameter(progressEvent, "progressEvent");
                if (progressEvent instanceof nu0.f) {
                    nu0.f fVar4 = (nu0.f) progressEvent;
                    if (fVar4.f219182b) {
                        int i3 = fVar4.f219181a;
                        y yVar2 = eVar.d;
                        nu0.i iVar2 = eVar.e;
                        if (yVar2 != null && iVar2 != null) {
                            if (iVar2.getF57516n() || i3 <= (i = eVar.f291288j)) {
                                handler.postDelayed(bVar7, 0L);
                                long contentDuration = yVar2.getContentDuration();
                                long j3 = contentDuration >= 0 ? contentDuration : 0L;
                                long maxProgress = (long) ((j3 * i3) / iVar2.getMaxProgress());
                                UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) yVar2;
                                uiKitPlayerView.f57710l = Long.valueOf(maxProgress);
                                ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
                                if (exoPlayer != null) {
                                    exoPlayer.seekTo(maxProgress);
                                    uiKitPlayerView.f57710l = null;
                                }
                                eVar.d(maxProgress, j3);
                            } else {
                                nu0.i iVar3 = eVar.e;
                                if (iVar3 != null) {
                                    iVar3.setProgress(i);
                                }
                                if (!eVar.f291289l) {
                                    handler.removeCallbacks(bVar7);
                                    nu0.i iVar4 = eVar.e;
                                    nu0.n nVar2 = eVar.f;
                                    if (iVar4 != null && nVar2 != null) {
                                        nu0.d.d(nVar2, true, new vd1.a(eVar, iVar4, 26), null, 4);
                                    }
                                }
                            }
                        }
                    }
                    if (fVar4.f219183c) {
                        handler.postDelayed(bVar7, 800L);
                    }
                } else if (Intrinsics.f(progressEvent, g.a.f219184a)) {
                    eVar.k = false;
                } else {
                    if (!Intrinsics.f(progressEvent, g.b.f219185a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.k = true;
                    handler.postDelayed(bVar7, 800L);
                }
                return Unit.f186387a;
            case 28:
                vq0.h hVar2 = (vq0.h) this.f289281b;
                nu0.l gestureEvent = (nu0.l) obj2;
                Intrinsics.checkNotNullParameter(gestureEvent, "gestureEvent");
                if (gestureEvent instanceof nu0.k) {
                    nu0.j jVar = ((nu0.k) gestureEvent).f219186a;
                    nu0.m mVar = hVar2.f291293c;
                    if (mVar != null) {
                        int i5 = vq0.i.f291296a[jVar.ordinal()];
                        if (i5 == 1) {
                            j2 = -5000;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j2 = MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS;
                        }
                        long contentPosition = mVar.getContentPlayerView().getContentPosition() + j2;
                        if (contentPosition < 0) {
                            contentPosition = 0;
                        }
                        ((RichVideoPlayerControlsView) mVar.mo3804getControlsView()).k.onNext(new nu0.f((int) ((contentPosition / (mVar.getContentPlayerView().getContentDuration() >= 0 ? r9 : 0L)) * mVar.mo3804getControlsView().getMaxProgress()), true, true));
                    }
                } else {
                    if (!Intrinsics.f(gestureEvent, l.a.f219187a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (hVar2.f) {
                        hVar2.c(true);
                    } else {
                        hVar2.d();
                        hVar2.d.postDelayed(hVar2.e, 5000L);
                    }
                }
                return Unit.f186387a;
            default:
                nu0.i iVar5 = (nu0.i) this.f289281b;
                String text = (String) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                efm.d0 d0VarFirstOrError = ((RichVideoPlayerControlsView) iVar5).f57514l.firstOrError();
                vpg.b bVar8 = new vpg.b(15, new vq0.g(3));
                d0VarFirstOrError.getClass();
                return new rfm.m(new rfm.j(d0VarFirstOrError, bVar8, 0), new vpg.b(16, new vb2.r(text, 15)), 1);
        }
    }
}
