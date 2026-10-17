package x97;

import h93.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public f0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f303586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f303587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f303586w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f303587x |= Integer.MIN_VALUE;
        return this.f303586w.l(null, null, this);
    }
}
