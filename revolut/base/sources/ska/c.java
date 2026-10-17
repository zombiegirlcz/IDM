package ska;

import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.instrument.OptionTickerDetails;
import dcl.a0;
import hcl.r0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf1.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import rub.m;
import th6.b0;
import th6.q;
import v20.f0;
import vdl.h0;
import vdl.r;
import vdl.y;
import wim.z;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f263782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 28;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    private final Object b(Object obj2) {
        BigDecimal bigDecimal;
        ej0.b bVar;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        BigDecimal bigDecimal7;
        ej0.b bVar2;
        ej0.b bVar3;
        List list = (List) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a0 a0Var = ((y) this.f263782w).f288064b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((InstrumentTicker) it8.next()).f105112b);
        }
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            InstrumentTicker instrumentTicker = (InstrumentTicker) it9.next();
            Object obj3 = tcl.i.f269885a;
            Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
            String str = instrumentTicker.f105113c;
            OptionTickerDetails optionTickerDetails = instrumentTicker.A;
            String str2 = instrumentTicker.f105112b;
            String strB = tbl.a.b(instrumentTicker.d);
            jo3.b bVarA = hx7.a.A(instrumentTicker.e);
            ej0.b bVar4 = instrumentTicker.f;
            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
            ej0.b bVar5 = instrumentTicker.f105114g;
            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
            boolean z = instrumentTicker.i;
            String strG = u1.g(instrumentTicker.f105115h, tcl.i.f269885a);
            boolean z3 = instrumentTicker.f105116j;
            dj0.d dVar = instrumentTicker.k;
            jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
            ej0.b bVar6 = instrumentTicker.f105117l;
            ko3.b bVarM3 = bVar6 != null ? cp5.c.M(bVar6) : null;
            Long l2 = instrumentTicker.f105118m;
            Iterator it10 = it9;
            long j2 = instrumentTicker.f105119n;
            dj0.d dVar2 = instrumentTicker.o;
            jo3.b bVarA3 = dVar2 != null ? hx7.a.A(dVar2) : null;
            ej0.b bVar7 = instrumentTicker.f105120p;
            ko3.b bVarM4 = bVar7 != null ? cp5.c.M(bVar7) : null;
            dj0.d dVar3 = instrumentTicker.f105121q;
            jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
            dj0.d dVar4 = instrumentTicker.f105122r;
            jo3.b bVarA5 = dVar4 != null ? hx7.a.A(dVar4) : null;
            ej0.b bVar8 = instrumentTicker.f105123s;
            ko3.b bVarM5 = bVar8 != null ? cp5.c.M(bVar8) : null;
            ej0.b bVar9 = instrumentTicker.f105124t;
            ko3.b bVarM6 = bVar9 != null ? cp5.c.M(bVar9) : null;
            ej0.b bVar10 = instrumentTicker.u;
            ko3.b bVarM7 = bVar10 != null ? cp5.c.M(bVar10) : null;
            String strH = u1.h(instrumentTicker.v, tcl.i.f269886b);
            String str3 = strH == null ? "" : strH;
            BigDecimal bigDecimal8 = instrumentTicker.f105125w;
            String engineeringString = bigDecimal8 != null ? bigDecimal8.toEngineeringString() : null;
            BigDecimal bigDecimal9 = instrumentTicker.f105126x;
            String engineeringString2 = bigDecimal9 != null ? bigDecimal9.toEngineeringString() : null;
            BigDecimal bigDecimal10 = instrumentTicker.f105127y;
            String engineeringString3 = bigDecimal10 != null ? bigDecimal10.toEngineeringString() : null;
            BigDecimal bigDecimal11 = instrumentTicker.z;
            String engineeringString4 = bigDecimal11 != null ? bigDecimal11.toEngineeringString() : null;
            String strH2 = u1.h(instrumentTicker.f105111a, tcl.i.f269887c);
            arrayList2.add(new r0(str2, str, strB, bVarA, bVarM, bVarM2, z, strG, z3, bVarA2, bVarM3, l2, j2, bVarA3, bVarM4, bVarA4, bVarA5, bVarM5, bVarM6, bVarM7, str3, engineeringString, engineeringString2, engineeringString3, engineeringString4, strH2 == null ? "" : strH2, (optionTickerDetails == null || (bVar3 = optionTickerDetails.f105128a) == null) ? null : cp5.c.M(bVar3), optionTickerDetails != null ? optionTickerDetails.f105129b : null, (optionTickerDetails == null || (bVar2 = optionTickerDetails.f105130c) == null) ? null : cp5.c.M(bVar2), optionTickerDetails != null ? optionTickerDetails.d : null, optionTickerDetails != null ? optionTickerDetails.e : null, optionTickerDetails != null ? optionTickerDetails.f : null, optionTickerDetails != null ? optionTickerDetails.f105131g : null, (optionTickerDetails == null || (bigDecimal7 = optionTickerDetails.f105132h) == null) ? null : bigDecimal7.toEngineeringString(), (optionTickerDetails == null || (bigDecimal6 = optionTickerDetails.i) == null) ? null : bigDecimal6.toEngineeringString(), (optionTickerDetails == null || (bigDecimal5 = optionTickerDetails.f105133j) == null) ? null : bigDecimal5.toEngineeringString(), (optionTickerDetails == null || (bigDecimal4 = optionTickerDetails.k) == null) ? null : bigDecimal4.toEngineeringString(), (optionTickerDetails == null || (bigDecimal3 = optionTickerDetails.f105134l) == null) ? null : bigDecimal3.toEngineeringString(), (optionTickerDetails == null || (bigDecimal2 = optionTickerDetails.f105135m) == null) ? null : bigDecimal2.toEngineeringString(), (optionTickerDetails == null || (bVar = optionTickerDetails.f105136n) == null) ? null : cp5.c.M(bVar), (optionTickerDetails == null || (bigDecimal = optionTickerDetails.o) == null) ? null : bigDecimal.toEngineeringString(), optionTickerDetails != null ? optionTickerDetails.f105137p : null));
            it9 = it10;
        }
        a0Var.d(arrayList, arrayList2);
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        uel.a aVar = (uel.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ue0.c cVar = ((h0) this.f263782w).f287974b;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ArrayList<uel.b> arrayList = aVar.f279485a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (uel.b bVar : arrayList) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList2.add(new kdl.i(bVar.f279486a, bVar.f279487b, bVar.f279488c, bVar.d));
        }
        cVar.G(new kdl.f(arrayList2), "INDUSTRIES_CACHE_KEY", z.d(o0.b(kdl.f.class)));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        ufc.c cVar;
        kf1.j domain = (kf1.j) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        vfc.f fVar = (vfc.f) this.f263782w;
        xe0.e eVar = fVar.d;
        fVar.f288568c.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        kf1.b bVar = domain.f183276a;
        ufc.a aVar2 = new ufc.a(bVar.f183268a, bVar.f183269b);
        boolean z = domain.f183277b;
        kf1.f fVar2 = domain.f183278c;
        if (fVar2 != null) {
            kf1.l lVar = fVar2.f183271a;
            ufc.f fVar3 = new ufc.f(lVar.f183279a, lVar.f183280b);
            n nVar = fVar2.f183272b;
            ufc.g gVar = new ufc.g(nVar.f183281a, nVar.f183282b);
            kf1.h hVar = fVar2.f183273c;
            cVar = new ufc.c(fVar3, gVar, new ufc.e(hVar.f183274a, hVar.f183275b));
        } else {
            cVar = null;
        }
        eVar.G(new ufc.d(aVar2, z, cVar), "PRO_MERCHANT_KEY", z.d(o0.b(ufc.d.class)));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                Map map = ((aka.o) obj3).f5767a;
                c cVar = new c((e) this.f263782w, (Continuation) obj4, 0);
                cVar.v = map;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c((sl1.c) this.f263782w, (Continuation) obj4, 1);
                cVar2.v = (List) obj2;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c((sne.g) this.f263782w, (Continuation) obj4, 2);
                cVar3.v = (xme.f) obj3;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c((sre.k) this.f263782w, (Continuation) obj4, 3);
                cVar4.v = (List) obj3;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c((suf.h) this.f263782w, (Continuation) obj4, 4);
                cVar5.v = (List) obj3;
                return cVar5.invokeSuspend(Unit.f186387a);
            case 5:
                c cVar6 = new c((t95.e) this.f263782w, (Continuation) obj4, 5);
                cVar6.v = (List) obj3;
                return cVar6.invokeSuspend(Unit.f186387a);
            case 6:
                c cVar7 = new c((q) this.f263782w, (Continuation) obj4, 6);
                cVar7.v = (ph6.f) obj3;
                return cVar7.invokeSuspend(Unit.f186387a);
            case 7:
                c cVar8 = new c((b0) this.f263782w, (Continuation) obj4, 7);
                cVar8.v = (PseInstitutions) obj3;
                return cVar8.invokeSuspend(Unit.f186387a);
            case 8:
                c cVar9 = new c((tjb.g) this.f263782w, (Continuation) obj4, 8);
                cVar9.v = (List) obj3;
                return cVar9.invokeSuspend(Unit.f186387a);
            case 9:
                c cVar10 = new c((tpj.d) this.f263782w, (Continuation) obj4, 9);
                cVar10.v = (od0.i) obj3;
                return cVar10.invokeSuspend(Unit.f186387a);
            case 10:
                c cVar11 = new c((tub.i) this.f263782w, (Continuation) obj4, 10);
                cVar11.v = (rub.c) obj3;
                return cVar11.invokeSuspend(Unit.f186387a);
            case 11:
                c cVar12 = new c((tub.i) this.f263782w, (Continuation) obj4, 11);
                cVar12.v = (m) obj3;
                return cVar12.invokeSuspend(Unit.f186387a);
            case 12:
                c cVar13 = new c((tuj.g) this.f263782w, (Continuation) obj4, 12);
                cVar13.v = (puj.h) obj3;
                return cVar13.invokeSuspend(Unit.f186387a);
            case 13:
                return new c((tzl.l) this.v, this.f263782w, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 14:
                c cVar14 = new c((tzl.l) this.f263782w, (Continuation) obj4, 14);
                cVar14.v = (FlowCollector) obj2;
                return cVar14.invokeSuspend(Unit.f186387a);
            case 15:
                c cVar15 = new c((u1l.b) this.f263782w, (Continuation) obj4, 15);
                cVar15.v = (a2l.h) obj3;
                return cVar15.invokeSuspend(Unit.f186387a);
            case 16:
                c cVar16 = new c((u1l.g) this.f263782w, (Continuation) obj4, 16);
                cVar16.v = (String) obj3;
                return cVar16.invokeSuspend(Unit.f186387a);
            case 17:
                c cVar17 = new c((ua5.e) this.f263782w, (Continuation) obj4, 17);
                cVar17.v = (CreditPostTerminationPlanDetails) obj3;
                return cVar17.invokeSuspend(Unit.f186387a);
            case 18:
                c cVar18 = new c((ucd.b) this.f263782w, (Continuation) obj4, 18);
                cVar18.v = (List) obj3;
                return cVar18.invokeSuspend(Unit.f186387a);
            case 19:
                c cVar19 = new c((urj.n) this.f263782w, (Continuation) obj4, 19);
                cVar19.v = (Throwable) obj3;
                return cVar19.invokeSuspend(Unit.f186387a);
            case 20:
                c cVar20 = new c((uy1.j) this.f263782w, (Continuation) obj4, 20);
                cVar20.v = (List) obj3;
                return cVar20.invokeSuspend(Unit.f186387a);
            case 21:
                c cVar21 = new c((f0) this.f263782w, (Continuation) obj4, 21);
                cVar21.v = (List) obj3;
                return cVar21.invokeSuspend(Unit.f186387a);
            case 22:
                c cVar22 = new c((vdl.d) this.f263782w, (Continuation) obj4, 22);
                cVar22.v = (wel.d) obj3;
                return cVar22.invokeSuspend(Unit.f186387a);
            case 23:
                c cVar23 = new c((vdl.h) this.f263782w, (Continuation) obj4, 23);
                cVar23.v = (List) obj3;
                return cVar23.invokeSuspend(Unit.f186387a);
            case 24:
                c cVar24 = new c((r) this.f263782w, (Continuation) obj4, 24);
                cVar24.v = (List) obj3;
                return cVar24.invokeSuspend(Unit.f186387a);
            case 25:
                c cVar25 = new c((y) this.f263782w, (Continuation) obj4, 25);
                cVar25.v = (List) obj3;
                return cVar25.invokeSuspend(Unit.f186387a);
            case 26:
                c cVar26 = new c((h0) this.f263782w, (Continuation) obj4, 26);
                cVar26.v = (uel.a) obj3;
                return cVar26.invokeSuspend(Unit.f186387a);
            case 27:
                c cVar27 = new c((vfc.f) this.f263782w, (Continuation) obj4, 27);
                cVar27.v = (kf1.j) obj3;
                return cVar27.invokeSuspend(Unit.f186387a);
            case 28:
                c cVar28 = new c(3, (Continuation) obj4);
                cVar28.v = (UnifiedTransaction) obj2;
                cVar28.f263782w = (Pair) obj3;
                return cVar28.invokeSuspend(Unit.f186387a);
            default:
                c cVar29 = new c((vj1.b) this.f263782w, (Continuation) obj4, 29);
                cVar29.v = (List) obj3;
                return cVar29.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 3606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ska.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f263782w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tzl.l lVar, Object obj2, Continuation continuation) {
        super(3, continuation);
        this.u = 13;
        this.v = lVar;
        this.f263782w = obj2;
    }
}
