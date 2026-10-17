package frk;

import ce9.m;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.feature.retail.savings.api.SavingsAccountApi$Toggles;
import com.revolut.feature.revolutpay.promoted_merchants.impl.data.service.RevolutPayPromotedMerchantsApiService;
import com.revolut.feature.shared.savings.impl.product.data.network.SavingsProductService;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.curated_collections.CuratedCollectionsService;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import ecd.a3;
import ecd.d3;
import f5j.n;
import f5j.p;
import g2e.c0;
import g2e.d0;
import g2e.e0;
import g2e.f0;
import g2e.g0;
import g2e.j;
import g2e.k;
import g2e.l;
import g2e.n0;
import g2e.u;
import g2e.v;
import gcc.e;
import gcc.g;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lhl.f;
import ncd.h;
import nel.z;
import nhl.r;
import r10.q;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f137486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f137487x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f137487x = obj2;
    }

    private final Object b(Object obj2) {
        e eVar = (e) this.f137486w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            RevolutPayPromotedMerchantsApiService revolutPayPromotedMerchantsApiService = ((g) this.f137487x).f142401a;
            boolean z = eVar.f142398a;
            Integer num = new Integer(9);
            this.f137486w = null;
            this.v = 1;
            obj2 = revolutPayPromotedMerchantsApiService.getPromotedMerchants(z, null, null, num, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((fcc.g) obj2).getMerchants();
    }

    private final Object c(Object obj2) {
        gcd.d dVar = (gcd.d) this.f137486w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            gcd.g gVar = (gcd.g) this.f137487x;
            SavingsProductService savingsProductService = gVar.f142414a;
            h hVar = dVar.f142411b;
            if (gcd.e.f142412a[hVar.ordinal()] == 1) {
                if (((jte.d) gVar.d.f197444a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c)) {
                    hVar = null;
                }
            }
            this.f137486w = null;
            this.v = 1;
            obj2 = savingsProductService.getSavingsOnboardingData(hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return d8l.d.A((a3) obj2);
    }

    private final Object n(Object obj2) {
        String str = (String) this.f137486w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            SavingsProductService savingsProductService = ((gcd.g) this.f137487x).f142414a;
            this.f137486w = null;
            this.v = 1;
            obj2 = savingsProductService.getSavingsProductData(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        d3 d3Var = (d3) obj2;
        Intrinsics.checkNotNullParameter(d3Var, "<this>");
        SavingsProductData savingsProductData = new SavingsProductData(fcd.c.a(d3Var.f124513a), fcd.a.c(d3Var.f124514b));
        fcd.b.a(savingsProductData);
        return savingsProductData;
    }

    private final Object o(Object obj2) {
        Object next;
        String str = (String) this.f137486w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            CuratedCollectionsService curatedCollectionsService = ((ghl.b) this.f137487x).f143997a;
            this.f137486w = str;
            this.v = 1;
            obj2 = curatedCollectionsService.getCollections(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Iterator it8 = ((Iterable) obj2).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((f) next).f195397a, str)) {
                break;
            }
        }
        f fVar = (f) next;
        if (fVar != null) {
            return m.H(fVar);
        }
        throw new IllegalStateException(p.a.p("Collection with ", str, " is not available"));
    }

    private final Object p(Object obj2) {
        List list = (List) this.f137486w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ScreenerService screenerService = ((ghl.g) this.f137487x).f144005a;
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((z) it8.next()).name());
            }
            this.f137486w = null;
            this.v = 1;
            obj2 = screenerService.getScreenerConfig(arrayList, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return mhl.a.e((r) obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a aVar = new a((b) this.f137487x, (Continuation) obj4, 0);
                aVar.f137486w = (String) obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            case 1:
                a aVar2 = new a((d) this.f137487x, (Continuation) obj4, 1);
                aVar2.f137486w = (cel.b) obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
            case 2:
                a aVar3 = new a((r10.r) this.f137487x, (Continuation) obj4, 2);
                aVar3.f137486w = (kv1.g) obj3;
                return aVar3.invokeSuspend(Unit.f186387a);
            case 3:
                return new a((g11.b) this.f137487x, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                a aVar4 = new a((q) this.f137487x, (Continuation) obj4, 4);
                aVar4.f137486w = (j18.o) obj3;
                return aVar4.invokeSuspend(Unit.f186387a);
            case 5:
                a aVar5 = new a((g2e.r) this.f137487x, (Continuation) obj4, 5);
                aVar5.f137486w = (g2e.i) obj3;
                return aVar5.invokeSuspend(Unit.f186387a);
            case 6:
                a aVar6 = new a((g2e.r) this.f137487x, (Continuation) obj4, 6);
                aVar6.f137486w = (k) obj3;
                return aVar6.invokeSuspend(Unit.f186387a);
            case 7:
                a aVar7 = new a((g2e.r) this.f137487x, (Continuation) obj4, 7);
                aVar7.f137486w = (j) obj3;
                return aVar7.invokeSuspend(Unit.f186387a);
            case 8:
                a aVar8 = new a((g2e.r) this.f137487x, (Continuation) obj4, 8);
                aVar8.f137486w = (l) obj3;
                return aVar8.invokeSuspend(Unit.f186387a);
            case 9:
                a aVar9 = new a((c0) this.f137487x, (Continuation) obj4, 9);
                aVar9.f137486w = (u) obj3;
                return aVar9.invokeSuspend(Unit.f186387a);
            case 10:
                a aVar10 = new a((c0) this.f137487x, (Continuation) obj4, 10);
                aVar10.f137486w = (v) obj3;
                return aVar10.invokeSuspend(Unit.f186387a);
            case 11:
                a aVar11 = new a((n0) this.f137487x, (Continuation) obj4, 11);
                aVar11.f137486w = (d0) obj3;
                return aVar11.invokeSuspend(Unit.f186387a);
            case 12:
                a aVar12 = new a((n0) this.f137487x, (Continuation) obj4, 12);
                aVar12.f137486w = (e0) obj3;
                return aVar12.invokeSuspend(Unit.f186387a);
            case 13:
                a aVar13 = new a((n0) this.f137487x, (Continuation) obj4, 13);
                aVar13.f137486w = (f0) obj3;
                return aVar13.invokeSuspend(Unit.f186387a);
            case 14:
                a aVar14 = new a((n0) this.f137487x, (Continuation) obj4, 14);
                aVar14.f137486w = (String) obj3;
                return aVar14.invokeSuspend(Unit.f186387a);
            case 15:
                a aVar15 = new a((n0) this.f137487x, (Continuation) obj4, 15);
                aVar15.f137486w = (g0) obj3;
                return aVar15.invokeSuspend(Unit.f186387a);
            case 16:
                a aVar16 = new a((g3b.g) this.f137487x, (Continuation) obj4, 16);
                aVar16.f137486w = (g3b.a) obj3;
                return aVar16.invokeSuspend(Unit.f186387a);
            case 17:
                a aVar17 = new a((g3b.g) this.f137487x, (Continuation) obj4, 17);
                aVar17.f137486w = (String) obj3;
                return aVar17.invokeSuspend(Unit.f186387a);
            case 18:
                a aVar18 = new a((g3b.k) this.f137487x, (Continuation) obj4, 18);
                aVar18.f137486w = (MarginQuoteParams) obj3;
                return aVar18.invokeSuspend(Unit.f186387a);
            case 19:
                a aVar19 = new a((a5h.g) this.f137487x, (Continuation) obj4, 19);
                aVar19.f137486w = (n) obj3;
                return aVar19.invokeSuspend(Unit.f186387a);
            case 20:
                a aVar20 = new a((a5h.g) this.f137487x, (Continuation) obj4, 20);
                aVar20.f137486w = (p) obj3;
                return aVar20.invokeSuspend(Unit.f186387a);
            case 21:
                a aVar21 = new a((gab.c) this.f137487x, (Continuation) obj4, 21);
                aVar21.f137486w = (gab.b) obj3;
                return aVar21.invokeSuspend(Unit.f186387a);
            case 22:
                a aVar22 = new a((g) this.f137487x, (Continuation) obj4, 22);
                aVar22.f137486w = (String) obj3;
                return aVar22.invokeSuspend(Unit.f186387a);
            case 23:
                a aVar23 = new a((g) this.f137487x, (Continuation) obj4, 23);
                aVar23.f137486w = (ucc.g) obj3;
                return aVar23.invokeSuspend(Unit.f186387a);
            case 24:
                a aVar24 = new a((g) this.f137487x, (Continuation) obj4, 24);
                aVar24.f137486w = (e) obj3;
                return aVar24.invokeSuspend(Unit.f186387a);
            case 25:
                a aVar25 = new a((gcd.g) this.f137487x, (Continuation) obj4, 25);
                aVar25.f137486w = (gcd.d) obj3;
                return aVar25.invokeSuspend(Unit.f186387a);
            case 26:
                a aVar26 = new a((gcd.g) this.f137487x, (Continuation) obj4, 26);
                aVar26.f137486w = (String) obj3;
                return aVar26.invokeSuspend(Unit.f186387a);
            case 27:
                a aVar27 = new a((ghl.b) this.f137487x, (Continuation) obj4, 27);
                aVar27.f137486w = (String) obj3;
                return aVar27.invokeSuspend(Unit.f186387a);
            case 28:
                a aVar28 = new a((ghl.g) this.f137487x, (Continuation) obj4, 28);
                aVar28.f137486w = (List) obj3;
                return aVar28.invokeSuspend(Unit.f186387a);
            default:
                a aVar29 = new a((ghl.j) this.f137487x, (Continuation) obj4, 29);
                aVar29.f137486w = (shl.a) obj3;
                return aVar29.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v69, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v44, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 3504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: frk.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
