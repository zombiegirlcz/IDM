package f3d;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public dsh.f u;
    public dsh.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f131934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131935y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, gim.c cVar) {
        super(cVar);
        this.f131934x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131933w = obj2;
        this.f131935y |= Integer.MIN_VALUE;
        return this.f131934x.b(null, this);
    }
}
