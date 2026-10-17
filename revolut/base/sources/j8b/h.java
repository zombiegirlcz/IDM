package j8b;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.s1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import iel.a0;
import iel.m;
import iel.o;
import iel.p;
import iel.q;
import iel.r;
import iel.v;
import iel.x;
import iel.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f172165a;

    public h(l80.e dateProvider, f titleBuilder, e subtitleBuilder, d iconBuilder, c calendarRowColorPicker) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(titleBuilder, "titleBuilder");
        Intrinsics.checkNotNullParameter(subtitleBuilder, "subtitleBuilder");
        Intrinsics.checkNotNullParameter(iconBuilder, "iconBuilder");
        Intrinsics.checkNotNullParameter(calendarRowColorPicker, "calendarRowColorPicker");
        this.f172165a = dateProvider;
    }

    public final CalendarRowDelegate.Model a(kp3.b corporateEvent, boolean z) throws Throwable {
        String str;
        Clause textClause;
        Clause clauseA;
        CdnImage cdnImage;
        Image instrumentImage;
        s1 s1Var;
        iel.i event = corporateEvent.a();
        String strQ = j6.a.q(z ? "CORPORATE_EVENTS_ASSET_EVENT_ID__" : "CORPORATE_EVENTS_EVENT_ID__", event.b());
        TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f(), new LocalDateClause$DateFormat.DayOfMonth(false));
        TimeClause timeClauseA = com.revolut.core.ui_kit.models.j.a(event.f(), new LocalDateClause$DateFormat.Month(ka.SHORT), null);
        if (z) {
            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
            textClause = e.a(corporateEvent);
        } else {
            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
            iel.i iVarA = corporateEvent.a();
            if ((iVarA instanceof iel.d) || (iVarA instanceof iel.h) || (iVarA instanceof x) || (iVarA instanceof o) || (iVarA instanceof y) || (iVarA instanceof iel.k) || (iVarA instanceof a0) || (iVarA instanceof r) || (iVarA instanceof v) || (iVarA instanceof iel.b) || (iVarA instanceof iel.c) || (iVarA instanceof m) || (iVarA instanceof iel.g) || (iVarA instanceof q)) {
                kp3.a aVar = corporateEvent instanceof kp3.a ? (kp3.a) corporateEvent : null;
                if (aVar == null || (str = aVar.f188165b) == null) {
                    str = "";
                }
                textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                if (!(iVarA instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = ((p) iVarA).e ? new TextLocalisedClause(R$string.feature_corporate_events_market_holiday_title, null, null, 14) : new TextLocalisedClause(R$string.feature_corporate_events_market_holiday_title_early_close, null, null, 14);
            }
        }
        if (z) {
            clauseA = null;
        } else {
            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
            clauseA = e.a(corporateEvent);
        }
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        if (corporateEvent instanceof kp3.a) {
            instrumentImage = new InstrumentImage(((kp3.a) corporateEvent).f188164a.i(), 30, null, null);
        } else {
            if (!(corporateEvent instanceof kp3.c)) {
                throw new NoWhenBranchMatchedException();
            }
            iel.i iVar = ((kp3.c) corporateEvent).f188166a;
            if (iVar instanceof p) {
                cdnImage = new CdnImage("Market-Closed", "assets/categories-v2", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            } else {
                hx7.e.n(new IllegalStateException("Add proper icon for the ".concat(iVar.getClass().getSimpleName())));
                cdnImage = new CdnImage("Market-Closed", "assets/categories-v2", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            }
            instrumentImage = cdnImage;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof iel.d) || (event instanceof x)) {
            s1Var = s1.GREEN;
        } else if (event instanceof iel.k) {
            s1Var = s1.YELLOW;
        } else if (event instanceof iel.h) {
            s1Var = s1.PINK;
        } else if (event instanceof o) {
            s1Var = s1.ORANGE;
        } else if (event instanceof y) {
            s1Var = s1.DEEP_PURPLE;
        } else if (event instanceof a0) {
            s1Var = s1.CYAN;
        } else if (event instanceof p) {
            s1Var = s1.RED;
        } else if (event instanceof r) {
            s1Var = s1.CYAN;
        } else if (event instanceof v) {
            s1Var = s1.ORANGE;
        } else if (event instanceof iel.b) {
            s1Var = s1.RED;
        } else if ((event instanceof iel.c) || (event instanceof m)) {
            s1Var = s1.YELLOW;
        } else if (event instanceof iel.g) {
            s1Var = s1.GREEN;
        } else {
            if (!(event instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            s1Var = s1.CYAN;
        }
        return new CalendarRowDelegate.Model(strQ, timeClauseB, timeClauseA, textClause, clauseA, instrumentImage, s1Var, false, null, corporateEvent, null, 5920);
    }
}
