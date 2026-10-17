package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class o1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t38.e f290087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t38.e f290088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290089y;
    public Ref$ObjectRef z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t38.e eVar, Continuation continuation) {
        super(continuation);
        this.f290087w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290087w.collect(null, this);
    }
}
