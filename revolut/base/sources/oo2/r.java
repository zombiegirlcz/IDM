package oo2;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.bank_account_switching.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import om4.l3;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f227005a;

    public r(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f227005a = dateProvider;
    }

    public static RowDelegate.Model.MainImage.Image40 a(qo2.b bVar, WarningCircleBadge warningCircleBadge) {
        String str = bVar.f247983c;
        if (str == null) {
            str = "";
        }
        return new RowDelegate.Model.MainImage.Image40(new UrlImage(str, null, null, null, 0L, null, null, null, null, new UserAvatarImage(new UserNamePlaceholder.Default(bVar.f247982b), null, null, 6), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878), warningCircleBadge, null, false, null, false, 60);
    }

    public static MoneyClause b(qo2.b bVar) {
        dj0.d dVar = bVar.k;
        if (dVar != null) {
            return new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.d, new l3(this, 27), new ol6.b(this, 25), new c1(this, domainState, 22));
    }

    public final RowDelegate.Model d(String str, qo2.b bVar) {
        Clause timeClause;
        TimeClause.Format dayAndMonth;
        TextClause textClause = new TextClause(bVar.f247982b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.MainImage.Image40 image40A = a(bVar, null);
        RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(b(bVar), null, null, false, 126);
        qo2.c cVar = bVar.d;
        LocalDate localDate = bVar.f;
        TextLocalisedClause textLocalisedClauseA = cVar != null ? qo2.e.a(cVar) : null;
        if (localDate == null) {
            timeClause = textLocalisedClauseA;
        } else {
            long jF = oc.c.F(localDate);
            if (localDate.getYear() != ((l80.f) this.f227005a).e().getYear()) {
                TimeClause.Format.INSTANCE.getClass();
                dayAndMonth = TimeClause.Format.f57959a;
            } else {
                dayAndMonth = new TimeClause.Format.DayAndMonth(ka.SHORT);
            }
            timeClause = new TimeClause(jF, dayAndMonth, null, null, 12);
            if (textLocalisedClauseA != null) {
                timeClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_known, v.k(textLocalisedClauseA, timeClause), null, 12);
            }
        }
        return new RowDelegate.Model(str, image40A, textClause, null, 0, timeClause, null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }
}
