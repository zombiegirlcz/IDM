package b6d;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public e6d.r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f12714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12715y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, gim.c cVar) {
        super(cVar);
        this.f12714x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12713w = obj2;
        this.f12715y |= Integer.MIN_VALUE;
        return this.f12714x.d(null, 0, this);
    }
}
