package po9;

import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f237911a;

    public c(e eVar) {
        this.f237911a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar = this.f237911a.f237913a;
        if (Intrinsics.f(str, bVar.c3().f310974a)) {
            Object obj3 = i3Var.f54273a.f52053j;
            s parcel = obj3 instanceof s ? (s) obj3 : null;
            if (parcel == null) {
                return Unit.f186387a;
            }
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            bVar.A2(u0.c(new TransactionsFeatureConfig.Details(new k71.d(parcel.f237932a, parcel.f237933b), null, null, null, 126)));
        }
        return Unit.f186387a;
    }
}
