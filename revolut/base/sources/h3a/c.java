package h3a;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, gim.c cVar) {
        super(cVar);
        this.v = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149046w |= Integer.MIN_VALUE;
        return this.v.b(null, null, this);
    }
}
