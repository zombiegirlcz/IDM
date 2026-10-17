package no;

import com.google.protobuf.h3;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends gim.c {
    public int A;
    public String u;
    public h3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k50.b2 f217784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.c f217785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f217786y;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.analytics.tracking.v3.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f217786y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, this);
    }
}
