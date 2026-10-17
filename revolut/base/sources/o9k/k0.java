package o9k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f223329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zm3.a f223330c;

    public /* synthetic */ k0(t0 t0Var, zm3.a aVar, int i) {
        this.f223328a = i;
        this.f223329b = t0Var;
        this.f223330c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f223328a) {
            case 0:
                MoneyRequest request = (MoneyRequest) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return new pfm.z(((wl3.h) this.f223329b.f223361b).i(zhm.u.c(hx7.q.E(this.f223330c))), 0, new nc0.a(request, 7), null);
            default:
                PeerToPeerTransferDescriptor.Link descriptor = (PeerToPeerTransferDescriptor.Link) obj2;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return ((wl3.h) this.f223329b.f223361b).i(zhm.u.c(hx7.q.E(this.f223330c))).D(descriptor);
        }
    }
}
