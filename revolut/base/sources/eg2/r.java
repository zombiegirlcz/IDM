package eg2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.k f125537a;

    public r(yof.k transferReviewMapper, a upiTransferReviewScheduleMapper) {
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(upiTransferReviewScheduleMapper, "upiTransferReviewScheduleMapper");
        this.f125537a = transferReviewMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i iVar;
        List listZ;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h hVar = domainState.e;
        TransferScheduleData transferScheduleData = domainState.d;
        yof.k kVar = this.f125537a;
        if (hVar == null) {
            listZ = ((ppf.d) kVar).e();
        } else {
            sa saVarB = ((ppf.d) kVar).b(hVar.f125530a);
            if (saVarB != null) {
                yp0.b.l(saVarB, 0, 0, 0, 0, null, false, 63);
            } else {
                saVarB = null;
            }
            boolean z = transferScheduleData.f104285a == 0;
            aim.e eVarB = zhm.u.b();
            UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = domainState.f125527b;
            aim.e eVarB2 = zhm.u.b();
            eVarB2.add(new CellDetailsDelegate.Model("ID_COUNTERPARTY", new TextLocalisedClause(R.string.contacts_to, null, null, 14), new TextClause(upiTransferFlowContract$Recipient.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
            if (upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.Alias) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.upi_transfer_review_upi_id_title, null, null, 14);
                UpiTransferFlowContract$Recipient.Alias alias = (UpiTransferFlowContract$Recipient.Alias) upiTransferFlowContract$Recipient;
                String strA = alias.f62963a.a("UPI_ID");
                if (strA == null) {
                    strA = alias.f62964b;
                }
                eVarB2.add(new CellDetailsDelegate.Model("ID_UPI_ID", textLocalisedClause, new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            eVarB.addAll(zhm.u.a(eVarB2));
            if (z) {
                eVarB.add(new CellDetailsDelegate.Model("ID_SCHEDULED_ON", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_field_title_estimated_arrival, null, null, 14), new TextLocalisedClause(R$string.upi_transfer_review_estimated_arrival_instantly, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            aim.e eVarA = zhm.u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            int i = a.f125523b;
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            ScreenConfiguration screenConfiguration = domainState.f125529g;
            aim.e eVarB3 = zhm.u.b();
            long j2 = transferScheduleData.f104285a;
            jli.c cVar = transferScheduleData.f104286b;
            TransferScheduleEndsOn transferScheduleEndsOn = transferScheduleData.f104287c;
            if (j2 != 0) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transfer.core.api.R$string.transfer_schedule_selector_start_date_title, null, null, 14);
                long j3 = transferScheduleData.f104285a;
                TimeClause.Format.INSTANCE.getClass();
                eVarB3.add(new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_DATE", textLocalisedClause2, 0, screenConfiguration.f ? new ResourceImage(a.f125522a, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, new TimeClause(j3, TimeClause.Format.f57959a, null, null, 12), false, screenConfiguration.f, null, null, 0, 0, 32672));
            }
            if (!(transferScheduleEndsOn instanceof TransferScheduleEndsOn.Never)) {
                new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_END_DATE", new TextLocalisedClause(com.revolut.feature.transfer.core.api.R$string.transfer_schedule_ends_on_title, null, null, 14), 0, new ResourceImage(a.f125522a, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), epf.b.d(transferScheduleEndsOn), false, false, null, null, 0, 0, 32736);
            }
            if (cVar != jli.c.PERIOD_SELECTION_NONE) {
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transfer.core.api.R$string.transfer_schedule_summary_recurring_mode_field_title, null, null, 14);
                Clause clauseE = epf.b.e(cVar);
                boolean z3 = screenConfiguration.e;
                boolean z4 = screenConfiguration.f62989g;
                eVarB3.add(new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_PERIOD", textLocalisedClause3, 0, (z3 || z4) ? new ResourceImage(a.f125522a, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, clauseE, false, screenConfiguration.e || z4, null, null, 0, 0, 32672));
            }
            aim.e eVarA2 = zhm.u.a(eVarB3);
            yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
            yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
            String str = domainState.f125528c;
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                qv0.i iVarA = yof.k.a(kVar, str, null, 2);
                yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
                iVar = iVarA;
            } else {
                iVar = null;
            }
            List listK = v.k(new CellDetailsDelegate.Model("ID_RECIPIENT_GETS", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_bank_transfer_section_recipient_fix, null, null, 14), new MoneyClause(domainState.f125526a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_FEES", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_bank_transfer_section_fees, null, null, 14), new TextLocalisedClause(R$string.upi_transfer_review_fees_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_TOTAL", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_bank_transfer_section_total, null, null, 14), new MoneyClause(domainState.f125526a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            IconDelegate.Model model = new IconDelegate.Model("UPI_LOGO_LIST_ID", te2.a.f270024a, null, null, 124);
            aim.e eVarB4 = zhm.u.b();
            if (saVarB != null) {
                eVarB4.add(saVarB);
            }
            eVarB4.addAll(eVarA);
            eVarB4.addAll(eVarA2);
            eVarB4.add(iVar);
            eVarB4.addAll(listK);
            eVarB4.add(model);
            listZ = zhm.d0.Z(zhm.u.a(eVarB4));
        }
        return new p(listZ);
    }
}
