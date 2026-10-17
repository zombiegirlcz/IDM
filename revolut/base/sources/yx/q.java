package yx;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f317514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317514w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f317514w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f317514w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((dx.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((xv.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r rVar = this.f317514w;
        switch (i) {
            case 0:
                dx.q qVar = (dx.q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Iterable iterable = qVar.f120511a;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    rVar.C2(new k(qVar.f120512b.f120508a));
                } else {
                    Iterator it8 = iterable.iterator();
                    while (it8.hasNext()) {
                        if (!((xv.q) it8.next()).d()) {
                        }
                    }
                    rVar.C2(new k(qVar.f120512b.f120508a));
                }
                break;
            default:
                xv.a aVar2 = (xv.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.H2(rVar.f317516q, new ux.m(aVar2, 1));
                break;
        }
        return Unit.f186387a;
    }
}
