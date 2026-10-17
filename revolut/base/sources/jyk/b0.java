package jyk;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f179459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f179459w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179460x |= Integer.MIN_VALUE;
        return this.f179459w.e(null, this);
    }
}
