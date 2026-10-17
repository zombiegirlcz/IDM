package xd2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f304227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f304228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f304229y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f304228x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f304227w = obj2;
        this.f304229y |= Integer.MIN_VALUE;
        return f.Z2(this.f304228x, null, this);
    }
}
