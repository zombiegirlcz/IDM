package xq3;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f308095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f308096x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f308095w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f308096x |= Integer.MIN_VALUE;
        return this.f308095w.c(null, null, this);
    }
}
