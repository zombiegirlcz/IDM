package e4k;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f122606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f122607x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f122608y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f122606w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122606w.emit(null, this);
    }
}
