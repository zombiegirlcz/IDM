package qpd;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3 f248365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f248366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar, a3 a3Var, vh vhVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f248365w = a3Var;
        this.f248366x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f248365w, this.f248366x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        ujf.h hVar = this.v.f87709s;
        String str = this.f248366x.f54883a.f53505a;
        this.u = 1;
        Object objD = hVar.d(this.f248365w, str, this);
        return objD == aVar ? aVar : objD;
    }
}
