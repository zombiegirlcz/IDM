package sr8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public mr8.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f265138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f265139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f265138w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f265139x |= Integer.MIN_VALUE;
        return this.f265138w.h(null, this);
    }
}
