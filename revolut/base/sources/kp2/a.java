package kp2;

import aw0.d0;
import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import ip0.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1063a Companion = new C1063a();

    /* JADX INFO: renamed from: kp2.a$a, reason: collision with other inner class name */
    public static final class C1063a {
        private C1063a() {
        }
    }

    public static SmallStockCardDelegate.Model a(String str, int i, BankInformation bankInformation) {
        Clause compositeClause;
        List listK = v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        t0 t0Var = t0.f186434a;
        CompositeClause compositeClause2 = new CompositeClause(listK, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        BankInformation.AccountNumber accountNumber = bankInformation.f63974c;
        if (accountNumber instanceof BankInformation.Iban) {
            String str2 = ((BankInformation.Iban) accountNumber).f63975a;
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            String strD = a0.D(str2, " ", "", false);
            compositeClause = strD.length() <= 8 ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.account_switch_account_selection_common_iban_placeholder, v.k(f0.U0(4, strD), f0.V0(4, strD)), null, 12);
        } else if (accountNumber instanceof BankInformation.Uk) {
            BankInformation.Uk uk3 = (BankInformation.Uk) accountNumber;
            List listK2 = v.k(new TextClause(uk3.f63977b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(uk3.f63976a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            compositeClause = new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            compositeClause = null;
        }
        SmallStockCardDelegate.Model model = new SmallStockCardDelegate.Model(str, new UrlImage(bankInformation.f63973b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), compositeClause2, compositeClause, null, null, null, null, null, null, null, false, null, null, null, 67108832);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static hg b() {
        f fVar = new f("ID_BANK_FROM_LOADING");
        yp0.b.l(fVar, 0, 0, 0, 0, null, false, 63);
        f fVar2 = new f("ID_BANK_TO_LOADING");
        yp0.b.l(fVar2, 0, 0, 0, 0, null, false, 63);
        return new hg("ID_SCROLLER_LOADING", v.k(fVar, fVar2), 2, new y4(new d0(1, 1)), null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
    }

    public static hg c(BankInformation fromBank, BankInformation toBank) {
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        Intrinsics.checkNotNullParameter(toBank, "toBank");
        return new hg("ID_SCROLLER", v.k(a("ID_BANK_FROM", R$string.account_switch_request_review_from, fromBank), a("ID_BANK_TO", R$string.account_switch_request_review_to, toBank)), 2, new y4(new d0(1, 1)), null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
    }
}
