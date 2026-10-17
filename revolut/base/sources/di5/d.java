package di5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f114920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114921x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f114920w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114921x |= Integer.MIN_VALUE;
        return this.f114920w.e(null, this);
    }
}
