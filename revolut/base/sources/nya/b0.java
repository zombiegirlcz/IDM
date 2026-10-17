package nya;

import android.graphics.PointF;
import au6.u1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerOrderPayment;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$DomainState;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.TermsInfo;
import com.revolut.feature.rev_points.models.TermsToReview;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow.LimitsPromptFlowContract$Limit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.f1;
import m1c.q1;
import m1c.r0;
import m1c.x0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220724b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f220723a = i;
        this.f220724b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v12, types: [nz7.c] */
    /* JADX WARN: Type inference failed for: r2v53, types: [wi0.b] */
    /* JADX WARN: Type inference failed for: r3v51, types: [z80.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow gVar;
        FreelancerOrderPayment freelancerOrderPayment;
        Object next;
        int i = this.f220723a;
        int i2 = 10;
        boolean z = true;
        z = true;
        z = true;
        int i3 = 0;
        int i5 = 2;
        ?? r102 = 0;
        Object obj3 = this.f220724b;
        switch (i) {
            case 0:
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) obj3).J2();
                return Unit.f186387a;
            case 1:
                return k.a((k) obj2, null, (i) obj3, false, false, false, 29);
            case 2:
                nyb.j jVar = (nyb.j) obj3;
                RevPointsEarningBreakdown earningRateBreakdown = (RevPointsEarningBreakdown) obj2;
                Intrinsics.checkNotNullParameter(earningRateBreakdown, "earningRateBreakdown");
                List list = earningRateBreakdown.f83974c;
                ArrayList rates = new ArrayList();
                for (Object obj4 : list) {
                    if (((RevPointsEarningRate) obj4).f83975a == f1.CREDIT_CARD) {
                        nyb.b bVar = (nyb.b) jVar.f220801b;
                        if (bVar.f()) {
                            if (yoj.b.k(((cpj.b) bVar.f220772b).g(yoj.c.CREDIT_CARD_APPLICATION, yoj.d.DISABLED))) {
                            }
                        }
                    }
                    rates.add(obj4);
                }
                boolean z3 = earningRateBreakdown.f83972a;
                RevPointsEarningRate currentRate = earningRateBreakdown.f83973b;
                Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                Intrinsics.checkNotNullParameter(rates, "rates");
                return new RevPointsEarningBreakdown(z3, currentRate, rates);
            case 3:
                x0 x0Var = (x0) obj3;
                Object[] results = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                ArrayList arrayList = new ArrayList();
                int length = results.length;
                while (i3 < length) {
                    Object obj5 = results[i3];
                    if (obj5 instanceof od0.i) {
                        arrayList.add(obj5);
                    }
                    i3++;
                }
                ArrayList<Terms> termsScopes = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    Terms terms = (Terms) ((od0.i) it8.next()).f224257a;
                    if (terms != null) {
                        termsScopes.add(terms);
                    }
                }
                Intrinsics.checkNotNullParameter(termsScopes, "termsScopes");
                ArrayList arrayList2 = new ArrayList(zhm.w.t(termsScopes, 10));
                for (Terms terms2 : termsScopes) {
                    TermsScope termsScope = terms2.f;
                    TermsScope.INSTANCE.getClass();
                    arrayList2.add(new TermsToReview(new TermsInfo.Full(terms2), Intrinsics.f(termsScope, TermsScope.X) ? new TextLocalisedClause(R$string.rev_points_terms_review_subtitle_points, null, null, 14) : new TextLocalisedClause(R$string.rev_points_terms_review_subtitle_common, null, null, 14), new TextLocalisedClause(R$string.rev_points_terms_review_disclaimer, null, null, 14)));
                }
                return new r0(x0Var, new m1c.s(arrayList2));
            case 4:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                od0.i iVar = (od0.i) rVar.f314201a;
                od0.i iVar2 = (od0.i) rVar.f314202b;
                od0.i iVar3 = (od0.i) rVar.f314203c;
                if (!((nyb.b0) obj3).b() || (!iVar.d() && !iVar2.d() && !iVar3.d())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                q1 revPointsTransactionsCachedContent = (q1) obj2;
                Intrinsics.checkNotNullParameter(revPointsTransactionsCachedContent, "revPointsTransactionsCachedContent");
                return ((nyb.m0) obj3).f220813b.a(revPointsTransactionsCachedContent.f201445a);
            case 6:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new ne0.o((nyb.n0) obj3, pagedData, 7), 2);
            case 7:
                f1 f1Var = (f1) obj3;
                List rates2 = (List) obj2;
                Intrinsics.checkNotNullParameter(rates2, "rates");
                Iterator it9 = rates2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (((RevPointsProductRate) next2).f84036b == f1Var) {
                            r102 = next2;
                        }
                    }
                }
                return (RevPointsProductRate) r102;
            case 8:
                nyl.b bVar2 = (nyl.b) obj3;
                int iIntValue = ((Integer) obj2).intValue();
                PointF pointF = bVar2.d;
                if (iIntValue != 0 && ((iIntValue <= 0 || pointF.y <= (-bVar2.e.y)) && (iIntValue >= 0 || pointF.y >= BitmapDescriptorFactory.HUE_RED))) {
                    i3 = (int) (iIntValue / bVar2.f);
                }
                return Integer.valueOf(i3);
            case 9:
                com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar = (com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    aVar.l2(new nt4.f(aVar, r102, 9), new yi5.b(26));
                }
                return Unit.f186387a;
            case 10:
                ((nz2.h) obj2).getClass();
                return new nz2.h((jz2.a) obj3);
            case 11:
                FreelancerOnboardingFlowContract$DomainState update = (FreelancerOnboardingFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return FreelancerOnboardingFlowContract$DomainState.a(update, null, null, null, null, null, (MainContainerScreenDestination.JustShow) obj3, 31);
            case 12:
                ((BaseLayoutBuilderFragment) ((nz7.c) obj3)).setItems((List) ((Pair) obj2).f186386b);
                return Unit.f186387a;
            case 13:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                ((nz9.e) obj3).f221009b.c(naviCommand);
                return Boolean.TRUE;
            case 14:
                nzj.i iVar4 = (nzj.i) obj3;
                LimitsPromptFlowContract$Limit limit = (LimitsPromptFlowContract$Limit) obj2;
                Intrinsics.checkNotNullParameter(limit, "limit");
                if (limit instanceof LimitsPromptFlowContract$Limit.Fx) {
                    mha.m.Companion.getClass();
                    return iVar4.c(mha.m.e);
                }
                if (limit instanceof LimitsPromptFlowContract$Limit.Atm) {
                    mha.m.Companion.getClass();
                    return iVar4.c(mha.m.f205456b);
                }
                if (limit instanceof LimitsPromptFlowContract$Limit.WalletDaily) {
                    return iVar4.f221077a.d();
                }
                if (limit instanceof LimitsPromptFlowContract$Limit.WalletWeekly) {
                    return iVar4.f221077a.b();
                }
                if (limit instanceof LimitsPromptFlowContract$Limit.WalletYearly) {
                    return iVar4.f221077a.a();
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                o0b.a params = (o0b.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (c1b.g) ((o0b.e) obj3).f221194b.get(params.f221190h);
            case 16:
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) obj3;
                o17.j saleInfo = (o17.j) obj2;
                Intrinsics.checkNotNullParameter(saleInfo, "saleInfo");
                FreelancerOrder order = saleInfo.f221323c;
                lr6.k[] elements = {lr6.k.CARD_READER, lr6.k.POS, lr6.k.APPLE_TAP_TO_PAY};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (zhm.d0.T(kotlin.collections.d.y0(elements), order.d)) {
                    o7.b bVar3 = aVar2.f74125s;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(order, "order");
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    List list2 = order.f73302t;
                    if (list2 != null) {
                        Iterator it10 = list2.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (((FreelancerOrderPayment) next).f73309b == lr6.p.CAPTURED) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        freelancerOrderPayment = (FreelancerOrderPayment) next;
                    } else {
                        freelancerOrderPayment = null;
                    }
                    if (freelancerOrderPayment == null) {
                        od0.i.Companion.getClass();
                        gVar = new go.g(zi0.c.P(od0.i.f224256b, false, null, 3), 2);
                    } else {
                        u1 u1Var = (u1) bVar3.f222639b;
                        String paymentId = freelancerOrderPayment.f73308a;
                        u1Var.getClass();
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        gVar = nim.a.v(u1Var.d.b(paymentId, loadingStrategy), new eif.c(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 18));
                    }
                } else {
                    gVar = new go.g(new Data(null, null, false, 7, null), 2);
                }
                return vkm.q.H(new nyd.j(aVar2, saleInfo, (Continuation) r102, z ? 1 : 0), gVar);
            case 17:
                o22.a update2 = (o22.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return o22.a.a(update2, (AliasType) obj3, null, null, null, 30);
            case 18:
                o22.n nVar = (o22.n) obj3;
                cli.y yVar = nVar.u;
                s7a.a0 data = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                s7a.c0 c0Var = data.f260599a;
                c8a.a aVar3 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                String str = aVar3 != null ? aVar3.f22154a : null;
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("APM NewContact: unexpected result when changing country: resultType=".concat(c0Var.getClass().getSimpleName()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return Unit.f186387a;
                }
                wi0.b.Companion.getClass();
                ?? A = wi0.a.a(str);
                o22.b bVar4 = (o22.b) ((o22.a) ((j2) yVar.f22677a).getValue()).f221417b.getContent();
                if (!A.equals(bVar4 != null ? bVar4.f221419a : null)) {
                    nVar.H2(yVar, new ho2.i(i5, nVar.f221430r.j(A), A));
                }
                return Unit.f186387a;
            case 19:
                o23.w update3 = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return o23.w.a(update3, null, null, null, null, null, false, null, (o23.v) obj3, null, null, false, null, 32511);
            case 20:
                return o23.w.a((o23.w) obj2, ((vh1.b) obj3).f289267a, null, null, null, null, false, null, null, null, null, false, null, 32766);
            case 21:
                o24.a configuration = (o24.a) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return (vu3.p) ((o24.e) obj3).f221484b.get(o24.e.a(configuration));
            case 22:
                return o27.l.a((o27.l) obj2, null, null, null, null, null, (nr6.a0) obj3, 255);
            case 23:
                iel.a assetEvent = (iel.a) obj2;
                Intrinsics.checkNotNullParameter(assetEvent, "assetEvent");
                return new pfm.h(new ne0.o((o28.h) obj3, assetEvent, i2), 2);
            case 24:
                String enabledFeatures = (String) obj2;
                Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
                return (w19.g) ((o29.d) obj3).f221552b.get("CACHE_KEY_ONBOARDING_INFO" + enabledFeatures.hashCode());
            case 25:
                o29.z zVar = (o29.z) obj3;
                o29.y params2 = (o29.y) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (z19.n) zVar.f221594b.get(((o29.w) zVar.d).a(params2));
            case 26:
                return ((g1i.l0) ((o2i.e) obj3).f221625h).o();
            case 27:
                com.revolut.feature.apm.core.ui.impl.ui.qr.details.a aVar4 = (com.revolut.feature.apm.core.ui.impl.ui.qr.details.a) obj3;
                q32.h result2 = (q32.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!Intrinsics.f(result2, q32.h.f241777a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.C2(g12.d.f139519a);
                return Unit.f186387a;
            case 28:
                WhoToTransferActionItem action = (WhoToTransferActionItem) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                return ((com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a) obj3).h(action);
            default:
                o3b.n0 n0Var = (o3b.n0) obj3;
                o3b.t tVar = (o3b.t) obj2;
                o3b.s sVar = ((o3b.t) ((j2) n0Var.getState().f22677a).getValue()).i;
                o3b.s sVarB = sVar != null ? o3b.s.b(sVar, null, 31) : null;
                o3b.s sVar2 = ((o3b.t) ((j2) n0Var.getState().f22677a).getValue()).f221769j;
                return o3b.t.a(tVar, null, null, null, null, sVarB, sVar2 != null ? o3b.s.b(sVar2, null, 31) : null, 7423);
        }
    }

    public /* synthetic */ b0(nyb.o oVar, x0 x0Var) {
        this.f220723a = 3;
        this.f220724b = x0Var;
    }
}
