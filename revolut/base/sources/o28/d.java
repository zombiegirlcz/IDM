package o28;

import c2d.l0;
import efm.r;
import gim.i;
import h8b.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mle.x;
import phl.j;
import vkm.q;
import vvh.l;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f221538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f221539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f221540y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, String str, Continuation continuation, l lVar) {
        super(3, continuation);
        this.A = lVar;
        this.f221540y = str;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(continuation, (f) this.A, this.z, this.f221540y);
                dVar.f221538w = flowCollector;
                dVar.f221539x = obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                l lVar = (l) this.A;
                d dVar2 = new d(this.z, this.f221540y, continuation, lVar);
                dVar2.f221538w = flowCollector;
                dVar2.f221539x = obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowS;
        String str;
        switch (this.u) {
            case 0:
                f fVar = (f) this.A;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f221538w;
                    if (((Boolean) this.f221539x).booleanValue()) {
                        k kVar = fVar.f221542b;
                        Integer num = new Integer(this.z);
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        yhl.d dVar = kVar.f149978a;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        j jVar = dVar.f314175a;
                        ArrayList arrayListB = dVar.b();
                        ArrayList supportedTypes = new ArrayList(w.t(arrayListB, 10));
                        Iterator it8 = arrayListB.iterator();
                        while (it8.hasNext()) {
                            supportedTypes.add(((iel.j) it8.next()).getId());
                        }
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        r rVarCompose = jVar.e.e(new phl.l(supportedTypes, num), loadingStrategy).compose(kVar.f149979b);
                        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
                        flowS = new x(zi0.c.w(rd0.e.b(rVarCompose)), this.f221540y, fVar, 2);
                    } else {
                        flowS = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f221538w = null;
                    this.f221539x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                l lVar = (l) this.A;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f221538w;
                    io3.d dVar2 = (io3.d) this.f221539x;
                    jhi.b bVarB = l.b(lVar, this.f221540y, (dVar2 == null || (str = dVar2.f163147c) == null) ? null : new xi0.b(6, str, null));
                    this.f221538w = null;
                    this.f221539x = null;
                    this.v = 1;
                    q.w(flowCollector2);
                    Object objCollect = bVarB.collect(new l0(flowCollector2, dVar2, lVar, this.z, 8), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, f fVar, int i, String str) {
        super(3, continuation);
        this.A = fVar;
        this.z = i;
        this.f221540y = str;
    }
}
