package zkf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import xkf.b2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f322966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f322967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f322968y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f322966w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f322966w.emit(null, this);
    }
}
