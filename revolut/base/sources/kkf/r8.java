package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class r8 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(s8 s8Var, gim.c cVar) {
        super(cVar);
        this.v = s8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184922w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
