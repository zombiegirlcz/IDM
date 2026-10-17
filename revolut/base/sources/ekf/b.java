package ekf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public m1l.a u;
    public a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f127046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f127046x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127045w = obj2;
        this.f127047y |= Integer.MIN_VALUE;
        return this.f127046x.c3(null, this);
    }
}
