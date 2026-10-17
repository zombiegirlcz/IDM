package j2l;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox0.b0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {
    public static n6 a(TravelStatusPartnerActionBottomSheetData.Button button) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        TextClause textClause = new TextClause(button.f104320a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = i.f170916b[button.f104321b.ordinal()];
        if (i == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return new n6(textClause, defaultFilledButton, null, null, false, null, button.f104321b, 508);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        aw0.i eVar;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelStatusPartnerActionBottomSheetData travelStatusPartnerActionBottomSheetData = domainState.f170911a;
        String str = travelStatusPartnerActionBottomSheetData.f104317a;
        String str2 = travelStatusPartnerActionBottomSheetData.f104318b;
        TravelStatusPartnerActionBottomSheetData.Button button = travelStatusPartnerActionBottomSheetData.f104319c;
        TravelStatusPartnerActionBottomSheetData.Button button2 = travelStatusPartnerActionBottomSheetData.d;
        if (button == null || button2 == null) {
            eVar = button != null ? new aw0.e(false, null, b0.BELOW_BUTTONS, a(button), null, null, 51) : button2 != null ? new aw0.e(false, null, b0.BELOW_BUTTONS, a(button2), null, null, 51) : null;
        } else {
            int i = i.f170915a[travelStatusPartnerActionBottomSheetData.e.ordinal()];
            if (i == 1) {
                eVar = new aw0.g(a(button), a(button2), (Clause) null, (aw0.f) null, 25);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new aw0.h(false, a(button), a(button2), null, b0.BELOW_BUTTONS, null, 97);
            }
        }
        return new h(str, str2, eVar, f0.f322471a);
    }
}
