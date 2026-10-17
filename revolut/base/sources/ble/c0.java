package ble;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f16561w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(0, this.f16561w, continuation);
            case 1:
                return new c0(1, this.f16561w, continuation);
            case 2:
                return new c0(2, this.f16561w, continuation);
            case 3:
                return new c0(3, this.f16561w, continuation);
            default:
                return new c0(4, this.f16561w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    eih.a aVar = this.f16561w.R;
                    this.v = 1;
                    jlh.o oVar = (jlh.o) ((djh.d) aVar).d;
                    Object objX = vkm.q.x(mo3.a.e(c8g.a.D(nim.a.u(new jec.p(oVar, null, 15), ((ulh.n) oVar.f175787a).a())), new jfb.v0(23), new jfb.v0(24)), this);
                    if (objX != obj3) {
                        objX = Unit.f186387a;
                    }
                    if (objX != obj3) {
                        objX = Unit.f186387a;
                    }
                    if (objX == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y2f.a aVar3 = this.f16561w.c0;
                    this.v = 1;
                    if (((d4f.p) aVar3).d(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    y2f.a aVar5 = this.f16561w.c0;
                    this.v = 1;
                    if (((d4f.p) aVar5).h(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    c cVar = this.f16561w.C;
                    this.v = 1;
                    z1 z1Var = cVar.f16559a;
                    Object obj4 = Unit.f186387a;
                    Object objEmit = z1Var.emit(obj4, this);
                    if (objEmit == aVar6) {
                        obj4 = objEmit;
                    }
                    if (obj4 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    hle.a aVar7 = this.f16561w.W;
                    this.v = 1;
                    Object objZ = vkm.q.z(zi0.c.w(boh.f.e(zh9.u0.m(nim.a.v(aVar7.f153451b.j(w4l.h.f294642c), new hhd.n(24)), ybl.k.k(aVar7.f153450a, w4l.j.f294644c, cfl.f.f23741a, null, 4)), new hg4.a(aVar7, 15))), this);
                    if (objZ != obj5) {
                        objZ = Unit.f186387a;
                    }
                    if (objZ == obj5) {
                        return obj5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
