package ym3;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zm3.a f314848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f314849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f314850y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f314850y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314849x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f314850y.a(null, null, this);
    }
}
