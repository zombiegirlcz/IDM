package jl8;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zq.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f175650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f175650w |= Integer.MIN_VALUE;
        return this.v.w(this);
    }
}
