package aee;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.Estimation;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalOutcome;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object objA;
        j jVar2;
        TextLocalisedClause textLocalisedClause;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferArrivalContent transferArrivalContent = domainState.f3561a;
        TransferArrivalOutcome transferArrivalOutcome = transferArrivalContent.f89376b;
        ArrayList arrayList = transferArrivalContent.f89375a;
        aim.e eVarB = u.b();
        TransferArrivalOutcome.AfterTimeframe afterTimeframe = TransferArrivalOutcome.AfterTimeframe.f89378a;
        boolean zF = Intrinsics.f(transferArrivalOutcome, afterTimeframe);
        TransferArrivalOutcome.Unsupported unsupported = TransferArrivalOutcome.Unsupported.f89379a;
        if (zF) {
            objA = new we0("IMAGE_LIST_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D007", null, null, null, 30)));
        } else if (Intrinsics.f(transferArrivalOutcome, unsupported)) {
            objA = new we0("IMAGE_LIST_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D277", null, null, null, 30)));
        } else {
            if (!(transferArrivalOutcome instanceof TransferArrivalOutcome.WithinTimeframe)) {
                throw new NoWhenBranchMatchedException();
            }
            Estimation estimation = ((TransferArrivalOutcome.WithinTimeframe) transferArrivalOutcome).f89380a;
            objA = cee.b.a(new TextClause(estimation.f89368a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(estimation.f89369b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        eVarB.add(objA);
        eVarB.addAll(cee.b.b(arrayList, new aed.a(this, 4)));
        tde.a aVar = transferArrivalContent.d;
        if (aVar != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i = s.f3573a[aVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_view_account_details_action, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_see_required_details_action, null, null, 14);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_confirmation_action, null, null, 14);
            }
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ROOT_ACTION_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, aVar, null, 744);
            int i2 = R$attr.uikit_dp24;
            yp0.b.r(model, i2, i2, 0, 0, 12);
            eVarB.add(model);
        }
        aim.e eVarA = u.a(eVarB);
        if (Intrinsics.f(transferArrivalOutcome, afterTimeframe)) {
            jVar2 = new j(new TextLocalisedClause(R$string.locate_inbound_transfer_output_delayed_header_title, null, null, 14), new TextLocalisedClause(R$string.locate_inbound_transfer_output_delayed_header_subtitle, null, null, 14));
        } else if (Intrinsics.f(transferArrivalOutcome, unsupported)) {
            jVar2 = new j(new TextLocalisedClause(R$string.locate_inbound_transfer_output_not_supported_header_title, null, null, 14), new TextLocalisedClause(R$string.locate_inbound_transfer_output_not_supported_header_subtitle, null, null, 14));
        } else {
            if (!(transferArrivalOutcome instanceof TransferArrivalOutcome.WithinTimeframe)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar2 = new j(new TextLocalisedClause(R$string.locate_inbound_transfer_output_within_timeframe_title, null, null, 14), null);
        }
        return new n(eVarA, jVar2);
    }
}
