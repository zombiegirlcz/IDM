package hk6;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import ip0.iq;
import java.time.LocalDate;
import java.util.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f152856a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f152856a = dateProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        LocalDate localDate;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_finance_payment_authorization_end_date_update_radio_button_option_indefinite, null, null, 14);
        boolean z = domainState.f152852a;
        LocalDate localDate2 = domainState.f152853b;
        iq iqVar = iq.RADIO_BUTTON;
        eVarB.add(new InputChecklistDelegate.Model("LIST_ID_INDEFINITE_RADIO_BUTTON", textLocalisedClause, z, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.open_finance_payment_authorization_end_date_update_radio_button_option_specific_date, null, null, 14);
        boolean z3 = domainState.f152852a;
        eVarB.add(new InputChecklistDelegate.Model("LIST_ID_SPECIFIC_DATE_RADIO_BUTTON", textLocalisedClause2, !z3, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248));
        AbstractList abstractListA = u.a(eVarB);
        yp0.b.k(abstractListA, 0, 0, 0, 0, 31);
        if (z3 || localDate2 == null) {
            localDate = localDate2;
        } else {
            g5 g5Var = new g5("LIST_ID_DATE_PICKER", localDate2, localDate2, true, null, ((l80.f) this.f152856a).e(), null, null, null, null, 0, 0, 1048368);
            localDate = localDate2;
            yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
            abstractListA = d0.F0(g5Var, abstractListA);
        }
        return new g(abstractListA, z3 || localDate != null);
    }
}
