package znd;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3 f323799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f323800x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, a3 a3Var, vh vhVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f323799w = a3Var;
        this.f323800x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w0(this.v, this.f323799w, this.f323800x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        ujf.h hVar = this.v.M;
        String str = this.f323800x.f54883a.f53505a;
        this.u = 1;
        Object objD = hVar.d(this.f323799w, str, this);
        return objD == aVar ? aVar : objD;
    }
}
