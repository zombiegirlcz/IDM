package gld;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f144657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f144658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, Continuation continuation) {
        super(continuation);
        this.f144657w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144657w.emit(null, this);
    }
}
