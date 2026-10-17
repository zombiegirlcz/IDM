package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 extends gim.c {
    public int A;
    public z1 u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f290152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Job f290153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f290154y;
    public final /* synthetic */ z1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, Continuation continuation) {
        super(continuation);
        this.z = z1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290154y = obj2;
        this.A |= Integer.MIN_VALUE;
        return z1.m(this.z, null, this);
    }
}
