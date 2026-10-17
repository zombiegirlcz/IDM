package hw3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f156068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f156069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f156070y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, boolean z3, boolean z4, i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f156068w = z3;
        this.f156069x = z4;
        this.f156070y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, this.f156068w, this.f156069x, this.f156070y, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = this.v;
        int i = 2;
        Continuation continuation = null;
        i iVar = this.f156070y;
        if (z) {
            p0 p0Var = p0.f264001a;
            skm.e0.C(coroutineScope, elm.f.f127540b, null, new g(iVar, continuation, 0), 2);
        }
        if (this.f156068w) {
            p0 p0Var2 = p0.f264001a;
            skm.e0.C(coroutineScope, elm.f.f127540b, null, new g(iVar, continuation, 1), 2);
        }
        if (this.f156069x) {
            p0 p0Var3 = p0.f264001a;
            skm.e0.C(coroutineScope, elm.f.f127540b, null, new g(iVar, continuation, i), 2);
        }
        for (ll4.c cVar : ll4.c.a()) {
            p0 p0Var4 = p0.f264001a;
            skm.e0.C(coroutineScope, elm.f.f127540b, null, new hul.f0(iVar, cVar, continuation, 5), 2);
        }
        return Unit.f186387a;
    }
}
