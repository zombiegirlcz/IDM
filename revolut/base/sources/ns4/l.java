package ns4;

import aw0.c7;
import aw0.ka;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        dj0.d dVar = domainState.f218740a.f68785g;
        LocalDate localDate = domainState.f218741b;
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "id_credit_card_anticipation_confirmation_counter", new x4(new TextLocalisedClause(R$string.credit_card_anticipation_confirm_counter_top, null, null, 14)), sx4.f.b(3, null, null, dVar), new TextLocalisedClause(R$string.credit_card_anticipation_confirm_counter_bottom, u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.Month(0))), null, 12), null, null, 0, 0, 4080);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        CreditCardInstalmentAnticipationQuote creditCardInstalmentAnticipationQuote = domainState.f218740a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_credit_card_anticipation_confirmation_statement_balance", new TextLocalisedClause(R$string.credit_card_anticipation_confirm_new_balance, u.c(com.revolut.core.ui_kit.models.j.a(localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT), null)), null, 12), sx4.f.b(3, null, null, creditCardInstalmentAnticipationQuote.f68787j), 0, null, null, null, null, null, false, 0, 0, 32760);
        int i = creditCardInstalmentAnticipationQuote.f68783b;
        List listK = v.k(model, new CellDetailsActionDelegate.Model("id_credit_card_anticipation_confirmation_instalments_to_repay", new TextLocalisedClause(R$string.credit_card_anticipation_confirm_left_to_repay, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6), null, false, false, null, null, null, 0, 0, 0, 0, 4194276), new CellDetailsDelegate.Model("id_credit_card_anticipation_confirmation_last_instalment_due_date", new TextLocalisedClause(R$string.credit_card_anticipation_confirm_last_instalment_day, null, null, 14), false, sx4.g.b(creditCardInstalmentAnticipationQuote.f68784c, null), sx4.g.b(domainState.f218742c, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION)), null, null, false, null, null, 0, 134217628));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new j(u.a(eVarB));
    }
}
