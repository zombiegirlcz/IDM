package i23;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public do3.n u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f157807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f157808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f157809y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f157808x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f157807w = obj2;
        this.f157809y |= Integer.MIN_VALUE;
        return d.a(this.f157808x, null, false, this);
    }
}
