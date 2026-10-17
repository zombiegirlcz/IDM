package z6l;

import h93.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.c {
    public f0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f319821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f319822x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, gim.c cVar) {
        super(cVar);
        this.f319821w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f319822x |= Integer.MIN_VALUE;
        return this.f319821w.p(null, null, null, null, null, null, null, null, this);
    }
}
