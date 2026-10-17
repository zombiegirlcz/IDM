package hma;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public rla.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f153588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f153589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f153590y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f153589x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f153588w = obj2;
        this.f153590y |= Integer.MIN_VALUE;
        return this.f153589x.c(this);
    }
}
