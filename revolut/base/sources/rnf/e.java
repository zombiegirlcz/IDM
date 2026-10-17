package rnf;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ kgm.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255660w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kgm.i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255660w |= Integer.MIN_VALUE;
        return this.v.h(null, this);
    }
}
