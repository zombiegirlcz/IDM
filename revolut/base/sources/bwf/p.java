package bwf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f19344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f19345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19346y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, Continuation continuation) {
        super(continuation);
        this.f19344w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19344w.emit(null, this);
    }
}
