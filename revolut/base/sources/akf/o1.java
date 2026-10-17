package akf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ s1 B;
    public int C;
    public a3 u;
    public n38.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s1 f5872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5874y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, gim.c cVar) {
        super(cVar);
        this.B = s1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b3(null, this);
    }
}
