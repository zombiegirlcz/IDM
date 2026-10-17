package qt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public BizumTransferReviewInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b f248921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248922x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.f248921w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f248922x |= Integer.MIN_VALUE;
        return this.f248921w.g3(null, this);
    }
}
