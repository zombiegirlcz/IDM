package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class r5 extends gim.c {
    public t5 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t5 f184917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t5 t5Var, gim.c cVar) {
        super(cVar);
        this.f184917w = t5Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184918x |= Integer.MIN_VALUE;
        return this.f184917w.b3(false, this);
    }
}
