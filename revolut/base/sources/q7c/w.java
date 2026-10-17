package q7c;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.c {
    public kwg.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f242841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242842x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f242841w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242842x |= Integer.MIN_VALUE;
        return this.f242841w.d(null, null, null, null, null, this);
    }
}
