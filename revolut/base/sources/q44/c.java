package q44;

import c84.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import da8.l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rp0.f1;
import s44.i;
import s44.j;
import s44.k;
import t44.g;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b f242059b;

    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar, int i) {
        this.f242058a = i;
        this.f242059b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f242058a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar = this.f242059b;
                h.t2(bVar, bVar.f66980s, CreditAddressV2FlowContract$Step.Address.f66974a, false, null, false, 12);
                return Boolean.TRUE;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar2 = this.f242059b;
                qki.d dVar = bVar2.f66979r;
                k it8 = (k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Continuation continuation = null;
                if (it8 instanceof j) {
                    bVar2.H2(dVar, new q03.h(it8, 21));
                    h.u2(bVar2, bVar2.f66980s, CreditAddressV2FlowContract$Step.AddressSearch.f66975a, null, 6);
                } else if (it8 instanceof i) {
                    List list = ((i) it8).f259758a;
                    bVar2.H2(dVar, new q2j.j(list, 2));
                    bVar2.l2(new f(bVar2, list, continuation, 1), new yi5.b(26));
                } else {
                    if (!(it8 instanceof s44.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t.J2(bVar2, false, null, null, 7);
                }
                return Unit.f186387a;
            case 2:
                AddressFlowContract$OutputData outputData = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar3 = this.f242059b;
                bVar3.H2(bVar3.f66979r, new l(outputData, 4));
                bVar3.X1(new mii.k("id_address_added", new TextLocalisedClause(R$string.credit_application_address_v2_toast_address_added, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 12));
                yki.i iVar = bVar3.f66980s;
                h.r2(iVar);
                h.t2(bVar3, iVar, CreditAddressV2FlowContract$Step.Address.f66974a, false, null, false, 12);
                return Unit.f186387a;
            default:
                t44.i it9 = (t44.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                boolean z = it9 instanceof t44.h;
                Continuation continuation2 = null;
                com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar4 = this.f242059b;
                if (z) {
                    bVar4.l2(new f(bVar4, ((t44.h) it9).f267882a, continuation2, 0), new yi5.b(26));
                } else {
                    if (!(it9 instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t.J2(bVar4, false, null, null, 7);
                }
                return Unit.f186387a;
        }
    }
}
