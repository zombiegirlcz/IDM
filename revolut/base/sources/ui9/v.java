package ui9;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f280351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f280352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f280353y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Continuation continuation) {
        super(continuation);
        this.f280351w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280351w.emit(null, this);
    }
}
