package no;

/* JADX INFO: loaded from: classes17.dex */
public final class v extends gim.c {
    public fo.i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f217852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f217853x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, gim.c cVar) {
        super(cVar);
        this.f217852w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f217853x |= Integer.MIN_VALUE;
        return z.a(this.f217852w, null, this);
    }
}
