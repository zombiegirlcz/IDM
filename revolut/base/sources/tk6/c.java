package tk6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f271889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f271890x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f271889w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f271890x |= Integer.MIN_VALUE;
        return this.f271889w.c(null, this);
    }
}
