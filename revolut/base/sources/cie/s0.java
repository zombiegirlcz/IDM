package cie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f24519w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s0 s0Var = new s0(0, this.f24519w, continuation);
                s0Var.v = ((Number) obj2).intValue();
                return s0Var;
            case 1:
                return new s0(1, this.f24519w, continuation);
            case 2:
                return new s0(2, this.f24519w, continuation);
            default:
                return new s0(3, this.f24519w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                break;
        }
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24519w;
        switch (i) {
            case 0:
                int i3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new a5g.i(i3, 9));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    hl2.a aVar3 = dVar.f89699a0;
                    this.v = 1;
                    x4l.c cVar = ((nl2.c) aVar3).f216987a.e;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, false, this);
                    if (objD != aVar2) {
                        objD = obj3;
                    }
                    if (objD == aVar2) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    y0 y0Var = new y0(i2, dVar, null);
                    skm.p0 p0Var = skm.p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    this.v = 1;
                    if (skm.e0.J(fVar, y0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    ahe.t tVar = (ahe.t) dVar.f89701d0.get();
                    this.v = 1;
                    if (((ahe.w0) tVar).e(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
