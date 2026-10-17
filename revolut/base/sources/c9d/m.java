package c9d;

import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.j0;
import nii.m0;
import nii.y0;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c f22362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f22363x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f22362w = cVar;
        this.f22363x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f22362w, this.f22363x, continuation, 0);
            default:
                return new m(this.f22362w, this.f22363x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar = this.f22362w;
                d9d.c cVar2 = cVar.f86336q;
                p pVar = cVar.f86342y;
                this.v = 1;
                Object objC = cVar2.c(this.f22363x, pVar, this);
                return objC == aVar ? aVar : objC;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar3 = this.f22362w;
                boolean z = true;
                if (i2 == 0) {
                    o.b(obj2);
                    m mVar = new m(cVar3, this.f22363x, continuation, 0);
                    this.v = 1;
                    obj2 = q.t(cVar3, mVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                m0 m0Var = (m0) obj2;
                if (m0Var instanceof j0) {
                    cVar3.n2(new af3.f(cVar3, z, continuation, 4), new whi.b(6));
                }
                return yji.l.a1(cVar3, cVar3.X1(new y0(null, m0Var, false, 5)), null, null, null, 7);
        }
    }
}
