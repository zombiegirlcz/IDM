package zge;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ acb.h f322113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f322114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f322115y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(acb.h hVar, Continuation continuation) {
        super(continuation);
        this.f322113w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f322113w.emit(null, this);
    }
}
