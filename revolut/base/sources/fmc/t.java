package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f136359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136360x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.f136359w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136360x |= Integer.MIN_VALUE;
        return this.f136359w.c(null, this);
    }
}
