package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class r7 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s7 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, gim.c cVar) {
        super(cVar);
        this.v = s7Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184921w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
