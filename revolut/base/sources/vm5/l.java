package vm5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tsk.t;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f290542a;

    public l(t validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f290542a = validator;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h hVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f290536a;
        LocalDate localDateE = ((l80.f) ((l80.e) this.f290542a.f274170b)).e();
        if (localDate == null) {
            hVar = h.EMPTY;
        } else if (localDate.isAfter(localDateE)) {
            hVar = h.FUTURE_DATE;
        } else {
            ChronoUnit chronoUnit = ChronoUnit.YEARS;
            hVar = chronoUnit.between(localDate, localDateE) > 120 ? h.TOO_OLD : chronoUnit.between(localDate, localDateE) < 18 ? h.TOO_YOUNG : h.VALID;
        }
        int i = k.f290541a[hVar.ordinal()];
        TextLocalisedClause textLocalisedClause = null;
        if (i == 1 || i == 2 || i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_tfr_validation_dob_date_error_label, null, null, 14);
        } else if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new g(textLocalisedClause, domainState.f290536a, hVar == h.VALID);
    }
}
