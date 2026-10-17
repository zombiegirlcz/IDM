package y3f;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f310701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310702x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f310701w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310702x |= Integer.MIN_VALUE;
        return this.f310701w.b(0L, this);
    }
}
