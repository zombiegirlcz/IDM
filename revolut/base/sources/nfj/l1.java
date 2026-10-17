package nfj;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendCard;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntity;
import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$Button$Action;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import dej.b4;
import dej.d4;
import dej.i3;
import dej.n3;
import dej.w3;
import dej.x3;
import dej.y3;
import dej.z3;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kfj.d5;
import kfj.e5;
import kfj.f5;
import kfj.g5;
import kfj.h5;
import kfj.i5;
import kfj.l3;
import kfj.q3;
import kfj.v4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import l29.a;
import m29.b;
import mok.c;
import q90.j;
import w19.g;

/* JADX INFO: loaded from: classes11.dex */
public final class l1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f214980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f214981x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, String str, Continuation continuation) {
        super(3, continuation);
        this.u = 12;
        this.f214980w = fVar;
        this.f214981x = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.l1.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        c.d dVar;
        String str;
        String str2;
        c.a aVar;
        c.e eVar;
        String str3;
        c.e.a.C1172a c1172a;
        ArrayList arrayList;
        c.EnumC1171c enumC1171c;
        String str4;
        c.a.b.C1170a c1170a;
        c.b.a aVar2;
        c.EnumC1171c enumC1171c2;
        String str5 = (String) this.v;
        gok.f fVar = (gok.f) this.f214980w;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = (ue0.c) ((hd.r) this.f214981x).f151366c;
        String str6 = "waitlist_layout_storage_" + str5;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str7 = fVar.f145189a;
        String str8 = fVar.f145190b;
        String str9 = fVar.f145191c;
        String str10 = fVar.d;
        List<gok.c> list = fVar.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (gok.c cVar2 : list) {
            String str11 = cVar2.f145182a;
            PricingPlanWaitlistLayout$Button$Action pricingPlanWaitlistLayout$Button$Action = cVar2.f145183b;
            if (pricingPlanWaitlistLayout$Button$Action.equals(PricingPlanWaitlistLayout$Button$Action.AcceptInvite.f103666a)) {
                aVar2 = c.b.a.ACCEPT;
            } else if (pricingPlanWaitlistLayout$Button$Action instanceof PricingPlanWaitlistLayout$Button$Action.ShowBenefits) {
                aVar2 = c.b.a.OPEN_PLAN_INTRO;
            } else if (pricingPlanWaitlistLayout$Button$Action instanceof PricingPlanWaitlistLayout$Button$Action.ShowBottomSheet) {
                aVar2 = c.b.a.SHOW_BOTTOMSHEET;
            } else {
                if (!pricingPlanWaitlistLayout$Button$Action.equals(PricingPlanWaitlistLayout$Button$Action.Unknown.f103669a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = c.b.a.UNKNOWN;
            }
            int i = nok.a.f218067c[cVar2.f145184c.ordinal()];
            if (i == 1) {
                enumC1171c2 = c.EnumC1171c.PRIMARY;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC1171c2 = c.EnumC1171c.SECONDARY;
            }
            arrayList2.add(new c.b(aVar2, str11, enumC1171c2));
        }
        gok.d dVar2 = fVar.f;
        if (dVar2 != null) {
            String str12 = dVar2.f145185a;
            gok.e eVar2 = dVar2.f145186b;
            dVar = new c.d(str12, eVar2 != null ? new c.f(eVar2.f145187a, eVar2.f145188b) : null);
        } else {
            dVar = null;
        }
        PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheet = fVar.f145192g;
        if (pricingPlanWaitlistLayout$BottomSheet != null) {
            String str13 = pricingPlanWaitlistLayout$BottomSheet.f103655a;
            String str14 = pricingPlanWaitlistLayout$BottomSheet.f103656b;
            String str15 = pricingPlanWaitlistLayout$BottomSheet.f103657c;
            List list2 = pricingPlanWaitlistLayout$BottomSheet.d;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                PricingPlanWaitlistLayout$BottomSheet.Section section = (PricingPlanWaitlistLayout$BottomSheet.Section) it8.next();
                String str16 = section.f103661a;
                Iterator it9 = it8;
                String str17 = section.f103662b;
                PricingPlanWaitlistLayout$BottomSheet.Section.Action action = section.f103663c;
                String str18 = str7;
                if (action != null) {
                    str4 = str8;
                    c1170a = new c.a.b.C1170a(action.f103664a, action.f103665b);
                } else {
                    str4 = str8;
                    c1170a = null;
                }
                arrayList3.add(new c.a.b(str16, str17, c1170a));
                it8 = it9;
                str7 = str18;
                str8 = str4;
            }
            str = str7;
            str2 = str8;
            List list3 = pricingPlanWaitlistLayout$BottomSheet.e;
            if (list3.isEmpty()) {
                list3 = null;
            }
            if (list3 != null) {
                List list4 = list3;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    PricingPlanWaitlistLayout$BottomSheet.Button button = (PricingPlanWaitlistLayout$BottomSheet.Button) it10.next();
                    String str19 = button.f103658a;
                    String str20 = button.f103659b;
                    int i2 = nok.a.f218067c[button.f103660c.ordinal()];
                    Iterator it11 = it10;
                    if (i2 == 1) {
                        enumC1171c = c.EnumC1171c.PRIMARY;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        enumC1171c = c.EnumC1171c.SECONDARY;
                    }
                    arrayList4.add(new c.a.C1169a(str19, str20, enumC1171c));
                    it10 = it11;
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            aVar = new c.a(str13, str14, str15, arrayList3, arrayList);
        } else {
            str = str7;
            str2 = str8;
            aVar = null;
        }
        PricingPlanWaitlistLayout$ProductIntro pricingPlanWaitlistLayout$ProductIntro = fVar.f145193h;
        if (pricingPlanWaitlistLayout$ProductIntro != null) {
            String str21 = pricingPlanWaitlistLayout$ProductIntro.f103670a;
            ArrayList arrayList5 = pricingPlanWaitlistLayout$ProductIntro.f103671b;
            ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
            Iterator it12 = arrayList5.iterator();
            while (it12.hasNext()) {
                PricingPlanWaitlistLayout$ProductIntro.Step step = (PricingPlanWaitlistLayout$ProductIntro.Step) it12.next();
                String str22 = step.f103674a;
                String str23 = step.f103675b;
                String str24 = step.f103676c;
                String str25 = step.d;
                String str26 = step.e;
                PricingPlanWaitlistLayout$ProductIntro.Badge badge = step.f;
                Iterator it13 = it12;
                if (badge != null) {
                    str3 = str22;
                    c1172a = new c.e.a.C1172a(badge.f103672a, badge.f103673b);
                } else {
                    str3 = str22;
                    c1172a = null;
                }
                arrayList6.add(new c.e.a(str3, str23, str24, str25, str26, c1172a));
                it12 = it13;
            }
            eVar = new c.e(str21, arrayList6);
        } else {
            eVar = null;
        }
        cVar.G(new mok.c(str, str2, str9, str10, arrayList2, dVar, aVar, eVar), str6, wim.z.d(kotlin.jvm.internal.o0.b(mok.c.class)));
        return Unit.f186387a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 q5f.j, still in use, count: 2, list:
          (r11v0 q5f.j) from 0x008c: MOVE (r19v0 q5f.j) = (r11v0 q5f.j)
          (r11v0 q5f.j) from 0x0072: MOVE (r19v2 q5f.j) = (r11v0 q5f.j)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object n(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.l1.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        p5f.f params = (p5f.f) this.v;
        List domains = (List) this.f214980w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p5f.e eVar = (p5f.e) this.f214981x;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domains, "investorUpdates");
        ue0.c cVar = eVar.f233119b;
        String strC = ebm.a.C(params);
        Intrinsics.checkNotNullParameter(domains, "domains");
        List<InvestorUpdate> list = domains;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (InvestorUpdate investorUpdate : list) {
            String str = investorUpdate.f91237a;
            String string = investorUpdate.f91238b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new q5f.g(str, string));
        }
        cVar.G(arrayList, strC, kii.e.o(q5f.g.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        pfk.b bVar = (pfk.b) this.v;
        kha.d dVar = (kha.d) this.f214980w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xe0.e eVar = ((pfk.e) this.f214981x).f235629c;
        String strA = pfk.e.a(bVar);
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        eVar.G(new kfk.b(dVar.f184083a), strA, wim.z.d(kotlin.jvm.internal.o0.b(kfk.b.class)));
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        pfk.i iVar = (pfk.i) this.v;
        lha.g gVar = (lha.g) this.f214980w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((pfk.s) this.f214981x).f235687c.G(nfk.c.i(gVar), pfk.s.b(iVar.f235642b), wim.z.d(kotlin.jvm.internal.o0.b(lfk.a.class)));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                l1 l1Var = new l1((m1) this.f214981x, (Continuation) obj4, 0);
                l1Var.v = (e1) obj2;
                l1Var.f214980w = (EsimConnectivityTroubleshootingInfo) obj3;
                return l1Var.invokeSuspend(Unit.f186387a);
            case 1:
                l1 l1Var2 = new l1((s2) this.f214981x, (Continuation) obj4, 1);
                l1Var2.v = (String) obj2;
                l1Var2.f214980w = (dej.t1) obj3;
                return l1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                l1 l1Var3 = new l1((w2) this.f214981x, (Continuation) obj4, 2);
                l1Var3.v = (d4) obj2;
                l1Var3.f214980w = (w3) obj3;
                return l1Var3.invokeSuspend(Unit.f186387a);
            case 3:
                l1 l1Var4 = new l1((nhc.i) this.f214981x, (Continuation) obj4, 3);
                l1Var4.v = (nhc.e) obj2;
                l1Var4.f214980w = (RentAndBillsConfigurations) obj3;
                return l1Var4.invokeSuspend(Unit.f186387a);
            case 4:
                String str = ((gyd.d) obj2).f147844a;
                l1 l1Var5 = new l1((nyd.k) this.f214981x, (Continuation) obj4, 4);
                l1Var5.v = str;
                l1Var5.f214980w = (wxd.s) obj3;
                return l1Var5.invokeSuspend(Unit.f186387a);
            case 5:
                l1 l1Var6 = new l1((nyd.k) this.f214981x, (Continuation) obj4, 5);
                l1Var6.v = (nyd.f) obj2;
                l1Var6.f214980w = (wxd.t) obj3;
                return l1Var6.invokeSuspend(Unit.f186387a);
            case 6:
                l1 l1Var7 = new l1((o0b.e) this.f214981x, (Continuation) obj4, 6);
                l1Var7.v = (o0b.a) obj2;
                l1Var7.f214980w = (c1b.g) obj3;
                return l1Var7.invokeSuspend(Unit.f186387a);
            case 7:
                l1 l1Var8 = new l1((o24.e) this.f214981x, (Continuation) obj4, 7);
                l1Var8.v = (o24.a) obj2;
                l1Var8.f214980w = (vu3.p) obj3;
                return l1Var8.invokeSuspend(Unit.f186387a);
            case 8:
                l1 l1Var9 = new l1((o29.d) this.f214981x, (Continuation) obj4, 8);
                l1Var9.v = (String) obj2;
                l1Var9.f214980w = (w19.g) obj3;
                return l1Var9.invokeSuspend(Unit.f186387a);
            case 9:
                l1 l1Var10 = new l1((o29.m) this.f214981x, (Continuation) obj4, 9);
                l1Var10.v = (o29.i) obj2;
                l1Var10.f214980w = (y19.d) obj3;
                return l1Var10.invokeSuspend(Unit.f186387a);
            case 10:
                l1 l1Var11 = new l1((o29.m) this.f214981x, (Continuation) obj4, 10);
                l1Var11.v = (o29.j) obj2;
                l1Var11.f214980w = (y19.e) obj3;
                return l1Var11.invokeSuspend(Unit.f186387a);
            case 11:
                l1 l1Var12 = new l1((o29.z) this.f214981x, (Continuation) obj4, 11);
                l1Var12.v = (o29.y) obj2;
                l1Var12.f214980w = (z19.n) obj3;
                return l1Var12.invokeSuspend(Unit.f186387a);
            case 12:
                l1 l1Var13 = new l1((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f214980w, (String) this.f214981x, (Continuation) obj4);
                l1Var13.v = (Throwable) obj3;
                return l1Var13.invokeSuspend(Unit.f186387a);
            case 13:
                l1 l1Var14 = new l1((oc0.f) this.f214981x, (Continuation) obj4, 13);
                l1Var14.v = (oc0.a) obj2;
                l1Var14.f214980w = (BackendCard) obj3;
                return l1Var14.invokeSuspend(Unit.f186387a);
            case 14:
                l1 l1Var15 = new l1((oc0.f) this.f214981x, (Continuation) obj4, 14);
                l1Var15.v = (oc0.b) obj2;
                l1Var15.f214980w = (List) obj3;
                return l1Var15.invokeSuspend(Unit.f186387a);
            case 15:
                l1 l1Var16 = new l1((oc0.i) this.f214981x, (Continuation) obj4, 15);
                l1Var16.v = (oc0.h) obj2;
                l1Var16.f214980w = (BackendFlowEntitiesPage) obj3;
                return l1Var16.invokeSuspend(Unit.f186387a);
            case 16:
                l1 l1Var17 = new l1((oc0.k) this.f214981x, (Continuation) obj4, 16);
                l1Var17.v = (oc0.j) obj2;
                l1Var17.f214980w = (BackendEntitiesSummaryItem) obj3;
                return l1Var17.invokeSuspend(Unit.f186387a);
            case 17:
                l1 l1Var18 = new l1((oc0.m) this.f214981x, (Continuation) obj4, 17);
                l1Var18.v = (String) obj2;
                l1Var18.f214980w = (q90.u) obj3;
                return l1Var18.invokeSuspend(Unit.f186387a);
            case 18:
                l1 l1Var19 = new l1((oh5.b) this.f214981x, (Continuation) obj4, 18);
                l1Var19.v = (Data) obj2;
                l1Var19.f214980w = (Data) obj3;
                return l1Var19.invokeSuspend(Unit.f186387a);
            case 19:
                l1 l1Var20 = new l1((hd.r) this.f214981x, (Continuation) obj4, 19);
                l1Var20.v = (ook.c) obj2;
                l1Var20.f214980w = (List) obj3;
                return l1Var20.invokeSuspend(Unit.f186387a);
            case 20:
                l1 l1Var21 = new l1((hd.r) this.f214981x, (Continuation) obj4, 20);
                l1Var21.v = (String) obj2;
                l1Var21.f214980w = (gok.f) obj3;
                return l1Var21.invokeSuspend(Unit.f186387a);
            case 21:
                l1 l1Var22 = new l1((or7.c) this.f214981x, (Continuation) obj4, 21);
                l1Var22.v = (String) obj2;
                l1Var22.f214980w = (List) obj3;
                return l1Var22.invokeSuspend(Unit.f186387a);
            case 22:
                l1 l1Var23 = new l1((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f214981x, (Continuation) obj4, 22);
                l1Var23.v = (Data) obj2;
                l1Var23.f214980w = (String) obj3;
                return l1Var23.invokeSuspend(Unit.f186387a);
            case 23:
                l1 l1Var24 = new l1((p24.v) this.f214981x, (Continuation) obj4, 23);
                l1Var24.v = (p24.w) obj2;
                l1Var24.f214980w = (au3.l) obj3;
                return l1Var24.invokeSuspend(Unit.f186387a);
            case 24:
                l1 l1Var25 = new l1((p24.v) this.f214981x, (Continuation) obj4, 24);
                l1Var25.v = (p24.x) obj2;
                l1Var25.f214980w = (au3.m) obj3;
                return l1Var25.invokeSuspend(Unit.f186387a);
            case 25:
                l1 l1Var26 = new l1((p5f.b) this.f214981x, (Continuation) obj4, 25);
                l1Var26.v = (String) obj2;
                l1Var26.f214980w = (z5f.h) obj3;
                return l1Var26.invokeSuspend(Unit.f186387a);
            case 26:
                l1 l1Var27 = new l1((p5f.e) this.f214981x, (Continuation) obj4, 26);
                l1Var27.v = (p5f.f) obj2;
                l1Var27.f214980w = (List) obj3;
                return l1Var27.invokeSuspend(Unit.f186387a);
            case 27:
                l1 l1Var28 = new l1((pfk.e) this.f214981x, (Continuation) obj4, 27);
                l1Var28.v = (pfk.b) obj2;
                l1Var28.f214980w = (kha.d) obj3;
                return l1Var28.invokeSuspend(Unit.f186387a);
            case 28:
                l1 l1Var29 = new l1((pfk.s) this.f214981x, (Continuation) obj4, 28);
                l1Var29.v = (pfk.i) obj2;
                l1Var29.f214980w = (lha.g) obj3;
                return l1Var29.invokeSuspend(Unit.f186387a);
            default:
                l1 l1Var30 = new l1((pfk.s) this.f214981x, (Continuation) obj4, 29);
                l1Var30.v = (pfk.k) obj2;
                l1Var30.f214980w = (lha.p) obj3;
                return l1Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v119, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterator it8;
        iyd.p0 p0Var;
        h24.q qVar;
        ArrayList arrayList;
        h24.o oVar;
        String str;
        ve0.c cVar;
        ArrayList arrayList2;
        String str2;
        h24.q qVar2;
        ArrayList arrayList3;
        h24.o oVar2;
        h24.f fVar;
        h24.i iVar;
        ve0.c cVar2;
        h24.j jVar;
        l29.a aVar;
        Iterator it9;
        String str3;
        n29.s oVar3;
        n29.v vVar;
        n29.h hVar = null;
        int i = 10;
        switch (this.u) {
            case 0:
                e1 e1Var = (e1) this.v;
                EsimConnectivityTroubleshootingInfo esimConnectivityTroubleshootingInfo = (EsimConnectivityTroubleshootingInfo) this.f214980w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = ((m1) this.f214981x).f214989c;
                String str4 = e1Var.f214938a;
                if (str4 == null) {
                    str4 = "";
                }
                String strConcat = "TROUBLESHOOTING_KEY_".concat(str4);
                Intrinsics.checkNotNullParameter(esimConnectivityTroubleshootingInfo, "<this>");
                String str5 = esimConnectivityTroubleshootingInfo.f100199a;
                Instant instant = esimConnectivityTroubleshootingInfo.f100200b;
                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                boolean z = esimConnectivityTroubleshootingInfo.e;
                Instant instant2 = esimConnectivityTroubleshootingInfo.d;
                Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
                boolean z3 = esimConnectivityTroubleshootingInfo.f;
                Instant instant3 = esimConnectivityTroubleshootingInfo.f100201c;
                cVar3.G(new kfj.l(str5, lValueOf, instant3 != null ? Long.valueOf(instant3.toEpochMilli()) : null, z, z3, lValueOf2), strConcat, wim.z.d(kotlin.jvm.internal.o0.b(kfj.l.class)));
                return Unit.f186387a;
            case 1:
                String str6 = (String) this.v;
                dej.t1 t1Var = (dej.t1) this.f214980w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s2) this.f214981x).f215040c.G(ofj.p.m(t1Var), j6.a.q("SUBSCRIPTION_KEY", str6), wim.z.d(kotlin.jvm.internal.o0.b(q3.class)));
                return Unit.f186387a;
            case 2:
                d4 d4Var = (d4) this.v;
                w3 w3Var = (w3) this.f214980w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar4 = ((w2) this.f214981x).f215065c;
                if (v2.f215062a[d4Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(w3Var, "<this>");
                ArrayList arrayList4 = w3Var.f113684a;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    y3 y3Var = (y3) it10.next();
                    Intrinsics.checkNotNullParameter(y3Var, "<this>");
                    z3 z3Var = y3Var.f113695a;
                    Intrinsics.checkNotNullParameter(z3Var, "<this>");
                    String str7 = z3Var.f113700a;
                    String strName = z3Var.f113701b.name();
                    h5 h5VarF = n14.k.F(z3Var.f113702c);
                    b4 b4Var = z3Var.d;
                    Intrinsics.checkNotNullParameter(b4Var, "<this>");
                    Iterator it11 = it10;
                    i5 i5Var = new i5(b4Var.f113500a, b4Var.f113501b.name(), b4Var.f113502c);
                    n3 n3Var = z3Var.e;
                    v4 v4VarP = n3Var != null ? ofj.p.p(n3Var) : null;
                    ArrayList arrayList6 = z3Var.f;
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                    Iterator it12 = arrayList6.iterator();
                    while (it12.hasNext()) {
                        arrayList7.add(ofj.p.o((i3) it12.next()));
                    }
                    g5 g5Var = new g5(str7, strName, h5VarF, i5Var, v4VarP, arrayList7);
                    dej.c2 c2Var = y3Var.f113696b;
                    Object obj3 = ofj.p.f224901a;
                    Intrinsics.checkNotNullParameter(c2Var, "<this>");
                    arrayList5.add(new f5(g5Var, new l3(c2Var.f113510b, c2Var.f113509a)));
                    it10 = it11;
                }
                ArrayList<x3> arrayList8 = w3Var.f113685b;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                for (x3 x3Var : arrayList8) {
                    Intrinsics.checkNotNullParameter(x3Var, "<this>");
                    arrayList9.add(new e5(n14.k.F(x3Var.f113692a), x3Var.f113693b));
                }
                cVar4.G(new d5(arrayList5, arrayList9), "ESIM_WIDGETS_CONFIG_KEY_type=HOME_SCREEN", wim.z.d(kotlin.jvm.internal.o0.b(d5.class)));
                return Unit.f186387a;
            case 3:
                nhc.e eVar = (nhc.e) this.v;
                RentAndBillsConfigurations rentAndBillsConfigurations = (RentAndBillsConfigurations) this.f214980w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar5 = ((nhc.i) this.f214981x).f215413b;
                String strA = eVar.a();
                Intrinsics.checkNotNullParameter(rentAndBillsConfigurations, "<this>");
                RentAndBillsConfigurations.Configuration configuration = rentAndBillsConfigurations.f84777a;
                chc.m mVarB = configuration != null ? dhc.a.b(configuration) : null;
                RentAndBillsConfigurations.Configuration configuration2 = rentAndBillsConfigurations.f84778b;
                cVar5.G(new chc.n(mVarB, configuration2 != null ? dhc.a.b(configuration2) : null), strA, wim.z.d(kotlin.jvm.internal.o0.b(chc.n.class)));
                return Unit.f186387a;
            case 4:
                String str8 = (String) this.v;
                wxd.s sVar = (wxd.s) this.f214980w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nyd.k kVar = (nyd.k) this.f214981x;
                ue0.c cVar6 = kVar.f220861c;
                String strB = nyd.k.b(kVar, str8);
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                String str9 = sVar.f300883a;
                ArrayList<wxd.r> arrayList10 = sVar.f300884b;
                ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
                for (wxd.r rVar : arrayList10) {
                    arrayList11.add(new iyd.g0(rVar.f300880a, rVar.f300881b, rVar.f300882c));
                }
                cVar6.G(new iyd.j0(str9, arrayList11), strB, wim.z.d(kotlin.jvm.internal.o0.b(iyd.j0.class)));
                return Unit.f186387a;
            case 5:
                nyd.f fVar2 = (nyd.f) this.v;
                wxd.t tVar = (wxd.t) this.f214980w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar7 = ((nyd.k) this.f214981x).f220861c;
                String strE = nyd.k.e(fVar2);
                Intrinsics.checkNotNullParameter(tVar, "<this>");
                String str10 = tVar.f300885a;
                String str11 = tVar.f300886b;
                ArrayList arrayList12 = tVar.f300887c;
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                Iterator it13 = arrayList12.iterator();
                while (it13.hasNext()) {
                    wxd.u uVar = (wxd.u) it13.next();
                    wxd.x xVar = uVar.f300890c;
                    String str12 = uVar.f300889b;
                    String str13 = uVar.f300888a;
                    wxd.h hVar2 = uVar.d;
                    if (xVar instanceof wxd.w) {
                        ArrayList arrayList14 = ((wxd.w) xVar).f300892a;
                        ArrayList arrayList15 = new ArrayList(zhm.w.t(arrayList14, 10));
                        Iterator it14 = arrayList14.iterator();
                        while (it14.hasNext()) {
                            wxd.q qVar3 = (wxd.q) it14.next();
                            String str14 = qVar3.f300877a;
                            String str15 = qVar3.f300878b;
                            ArrayList arrayList16 = qVar3.f300879c;
                            Iterator it15 = it13;
                            wxd.h hVar3 = hVar2;
                            Iterator it16 = it14;
                            ArrayList arrayList17 = new ArrayList(zhm.w.t(arrayList16, 10));
                            Iterator it17 = arrayList16.iterator();
                            while (it17.hasNext()) {
                                wxd.l lVar = (wxd.l) it17.next();
                                String str16 = lVar.f300870a;
                                Iterator it18 = it17;
                                String str17 = lVar.f300871b;
                                String str18 = lVar.f300872c;
                                String str19 = lVar.d;
                                arrayList17.add(new iyd.x(str16, str17, str18, str19 == null ? null : str19, mra.d.g0(lVar.e)));
                                it17 = it18;
                            }
                            wxd.i iVar2 = qVar3.d;
                            arrayList15.add(new iyd.a0(str14, str15, arrayList17, iVar2 != null ? new iyd.l(iVar2.f300863a, mra.d.g0(iVar2.f300864b)) : null));
                            it13 = it15;
                            hVar2 = hVar3;
                            it14 = it16;
                        }
                        it8 = it13;
                        wxd.h hVar4 = hVar2;
                        p0Var = new iyd.p0(str13, str12, arrayList15, (iyd.f) null, hVar4 != null ? mra.d.h0(hVar4) : null, 8);
                    } else {
                        it8 = it13;
                        if (!(xVar instanceof wxd.v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wxd.f fVar3 = ((wxd.v) xVar).f300891a;
                        wxd.g gVar = fVar3.f300858a;
                        String strName2 = gVar.f300860a.name();
                        TaxPeriod taxPeriod = gVar.f300861b;
                        iyd.i iVar3 = new iyd.i(strName2, new iyd.d0(taxPeriod.getFrom(), taxPeriod.getTo()));
                        Set set = fVar3.f300859b;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it19 = set.iterator();
                        while (it19.hasNext()) {
                            linkedHashSet.add(((wxd.z) it19.next()).b());
                        }
                        p0Var = new iyd.p0(str13, str12, (ArrayList) null, new iyd.f(iVar3, linkedHashSet), hVar2 != null ? mra.d.h0(hVar2) : null, 4);
                    }
                    arrayList13.add(p0Var);
                    it13 = it8;
                }
                cVar7.G(new iyd.m0(str10, str11, arrayList13), strE, wim.z.d(kotlin.jvm.internal.o0.b(iyd.m0.class)));
                return Unit.f186387a;
            case 6:
                o0b.a aVar8 = (o0b.a) this.v;
                c1b.g gVar2 = (c1b.g) this.f214980w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o0b.e) this.f214981x).f221195c.G(gVar2, aVar8.f221190h, wim.z.d(kotlin.jvm.internal.o0.b(c1b.g.class)));
                return Unit.f186387a;
            case 7:
                o24.a aVar10 = (o24.a) this.v;
                vu3.p pVar = (vu3.p) this.f214980w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar8 = ((o24.e) this.f214981x).f221485c;
                String strA2 = o24.e.a(aVar10);
                Intrinsics.checkNotNullParameter(pVar, "<this>");
                String str20 = pVar.f292236b;
                ArrayList<vu3.t> arrayList18 = pVar.f292235a;
                ArrayList arrayList19 = new ArrayList(zhm.w.t(arrayList18, 10));
                for (vu3.t tVar2 : arrayList18) {
                    Intrinsics.checkNotNullParameter(tVar2, "<this>");
                    arrayList19.add(new h24.r(tVar2.f292245a, tVar2.f292246b, tVar2.f292247c));
                }
                vu3.s sVar2 = pVar.f292237c;
                if (sVar2 != null) {
                    Intrinsics.checkNotNullParameter(sVar2, "<this>");
                    String str21 = sVar2.f292244c;
                    String str22 = sVar2.f292242a;
                    String str23 = sVar2.f292243b;
                    ArrayList<vu3.o> arrayList20 = sVar2.d;
                    ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                    for (vu3.o oVar4 : arrayList20) {
                        Intrinsics.checkNotNullParameter(oVar4, "<this>");
                        arrayList21.add(new h24.m(oVar4.f292232a, oVar4.f292233b, oVar4.f292234c));
                    }
                    qVar = new h24.q(str22, str23, str21, arrayList21);
                } else {
                    qVar = null;
                }
                List list = pVar.d;
                if (list != null) {
                    List<vu3.a> list2 = list;
                    ArrayList arrayList22 = new ArrayList(zhm.w.t(list2, 10));
                    for (vu3.a aVar12 : list2) {
                        Intrinsics.checkNotNullParameter(aVar12, "<this>");
                        arrayList22.add(new h24.a(aVar12.f292201a, aVar12.f292202b));
                    }
                    arrayList = arrayList22;
                } else {
                    arrayList = null;
                }
                vu3.q qVar4 = pVar.e;
                if (qVar4 != null) {
                    Intrinsics.checkNotNullParameter(qVar4, "<this>");
                    String str24 = qVar4.f292238a;
                    ArrayList<vu3.r> arrayList23 = qVar4.f292239b;
                    ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                    for (vu3.r rVar2 : arrayList23) {
                        Intrinsics.checkNotNullParameter(rVar2, "<this>");
                        dx4.a1 a1Var = rVar2.f292240a;
                        arrayList24.add(new h24.p(a1Var != null ? a1Var.name() : null, rVar2.f292241b));
                    }
                    oVar = new h24.o(str24, arrayList24);
                } else {
                    oVar = null;
                }
                vu3.g gVar3 = pVar.f;
                if (gVar3 != null) {
                    Intrinsics.checkNotNullParameter(gVar3, "<this>");
                    String str25 = gVar3.f292216a;
                    String str26 = gVar3.f292217b;
                    ArrayList arrayList25 = gVar3.f292218c;
                    ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                    Iterator it20 = arrayList25.iterator();
                    while (it20.hasNext()) {
                        vu3.h hVar5 = (vu3.h) it20.next();
                        Intrinsics.checkNotNullParameter(hVar5, "<this>");
                        String str27 = hVar5.f292219a;
                        Iterator it21 = it20;
                        String str28 = hVar5.f292220b;
                        vu3.b bVar = hVar5.f292221c;
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        ArrayList arrayList27 = arrayList19;
                        String str29 = bVar.f292203a;
                        vu3.l lVar2 = bVar.f292204b;
                        Intrinsics.checkNotNullParameter(lVar2, "<this>");
                        String str30 = str20;
                        String strName3 = lVar2.f292229a.name();
                        h24.q qVar5 = qVar;
                        String str31 = lVar2.f292230b;
                        ArrayList arrayList28 = lVar2.f292231c;
                        ArrayList arrayList29 = arrayList;
                        h24.o oVar5 = oVar;
                        ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList28, 10));
                        Iterator it22 = arrayList28.iterator();
                        while (it22.hasNext()) {
                            vu3.f fVar4 = (vu3.f) it22.next();
                            Intrinsics.checkNotNullParameter(fVar4, "<this>");
                            Iterator it23 = it22;
                            String str32 = fVar4.f292213a;
                            String str33 = strA2;
                            String str34 = fVar4.f292214b;
                            vu3.j jVar2 = fVar4.f292215c;
                            if (jVar2 != null) {
                                Intrinsics.checkNotNullParameter(jVar2, "<this>");
                                cVar2 = cVar8;
                                jVar = new h24.j(jVar2.f292225a);
                            } else {
                                cVar2 = cVar8;
                                jVar = null;
                            }
                            arrayList30.add(new h24.e(str32, str34, jVar));
                            it22 = it23;
                            strA2 = str33;
                            cVar8 = cVar2;
                        }
                        String str35 = strA2;
                        ve0.c cVar9 = cVar8;
                        h24.l lVar3 = new h24.l(strName3, str31, arrayList30);
                        String str36 = bVar.f292205c;
                        String str37 = bVar.d;
                        vu3.e eVar2 = bVar.e;
                        h24.d dVarC = eVar2 != null ? oc.c.C(eVar2) : null;
                        List<vu3.k> list3 = bVar.f;
                        ArrayList arrayList31 = new ArrayList(zhm.w.t(list3, 10));
                        for (vu3.k kVar2 : list3) {
                            Intrinsics.checkNotNullParameter(kVar2, "<this>");
                            String str38 = kVar2.f292226a;
                            h24.l lVar4 = lVar3;
                            String str39 = kVar2.f292227b;
                            vu3.j jVar3 = kVar2.f292228c;
                            Intrinsics.checkNotNullParameter(jVar3, "<this>");
                            arrayList31.add(new h24.k(str38, str39, new h24.j(jVar3.f292225a)));
                            lVar3 = lVar4;
                            str36 = str36;
                        }
                        h24.l lVar5 = lVar3;
                        String str40 = str36;
                        vu3.i iVar4 = bVar.f292206g;
                        if (iVar4 != null) {
                            Intrinsics.checkNotNullParameter(iVar4, "<this>");
                            iVar = new h24.i(iVar4.f292222a, iVar4.f292223b, oc.c.C(iVar4.f292224c));
                        } else {
                            iVar = null;
                        }
                        arrayList26.add(new h24.g(str27, str28, new h24.h(str29, lVar5, str40, str37, dVarC, arrayList31, iVar)));
                        it20 = it21;
                        arrayList19 = arrayList27;
                        str20 = str30;
                        qVar = qVar5;
                        arrayList = arrayList29;
                        oVar = oVar5;
                        strA2 = str35;
                        cVar8 = cVar9;
                    }
                    str = strA2;
                    cVar = cVar8;
                    arrayList2 = arrayList19;
                    str2 = str20;
                    qVar2 = qVar;
                    arrayList3 = arrayList;
                    oVar2 = oVar;
                    fVar = new h24.f(str25, str26, arrayList26);
                } else {
                    str = strA2;
                    cVar = cVar8;
                    arrayList2 = arrayList19;
                    str2 = str20;
                    qVar2 = qVar;
                    arrayList3 = arrayList;
                    oVar2 = oVar;
                    fVar = null;
                }
                cVar.G(new h24.n(arrayList2, str2, qVar2, arrayList3, oVar2, fVar), str, wim.z.d(kotlin.jvm.internal.o0.b(h24.n.class)));
                return Unit.f186387a;
            case 8:
                String str41 = (String) this.v;
                w19.g gVar4 = (w19.g) this.f214980w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar10 = ((o29.d) this.f214981x).f221553c;
                String str42 = "STORAGE_KEY_ONBOARDING_INFO" + str41.hashCode();
                Intrinsics.checkNotNullParameter(gVar4, "<this>");
                if (gVar4 instanceof g.b) {
                    aVar = new l29.a(null);
                } else {
                    if (!(gVar4 instanceof w19.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w19.f fVar5 = ((w19.h) gVar4).f293811b;
                    String str43 = fVar5.f293806a;
                    String str44 = fVar5.f293807b;
                    List<w19.e> list4 = fVar5.f293808c;
                    ArrayList arrayList32 = new ArrayList(zhm.w.t(list4, 10));
                    for (w19.e eVar3 : list4) {
                        arrayList32.add(new a.C1088a.C1089a(eVar3.f293803a, eVar3.f293804b, qvb.b.c(eVar3.f293805c), eVar3.d));
                    }
                    String str45 = fVar5.d;
                    RevPointsTextWithLinks revPointsTextWithLinks = fVar5.e;
                    aVar = new l29.a(new a.C1088a(str43, str44, arrayList32, str45, revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null));
                }
                cVar10.G(aVar, str42, wim.z.d(kotlin.jvm.internal.o0.b(l29.a.class)));
                return Unit.f186387a;
            case 9:
                o29.i iVar5 = (o29.i) this.v;
                y19.d dVar = (y19.d) this.f214980w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar11 = ((o29.m) this.f214981x).f221569c;
                Intrinsics.checkNotNullParameter(iVar5, "<this>");
                String str46 = "SAVINGS_BOTTOM_SHEET_STORAGE_KEY_" + iVar5.f221558a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                String str47 = dVar.f310335a;
                String str48 = dVar.f310336b;
                m1c.p1 p1VarC = qvb.b.c(dVar.f310337c);
                y19.c cVar12 = dVar.d;
                b.C1146b c1146b = cVar12 != null ? new b.C1146b(cVar12.f310333a, cVar12.f310334b) : null;
                ArrayList<y19.b> arrayList33 = dVar.e;
                ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                for (y19.b bVar2 : arrayList33) {
                    arrayList34.add(new b.a(bVar2.f310331a, bVar2.f310332b));
                }
                cVar11.G(new m29.b(str47, str48, p1VarC, c1146b, arrayList34), str46, wim.z.d(kotlin.jvm.internal.o0.b(m29.b.class)));
                return Unit.f186387a;
            case 10:
                o29.j jVar4 = (o29.j) this.v;
                y19.e eVar4 = (y19.e) this.f214980w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar13 = ((o29.m) this.f214981x).f221569c;
                Intrinsics.checkNotNullParameter(jVar4, "<this>");
                String str49 = "SAVINGS_DETAILS_STORAGE_KEY_" + jVar4.f221560a.name();
                Intrinsics.checkNotNullParameter(eVar4, "<this>");
                jo3.b bVarA = hx7.a.A(eVar4.f310338a);
                String strName4 = eVar4.f310339b.name();
                ArrayList arrayList35 = eVar4.f310340c;
                ArrayList arrayList36 = new ArrayList(zhm.w.t(arrayList35, 10));
                Iterator it24 = arrayList35.iterator();
                while (it24.hasNext()) {
                    arrayList36.add(d29.a.d((y19.a) it24.next()));
                }
                ArrayList arrayList37 = eVar4.d;
                ArrayList arrayList38 = new ArrayList(zhm.w.t(arrayList37, 10));
                Iterator it25 = arrayList37.iterator();
                while (it25.hasNext()) {
                    arrayList38.add(d29.a.d((y19.a) it25.next()));
                }
                cVar13.G(new m29.c(strName4, bVarA, arrayList36, arrayList38), str49, wim.z.d(kotlin.jvm.internal.o0.b(m29.c.class)));
                return Unit.f186387a;
            case 11:
                o29.y yVar = (o29.y) this.v;
                z19.n nVar = (z19.n) this.f214980w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String strA3 = ((o29.w) ((o29.z) this.f214981x).d).a(yVar);
                ue0.c cVar14 = ((o29.z) this.f214981x).f221595c;
                String str50 = "<this>";
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                ArrayList arrayList39 = nVar.f318787a;
                ArrayList arrayList40 = new ArrayList(zhm.w.t(arrayList39, 10));
                Iterator it26 = arrayList39.iterator();
                while (it26.hasNext()) {
                    z19.a aVar17 = (z19.a) it26.next();
                    Intrinsics.checkNotNullParameter(aVar17, str50);
                    String strName5 = aVar17.f318760a.name();
                    z19.h hVar6 = aVar17.f318761b;
                    Intrinsics.checkNotNullParameter(hVar6, str50);
                    if (hVar6 instanceof z19.g) {
                        z19.g gVar5 = (z19.g) hVar6;
                        String str51 = gVar5.f318774a;
                        String str52 = gVar5.f318775b;
                        String str53 = gVar5.f318776c;
                        z19.d dVar2 = gVar5.d;
                        n29.h hVarD = dVar2 != null ? e29.a.d(dVar2) : hVar;
                        z19.i iVar6 = gVar5.e;
                        oVar3 = new n29.r(str51, str52, str53, hVarD, iVar6 != null ? new n29.v(iVar6.f318777a, iVar6.f318778b) : null);
                        it9 = it26;
                        str3 = str50;
                    } else if (hVar6 instanceof z19.e) {
                        z19.e eVar5 = (z19.e) hVar6;
                        String str54 = eVar5.f318767a;
                        String str55 = eVar5.f318768b;
                        String str56 = eVar5.f318769c;
                        z19.d dVar3 = eVar5.d;
                        n29.h hVarD2 = dVar3 != null ? e29.a.d(dVar3) : null;
                        z19.i iVar7 = eVar5.e;
                        if (iVar7 != null) {
                            it9 = it26;
                            vVar = new n29.v(iVar7.f318777a, iVar7.f318778b);
                        } else {
                            it9 = it26;
                            vVar = null;
                        }
                        ArrayList arrayList41 = eVar5.f;
                        ArrayList arrayList42 = new ArrayList(zhm.w.t(arrayList41, 10));
                        Iterator it27 = arrayList41.iterator();
                        while (it27.hasNext()) {
                            z19.j jVar5 = (z19.j) it27.next();
                            arrayList42.add(new n29.b0(jVar5.f318779a, jVar5.f318780b, jVar5.f318781c, jVar5.d));
                            it27 = it27;
                            str50 = str50;
                            str54 = str54;
                        }
                        str3 = str50;
                        oVar3 = new n29.l(str54, str55, str56, hVarD2, vVar, arrayList42);
                    } else {
                        it9 = it26;
                        str3 = str50;
                        if (!(hVar6 instanceof z19.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z19.f fVar6 = (z19.f) hVar6;
                        String str57 = fVar6.f318770a;
                        String str58 = fVar6.f318771b;
                        String str59 = fVar6.f318772c;
                        z19.d dVar4 = fVar6.d;
                        n29.h hVarD3 = dVar4 != null ? e29.a.d(dVar4) : null;
                        z19.i iVar8 = fVar6.e;
                        n29.v vVar2 = iVar8 != null ? new n29.v(iVar8.f318777a, iVar8.f318778b) : null;
                        ArrayList<z19.k> arrayList43 = fVar6.f;
                        ArrayList arrayList44 = new ArrayList(zhm.w.t(arrayList43, 10));
                        for (z19.k kVar3 : arrayList43) {
                            arrayList44.add(new n29.e0(kVar3.f318782a, kVar3.f318783b));
                        }
                        oVar3 = new n29.o(str57, str58, str59, hVarD3, vVar2, arrayList44, fVar6.f318773g);
                    }
                    z19.m mVar = aVar17.f318762c;
                    arrayList40.add(new n29.y(strName5, oVar3, mVar != null ? new n29.h0(mVar.f318784a, mVar.f318785b, mVar.f318786c) : null));
                    it26 = it9;
                    str50 = str3;
                    hVar = null;
                }
                cVar14.G(new n29.k0(arrayList40), strA3, wim.z.d(kotlin.jvm.internal.o0.b(n29.k0.class)));
                o29.z zVar = (o29.z) this.f214981x;
                synchronized (zVar) {
                    try {
                        ue0.c cVar15 = zVar.f221595c;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = kotlin.jvm.internal.o0.b(String.class);
                        companion.getClass();
                        Collection collection = (List) cVar15.T2("WRAPPED_CARDS_KEY_INDEX", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                        if (collection == null) {
                            collection = zhm.f0.f322471a;
                        }
                        ArrayList arrayListF1 = zhm.d0.f1(collection);
                        arrayListF1.remove(strA3);
                        arrayListF1.add(strA3);
                        if (arrayListF1.size() > 10) {
                            String str60 = (String) arrayListF1.remove(0);
                            zVar.f221595c.I0(str60);
                            zVar.f221594b.remove(str60);
                        }
                        zVar.f221595c.G(arrayListF1, "WRAPPED_CARDS_KEY_INDEX", wim.z.d(kotlin.jvm.internal.o0.f186429a.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class))))));
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return Unit.f186387a;
            case 12:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar7 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f214980w;
                String str61 = (String) this.f214981x;
                fVar7.s1();
                cli.y yVar2 = fVar7.M;
                fVar7.H2(yVar2, new o95.b(12));
                q6c.h hVar7 = (q6c.h) ((o9c.s) ((vkm.j2) yVar2.f22677a).getValue()).f223227c.getContent();
                q6c.m mVar2 = hVar7 != null ? hVar7.f242538b : null;
                IllegalStateException illegalStateException = new IllegalStateException("Revolut Pay payment-details polling failed: orderState=" + mVar2 + ", errorType=" + kotlin.jvm.internal.o0.f186429a.b(th11.getClass()).m(), th11);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                yji.l.a1(fVar7, fVar7.X1(fVar7.f84575t.a()), null, null, new com.revolut.feature.revolutpay.impl.ui.summary_screen.b(fVar7, str61, null), 3);
                return Unit.f186387a;
            case 13:
                oc0.a aVar19 = (oc0.a) this.v;
                BackendCard backendCard = (BackendCard) this.f214980w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar16 = ((oc0.f) this.f214981x).f224030c;
                String strA4 = aVar19.a();
                Intrinsics.checkNotNullParameter(backendCard, "<this>");
                cVar16.G(new q90.g(backendCard.f63254a, backendCard.f63255b, backendCard.f63256c, backendCard.d), strA4, wim.z.d(kotlin.jvm.internal.o0.b(q90.g.class)));
                return Unit.f186387a;
            case 14:
                oc0.b bVar3 = (oc0.b) this.v;
                List list5 = (List) this.f214980w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar17 = ((oc0.f) this.f214981x).f224030c;
                String strA5 = bVar3.a();
                Intrinsics.checkNotNullParameter(list5, "<this>");
                List<BackendCard> list6 = list5;
                ArrayList arrayList45 = new ArrayList(zhm.w.t(list6, 10));
                for (BackendCard backendCard2 : list6) {
                    Intrinsics.checkNotNullParameter(backendCard2, "<this>");
                    arrayList45.add(new q90.g(backendCard2.f63254a, backendCard2.f63255b, backendCard2.f63256c, backendCard2.d));
                }
                cVar17.G(arrayList45, strA5, kii.e.o(q90.g.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 15:
                oc0.h hVar8 = (oc0.h) this.v;
                BackendFlowEntitiesPage domain = (BackendFlowEntitiesPage) this.f214980w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oc0.i iVar9 = (oc0.i) this.f214981x;
                ue0.c cVar18 = iVar9.d;
                String strA6 = hVar8.a();
                ((gc0.b) iVar9.f224034a).getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                Boolean boolValueOf = Boolean.valueOf(domain.f63269a);
                Long lValueOf3 = Long.valueOf(domain.f63270b);
                List<BackendFlowEntity> list7 = domain.f63271c;
                ArrayList arrayList46 = new ArrayList(zhm.w.t(list7, 10));
                for (BackendFlowEntity backendFlowEntity : list7) {
                    String str62 = backendFlowEntity.f63272a;
                    String str63 = backendFlowEntity.f63273b;
                    String str64 = backendFlowEntity.f63274c;
                    String str65 = backendFlowEntity.d;
                    String str66 = backendFlowEntity.f63275g;
                    BackendFlowIcon backendFlowIcon = backendFlowEntity.e;
                    arrayList46.add(new j.a(str62, str63, str64, str65, backendFlowIcon != null ? t90.e.b(backendFlowIcon) : null, backendFlowEntity.f, str66));
                }
                cVar18.G(new q90.j(boolValueOf, lValueOf3, arrayList46), strA6, wim.z.d(kotlin.jvm.internal.o0.b(q90.j.class)));
                return Unit.f186387a;
            case 16:
                oc0.j jVar6 = (oc0.j) this.v;
                BackendEntitiesSummaryItem backendEntitiesSummaryItem = (BackendEntitiesSummaryItem) this.f214980w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar19 = ((oc0.k) this.f214981x).f224042c;
                String strA7 = jVar6.a();
                Intrinsics.checkNotNullParameter(backendEntitiesSummaryItem, "<this>");
                cVar19.G(new q90.k(backendEntitiesSummaryItem.f63262c, backendEntitiesSummaryItem.f63260a, backendEntitiesSummaryItem.f63261b), strA7, wim.z.d(kotlin.jvm.internal.o0.b(q90.k.class)));
                return Unit.f186387a;
            case 17:
                String str67 = (String) this.v;
                q90.u uVar2 = (q90.u) this.f214980w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oc0.m) this.f214981x).f224044b.G(uVar2, oc0.m.b(str67), wim.z.d(kotlin.jvm.internal.o0.b(q90.u.class)));
                return Unit.f186387a;
            case 18:
                return b(obj2);
            case 19:
                ook.c cVar20 = (ook.c) this.v;
                List list8 = (List) this.f214980w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar21 = (ue0.c) ((hd.r) this.f214981x).f151366c;
                String strB2 = cVar20.b();
                Intrinsics.checkNotNullParameter(list8, "<this>");
                List<PricingPlanWaitlistEntry> list9 = list8;
                ArrayList arrayList47 = new ArrayList(zhm.w.t(list9, 10));
                for (PricingPlanWaitlistEntry pricingPlanWaitlistEntry : list9) {
                    Intrinsics.checkNotNullParameter(pricingPlanWaitlistEntry, "<this>");
                    arrayList47.add(new mok.b(pricingPlanWaitlistEntry.f103652a, pricingPlanWaitlistEntry.f103653b.name(), pricingPlanWaitlistEntry.f103654c, pricingPlanWaitlistEntry.d));
                }
                cVar21.G(arrayList47, strB2, kii.e.o(mok.b.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 20:
                return c(obj2);
            case 21:
                String str68 = (String) this.v;
                List list10 = (List) this.f214980w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar22 = ((or7.c) this.f214981x).f228077c;
                String strQ = j6.a.q("POLICY_DOCUMENTS_PREFIX_", str68);
                List<DocumentsGroup> list11 = list10;
                ArrayList arrayList48 = new ArrayList(zhm.w.t(list11, 10));
                for (DocumentsGroup documentsGroup : list11) {
                    Object obj4 = mr7.a.f208068a;
                    Intrinsics.checkNotNullParameter(documentsGroup, "<this>");
                    String str69 = documentsGroup.f75716a;
                    ArrayList<Document> arrayList49 = documentsGroup.f75717b;
                    ArrayList arrayList50 = new ArrayList(zhm.w.t(arrayList49, i));
                    for (Document document : arrayList49) {
                        Intrinsics.checkNotNullParameter(document, "<this>");
                        arrayList50.add(new lr7.a(document.f75713a, document.f75714b, le.u1.g(document.e, mr7.a.f208068a), document.d, document.f75715c, document.f));
                    }
                    arrayList48.add(new lr7.b(str69, arrayList50));
                    i = 10;
                }
                cVar22.G(arrayList48, strQ, kii.e.o(lr7.b.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 22:
                Data data = (Data) this.v;
                String str70 = (String) this.f214980w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar4 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f214981x;
                ox5.f0 f0Var = com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b.Companion;
                return new Pair(data, bVar4.J2(data, str70));
            case 23:
                p24.w wVar = (p24.w) this.v;
                au3.l lVar6 = (au3.l) this.f214980w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar6 = ((p24.v) this.f214981x).f232069c;
                Intrinsics.checkNotNullParameter(lVar6, "<this>");
                String str71 = lVar6.f9481a;
                String str72 = lVar6.f9482b;
                String str73 = lVar6.f9483c;
                ArrayList arrayList51 = lVar6.d;
                ArrayList arrayList52 = new ArrayList(zhm.w.t(arrayList51, 10));
                Iterator it28 = arrayList51.iterator();
                while (it28.hasNext()) {
                    arrayList52.add(v04.b.D((au3.k) it28.next()));
                }
                eVar6.b(wVar, new f24.k(str71, str72, str73, arrayList52));
                return Unit.f186387a;
            case 24:
                p24.x xVar2 = (p24.x) this.v;
                au3.m mVar3 = (au3.m) this.f214980w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p24.v) this.f214981x).f232069c.b(xVar2, mVar3);
                return Unit.f186387a;
            case 25:
                return n(obj2);
            case 26:
                return o(obj2);
            case 27:
                return p(obj2);
            case 28:
                return s(obj2);
            default:
                pfk.k kVar4 = (pfk.k) this.v;
                lha.p pVar2 = (lha.p) this.f214980w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pfk.s) this.f214981x).f235687c.G(nfk.c.l(pVar2), pfk.s.c(kVar4), wim.z.d(kotlin.jvm.internal.o0.b(afk.c.class)));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f214981x = obj2;
    }
}
