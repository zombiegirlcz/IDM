package i52;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f158564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f158565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ApmQuote f158566y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(continuation);
        this.f158564w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158564w.emit(null, this);
    }
}
