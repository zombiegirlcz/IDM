package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.c {
    public jof.g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f127418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127419x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, gim.c cVar) {
        super(cVar);
        this.f127418w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127419x |= Integer.MIN_VALUE;
        return this.f127418w.f3(null, this);
    }
}
