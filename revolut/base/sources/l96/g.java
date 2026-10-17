package l96;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_title, null, null, 14), null, null, null, false, 30);
        SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model("DIALOG_ITEM_ENTIRE_ID", new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_full, null, null, 14), domainState.f193041a instanceof DepositAmount.EntirePaycheck, null, DepositAmount.EntirePaycheck.f71945a, YearClass.CLASS_2008);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_percentage, null, null, 14);
        DepositAmount depositAmount = domainState.f193041a;
        return new cii.b(null, v.k(model, new SingleChoiceDelegate.Model("DIALOG_ITEM_PERCENTAGE_ID", textLocalisedClause, depositAmount instanceof DepositAmount.PercentageOfPaycheck, null, new DepositAmount.PercentageOfPaycheck(0), YearClass.CLASS_2008), new SingleChoiceDelegate.Model("DIALOG_ITEM_FIXED_ID", new TextLocalisedClause(R$string.direct_deposit_form_creation_amount_type_fixed, null, null, 14), depositAmount instanceof DepositAmount.FixedAmount, null, new DepositAmount.FixedAmount(0), YearClass.CLASS_2008)), aVar);
    }
}
