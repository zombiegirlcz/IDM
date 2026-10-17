package xkl;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f306865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f306866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306867y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, gim.c cVar) {
        super(cVar);
        this.f306866x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306865w = obj2;
        this.f306867y |= Integer.MIN_VALUE;
        return this.f306866x.c3(null, null, null, this);
    }
}
