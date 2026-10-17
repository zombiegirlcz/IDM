package vge;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes8.dex */
public final class r2 extends gim.c {
    public int A;
    public vkm.z1 u;
    public ReentrantReadWriteLock.ReadLock v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ReentrantReadWriteLock.WriteLock f288990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f288992y;
    public final /* synthetic */ t2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, gim.c cVar) {
        super(cVar);
        this.z = t2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288992y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.p(null, null, null, null, this);
    }
}
