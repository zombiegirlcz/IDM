package qt1;

import com.revolut.feature.apm.core.models.recipients.BizumContact;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public BizumContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b f248924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.f248924w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f248925x |= Integer.MIN_VALUE;
        return this.f248924w.h3(null, null, this);
    }
}
