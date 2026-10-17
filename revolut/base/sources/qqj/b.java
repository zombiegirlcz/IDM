package qqj;

import kotlinx.coroutines.flow.FlowCollector;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ h B;
    public int C;
    public FlowCollector u;
    public Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f248554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Response f248555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f248556y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, gim.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return h.a(this.B, null, null, 0L, null, false, this);
    }
}
