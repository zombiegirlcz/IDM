package hy3;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f156723w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f156723w |= Integer.MIN_VALUE;
        return j.b(this.v, null, this);
    }
}
