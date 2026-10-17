package ehg;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f126191a;

    public j(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f126191a = dateProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDateE = ((l80.f) this.f126191a).e();
        LocalDate localDatePlusYears = localDateE.plusYears(1L);
        LocalDate localDate = domainState.f126187a;
        TimeClause timeClause = new TimeClause(oc.c.N(localDate), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_recommended_flights_one_way, null, null, 14);
        DotDividerClause dotDividerClause = new DotDividerClause((Integer) null);
        m70.a.t(t0.f186434a);
        Clause[] elements = {timeClause, dotDividerClause, textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Float) null, (Float) null, 30)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), u.c(new g5("DATE_PICKER_ITEM_ID", localDate, localDate, false, null, localDateE, localDatePlusYears, null, null, null, 0, 0, 1048376)));
    }
}
