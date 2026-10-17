package jwc;

import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a f178971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LimitValue f178972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ OutboundTransactionLimit f178973y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar, LimitValue limitValue, OutboundTransactionLimit outboundTransactionLimit, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f178971w = aVar;
        this.f178972x = limitValue;
        this.f178973y = outboundTransactionLimit;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f178971w, this.f178972x, this.f178973y, continuation, 0);
            default:
                return new r(this.f178971w, this.f178972x, this.f178973y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jwc.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
