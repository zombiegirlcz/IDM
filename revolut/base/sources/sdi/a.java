package sdi;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import cxe.u;
import d9.e1;
import efm.r;
import java.math.BigDecimal;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n38.c0;
import tfm.n4;
import tjh.h0;
import tof.a3;
import ui9.z;
import v38.c;
import vch.x0;
import vge.x;
import vha.s;
import w38.v;
import wp5.y;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f261894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f261895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f261896y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Continuation continuation, j49.i iVar, w38.e eVar) {
        super(3, continuation);
        this.u = 26;
        this.z = iVar;
        this.f261896y = eVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            w4l.k loadingStrategy = (w4l.k) this.f261895x;
            rul.e eVar = ((veh.k) this.f261896y).f288335p;
            teh.c params = (teh.c) this.z;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            neh.b bVar = (neh.b) eVar.f257629a;
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Flow flowE = boh.f.e(bVar.f.b(params, loadingStrategy), new scl.e(eVar, 12));
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            vge.g gVar = (vge.g) this.f261895x;
            Flow flowH = xam.a.h(new vge.k((x) this.f261896y, (ProductAccountDescriptor$Value) this.z, null), new go.g(gVar.f288897a, 2));
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objCollect = flowH.collect(new u97.e(flowCollector, gVar, 23), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        Flow gVar;
        ProductAccountId productAccountId = (ProductAccountId) this.z;
        vha.i iVar = (vha.i) this.f261896y;
        s sVar = iVar.f289372a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) this.f261895x;
            if (Intrinsics.f(productAccountId.f89729a, "PENDING_PRO_ACCOUNT_ID") && (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Pending)) {
                gVar = nim.a.v(rd0.e.b(sVar.a(sfe.a.FULL)), new vha.g(iVar));
            } else if (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded) {
                sfe.a dataLoadingMode = sfe.a.FULL;
                Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
                sVar.f289435n.setValue(dataLoadingMode);
                r rVarA = sVar.a(dataLoadingMode);
                u uVarE = ((d89.g) iVar.f289376h).e(z79.b.PRO);
                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                r rVarC = rd0.e.c(uVarE, gVar2);
                n4 pendingAmountObservable = sVar.o;
                Intrinsics.checkNotNullExpressionValue(pendingAmountObservable, "pendingAmountObservable");
                r rVarDistinctUntilChanged = mif.a.g(rVarA, rVarC, pendingAmountObservable, sVar.b(dataLoadingMode), rd0.e.c(new ahe.l(iVar.i.k(), 23), gVar2)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                gVar = nim.a.v(rd0.e.b(rVarDistinctUntilChanged), new vgk.f(productAccountId, iVar, 1));
            } else {
                gVar = new go.g(zi0.c.O(new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Pro product!"))), 2);
            }
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7 == r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r7)
            goto L63
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.lang.Object r1 = r6.z
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            yhm.o.b(r7)
            goto L41
        L21:
            yhm.o.b(r7)
            kotlinx.coroutines.flow.FlowCollector r1 = r6.f261894w
            java.lang.Object r7 = r6.f261895x
            kotlin.Unit r7 = (kotlin.Unit) r7
            java.lang.Object r7 = r6.f261896y
            w07.n r7 = (w07.n) r7
            gr6.r r7 = r7.o
            r6.f261894w = r4
            r6.f261895x = r4
            r6.z = r1
            r6.v = r3
            et6.y3 r7 = (et6.y3) r7
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L41
            goto L62
        L41:
            r3 = 3
            r5 = 0
            com.revolut.data.model.Data r7 = zi0.c.P(r7, r5, r4, r3)
            r6.f261894w = r4
            r6.f261895x = r4
            r6.z = r4
            r6.v = r2
            vkm.q.w(r1)
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L59
            goto L5b
        L59:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L5b:
            if (r7 != r0) goto L5e
            goto L60
        L5e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L60:
            if (r7 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sdi.a.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) {
        w2b.h hVar = (w2b.h) this.f261896y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            CfdOrderData cfdOrderData = (CfdOrderData) this.f261895x;
            p2b.l lVar = hVar.d;
            u2b.a aVar2 = hVar.f294022c;
            e2b.a aVar3 = cfdOrderData.f82170b;
            BigDecimal bigDecimal = cfdOrderData.e;
            f8l.e eVarB = u2b.c.b(aVar3);
            nel.n nVar = hVar.f294020a.f294014b;
            BigDecimal bigDecimal2 = cfdOrderData.f82171c;
            bfl.g gVar = cfdOrderData.f82169a;
            CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = cfdOrderData.d;
            BigDecimal bigDecimal3 = cfdOpenPositionsDelegate$OpenPositions.f82237a;
            BigDecimal bigDecimal4 = cfdOpenPositionsDelegate$OpenPositions.f82238b;
            Float f = ((e0) this.z).k;
            BigDecimal bigDecimal5 = f != null ? new BigDecimal(String.valueOf(f.floatValue())) : null;
            BigDecimal bigDecimal6 = e1.I(bigDecimal) ? null : bigDecimal;
            aVar2.getClass();
            Flow flowA = lVar.a(u2b.a.a(eVarB, nVar, bigDecimal2, gVar, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6));
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object s(Object obj2) {
        Flow gVar;
        w38.e eVar = (w38.e) this.f261896y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            Pair pair = (Pair) this.f261895x;
            w4l.k kVar = (w4l.k) pair.f186385a;
            v38.c cVar = (v38.c) pair.f186386b;
            NewBadgeContent.WithNumber withNumber = null;
            Object[] objArr = 0;
            if ((cVar instanceof v38.a) || Intrinsics.f(cVar, c.a.f285856a)) {
                gVar = new go.g(f0.f322471a, 2);
            } else if (cVar instanceof v38.d) {
                if (Intrinsics.f(((j49.i) this.z).f171328a, ProductId.JOINT.getId())) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_pending_widget_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_home_pending_widget_description, null, null, 14);
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    int i2 = R$drawable.uikit_icn_24_users_search;
                    int i3 = R$attr.uikit_colorAccentNeutral;
                    Color.Solid solid = new Color.Solid(i3);
                    Object[] objArr2 = objArr == true ? 1 : 0;
                    ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("PENDING_JOINT_ACCOUNT_BANNER_ITEM_ID", textLocalisedClause, textLocalisedClause2, new com.revolut.core.ui_kit.delegates.m((Image) y.h(new Color.Solid(i3), 0.1f, companion, i2, solid), withNumber, (CircleBadgeModel) objArr2, 10), null, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, c0.f211933a, null, true, 5968);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    gVar = new go.g(zhm.u.c(model), 2);
                } else {
                    gVar = new go.g(f0.f322471a, 2);
                }
            } else {
                if (!(cVar instanceof v38.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new v0b.b(eVar.f294172b.j(null, kVar), eVar, 17);
            }
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        Flow flowE;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f261894w;
            bla.c cVar = (bla.c) this.f261895x;
            w88.g gVar = (w88.g) this.f261896y;
            String str = (String) this.z;
            int i2 = w88.f.f295609a[cVar.ordinal()];
            if (i2 == 1) {
                ybl.k kVar = gVar.f295612b;
                w4l.h hVar = w4l.h.f294642c;
                flowE = boh.f.e(u0.i(ybl.k.k(kVar, hVar, null, null, 6), hj8.a.d(gVar.e, str, hVar), rd0.e.b(gVar.f.K(hVar))), new v(gVar, str, 14));
            } else {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                flowE = zi0.c.i(new w88.c(u98.a.TOO_OLD));
            }
            this.f261894w = null;
            this.f261895x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sdi.a.u(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a aVar = new a(continuation, (d) this.f261896y, (j49.i) this.z, 0);
                aVar.f261894w = flowCollector;
                aVar.f261895x = obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            case 1:
                a aVar2 = new a(continuation, (ssd.b) this.f261896y, (String) this.z, 1);
                aVar2.f261894w = flowCollector;
                aVar2.f261895x = obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
            case 2:
                a aVar3 = new a(continuation, (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.b) this.f261896y, (TransferData) this.z, 2);
                aVar3.f261894w = flowCollector;
                aVar3.f261895x = obj3;
                return aVar3.invokeSuspend(Unit.f186387a);
            case 3:
                a aVar4 = new a(continuation, (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b) this.f261896y, (String) this.z, 3);
                aVar4.f261894w = flowCollector;
                aVar4.f261895x = obj3;
                return aVar4.invokeSuspend(Unit.f186387a);
            case 4:
                a aVar5 = new a(continuation, (te8.e) this.f261896y, (w4l.k) this.z, 4);
                aVar5.f261894w = flowCollector;
                aVar5.f261895x = obj3;
                return aVar5.invokeSuspend(Unit.f186387a);
            case 5:
                a aVar6 = new a(continuation, (kbb.c) this.f261896y, (String) this.z, 5);
                aVar6.f261894w = flowCollector;
                aVar6.f261895x = obj3;
                return aVar6.invokeSuspend(Unit.f186387a);
            case 6:
                a aVar7 = new a(continuation, (rul.e) this.f261896y, (w4l.k) this.z, 6);
                aVar7.f261894w = flowCollector;
                aVar7.f261895x = obj3;
                return aVar7.invokeSuspend(Unit.f186387a);
            case 7:
                a aVar8 = new a(continuation, (h0) this.f261896y, (Flow) this.z, 7);
                aVar8.f261894w = flowCollector;
                aVar8.f261895x = obj3;
                return aVar8.invokeSuspend(Unit.f186387a);
            case 8:
                a aVar9 = new a(continuation, (h0) this.f261896y, (TradingAccount.Portfolio) this.z, 8);
                aVar9.f261894w = flowCollector;
                aVar9.f261895x = obj3;
                return aVar9.invokeSuspend(Unit.f186387a);
            case 9:
                a aVar10 = new a(continuation, (WealthAccount) this.f261896y, (h0) this.z, 9);
                aVar10.f261894w = flowCollector;
                aVar10.f261895x = obj3;
                return aVar10.invokeSuspend(Unit.f186387a);
            case 10:
                a aVar11 = new a(continuation, (tqh.i) this.f261896y, (tqh.e) this.z, 10);
                aVar11.f261894w = flowCollector;
                aVar11.f261895x = obj3;
                return aVar11.invokeSuspend(Unit.f186387a);
            case 11:
                a aVar12 = new a(continuation, (tv4.o) this.f261896y, (vl4.g) this.z, 11);
                aVar12.f261894w = flowCollector;
                aVar12.f261895x = obj3;
                return aVar12.invokeSuspend(Unit.f186387a);
            case 12:
                a aVar13 = new a(continuation, (jt0.b) this.f261896y, (a3) this.z, 12);
                aVar13.f261894w = flowCollector;
                aVar13.f261895x = obj3;
                return aVar13.invokeSuspend(Unit.f186387a);
            case 13:
                a aVar14 = new a(continuation, (u29.m) this.f261896y, (i19.f) this.z, 13);
                aVar14.f261894w = flowCollector;
                aVar14.f261895x = obj3;
                return aVar14.invokeSuspend(Unit.f186387a);
            case 14:
                a aVar15 = new a(continuation, (Flow) this.f261896y, (u29.m) this.z, 14);
                aVar15.f261894w = flowCollector;
                aVar15.f261895x = obj3;
                return aVar15.invokeSuspend(Unit.f186387a);
            case 15:
                a aVar16 = new a(continuation, (ubd.i) this.f261896y, (lcd.q) this.z, 15);
                aVar16.f261894w = flowCollector;
                aVar16.f261895x = obj3;
                return aVar16.invokeSuspend(Unit.f186387a);
            case 16:
                a aVar17 = new a(continuation, (z) this.f261896y, (ai9.h) this.z, 16);
                aVar17.f261894w = flowCollector;
                aVar17.f261895x = obj3;
                return aVar17.invokeSuspend(Unit.f186387a);
            case 17:
                a aVar18 = new a(continuation, (v4k.l) this.f261896y, 17);
                aVar18.f261894w = flowCollector;
                aVar18.f261895x = obj3;
                return aVar18.invokeSuspend(Unit.f186387a);
            case 18:
                a aVar19 = new a(continuation, (wkm.l) this.f261896y, (x0) this.z, 18);
                aVar19.f261894w = flowCollector;
                aVar19.f261895x = obj3;
                return aVar19.invokeSuspend(Unit.f186387a);
            case 19:
                a aVar20 = new a(continuation, (ved.o) this.f261896y, (AlertItem) this.z, 19);
                aVar20.f261894w = flowCollector;
                aVar20.f261895x = obj3;
                return aVar20.invokeSuspend(Unit.f186387a);
            case 20:
                a aVar21 = new a(continuation, (veh.k) this.f261896y, (teh.c) this.z, 20);
                aVar21.f261894w = flowCollector;
                aVar21.f261895x = obj3;
                return aVar21.invokeSuspend(Unit.f186387a);
            case 21:
                a aVar22 = new a(continuation, (x) this.f261896y, (ProductAccountDescriptor$Value) this.z, 21);
                aVar22.f261894w = flowCollector;
                aVar22.f261895x = obj3;
                return aVar22.invokeSuspend(Unit.f186387a);
            case 22:
                a aVar23 = new a(continuation, (Flow) this.f261896y, (ve7.i) this.z, 22);
                aVar23.f261894w = flowCollector;
                aVar23.f261895x = obj3;
                return aVar23.invokeSuspend(Unit.f186387a);
            case 23:
                a aVar24 = new a(continuation, (vha.i) this.f261896y, (ProductAccountId) this.z, 23);
                aVar24.f261894w = flowCollector;
                aVar24.f261895x = obj3;
                return aVar24.invokeSuspend(Unit.f186387a);
            case 24:
                a aVar25 = new a(continuation, (w07.n) this.f261896y, 24);
                aVar25.f261894w = flowCollector;
                aVar25.f261895x = obj3;
                return aVar25.invokeSuspend(Unit.f186387a);
            case 25:
                a aVar26 = new a(continuation, (w2b.h) this.f261896y, (e0) this.z, 25);
                aVar26.f261894w = flowCollector;
                aVar26.f261895x = obj3;
                return aVar26.invokeSuspend(Unit.f186387a);
            case 26:
                a aVar27 = new a(continuation, (j49.i) this.z, (w38.e) this.f261896y);
                aVar27.f261894w = flowCollector;
                aVar27.f261895x = obj3;
                return aVar27.invokeSuspend(Unit.f186387a);
            case 27:
                a aVar28 = new a(continuation, (w88.g) this.f261896y, (String) this.z, 27);
                aVar28.f261894w = flowCollector;
                aVar28.f261895x = obj3;
                return aVar28.invokeSuspend(Unit.f186387a);
            case 28:
                a aVar29 = new a(continuation, (ecg.b) this.f261896y, (wbg.s) this.z, 28);
                aVar29.f261894w = flowCollector;
                aVar29.f261895x = obj3;
                return aVar29.invokeSuspend(Unit.f186387a);
            default:
                a aVar30 = new a(continuation, (toh.d) this.f261896y, (String) this.z, 29);
                aVar30.f261894w = flowCollector;
                aVar30.f261895x = obj3;
                return aVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sdi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f261896y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f261896y = obj2;
        this.z = obj3;
    }
}
