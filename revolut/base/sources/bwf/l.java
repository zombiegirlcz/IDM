package bwf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public boolean A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f19338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f19339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19340y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Continuation continuation) {
        super(continuation);
        this.f19338w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19338w.emit(null, this);
    }
}
