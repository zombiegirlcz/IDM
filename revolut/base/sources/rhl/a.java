package rhl;

import b93.k;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import dj0.d;
import ft3.a1;
import ft3.d1;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kbk.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import prl.e;
import skm.h1;
import tdc.c;
import tdc.h;
import tdc.r;
import u10.n;
import ukm.g0;
import v20.s0;
import v6l.b1;
import wbk.j;
import z20.q;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u = 4;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f254525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f254526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f254527y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, hha.i iVar, j jVar, l lVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.B = dVar;
        this.f254525w = iVar;
        this.z = jVar;
        this.C = lVar;
        this.f254526x = str;
        this.f254527y = str2;
        this.A = str3;
    }

    /* JADX WARN: Type inference failed for: r13v32, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((e) this.f254525w, (String) this.f254526x, (String) this.f254527y, (List) this.z, (List) this.C, (ScreenerSortingOptions) this.A, continuation);
            case 1:
                return new a((e) this.f254525w, (String) this.f254526x, (String) this.f254527y, (String) this.B, (List) this.z, (ArrayList) this.C, (ScreenerSortingOptions) this.A, continuation);
            case 2:
                a aVar = new a((r) this.f254526x, (c) this.f254527y, (h) this.z, (d) this.C, (d) this.A, continuation);
                aVar.B = obj2;
                return aVar;
            case 3:
                return new a((b1) this.f254526x, (List) this.z, (b93.d) this.f254527y, (k) this.A, (List) this.C, continuation);
            case 4:
                return new a((d) this.B, (hha.i) this.f254525w, (j) this.z, (l) this.C, (String) this.f254526x, (String) this.f254527y, (String) this.A, continuation);
            case 5:
                a aVar2 = new a((wda.r) this.C, (String) this.f254527y, (io3.l) this.A, continuation);
                aVar2.B = obj2;
                return aVar2;
            case 6:
                return new a((Flow) this.f254525w, (CoroutineContext) this.f254526x, this.B, (g0) this.f254527y, (FlowCollector) this.z, (Function3) this.C, (h1) this.A, continuation);
            case 7:
                a aVar3 = new a((a1) this.f254527y, (xr3.k) this.z, (d1) this.C, (String) this.f254526x, (IntendedPricingPlan) this.A, continuation);
                aVar3.B = obj2;
                return aVar3;
            case 8:
                return new a((q) this.B, (z20.d) this.f254525w, (n) this.f254526x, (Set) this.f254527y, (Set) this.z, (Set) this.C, (hlm.i) this.A, continuation);
            default:
                return new a((s0) this.C, (z20.r) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r7 == r13) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Type inference failed for: r23v3, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rhl.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a1 a1Var, xr3.k kVar, d1 d1Var, String str, IntendedPricingPlan intendedPricingPlan, Continuation continuation) {
        super(2, continuation);
        this.f254527y = a1Var;
        this.z = kVar;
        this.C = d1Var;
        this.f254526x = str;
        this.A = intendedPricingPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Flow flow, CoroutineContext coroutineContext, Object obj2, g0 g0Var, FlowCollector flowCollector, Function3 function3, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.f254525w = flow;
        this.f254526x = coroutineContext;
        this.B = obj2;
        this.f254527y = g0Var;
        this.z = flowCollector;
        this.C = (i) function3;
        this.A = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String str, String str2, String str3, List list, ArrayList arrayList, ScreenerSortingOptions screenerSortingOptions, Continuation continuation) {
        super(2, continuation);
        this.f254525w = eVar;
        this.f254526x = str;
        this.f254527y = str2;
        this.B = str3;
        this.z = list;
        this.C = arrayList;
        this.A = screenerSortingOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String str, String str2, List list, List list2, ScreenerSortingOptions screenerSortingOptions, Continuation continuation) {
        super(2, continuation);
        this.f254525w = eVar;
        this.f254526x = str;
        this.f254527y = str2;
        this.z = list;
        this.C = list2;
        this.A = screenerSortingOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, c cVar, h hVar, d dVar, d dVar2, Continuation continuation) {
        super(2, continuation);
        this.f254526x = rVar;
        this.f254527y = cVar;
        this.z = hVar;
        this.C = dVar;
        this.A = dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s0 s0Var, z20.r rVar, Continuation continuation) {
        super(2, continuation);
        this.C = s0Var;
        this.A = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b1 b1Var, List list, b93.d dVar, k kVar, List list2, Continuation continuation) {
        super(2, continuation);
        this.f254526x = b1Var;
        this.z = list;
        this.f254527y = dVar;
        this.A = kVar;
        this.C = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(wda.r rVar, String str, io3.l lVar, Continuation continuation) {
        super(2, continuation);
        this.C = rVar;
        this.f254527y = str;
        this.A = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, z20.d dVar, n nVar, Set set, Set set2, Set set3, hlm.i iVar, Continuation continuation) {
        super(2, continuation);
        this.B = qVar;
        this.f254525w = dVar;
        this.f254526x = nVar;
        this.f254527y = set;
        this.z = set2;
        this.C = set3;
        this.A = iVar;
    }
}
