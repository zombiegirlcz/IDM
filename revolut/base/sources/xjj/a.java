package xjj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static TextLocalisedClause a(t1 subscription, List userDevices) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(userDevices, "userDevices");
        Iterator it8 = userDevices.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((UserDevice) next).f71914a, subscription.e.f100442c)) {
                break;
            }
        }
        UserDevice userDevice = (UserDevice) next;
        TextClause textClause = (userDevice == null || (str = userDevice.e) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return textClause != null ? new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_header_connected_to_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.esim_subscription_details_header_different_device_description, null, null, 14);
    }
}
