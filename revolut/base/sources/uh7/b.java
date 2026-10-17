package uh7;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public c u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f280104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280105y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f280104x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280103w = obj2;
        this.f280105y |= Integer.MIN_VALUE;
        return this.f280104x.i(null, null, this);
    }
}
