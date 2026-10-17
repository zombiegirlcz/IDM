package wae;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import w3k.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends d9e.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xua.a f295869l;

    public d(xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f295869l = recurringPaymentInteractor;
    }

    @Override // d9e.a
    public final void Z2(t clickData) {
        String str;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f54722b.f51596l;
        Continuation continuation = null;
        p pVar = obj2 instanceof p ? (p) obj2 : null;
        if (pVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(clickData.f54722b.f51596l, "Expected parcel to be RecurringPayment but was: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        ActionWidgetDelegate.a aVar = clickData.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            T2(new c(this, pVar, null), new yi5.b(27));
            return;
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            T2(new i(this, pVar, continuation, 17), new yi5.b(27));
            return;
        }
        if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
            Unit unit = Unit.f186387a;
            return;
        }
        Set set = pVar.G;
        if (set != null && (str = (String) d0.c0(set)) != null) {
            A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), null, null, null, 122))));
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("transactionGroupId cannot be null");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
    }
}
