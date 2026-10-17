package sc3;

import cc3.f;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.h;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlow;
import com.revolut.kompot.common.ModalDestination;
import d4f.s;
import j49.i;
import kl.t1;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qtb.o;
import rd0.e;
import s9b.n;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements gb3.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f261627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f261628b;

    public c(s cashTopUpAvailabilityInteractor, t1 cashTopUpBarcodeInteractor) {
        Intrinsics.checkNotNullParameter(cashTopUpAvailabilityInteractor, "cashTopUpAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cashTopUpBarcodeInteractor, "cashTopUpBarcodeInteractor");
        this.f261627a = cashTopUpAvailabilityInteractor;
        this.f261628b = cashTopUpBarcodeInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.f(data.f54722b.f51590a, "CASH_DEPOSIT_BARCODE_WIDGET_ID");
    }

    @Override // i49.c
    public final Object d(Object obj2) {
        return obj2 instanceof f ? j49.a.f171320a : j49.c.f171322a;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        int i = 21;
        return new y(new w1(2, i, continuation), e.e(q.Q(e.b(((cpj.b) this.f261627a.f111304a).l(yoj.c.EU_CASH_DEPOSIT)), new n(continuation, this, 2)), h0.f322473a, new o(3, i, continuation)));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            return new j49.e(new CashTopUpBarcodeFlow(new CashTopUpBarcodeFlowContract$InputData((CashTopUpBarcodeFlowContract$Step.ModalStep) null)), ModalDestination.Style.POPUP.f98311a);
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            return new j49.e(new DeleteBarcodeConfirmationFlow(), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || (aVar instanceof h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
            return j49.c.f171322a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
