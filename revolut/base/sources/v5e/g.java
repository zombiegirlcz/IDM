package v5e;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uk2.w;
import v2g.i;
import x4e.l;
import yp0.e0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f286205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4e.c f286206b;

    public g(l payoutChartWidgetMapper, r4e.c payoutScenarioMapper) {
        Intrinsics.checkNotNullParameter(payoutChartWidgetMapper, "payoutChartWidgetMapper");
        Intrinsics.checkNotNullParameter(payoutScenarioMapper, "payoutScenarioMapper");
        this.f286205a = payoutChartWidgetMapper;
        this.f286206b = payoutScenarioMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List listC = this.f286205a.c(domainState.f286202a);
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        if (!listC.isEmpty()) {
            listC = yp0.b.d(listC, new ListSubheaderDelegate.Model("payout_chart_header", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_structured_notes_payout_scenarios_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
        }
        eVarB.addAll(listC);
        Data data = domainState.f286203b;
        List list = data != null ? (List) iii.c.f(data, new i(28), new v25.g(21), new w(this, 20)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        eVarB.addAll(list);
        return new f(u.a(eVarB));
    }
}
