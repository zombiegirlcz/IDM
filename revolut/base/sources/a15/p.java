package a15;

import android.os.Parcelable;
import aw0.c7;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l0;
import com.revolut.core.ui_kit.delegates.p0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.health.impl.domain.model.ScoreSnapshot;
import com.youTransactor.uCube.rpc.Constants;
import ip0.tc0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v05.j f546a;

    public p(v05.j insightsItemsMapper) {
        Intrinsics.checkNotNullParameter(insightsItemsMapper, "insightsItemsMapper");
        this.f546a = insightsItemsMapper;
    }

    public static List a(h hVar) {
        List list = hVar.f534a.f69959a;
        LocalDate localDate = hVar.f535b;
        List<ScoreSnapshot> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ScoreSnapshot scoreSnapshot : list2) {
            LocalDate localDate2 = scoreSnapshot.f69993a;
            LocalDate localDate3 = scoreSnapshot.f69993a;
            String strS = h30.l.s("INSIGHTS_CALENDAR_ITEM_ID_", localDate2);
            TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate3, new LocalDateClause$DateFormat.Month(0));
            Integer num = scoreSnapshot.f69994b;
            l0 l0Var = null;
            p0 p0Var = new p0(timeClauseB, num != null ? new NumberClause(num.intValue(), (NumberClause.Format.Compact) null, (Custom) null, 6) : null);
            if (Intrinsics.f(localDate3, localDate)) {
                l0Var = l0.f54408b;
            }
            AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(strS, p0Var, l0Var, null, scoreSnapshot.f69993a, null, Constants.TAG_EMV_L2_CHECKSUM);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return u.c(new hg("INSIGHTS_CALENDAR_SCROLLER_ID", arrayList, 3, x4.c.f10604a, new tc0(h30.l.s("INSIGHTS_CALENDAR_ITEM_ID_", localDate), false, 6), new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32704));
    }

    public static ListSubheaderDelegate.Model b(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f536c, new a0.c(this, domainState, 4), new a09.b(this, domainState, 4), new n(this, domainState, 0));
    }
}
