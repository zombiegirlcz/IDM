package k1a;

import fnc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f180187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180188x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, gim.c cVar) {
        super(cVar);
        this.f180187w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180188x |= Integer.MIN_VALUE;
        return this.f180187w.f(null, this);
    }
}
