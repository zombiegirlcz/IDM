package vgk;

import efm.d0;
import kkf.r6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f289202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.l f289203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hha.i f289204y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar, String str, zm3.l lVar, hha.i iVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f289202w = str;
        this.f289203x = lVar;
        this.f289204y = iVar;
        this.z = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f289202w, this.f289203x, this.f289204y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        r6 r6VarI3;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = this.v;
        zfk.c cVar = dVar.f103014s;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarE = dVar.f103012q.e();
            this.u = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        String str = ((hha.d) obj2).f152287a;
        String str2 = this.f289202w;
        boolean zF = Intrinsics.f(str2, str);
        zfk.m kVar = zfk.l.f322029a;
        zm3.l lVar = this.f289203x;
        if (zF) {
            zfk.j jVar = zfk.m.Companion;
            z = lVar != null;
            jVar.getClass();
            if (!z) {
                kVar = new zfk.k(null);
            }
            r6VarI3 = cVar.f3(kVar);
        } else {
            zfk.j jVar2 = zfk.m.Companion;
            z = lVar != null;
            jVar2.getClass();
            if (!z) {
                kVar = new zfk.k(null);
            }
            r6VarI3 = cVar.i3(str2, this.f289204y, kVar);
        }
        return yji.l.a1(dVar, r6VarI3, null, null, new j(this.z, null), 3);
    }
}
