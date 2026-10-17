package ekf;

import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public a3 u;
    public m1l.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t3 f127064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f127065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f127066y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f127066y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127065x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f127066y.e3(null, null, this);
    }
}
