package gld;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f144686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f144687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144688y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h hVar, Continuation continuation) {
        super(continuation);
        this.f144686w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144686w.emit(null, this);
    }
}
