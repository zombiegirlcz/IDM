package jl6;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointDataSharingScreenContract$InputData f175607a;

    public j(JointDataSharingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f175607a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cii.a aVar;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        JointDataSharingScreenContract$InputData jointDataSharingScreenContract$InputData = this.f175607a;
        if (jointDataSharingScreenContract$InputData instanceof JointDataSharingScreenContract$InputData.EnableDataSharing) {
            aVar = new cii.a(new lw0.a(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_enable_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_enable_description, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_button_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "JOINT_DATA_SHARING_TAG", false, null, e.f175604a, 488), null, null, 55));
        } else {
            boolean z = jointDataSharingScreenContract$InputData instanceof JointDataSharingScreenContract$InputData.DisableDataSharing;
            c cVar = c.f175602a;
            if (z) {
                aVar = new cii.a(new lw0.a(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_disable_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_disable_description, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_button_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, cVar, 508), new n6(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_button_disable, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "JOINT_DATA_SHARING_TAG", false, null, d.f175603a, 492), (Clause) null, (aw0.f) null, 25));
            } else {
                if (!(jointDataSharingScreenContract$InputData instanceof JointDataSharingScreenContract$InputData.LearnDataSharing)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new cii.a(new lw0.a(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_enable_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_enable_description, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_bottmsheet_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, cVar, 504), null, null, 55));
            }
        }
        return new h(aVar);
    }
}
