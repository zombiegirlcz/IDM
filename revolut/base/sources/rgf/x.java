package rgf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f254179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f254180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f254181y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f254179w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254179w.emit(null, this);
    }
}
