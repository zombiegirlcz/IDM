package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.statements.api.models.ContractSummaryType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.i f162734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fna.h f162735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zxd.c f162736n;
    public final ij0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vyd.a f162737p;

    public n(fna.i itemsFactory, fna.h interactor, zxd.c statementsInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        this.f162734l = itemsFactory;
        this.f162735m = interactor;
        this.f162736n = statementsInteractor;
        this.o = coreNetworkConfiguration;
        this.f162737p = dialogModelConfigurationFactory;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode == -1087519285) {
            if (str.equals("ID_SUBJECT_ACCESS_REQUEST")) {
                j7a.g.Companion.getClass();
                ActivityNavigateCommand activityNavigateCommand = new ActivityNavigateCommand(j7a.a.f171876b, new PdfNativeSaveContract$Configuration(PdfNativeSaveContract$ProfileConfirmationPayload.Subject.f80323a, "PROFILE_CONFIRMATION_FLOW"), null, 1, 0, null, null, null, null, false, 1012);
                Intrinsics.checkNotNullParameter(activityNavigateCommand, "<this>");
                A2(new BridgeDestination(activityNavigateCommand));
                return;
            }
            return;
        }
        if (iHashCode != -954532867) {
            if (iHashCode == 1410852576 && str.equals("ID_CARD_CONFIRMATION")) {
                j7a.g.Companion.getClass();
                ActivityNavigateCommand activityNavigateCommand2 = new ActivityNavigateCommand(j7a.a.f171876b, new PdfNativeSaveContract$Configuration(PdfNativeSaveContract$ProfileConfirmationPayload.Cards.f80322a, "PROFILE_CONFIRMATION_FLOW"), null, 2, 0, null, null, null, null, false, 1012);
                Intrinsics.checkNotNullParameter(activityNavigateCommand2, "<this>");
                A2(new BridgeDestination(activityNavigateCommand2));
                return;
            }
            return;
        }
        if (str.equals("ID_CONTRACT_SUMMARY")) {
            ContractSummaryType type = ContractSummaryType.ELECTRONIC_BANKING;
            ryd.w wVar = (ryd.w) this.f162736n;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            b3(wVar.n(2, new rsl.p(wVar, type, 12)), this.o, this.f162737p);
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.General documentsPage2 = (DocumentsPage.General) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        return nim.a.v(this.f162735m.b(), new ii4.b(this, 16));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.documents_group_general, null, null, 14);
    }
}
