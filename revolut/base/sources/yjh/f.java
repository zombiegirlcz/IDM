package yjh;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f314469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f314469w |= Integer.MIN_VALUE;
        return this.v.c3(this);
    }
}
