package k2j;

import h30.q;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ q B;
    public int C;
    public j1j.d u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f180606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f180607x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180608y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, gim.c cVar) {
        super(cVar);
        this.B = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.x0(null, null, false, null, this);
    }
}
