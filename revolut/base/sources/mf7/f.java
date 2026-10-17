package mf7;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public q06.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f204957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f204958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f204957w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f204958x |= Integer.MIN_VALUE;
        return this.f204957w.e(null, this);
    }
}
