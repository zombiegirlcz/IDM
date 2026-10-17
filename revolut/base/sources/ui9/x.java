package ui9;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f280357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f280358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, Continuation continuation) {
        super(continuation);
        this.f280357w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280357w.emit(null, this);
    }
}
