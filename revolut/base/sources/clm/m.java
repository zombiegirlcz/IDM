package clm;

import efm.u;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import skm.d0;
import skm.p0;
import skm.x;
import tfm.z0;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class m implements efm.m, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f25081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gim.i f25082b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(CoroutineContext coroutineContext, Function2 function2, int i) {
        this.f25081a = coroutineContext;
        this.f25082b = (gim.i) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // efm.u
    public void a(z0 z0Var) {
        CoroutineContext coroutineContextA = x.a(kotlin.coroutines.g.f186406a, this.f25081a, true);
        elm.g gVar = p0.f264002b;
        if (coroutineContextA != gVar && coroutineContextA.get(kotlin.coroutines.d.q1) == null) {
            coroutineContextA = coroutineContextA.plus(gVar);
        }
        q qVar = new q(coroutineContextA, z0Var);
        z0Var.d(new g(qVar));
        qVar.j0(d0.DEFAULT, qVar, this.f25082b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // efm.m
    public void b(rfm.c cVar) {
        CoroutineContext coroutineContextA = x.a(kotlin.coroutines.g.f186406a, this.f25081a, true);
        elm.g gVar = p0.f264002b;
        if (coroutineContextA != gVar && coroutineContextA.get(kotlin.coroutines.d.q1) == null) {
            coroutineContextA = coroutineContextA.plus(gVar);
        }
        l lVar = new l(coroutineContextA, cVar);
        lfm.d.d(cVar, new lfm.b(new g(lVar)));
        lVar.j0(d0.DEFAULT, lVar, this.f25082b);
    }
}
