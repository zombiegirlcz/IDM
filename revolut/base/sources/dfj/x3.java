package dfj;

import java.time.Instant;

/* JADX INFO: loaded from: classes11.dex */
public final class x3 extends gim.c {
    public int A;
    public Instant u;
    public chj.k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dej.a3 f114153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f114154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f114155y;
    public final /* synthetic */ k4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.z = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114155y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, null, null, false, null, null, null, this);
    }
}
