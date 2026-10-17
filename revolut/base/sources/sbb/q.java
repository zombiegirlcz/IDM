package sbb;

import android.content.Intent;
import android.net.Uri;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payto.api.R$string;
import com.revolut.feature.external_accounts.api.ExternalAccountsApi$FeatureToggle;
import com.revolut.feature.external_accounts.impl.ui.choose_account_type.ChooseAccountTypeScreen;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends yji.n implements etb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ug6.v f261556l;

    public q(ug6.v extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f261556l = extension;
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        ExternalAccountTopupPayload payload = (ExternalAccountTopupPayload) actionData.f83422b;
        if (payload != null) {
            ug6.v vVar = this.f261556l;
            vVar.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (((jte.d) vVar.o).c(ExternalAccountsApi$FeatureToggle.ExternalPaymentResultLog.f72203c)) {
                RuntimeException runtimeException = new RuntimeException("External account top-up payload " + payload);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
            }
            if (payload instanceof ExternalAccountTopupPayload.DirectLinkPayload) {
                vVar.T2(new ug6.m(vVar, (ExternalAccountTopupPayload.DirectLinkPayload) payload, null), new ug6.g(vVar, 1));
                return;
            }
            if (payload instanceof ExternalAccountTopupPayload.LinkedAccountPayload) {
                vVar.T2(new ug6.o(vVar, (ExternalAccountTopupPayload.LinkedAccountPayload) payload, null), new ug6.g(vVar, 0));
                return;
            }
            if (payload instanceof ExternalAccountTopupPayload.OneOffPayload) {
                vVar.T2(new ug6.r((ExternalAccountTopupPayload.OneOffPayload) payload, null, vVar), new ug6.g(vVar, 2));
                return;
            }
            if (payload instanceof ExternalAccountTopupPayload.IndiaNetBankingPayload) {
                boolean z = ((ExternalAccountTopupPayload.IndiaNetBankingPayload) payload).f73101a;
                if (z) {
                    vVar.d3();
                    return;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.c3();
                    return;
                }
            }
            if (payload instanceof ExternalAccountTopupPayload.IndiaUpiPayload) {
                ExternalAccountTopupPayload.IndiaUpiPayload indiaUpiPayload = (ExternalAccountTopupPayload.IndiaUpiPayload) payload;
                try {
                    String str = indiaUpiPayload.f73102a;
                    String str2 = indiaUpiPayload.f73103b;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    intent.setPackage(str2);
                    vVar.A2(new ExternalDestination.ByIntent(intent, null));
                    return;
                } catch (Exception unused) {
                    vVar.f3();
                    return;
                }
            }
            if (payload instanceof ExternalAccountTopupPayload.PayToStoredMethodPayload) {
                ExternalAccountTopupPayload.PayToStoredMethodPayload payToStoredMethodPayload = (ExternalAccountTopupPayload.PayToStoredMethodPayload) payload;
                if (payToStoredMethodPayload.f73113c) {
                    vVar.T2(new ug6.t(vVar, payToStoredMethodPayload, null), new yi5.b(27));
                    return;
                } else {
                    vVar.L2(new y0("DIALOG_ID_TOP_UP_REJECTED", new nii.z(new TextLocalisedClause(R$string.topup_linked_account_rejected_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                    return;
                }
            }
            if (payload instanceof ExternalAccountTopupPayload.MandateCreationPayload) {
                vVar.d3();
                return;
            }
            if (payload instanceof ExternalAccountTopupPayload.PsePayload) {
                try {
                    String str3 = ((ExternalAccountTopupPayload.PsePayload) payload).f73114a;
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(str3));
                    intent2.setPackage(null);
                    vVar.A2(new ExternalDestination.ByIntent(intent2, null));
                    return;
                } catch (Exception unused2) {
                    vVar.f3();
                    return;
                }
            }
            if (payload instanceof ExternalAccountTopupPayload.OpenAccountTypeChooserPayload) {
                vVar.N2(new ChooseAccountTypeScreen(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new u69.g(vVar, (ExternalAccountTopupPayload.OpenAccountTypeChooserPayload) payload, 24));
            } else {
                if (!(payload instanceof ExternalAccountTopupPayload.BrazilPixMandatePayload)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.T2(new ug6.k(vVar, (ExternalAccountTopupPayload.BrazilPixMandatePayload) payload, null), new yi5.b(27));
            }
        }
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof ExternalAccountTopupPayload;
    }
}
