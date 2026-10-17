package ed0;

import com.revolut.feature.backend_flow.domain.models.ExternalValidation;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public ExternalValidation u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f124907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f124908x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f124907w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f124908x |= Integer.MIN_VALUE;
        return this.f124907w.a(null, null, null, this);
    }
}
