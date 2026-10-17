package iuf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f168551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f168552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hrf.c f168553y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f168551w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f168551w.emit(null, this);
    }
}
