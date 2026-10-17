package t33;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f267618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k93.a f267619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm.d f267620c;
    public boolean d;
    public final String e;

    public m(g state, k93.a issueVirtualCardActionHandler, mm.d actionsDispatcher, i90.b uuidUtils, a cardCheckoutParamsProvider) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(issueVirtualCardActionHandler, "issueVirtualCardActionHandler");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(cardCheckoutParamsProvider, "cardCheckoutParamsProvider");
        this.f267618a = state;
        this.f267619b = issueVirtualCardActionHandler;
        this.f267620c = actionsDispatcher;
        this.e = wp5.y.u(uuidUtils, "toString(...)");
    }

    public final pfm.h a() {
        y yVar = (y) this.f267618a;
        e93.e eVar = (e93.e) yVar.B0().get();
        NaviCommand naviCommand = (NaviCommand) te0.w.O(yVar.y0());
        String str = (String) te0.w.O(yVar.z0());
        te0.j jVar = yVar.f;
        KProperty[] kPropertyArr = y.f267639l;
        Object obj2 = jVar.getValue(yVar, kPropertyArr[4]).get();
        String str2 = (String) obj2;
        if (this.d || d0.F0(str2).toString().length() <= 0) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) te0.w.O(yVar.A0());
        i93.d dVar = selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65251a : null;
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy2 = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) te0.w.O(yVar.A0());
        return (pfm.h) this.f267620c.c0(new n93.g(this.e, eVar, naviCommand, str, str3, dVar, selectedPaymentMethodResultContract$SelectedCardBindingStrategy2 != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy2.f65252b : null, (AccountId) yVar.w0().get(), null, (e93.b) te0.w.L(yVar.f267644j.getValue(yVar, kPropertyArr[8])), null, 1280));
    }
}
