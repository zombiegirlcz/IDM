package jyk;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f179494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179495x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, gim.c cVar) {
        super(cVar);
        this.f179494w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179495x |= Integer.MIN_VALUE;
        return this.f179494w.e(null, this);
    }
}
