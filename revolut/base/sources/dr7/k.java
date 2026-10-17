package dr7;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsChevronDelegate.Model b() {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("GET_HELP_ID", new TextLocalisedClause(R$string.car_insurance_requested_documents_cells_support, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static i c(List list) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_requested_documents_header_title, null, null, 14);
        if (list.size() > 3) {
            list = d0.E0(d0.W0(1, list), d0.V0(list, 2));
        }
        return new i(textLocalisedClause, null, new TextLocalisedClause(R$string.car_insurance_requested_documents_footer_primary_button_title, null, null, 14), d0.F0(b(), list), false, false);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f117092a, new dmj.a(this, 26), new dmb.m(this, 20), new dob.a(this, 3));
    }
}
