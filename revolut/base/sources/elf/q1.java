package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, gim.c cVar) {
        super(cVar);
        this.v = s1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127399w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
