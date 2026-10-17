package xdg;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public cgi.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f304442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304443x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f304442w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304443x |= Integer.MIN_VALUE;
        return this.f304442w.b3(null, null, this);
    }
}
