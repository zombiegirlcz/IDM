package ova;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.recurringbuys.api.navigation.RecurringPaymentsHistoryDestination;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$InputData;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryController;
import de6.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f230011a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RecurringPaymentsHistoryDestination)) {
            return null;
        }
        RecurringPaymentsHistoryDestination recurringPaymentsHistoryDestination = (RecurringPaymentsHistoryDestination) destination;
        PaymentHistoryController paymentHistoryController = new PaymentHistoryController(new PaymentHistoryContract$InputData(recurringPaymentsHistoryDestination.f81660b, recurringPaymentsHistoryDestination.f81661c, recurringPaymentsHistoryDestination.f81659a));
        b block = new b(flowModel, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        paymentHistoryController.H = block;
        return paymentHistoryController;
    }
}
