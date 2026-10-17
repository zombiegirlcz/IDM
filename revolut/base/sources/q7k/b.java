package q7k;

import com.revolut.retail.feature.payments.payment_links.impl.data.TransferLinkService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f242871a;

    public b(c cVar) {
        this.f242871a = cVar;
    }

    @Override // phm.a
    public final Object get() {
        nj0.a aVar = this.f242871a.d;
        ek.a converterFactory = ((nj0.d) aVar).d();
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TransferLinkService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TransferLinkService transferLinkService = (TransferLinkService) objCreate;
        s.k(transferLinkService);
        return transferLinkService;
    }
}
