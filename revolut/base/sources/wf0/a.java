package wf0;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f296862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f296863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f296864y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f296862w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296862w.emit(null, this);
    }
}
