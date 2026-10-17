package vgc;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f288825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f288826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f288825w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288825w.emit(null, this);
    }
}
