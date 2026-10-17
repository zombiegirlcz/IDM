package z8h;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import r10.r;
import w4l.k;
import yhm.o;
import z8g.q;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f320134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f320135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n9l.b f320136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, String str, k kVar, n9l.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f320134w = str;
        this.f320135x = kVar;
        this.f320136y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f320134w, this.f320135x, this.f320136y, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar = (xi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = this.v;
        r rVar = gVar.f320144a;
        String str = this.f320134w;
        k kVar = this.f320135x;
        n9l.b bVar2 = this.f320136y;
        return nim.a.v(u0.m(nim.a.A(rd0.e.n(rVar.v(str, kVar, bVar2, bVar), h0.f322473a), new b(2)), wzg.a.c(gVar.f320145b, str, bVar2, kVar)), new q(gVar, bVar, 2));
    }
}
