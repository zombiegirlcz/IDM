package zmg;

import smd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f323507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f323507w |= Integer.MIN_VALUE;
        return this.v.S(this);
    }
}
