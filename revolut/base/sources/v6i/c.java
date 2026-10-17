package v6i;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreenContract$InputModelSettings;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import u7i.r;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c extends q implements Function2 {
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model p0 = (InputTextDelegate.Model) obj2;
        InputText p17 = (InputText) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        OrderSettingsScreen orderSettingsScreen = (OrderSettingsScreen) this.receiver;
        KProperty[] kPropertyArr = OrderSettingsScreen.Q;
        orderSettingsScreen.getClass();
        Object obj4 = p0.P;
        OrderSettingsScreenContract$InputModelSettings orderSettingsScreenContract$InputModelSettings = obj4 instanceof OrderSettingsScreenContract$InputModelSettings ? (OrderSettingsScreenContract$InputModelSettings) obj4 : null;
        if (orderSettingsScreenContract$InputModelSettings == null) {
            return null;
        }
        MaskedTextInputEditText innerEditText = p17.getInnerEditText();
        xi0.b bVar = orderSettingsScreenContract$InputModelSettings.f97308a;
        qd0.b bVarN = ((r) orderSettingsScreen.O.getValue()).f277892b.f277824c.n();
        s.j(bVarN);
        return new zp0.d(innerEditText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, orderSettingsScreenContract$InputModelSettings.f97309b, false, null, 1688);
    }
}
