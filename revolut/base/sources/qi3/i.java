package qi3;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.r0;
import ozc.z;
import qce.m0;
import te0.w;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        lbf.l lVar;
        int i = 12;
        int i2 = 3;
        int i3 = 2;
        int i5 = 10;
        lbf.l lVar2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.f) {
            case 0:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "p0");
                l lVar3 = (l) this.receiver;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                efm.b bVarH = mo3.a.u(o70.a.g(lVar3.f246640j.c(id10)), lVar3.f246644p, true).h(f9b.f.a(lVar3.i));
                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                Function1 function1K = lVar3.K();
                pfm.a aVar = new pfm.a(bVarH, new nw8.d(8, new m0(new BreadcrumbException(), 9)), i3);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar.w(new ly7.g(12, function1K), new z(19, j.f246637a));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(lVar3.f239031a, hVarW);
                return Unit.f186387a;
            case 1:
                NaviCommand p0 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((sri.m) this.receiver).c(p0);
                return Unit.f186387a;
            case 2:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "p0");
                ((l) this.receiver).getClass();
                throw null;
            case 3:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((l) this.receiver).Q(p03);
            case 4:
                String p010 = (String) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((com.revolut.feature.chooser.c) this.receiver).H0(p010);
            case 5:
                ol8.c p011 = (ol8.c) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a aVar2 = (com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a) this.receiver;
                if (p011 instanceof ol8.c) {
                    oki.h.D2(aVar2.f77191p);
                    return Unit.f186387a;
                }
                aVar2.getClass();
                throw new NoWhenBranchMatchedException();
            case 6:
                RoboPortfolioInfo p012 = (RoboPortfolioInfo) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return rd0.e.b(ael.t.d(((qmc.d) this.receiver).f247796a, p012.f95703c, false, null, p012.f, true, null, 38));
            case 7:
                RoboPortfolioInfo p013 = (RoboPortfolioInfo) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                qmc.d dVar = (qmc.d) this.receiver;
                return vkm.q.Q(dVar.f247797b.a(), new r0(objArr == true ? 1 : 0, dVar, p013, 11));
            case 8:
                List p014 = (List) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                qmc.d dVar2 = (qmc.d) this.receiver;
                return vkm.q.Q(dVar2.f247797b.a(), new r0(objArr2 == true ? 1 : 0, p014, dVar2, i));
            case 9:
                Throwable p015 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.payments.air.widget.impl.ui.flow.a.I2((com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.receiver, p015);
                return Boolean.TRUE;
            case 10:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar3 = (com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.receiver;
                aVar3.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p016, h0Var);
                aVar3.l2(new qo9.k(aVar3, objArr3 == true ? 1 : 0, 0), new yi5.b(26));
                return Boolean.TRUE;
            case 11:
                List p017 = (List) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                return ((qse.e) this.receiver).a(p017);
            case 12:
                List p018 = (List) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                return ((qse.e) this.receiver).a(p018);
            case 13:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((CreditCardAutopayPayments) obj2);
            case 14:
                aw7.i p019 = (aw7.i) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.b) this.receiver;
                bVar.getClass();
                if (p019 instanceof aw7.h) {
                    bVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(null, u.c(((aw7.h) p019).f10742a), null, null, false, xfa.b.INSURANCE_HOME, 189))));
                }
                return Unit.f186387a;
            case 15:
                qw1.g.J2((qw1.g) this.receiver);
                return Boolean.TRUE;
            case 16:
                t27.m p020 = (t27.m) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a aVar4 = (com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a) this.receiver;
                aVar4.getClass();
                aVar4.n2(new qu4.s(aVar4, p020, objArr4 == true ? 1 : 0, 20), new whi.b(6));
                return Unit.f186387a;
            case 17:
                Throwable p021 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                q7e.b.d((yji.l) this.receiver, p021);
                return Boolean.TRUE;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                r9a.k.I2((r9a.k) this.receiver);
                return Boolean.TRUE;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                r9a.k.I2((r9a.k) this.receiver);
                return Boolean.TRUE;
            case 20:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "p0");
                ((r9i.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                List<i9i.e> list = items;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (i9i.e eVar : list) {
                    arrayList.add(new zx0.k(new TextClause(eVar.f159883b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eVar.f159882a));
                }
                return arrayList;
            case 21:
                List items2 = (List) obj2;
                Intrinsics.checkNotNullParameter(items2, "p0");
                ((r9i.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(items2, "items");
                List<i9i.f> list2 = items2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (i9i.f fVar : list2) {
                    arrayList2.add(new zx0.l(fVar.f159884a, fVar.f159885b, fVar.f159886c));
                }
                return arrayList2;
            case 22:
                Throwable p022 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                rb9.i.I2((rb9.i) this.receiver, p022);
                return Boolean.TRUE;
            case 23:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                rb9.i.I2((rb9.i) this.receiver, p023);
                return Boolean.TRUE;
            case 24:
                bbc.f p024 = (bbc.f) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar5 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) this.receiver;
                aVar5.getClass();
                if (!(p024 instanceof bbc.d)) {
                    if (!(p024 instanceof bbc.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.C2(rbc.l.f253017a);
                }
                return Unit.f186387a;
            case 25:
                zac.j p025 = (zac.j) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar6 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) this.receiver;
                aVar6.getClass();
                if (!(p025 instanceof zac.h) && !(p025 instanceof zac.g)) {
                    if (!(p025 instanceof zac.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.H2(aVar6.u, new raf.o(p025, i2));
                }
                return Unit.f186387a;
            case 26:
                qbf.l dto = (qbf.l) obj2;
                Intrinsics.checkNotNullParameter(dto, "p0");
                ((pbf.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                if (dto.getIsEligible()) {
                    return lbf.g.f193675a;
                }
                qbf.n reason = dto.getReason();
                if (reason != null) {
                    int i6 = pbf.b.f234679a[reason.ordinal()];
                    if (i6 == 1) {
                        lVar = lbf.l.NOT_ONBOARDED_FOR_TRADING;
                    } else if (i6 == 2) {
                        lVar = lbf.l.BUY_ORDER_BLOCK_ACTIVE;
                    } else if (i6 == 3) {
                        lVar = lbf.l.ACCOUNT_IS_RESTRICTED;
                    } else {
                        if (i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lVar = lbf.l.UNKNOWN;
                    }
                    lVar2 = lVar;
                }
                return new lbf.h(lVar2);
            case 27:
                ((rbg.j) this.receiver).I2((Throwable) obj2);
                return Boolean.TRUE;
            case 28:
                kn8.d p026 = (kn8.d) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                rc8.k kVar = (rc8.k) this.receiver;
                kVar.getClass();
                kVar.V2(new r83.g(kVar, p026, objArr5 == true ? 1 : 0, i5), new yi5.b(29));
                return Unit.f186387a;
            default:
                ks2.c p027 = (ks2.c) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                ((BluePromptActivity) ((ms2.f) this.receiver)).d1(p027);
                return Unit.f186387a;
        }
    }
}
