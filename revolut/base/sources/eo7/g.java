package eo7;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new RowDelegate.Model("DRIVER_TYPE_PERMANENT_ITEM", xl7.n.k(R$drawable.uikit_icn_24_add_contact, false, null, 15), new TextLocalisedClause(R$string.car_insurance_mta_driver_type_cell_permanent_title, null, null, 14), null, 0, null, null, null, 0, xl7.n.c(), false, null, false, null, null, null, null, null, null, c.PERMANENT, null, 0, 0, 0, 0, 532675576), new RowDelegate.Model("DRIVER_TYPE_TEMPORARY_ITEM", xl7.n.k(R$drawable.uikit_icn_24_calendar_date, false, null, 15), new TextLocalisedClause(R$string.car_insurance_mta_driver_type_cell_temporary_title, null, null, 14), null, 0, null, null, null, 0, xl7.n.c(), false, null, false, null, null, null, null, null, null, c.TEMPORARY, null, 0, 0, 0, 0, 532675576));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new e(listK);
    }
}
