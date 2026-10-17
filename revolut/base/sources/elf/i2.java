package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class i2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127350w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, gim.c cVar) {
        super(cVar);
        this.v = j2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127350w |= Integer.MIN_VALUE;
        return this.v.Z2(this);
    }
}
