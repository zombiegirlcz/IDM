package lq7;

import aw0.ka;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.List;
import jki.p;
import kl7.a1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f199207a;

    public o(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f199207a = dateProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(t1.u(domainState.f199195b, domainState.f199196c, domainState.f199194a), new loc.a(8), new lnk.o(4), new lk7.n(this, 4)));
    }

    public final TextLocalisedClause b(ZonedDateTime zonedDateTime) {
        return Intrinsics.f(zonedDateTime.toLocalDate(), ((l80.f) this.f199207a).e()) ? new TextLocalisedClause(R$string.car_insurance_common_date_from_x_today, u.c(xl7.n.f(zonedDateTime, TimeClause.Format.TimeDefault.f57977b, false, 6)), null, 12) : new TextLocalisedClause(R$string.car_insurance_common_date_from_x, u.c(xl7.n.f(zonedDateTime, new TimeClause.Format.DayAndMonth(ka.SHORT), false, 6)), null, 12);
    }

    public final boolean c(InsurableCar insurableCar) {
        ZonedDateTime zonedDateTime = insurableCar.f75234n;
        return zonedDateTime == null || zonedDateTime.compareTo((ChronoZonedDateTime<?>) ((l80.f) this.f199207a).k()) <= 0;
    }

    public final RowDelegate.Model d(InsurableCar insurableCar, a1 a1Var) {
        int i;
        TextLocalisedClause textLocalisedClauseB;
        String str = insurableCar.f75226a;
        if (str == null) {
            str = insurableCar.f75227b;
        }
        String strQ = j6.a.q("DETAILS_CAR_", str);
        RowDelegate.Model.MainImage.Image40 image40K = xl7.n.k(R$drawable.uikit_icn_24_driving_licence, c(insurableCar), !c(insurableCar) ? xl7.n.d(R$drawable.uikit_icn_16_status_clock_arrows, R$attr.uikit_colorGrey50) : null, 10);
        switch (n.f199206a[a1Var.ordinal()]) {
            case 1:
                i = R$string.car_insurance_manage_policy_cells_main_car_title;
                break;
            case 2:
                i = R$string.car_insurance_manage_policy_cells_substitute_car_title;
                break;
            case 3:
                i = R$string.car_insurance_manage_policy_cells_additional_car_title;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException(("unexpected mtaType: " + a1Var).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        TextClause textClauseC = xl7.h.c(insurableCar);
        ZonedDateTime zonedDateTime = insurableCar.f75234n;
        if (zonedDateTime == null) {
            textLocalisedClauseB = null;
        } else {
            ZonedDateTime zonedDateTime2 = insurableCar.o;
            textLocalisedClauseB = zonedDateTime2 == null ? b(zonedDateTime) : xl7.n.a(zonedDateTime, zonedDateTime2, false);
        }
        Clause[] elements = {textClauseC, textLocalisedClauseB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(strQ, image40K, textLocalisedClause, null, 0, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }
}
