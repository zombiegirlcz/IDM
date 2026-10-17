package xq3;

import ft3.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public d1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f308070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f308071x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.f308070w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f308071x |= Integer.MIN_VALUE;
        return this.f308070w.b(null, null, this);
    }
}
