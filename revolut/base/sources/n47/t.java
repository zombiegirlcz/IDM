package n47;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n33.l0;
import n33.v0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TaxHubTransactionExportPeriodPickerScreenContract$DomainState domainState = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new o(new n(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_subtitle, null, null, 14)), new m(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_action_continue, null, null, 14), domainState.f74402a.getContent() != null && (domainState.f74403b instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e)), (List) iii.c.f(domainState.f74402a, new v0(this, 21), new l0(this), new mgh.i(domainState, this, 15)));
    }
}
