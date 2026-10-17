package zhf;

import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;
import tof.i7;
import vkm.j2;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f322402a;

    public a(c cVar) {
        this.f322402a = cVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        String str = ((i3) obj2).f54273a.f52049b;
        g gVar = this.f322402a.f322404a;
        if (!Intrinsics.f(str, gVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        k kVar = (k) ((j2) gVar.d3().f22677a).getValue();
        if (kVar instanceof j) {
            a3 transaction = ((j) kVar).f322420b;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            if (gVar.o.a()) {
                n.P2(gVar, gVar.o2(new rhf.e(transaction, (i7) null, (TransactionContext) null, "", 16)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
            } else {
                gVar.A2(u0.c(new TransactionsFeatureConfig.Details(new k71.c(transaction.f272581b), null, null, null, 126)));
            }
        }
        return Unit.f186387a;
    }
}
