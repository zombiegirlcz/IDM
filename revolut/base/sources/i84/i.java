package i84;

import cli.y;
import cv3.t;
import cv3.u;
import g84.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f159441w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f159441w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f159441w, continuation, 0);
            default:
                return new i(this.f159441w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                j jVar = this.f159441w;
                y yVar = jVar.f159443q;
                g84.e eVar = jVar.o;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    t tVar = u.Companion;
                    String str = ((e) ((j2) yVar.f22677a).getValue()).f159435a.f219209h;
                    Integer num = new Integer(((e) ((j2) yVar.f22677a).getValue()).f159435a.f219207c);
                    tVar.getClass();
                    u uVarB = t.b(num, str);
                    this.v = 1;
                    if (((m) eVar).g(null, uVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                z1 z1Var = ((m) eVar).e;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                jVar.B2();
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar2 = this.f159441w;
                    i iVar = new i(jVar2, null, 0);
                    this.v = 1;
                    if (jVar2.p2(this, iVar) == aVar2) {
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
}
