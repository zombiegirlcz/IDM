package g3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.common.RemittanceRoutesException;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o3k.g;
import z1k.e;
import z1k.o;
import z1k.p;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RemittanceRouteId f140302b;

    public /* synthetic */ b(RemittanceRouteId remittanceRouteId, int i) {
        this.f140301a = i;
        this.f140302b = remittanceRouteId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f140301a) {
            case 0:
                List corridors = (List) obj2;
                Intrinsics.checkNotNullParameter(corridors, "corridors");
                Iterator it8 = corridors.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(com.revolut.retail.feature.payments.bank_transfer.api.domain.model.a.b(((e) next).getId()), com.revolut.retail.feature.payments.bank_transfer.api.domain.model.a.b(this.f140302b))) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (e) next;
            case 1:
                RemittanceTransferData updateTransferData = (RemittanceTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return RemittanceTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, this.f140302b, null, null, 7679);
            default:
                p routes = (p) obj2;
                Intrinsics.checkNotNullParameter(routes, "routes");
                RemittanceRouteId remittanceRouteId = this.f140302b;
                o oVarB = remittanceRouteId != null ? e3k.a.b(routes, remittanceRouteId) : null;
                if (oVarB != null) {
                    return new e3k.b(routes, oVarB);
                }
                if (routes.d.isEmpty()) {
                    return new e3k.c(RemittanceRoutesException.NoRoutesAvailable.f101991a);
                }
                o oVarB2 = e3k.a.b(routes, RemittanceRouteId.Internal.f101916b);
                if (oVarB2 == null) {
                    Intrinsics.checkNotNullParameter(routes, "<this>");
                    oVarB2 = (o) d0.b0(routes.d);
                }
                return new e3k.b(routes, oVarB2);
        }
    }

    public /* synthetic */ b(RemittanceRouteId remittanceRouteId, g gVar) {
        this.f140301a = 2;
        this.f140302b = remittanceRouteId;
    }
}
