package opf;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends gim.c {
    public ne0.j u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k7i.i f227613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227614y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.f227613x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227612w = obj2;
        this.f227614y |= Integer.MIN_VALUE;
        return this.f227613x.j(null, this);
    }
}
