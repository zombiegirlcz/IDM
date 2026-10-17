package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class h7 extends gim.c {
    public nof.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i7 f184725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184726x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(i7 i7Var, gim.c cVar) {
        super(cVar);
        this.f184725w = i7Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184726x |= Integer.MIN_VALUE;
        return this.f184725w.b3(null, this);
    }
}
