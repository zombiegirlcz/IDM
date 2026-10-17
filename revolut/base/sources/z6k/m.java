package z6k;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yed.f0 f319797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f319798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f319799y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yed.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f319797w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319797w.emit(null, this);
    }
}
