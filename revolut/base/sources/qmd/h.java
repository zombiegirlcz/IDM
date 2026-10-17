package qmd;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f247814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f247815x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f247814w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f247815x |= Integer.MIN_VALUE;
        return this.f247814w.a(null, this);
    }
}
