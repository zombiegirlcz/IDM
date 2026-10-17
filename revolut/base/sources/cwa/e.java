package cwa;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f109583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109584y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gim.c cVar) {
        super(cVar);
        this.f109583x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109582w = obj2;
        this.f109584y |= Integer.MIN_VALUE;
        return this.f109583x.d(this);
    }
}
