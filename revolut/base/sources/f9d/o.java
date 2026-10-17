package f9d;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f132934a;

    public o(p9d.c doneButtonProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        this.f132934a = doneButtonProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        Data data = domainState.f132924b;
        String str = domainState.f132923a;
        eVarB.addAll((List) iii.c.f(data, new f7l.c(this, 5), new f5g.l(12), new b9d.k(4, str, this)));
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("HELP_BUTTON_ITEM_ID", new TextLocalisedClause(R$string.help_center_action_help_with_something_else, null, null, 14), 0, false, null, l7d.a.d(6, str, null), null, YearClass.CLASS_2012);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.addAll(u.c(model));
        return new n(u.a(eVarB), ((p9d.d) this.f132934a).a(domainState.f132925c));
    }
}
