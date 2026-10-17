package z9m;

import cam.t;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public k u;
    public t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f320531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f320532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f320533y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f320533y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320532x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f320533y.b(this);
    }
}
