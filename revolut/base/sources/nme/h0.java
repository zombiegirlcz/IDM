package nme;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f f217301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f217301w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0(0, this.f217301w, continuation);
            case 1:
                return new h0(1, this.f217301w, continuation);
            case 2:
                return new h0(2, this.f217301w, continuation);
            default:
                return new h0(3, this.f217301w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    web.b bVar = this.f217301w.Y;
                    this.v = 1;
                    x4l.c cVar = ((efb.g) bVar).f125309a.e;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, true, this);
                    if (objD != aVar) {
                        objD = obj3;
                    }
                    if (objD == aVar) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u29.m mVar = this.f217301w.f89946p;
                    this.v = 1;
                    Object objO = vkm.q.o(mo3.a.g(vkm.q.q(f39.c.b(mVar.f)), null, null, 3), new tqh.j(mVar, null, 29), this);
                    if (objO != obj4) {
                        objO = Unit.f186387a;
                    }
                    if (objO == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarG = ((jxb.l) this.f217301w.J.f220800a).f179127g.g(Unit.f186387a, false);
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    nyb.i0 i0Var = this.f217301w.C;
                    m1c.o0 o0Var = m1c.o0.ACTIVATION;
                    efm.d0 d0VarE = i0Var.f220798a.e();
                    nyb.h0 h0Var = new nyb.h0(0, new nyb.g0(i0Var, o0Var, 1));
                    d0VarE.getClass();
                    pfm.a aVar4 = new pfm.a(d0VarE, h0Var, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
