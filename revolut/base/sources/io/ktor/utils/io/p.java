package io.ktor.utils.io;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f163072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f163073x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f163072w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f163073x |= Integer.MIN_VALUE;
        return this.f163072w.d(false, this);
    }
}
