package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f290124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f290125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290126y;
    public Ref$BooleanRef z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Continuation continuation) {
        super(continuation);
        this.f290124w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290124w.collect(null, this);
    }
}
