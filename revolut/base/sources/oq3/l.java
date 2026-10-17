package oq3;

import ft3.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public jf0.c u;
    public q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f227720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f227720x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227719w = obj2;
        this.f227721y |= Integer.MIN_VALUE;
        return this.f227720x.j(null, null, null, this);
    }
}
