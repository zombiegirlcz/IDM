package o65;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f222512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f222513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f222514y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f222512w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f222512w.emit(null, this);
    }
}
