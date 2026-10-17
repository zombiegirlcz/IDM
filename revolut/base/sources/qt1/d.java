package qt1;

import com.revolut.feature.apm.core.models.bizum.BizumTransferInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public BizumTransferInfo u;
    public k71.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f248915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b f248916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f248917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.f248916x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f248915w = obj2;
        this.f248917y |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.b3(this.f248916x, null, null, this);
    }
}
