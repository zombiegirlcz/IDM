package w1i;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsActivity;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsContract$InputModelSettings;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model p0 = (InputTextDelegate.Model) obj2;
        InputText p17 = (InputText) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        OrderSettingsActivity orderSettingsActivity = (OrderSettingsActivity) this.receiver;
        int i = OrderSettingsActivity.f96904w0;
        orderSettingsActivity.getClass();
        Object obj4 = p0.P;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsContract.InputModelSettings");
        OrderSettingsContract$InputModelSettings orderSettingsContract$InputModelSettings = (OrderSettingsContract$InputModelSettings) obj4;
        MaskedTextInputEditText innerEditText = p17.getInnerEditText();
        xi0.b bVar = orderSettingsContract$InputModelSettings.f96910a;
        j1i.e eVar = orderSettingsActivity.f96905s0;
        if (eVar != null) {
            return new zp0.d(innerEditText, bVar, (u80.d) eVar.z.get(), null, null, false, false, orderSettingsContract$InputModelSettings.f96911b, false, null, 1688);
        }
        Intrinsics.r("activityComponent");
        throw null;
    }
}
