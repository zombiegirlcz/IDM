package qe4;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f245066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.v = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f245066w |= Integer.MIN_VALUE;
        return this.v.d3(this);
    }
}
