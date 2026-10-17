package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v1 f127412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127413x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, gim.c cVar) {
        super(cVar);
        this.f127412w = v1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127413x |= Integer.MIN_VALUE;
        return this.f127412w.Z2(null, null, this);
    }
}
