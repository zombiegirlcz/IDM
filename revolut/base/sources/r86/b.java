package r86;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final Clause a(UserDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        h86.c cVar = device.f71916c;
        String str = device.e;
        int i = a.f252375a[cVar.ordinal()];
        if (i == 1) {
            return new TextClause(device.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i == 2) {
            return !d0.W(str) ? d0.J(str, "unknown", true) ? new TextLocalisedClause(R$string.devices_unknown, null, null, 14) : new TextClause(device.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(device.f71915b.a(), " ", device.f71919j), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i == 3) {
            return new TextClause(device.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b(UserDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        int i = a.f252376b[device.f71915b.ordinal()];
        if (i == 1 || i == 2) {
            return R$drawable.uikit_icn_24_smartphone;
        }
        if (i == 3) {
            return a.f252375a[device.f71916c.ordinal()] == 3 ? R$drawable.uikit_icn_24_smartphone : R$drawable.uikit_icn_24_laptop;
        }
        if (i == 4) {
            return R$drawable.uikit_icn_24_unknown;
        }
        throw new NoWhenBranchMatchedException();
    }
}
