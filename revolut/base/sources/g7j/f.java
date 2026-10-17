package g7j;

import fmc.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f141209w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f141209w |= Integer.MIN_VALUE;
        return this.v.n(null, this);
    }
}
