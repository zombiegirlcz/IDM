package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class i2 extends gim.c {
    public final /* synthetic */ j2 A;
    public int B;
    public j2 u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k2 f290044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Job f290045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f290046y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, Continuation continuation) {
        super(continuation);
        this.A = j2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.collect(null, this);
    }
}
