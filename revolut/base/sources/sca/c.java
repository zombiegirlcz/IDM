package sca;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f261692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f261692w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261693x |= Integer.MIN_VALUE;
        return this.f261692w.c(null, this);
    }
}
