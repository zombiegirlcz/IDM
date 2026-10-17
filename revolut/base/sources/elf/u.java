package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.c {
    public jof.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f127414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127415x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.f127414w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127415x |= Integer.MIN_VALUE;
        return this.f127414w.e3(null, this);
    }
}
