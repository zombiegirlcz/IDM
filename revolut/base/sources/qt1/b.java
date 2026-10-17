package qt1;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public TransferTrustData u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f248910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b f248911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f248912y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.f248911x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f248910w = obj2;
        this.f248912y |= Integer.MIN_VALUE;
        return this.f248911x.e3(null, this);
    }
}
