package gld;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f144681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f144682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, Continuation continuation) {
        super(continuation);
        this.f144681w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144681w.emit(null, this);
    }
}
