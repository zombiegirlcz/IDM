package kk8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ jx0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184501w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jx0.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184501w |= Integer.MIN_VALUE;
        return this.v.m(this);
    }
}
