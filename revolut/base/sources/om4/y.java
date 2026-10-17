package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f226754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226755x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f226754w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226755x |= Integer.MIN_VALUE;
        return this.f226754w.b(null, this);
    }
}
