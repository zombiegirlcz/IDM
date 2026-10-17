package fq;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f137144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f137145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f137146y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f137144w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f137144w.emit(null, this);
    }
}
