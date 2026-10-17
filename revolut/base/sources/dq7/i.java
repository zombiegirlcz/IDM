package dq7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import java.util.List;
import jki.m;
import jki.p;
import kl7.m1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import xl7.o;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CancellationDetails cancellationDetails = domainState.f116922b;
        m1 m1Var = domainState.f116921a;
        aim.e eVarB = u.b();
        String str = cancellationDetails.d;
        if (str != null) {
            a0.x(yp0.b.i(new PlainTextDelegate.Model("CANCELLATION_REASON", (Clause) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), new ListSubheaderDelegate.Model("CANCELLATION_REASON_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_policy_cancellation_details_section_cancellation_reason_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        }
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("GET_HELP_ID", new TextLocalisedClause(R$string.car_insurance_common_get_help, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        aim.e eVarA = u.a(eVarB);
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        int[] iArr = o.f306952a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iArr[m1Var.ordinal()] == 1 ? R$string.car_insurance_policy_cancellation_details_title_be_canceled_soon : R$string.car_insurance_policy_cancellation_details_title, null, null, 14);
        CancellationDetails cancellationDetails2 = domainState.f116922b;
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        Intrinsics.checkNotNullParameter(cancellationDetails2, "cancellationDetails");
        return new g(eVarA, textLocalisedClause, new TextLocalisedClause(iArr[m1Var.ordinal()] == 1 ? R$string.car_insurance_policy_cancellation_details_description_be_canceled_soon : R$string.car_insurance_policy_cancellation_details_description, u.c(n.f(cancellationDetails2.f75184a, null, true, 5)), null, 12));
    }
}
