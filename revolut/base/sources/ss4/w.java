package ss4;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public int A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f265301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f265302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f265303y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f265301w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265301w.emit(null, this);
    }
}
