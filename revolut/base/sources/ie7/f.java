package ie7;

import hd.r;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f160663w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f160663w |= Integer.MIN_VALUE;
        return r.h(this.v, null, this);
    }
}
