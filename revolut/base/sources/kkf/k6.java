package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class k6 extends gim.c {
    public m6 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m6 f184792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184793x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(m6 m6Var, gim.c cVar) {
        super(cVar);
        this.f184792w = m6Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184793x |= Integer.MIN_VALUE;
        return this.f184792w.Z2(this);
    }
}
