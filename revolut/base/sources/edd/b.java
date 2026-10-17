package edd;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f124976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f124977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f124976w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f124977x |= Integer.MIN_VALUE;
        return this.f124976w.b(null, null, false, this);
    }
}
