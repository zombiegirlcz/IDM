package rqk;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f256575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256576x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f256575w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256576x |= Integer.MIN_VALUE;
        return this.f256575w.e(null, this);
    }
}
