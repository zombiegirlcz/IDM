package gsh;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ n B;
    public int C;
    public List u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f146482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146484y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, gim.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(null, this);
    }
}
