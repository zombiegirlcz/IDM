package wf0;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f296944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f296945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f296946y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f296944w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296944w.emit(null, this);
    }
}
