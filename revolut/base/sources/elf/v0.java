package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.c {
    public w0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f127420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127421x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.f127420w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127421x |= Integer.MIN_VALUE;
        return this.f127420w.Z2(null, this);
    }
}
