package md9;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f204538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f204539x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f204538w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f204539x |= Integer.MIN_VALUE;
        return l.I2(this.f204538w, null, false, this);
    }
}
