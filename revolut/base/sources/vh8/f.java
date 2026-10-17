package vh8;

import hd.r;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289346w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289346w |= Integer.MIN_VALUE;
        return this.v.z(this);
    }
}
