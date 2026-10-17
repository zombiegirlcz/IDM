package okf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f226012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f226013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226014y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f226012w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226012w.emit(null, this);
    }
}
