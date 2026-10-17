package wha;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f297469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f297470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f297471y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, Continuation continuation) {
        super(continuation);
        this.f297469w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f297469w.emit(null, this);
    }
}
