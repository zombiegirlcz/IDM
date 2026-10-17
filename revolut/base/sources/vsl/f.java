package vsl;

import aii.r;
import ali.j;
import cg0.j0;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.network.models.openbanking.ExternalPaymentStatusDto;
import com.revolut.feature.crypto.gift.asset.impl.ui.flow.CryptoGiftAssetFlowContract$Step;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllActivity;
import com.revolut.feature.defi.accounts.impl.ui.creation.flow.DeFiAccountCreationFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.R$string;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.b0;
import jel.d0;
import jel.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import nii.y0;
import nii.z;
import vkm.j2;
import vmf.k;
import wf0.z0;
import yji.l;
import zhm.a0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 26;
        final int i2 = 3;
        boolean z = true;
        char c2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final int i3 = 0;
        switch (this.f) {
            case 0:
                ldf.b p0 = (ldf.b) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                g gVar = (g) this.receiver;
                gVar.getClass();
                if (!Intrinsics.f(p0, ldf.b.f194097a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ali.b bVar = gVar.f291853s;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                bVar.f6270b.k(j.f6279a);
                return Unit.f186387a;
            case 1:
                ty0.a p03 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ihm.f) this.receiver).onNext(p03);
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((r) obj2, "p0");
                com.revolut.feature.staking.impl.flow.stake.v2.a aVar = (com.revolut.feature.staking.impl.flow.stake.v2.a) this.receiver;
                oki.h.t2(aVar, aVar.f88137r, StakingControllerContract$Step.Stake.f88133a, true, null, false, 12);
                return Unit.f186387a;
            case 3:
                Throwable p010 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                pu7.a.o((l) this.receiver, p010);
                return Boolean.TRUE;
            case 4:
                List p011 = (List) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((CryptoCommodityDiscoverAllActivity) ((vx5.i) this.receiver)).setItems(p011);
                return Unit.f186387a;
            case 5:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                xx5.a aVar2 = ((xx5.c) ((vx5.e) this.receiver)).f309402a;
                efm.b bVarIgnoreElements = aVar2.f309399b.getValue(aVar2, xx5.a.f309398g[0]).b(bool).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements;
            case 6:
                String input = (String) obj2;
                Intrinsics.checkNotNullParameter(input, "p0");
                xx5.c cVar = (xx5.c) ((vx5.e) this.receiver);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                efm.b bVarIgnoreElements2 = cVar.f309402a.w0().b(input).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                return bVarIgnoreElements2;
            case 7:
                oq.e p012 = (oq.e) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((vy8.a) this.receiver).Z2(p012);
                return Unit.f186387a;
            case 8:
                hha.d p013 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return Boolean.valueOf(w0i.b.a((w0i.b) this.receiver, p013));
            case 9:
                hha.d p014 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return Boolean.valueOf(w0i.b.a((w0i.b) this.receiver, p014));
            case 10:
                u16.a p015 = (u16.a) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar3 = (com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) this.receiver;
                aVar3.getClass();
                if (!Intrinsics.f(p015, u16.a.f276351a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar3, aVar3.f71650r, DeFiAccountCreationFlowContract$Step.Confirmation.f71646a, true, null, false, 12);
                return Unit.f186387a;
            case 11:
                s16.a p016 = (s16.a) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar4 = (com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) this.receiver;
                aVar4.getClass();
                if (!Intrinsics.f(p016, s16.a.f259097a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.l2(new k(aVar4, objArr == true ? 1 : 0, 19), new yi5.b(i));
                return Unit.f186387a;
            case 12:
                ExternalPaymentStatusDto p017 = (ExternalPaymentStatusDto) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((p21.b) this.receiver).getClass();
                return p21.b.a(p017);
            case 13:
                ExternalPaymentStatusDto p018 = (ExternalPaymentStatusDto) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((p21.b) this.receiver).getClass();
                return p21.b.a(p018);
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.feature.retail.cfd.impl.flows.order.c cVar2 = (com.revolut.feature.retail.cfd.impl.flows.order.c) this.receiver;
                cVar2.getClass();
                l.a1(cVar2, cVar2.X1(new y0("CFD_ORDER_FLOW_ERROR", new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new w2b.e(cVar2, objArr2 == true ? 1 : 0, i3), 3);
                return Boolean.TRUE;
            case 15:
                Throwable p019 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                w75.l lVar = (w75.l) this.receiver;
                j60.a.v(lVar.f295478p, false, null, 3);
                lVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p019, h0Var);
                return Boolean.TRUE;
            case 16:
                Throwable p020 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a aVar5 = (com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a) this.receiver;
                y0 y0VarB = aVar5.f70672r.b(p020);
                if (y0VarB == null) {
                    z = false;
                } else {
                    aVar5.X().d(y0VarB);
                }
                return Boolean.valueOf(z);
            case 17:
                Throwable p021 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar6 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.receiver;
                aVar6.L.b3(p021, new uk9.h(aVar6, objArr3 == true ? 1 : 0, i));
                return Boolean.TRUE;
            case 18:
                j0 p022 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                return z0.a((z0) this.receiver, p022);
            case 19:
                j0 p023 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                return z0.a((z0) this.receiver, p023);
            case 20:
                j0 p024 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                return z0.a((z0) this.receiver, p024);
            case 21:
                j0 p025 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return z0.a((z0) this.receiver, p025);
            case 22:
                j0 p026 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                return z0.a((z0) this.receiver, p026);
            case 23:
                j0 p027 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                return z0.a((z0) this.receiver, p027);
            case 24:
                j0 p028 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                return z0.a((z0) this.receiver, p028);
            case 25:
                b0 p029 = (b0) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) this.receiver).getClass();
                d0 d0Var = p029.i;
                List list = d0Var != null ? d0Var.d : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    Iterable iterable = ((u) it8.next()).f173570b;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    a0.x(iterable, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    String str = ((jel.y0) it9.next()).f173608b;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    xi0.b.Companion.getClass();
                    if (cp5.d.C(xi0.a.a((String) obj3))) {
                        arrayList3.add(obj3);
                    }
                }
                return zhm.d0.i1(arrayList3);
            case 26:
                yg5.j p030 = (yg5.j) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.crypto.gift.asset.impl.ui.flow.a aVar7 = (com.revolut.feature.crypto.gift.asset.impl.ui.flow.a) this.receiver;
                yki.a aVar8 = aVar7.o;
                if (Intrinsics.f(p030, yg5.i.f313528a)) {
                    oki.h.t2(aVar7, aVar8, CryptoGiftAssetFlowContract$Step.NotEligibleScreen.f70865a, false, TransitionAnimation.REPLACE.f98394a, false, 8);
                } else {
                    if (!Intrinsics.f(p030, yg5.h.f313527a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar8);
                }
                return Unit.f186387a;
            case 27:
                final pj7.l p031 = (pj7.l) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar2 = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) this.receiver;
                y yVar = bVar2.f75086t;
                if (p031 instanceof pj7.i) {
                    bVar2.H2(yVar, new Function1() { // from class: wj7.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i3) {
                                case 0:
                                    i update = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return i.a(update, null, null, null, null, ((pj7.i) p031).f236684a, null, false, 479);
                                case 1:
                                    i update2 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return i.a(update2, null, ((pj7.k) p031).f236687a, null, null, null, null, false, 507);
                                case 2:
                                    i update3 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update3, "$this$update");
                                    return i.a(update3, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, null, false, 503);
                                default:
                                    i update4 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update4, "$this$update");
                                    return i.a(update4, null, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, false, 495);
                            }
                        }
                    });
                } else if (p031 instanceof pj7.k) {
                    final char c3 = c2 == true ? 1 : 0;
                    bVar2.H2(yVar, new Function1() { // from class: wj7.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (c3) {
                                case 0:
                                    i update = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return i.a(update, null, null, null, null, ((pj7.i) p031).f236684a, null, false, 479);
                                case 1:
                                    i update2 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return i.a(update2, null, ((pj7.k) p031).f236687a, null, null, null, null, false, 507);
                                case 2:
                                    i update3 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update3, "$this$update");
                                    return i.a(update3, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, null, false, 503);
                                default:
                                    i update4 = (i) obj4;
                                    Intrinsics.checkNotNullParameter(update4, "$this$update");
                                    return i.a(update4, null, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, false, 495);
                            }
                        }
                    });
                } else if (p031 instanceof pj7.j) {
                    if (((pj7.j) p031).f236685a) {
                        final int i5 = 2;
                        bVar2.H2(yVar, new Function1() { // from class: wj7.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i5) {
                                    case 0:
                                        i update = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return i.a(update, null, null, null, null, ((pj7.i) p031).f236684a, null, false, 479);
                                    case 1:
                                        i update2 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return i.a(update2, null, ((pj7.k) p031).f236687a, null, null, null, null, false, 507);
                                    case 2:
                                        i update3 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return i.a(update3, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, null, false, 503);
                                    default:
                                        i update4 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return i.a(update4, null, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, false, 495);
                                }
                            }
                        });
                    } else {
                        bVar2.H2(yVar, new Function1() { // from class: wj7.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i2) {
                                    case 0:
                                        i update = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return i.a(update, null, null, null, null, ((pj7.i) p031).f236684a, null, false, 479);
                                    case 1:
                                        i update2 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return i.a(update2, null, ((pj7.k) p031).f236687a, null, null, null, null, false, 507);
                                    case 2:
                                        i update3 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return i.a(update3, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, null, false, 503);
                                    default:
                                        i update4 = (i) obj4;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return i.a(update4, null, null, null, Long.valueOf(((pj7.j) p031).f236686b), null, null, false, 495);
                                }
                            }
                        });
                    }
                } else if (p031 instanceof pj7.g) {
                    File document = ((pj7.g) p031).f236682a;
                    Intrinsics.checkNotNullParameter(document, "document");
                    ArrayList arrayListF1 = zhm.d0.f1(((wj7.i) ((j2) yVar.f22677a).getValue()).f297981g);
                    arrayListF1.remove(document);
                    bVar2.H2(yVar, new ua2.r(10, arrayListF1));
                } else if (p031 instanceof pj7.h) {
                    bVar2.C2(a.C0499a.f75081a);
                } else if (!(p031 instanceof pj7.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 28:
                String p032 = (String) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                return ((DescriptorRendererImpl) this.receiver).a(p032);
            default:
                Throwable p033 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p033, "p0");
                ((com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.receiver).Q2(p033);
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DescriptorRendererImpl descriptorRendererImpl) {
        super(1, 0, DescriptorRendererImpl.class, descriptorRendererImpl, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;");
        this.f = 28;
    }
}
