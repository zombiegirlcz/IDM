package ll7;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f196657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f196658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f196657x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f196656w = obj2;
        this.f196658y |= Integer.MIN_VALUE;
        return this.f196657x.a(this, null, false);
    }
}
