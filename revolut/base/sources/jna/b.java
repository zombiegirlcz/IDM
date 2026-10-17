package jna;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import com.revolut.feature.statements.api.navigation.AccountConfirmationSelectionDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import ina.k;
import io3.l;
import j7a.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zxd.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y91.b f176663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f176664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij0.a f176665c;
    public final vyd.a d;

    public b(y91.b accountsProductFeatureChecker, c statementsInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        this.f176663a = accountsProductFeatureChecker;
        this.f176664b = statementsInteractor;
        this.f176665c = coreNetworkConfiguration;
        this.d = dialogModelConfigurationFactory;
    }

    public final void a(k kVar, AccountId accountId, l pocketType) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        x91.a aVarB = this.f176663a.b();
        int i = aVarB == null ? -1 : a.f176662a[aVarB.ordinal()];
        if (i == -1) {
            g.Companion.getClass();
            ActivityNavigateCommand activityNavigateCommand = new ActivityNavigateCommand(j7a.a.f171876b, new PdfNativeSaveContract$Configuration(new PdfNativeSaveContract$ProfileConfirmationPayload.Account(fna.b.a(accountId), pocketType), "PROFILE_CONFIRMATION_FLOW"), null, 1, 0, null, null, null, null, false, 1012);
            Intrinsics.checkNotNullParameter(activityNavigateCommand, "<this>");
            kVar.A2(new BridgeDestination(activityNavigateCommand));
            return;
        }
        if (i == 1) {
            AccountConfirmationSelectionDestination accountConfirmationSelectionDestination = new AccountConfirmationSelectionDestination(accountId, pocketType);
            Intrinsics.checkNotNullParameter(accountConfirmationSelectionDestination, "<this>");
            kVar.A2(accountConfirmationSelectionDestination);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strA = fna.b.a(accountId);
            if (strA == null) {
                strA = null;
            }
            kVar.b3(c.b(this.f176664b, null, strA, pocketType, 5), this.f176665c, this.d);
        }
    }
}
