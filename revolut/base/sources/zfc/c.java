package zfc;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rd0.e;
import vfc.f;
import vkm.q;
import vkm.y;
import yhm.o;
import z6k.l;
import z8d.h;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f321921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f321921w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f321921w, continuation, 0);
            case 1:
                return new c(this.f321921w, continuation, 1);
            default:
                return new c(this.f321921w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                y yVarE = e.e(new vvh.e(mo3.a.g(this.f321921w.f321923b.a(), null, new h(13), 1), 18), h0.f322473a, new l(3, 2, null));
                this.v = 1;
                Object objX = q.x(yVarE, this);
                return objX == aVar ? aVar : objX;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    y yVarE2 = e.e(mo3.a.g(this.f321921w.b(w4l.h.f294642c), null, new h(14), 1), h0.f322473a, new l(3, 3, null));
                    this.v = 1;
                    obj2 = q.z(yVarE2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Boolean bool = (Boolean) obj2;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar = this.f321921w.f321923b;
                    this.v = 1;
                    x4l.c cVar = fVar.e;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, true, this);
                    if (objD == aVar3) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
