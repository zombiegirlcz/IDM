package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f136321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136322x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f136321w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136322x |= Integer.MIN_VALUE;
        return this.f136321w.a(null, this);
    }
}
