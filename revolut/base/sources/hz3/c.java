package hz3;

import an4.i;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOperationStatusCheckConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ft3.j1;
import java.util.ArrayList;
import java.util.List;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vie.h;
import x94.f;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vx4.a f157014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f157015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f157016c;
    public final vx4.b d;
    public final h e;

    public c(vx4.a loanProductCommandFactory, i creditCardProductCommandFactory, i payLaterProductCommandFactory, vx4.b overdraftProductCommandFactory, h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(loanProductCommandFactory, "loanProductCommandFactory");
        Intrinsics.checkNotNullParameter(creditCardProductCommandFactory, "creditCardProductCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterProductCommandFactory, "payLaterProductCommandFactory");
        Intrinsics.checkNotNullParameter(overdraftProductCommandFactory, "overdraftProductCommandFactory");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f157014a = loanProductCommandFactory;
        this.f157015b = creditCardProductCommandFactory;
        this.f157016c = payLaterProductCommandFactory;
        this.d = overdraftProductCommandFactory;
        this.e = tabCreditAvailabilityInteractor;
    }

    public final NaviCommand a(j1 productType, String facilityId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        switch (b.f157013b[productType.ordinal()]) {
            case 1:
                return this.f157015b.b(facilityId);
            case 2:
                return this.f157016c.b(facilityId);
            case 3:
                return this.d.b(facilityId);
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalArgumentException(productType + " has no home screen command factory implemented");
            case 6:
                return this.f157014a.b(facilityId);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final NaviCommand b() {
        x94.i.Companion.getClass();
        return new ActivityNavigateCommand(x94.c.f303549b, new CreditApplicationDocumentViewerContract$Configuration(new DocumentViewerScreenConfig(false, false, ju3.b.QUICK_READ_ACTION_SUPPORT, null, new TextLocalisedClause(R$string.credit_common_accept, null, null, 14), null, 40), "credit_registers_document_id", f.VIEW, null, "CREDIT_REGISTERS_FLOW"), null, null, 0, null, null, null, null, false, 1020);
    }

    public final NaviCommand c() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(this.e.a() ? ibb.c.f.f83420a : ibb.c.f160140a.f83420a, null), null, null, 6)));
    }

    public final NaviCommand d(g popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        return f(new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_signed_locktime_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_signed_locktime_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_signed_locktime_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_signed_locktime_button_turn_notifications_on, null, null, 14)), popupType);
    }

    public final NaviCommand e(CreditOperationStatusCheckConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        List<CreditOperationStatusCheckConfig.SpinnerContent> list = screenConfig.f66353a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CreditOperationStatusCheckConfig.SpinnerContent spinnerContent : list) {
            arrayList.add(new SpinnerConfiguration.Content.SpinnerContent(spinnerContent.f66356a, spinnerContent.f66357b));
        }
        SpinnerConfiguration.Content.Dynamic dynamic = new SpinnerConfiguration.Content.Dynamic(screenConfig.f66354b, arrayList);
        int i = screenConfig.f66355c;
        long j2 = screenConfig.d;
        long j3 = ((long) i) * j2;
        ks3.b bVar = pluginConfiguration.f66894g;
        List list2 = screenConfig.f;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Spinner(new SpinnerConfiguration.FullScreen(dynamic, new SpinnerConfiguration.Mode.Limited(i, j2, j3, new SpinnerConfiguration.Mode.Limited.TerminationCondition.StatusStateChanged(bVar, list2), screenConfig.e, g.STATUS_DIALOG)), false, false, pluginConfiguration, null));
    }

    public final NaviCommand f(WaitingPopupScreenConfig screenConfig, g popupType) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        int i = b.f157012a[popupType.ordinal()];
        if (i == 1) {
            aj4.c.Companion.getClass();
            return new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.WaitingPopup(screenConfig, null).f98274b), null, null, 0, null, null, null, null, false, 1020);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Pending("id_in_progress", screenConfig.f66427a, screenConfig.f66428b, null, null, null, false, 8184), null, null, new FinishCommand(null, null, null, 7), null, 222);
    }
}
