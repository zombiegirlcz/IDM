package rn7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new RowDelegate.Model("COLOR_PRINTER_ID", n.i(R$drawable.uikit_icn_24_printer, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_print_certificate_cells_printer_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_print_certificate_cells_printer_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("WINDSCREEN_ID", n.i(R$drawable.uikit_icn_24_share_ios, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_print_certificate_cells_display_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_print_certificate_cells_display_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new f(listK);
    }
}
