package clm;

import efm.e0;
import efm.g0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import skm.d0;
import skm.p0;
import skm.x;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements efm.e, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f25074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gim.i f25075b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i(CoroutineContext coroutineContext, Function2 function2, int i) {
        this.f25074a = coroutineContext;
        this.f25075b = (gim.i) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // efm.e
    public void d(pfm.g gVar) {
        CoroutineContext coroutineContextA = x.a(kotlin.coroutines.g.f186406a, this.f25074a, true);
        elm.g gVar2 = p0.f264002b;
        if (coroutineContextA != gVar2 && coroutineContextA.get(kotlin.coroutines.d.q1) == null) {
            coroutineContextA = coroutineContextA.plus(gVar2);
        }
        h hVar = new h(coroutineContextA, gVar, 0);
        lfm.d.d(gVar, new lfm.b(new g(hVar)));
        hVar.j0(d0.DEFAULT, hVar, this.f25075b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // efm.g0
    public void subscribe(e0 e0Var) {
        CoroutineContext coroutineContextA = x.a(kotlin.coroutines.g.f186406a, this.f25074a, true);
        elm.g gVar = p0.f264002b;
        if (coroutineContextA != gVar && coroutineContextA.get(kotlin.coroutines.d.q1) == null) {
            coroutineContextA = coroutineContextA.plus(gVar);
        }
        ufm.a aVar = (ufm.a) e0Var;
        h hVar = new h(coroutineContextA, aVar, 1);
        lfm.d.d(aVar, new lfm.b(new g(hVar)));
        hVar.j0(d0.DEFAULT, hVar, this.f25075b);
    }
}
