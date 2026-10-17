package ekf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.c {
    public a3 u;
    public kotlin.jvm.internal.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f127145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127146y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f127145x = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127144w = obj2;
        this.f127146y |= Integer.MIN_VALUE;
        return this.f127145x.c3(null, null, this);
    }
}
