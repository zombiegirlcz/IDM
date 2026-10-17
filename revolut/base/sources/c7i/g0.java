package c7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.i implements Function3 {
    public AccountWrapper A;
    public AccountWrapper B;
    public long C;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f22005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c f22006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f22007y;
    public f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature_move_money.impl.automation.screen.c cVar, Continuation continuation) {
        super(3, continuation);
        this.f22006x = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g0 g0Var = new g0(this.f22006x, (Continuation) obj4);
        g0Var.v = (FlowCollector) obj2;
        g0Var.f22005w = obj3;
        return g0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0146, code lost:
    
        if (vkm.q.u(r10, r2, r20) != r1) goto L50;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7i.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
