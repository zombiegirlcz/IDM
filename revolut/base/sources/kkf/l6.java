package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class l6 extends gim.c {
    public m6 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m6 f184809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184810x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, gim.c cVar) {
        super(cVar);
        this.f184809w = m6Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184810x |= Integer.MIN_VALUE;
        return this.f184809w.b3(this);
    }
}
