package vge;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.c {
    public int A;
    public List u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f288969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f288971y;
    public final /* synthetic */ q0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.z = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288971y = obj2;
        this.A |= Integer.MIN_VALUE;
        return q0.a(this.z, null, null, null, this);
    }
}
