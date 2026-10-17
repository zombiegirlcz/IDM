package o8c;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f222995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, gim.c cVar) {
        super(cVar);
        this.f222995w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f222996x |= Integer.MIN_VALUE;
        return this.f222995w.b3(null, this);
    }
}
