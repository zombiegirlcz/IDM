package ayf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f11171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f11172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, Continuation continuation) {
        super(continuation);
        this.f11171w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11171w.emit(null, this);
    }
}
