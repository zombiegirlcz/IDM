package pjl;

import android.accounts.Account;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 extends gim.c {
    public final /* synthetic */ z0 A;
    public int B;
    public Account u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236841y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.A = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return z0.b(this.A, null, this);
    }
}
