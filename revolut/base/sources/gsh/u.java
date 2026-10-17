package gsh;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.c {
    public final /* synthetic */ a0 A;
    public int B;
    public List u;
    public a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f146518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.c f146519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146520y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.A = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(this, null, null);
    }
}
