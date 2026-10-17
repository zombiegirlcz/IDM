package sng;

import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import com.revolut.shared.feature.user_declarations.api.models.ValidationConfig;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sng.f;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ung.b f264616a;

    public j(l80.e dateProvider, ung.b validator) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f264616a = validator;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Object gVar;
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f264608a;
        DateOfBirthScreenConfig dateOfBirthScreenConfig = domainState.f264609b;
        ValidationConfig validationConfig = dateOfBirthScreenConfig.d;
        LocalDate localDateE = ((l80.f) ((ung.c) this.f264616a).f281432a).e();
        f.a aVar = f.a.f264613a;
        f.c cVar = f.c.f264615a;
        if (localDate == null) {
            gVar = aVar;
        } else if (localDate.isAfter(localDateE)) {
            gVar = f.b.f264614a;
        } else {
            ChronoUnit chronoUnit = ChronoUnit.YEARS;
            gVar = chronoUnit.between(localDate, localDateE) > 120 ? new g() : (chronoUnit.between(localDate, localDateE) >= 18 || validationConfig == null || !validationConfig.f105043a) ? cVar : new h();
        }
        TextLocalisedClause textLocalisedClause2 = null;
        if (gVar instanceof g) {
            textLocalisedClause = new TextLocalisedClause(R$string.inputs_date_error_signup_maximum_date, u.c(Integer.valueOf(SyslogConstants.LOG_CLOCK)), null, 12);
        } else if (gVar instanceof h) {
            textLocalisedClause = new TextLocalisedClause(R$string.inputs_date_error_signup_minimum_date_no_redirect, u.c(18), null, 12);
        } else {
            if (!(gVar instanceof f.b)) {
                if (!gVar.equals(aVar) && !gVar.equals(cVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new e(domainState.f264608a, textLocalisedClause2, gVar.equals(cVar), dateOfBirthScreenConfig.f105034b);
            }
            textLocalisedClause = new TextLocalisedClause(R$string.inputs_date_error_maximum_date, u.c(new TimeClause(System.currentTimeMillis(), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12);
        }
        textLocalisedClause2 = textLocalisedClause;
        return new e(domainState.f264608a, textLocalisedClause2, gVar.equals(cVar), dateOfBirthScreenConfig.f105034b);
    }
}
