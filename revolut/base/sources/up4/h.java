package up4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281842a;

    public /* synthetic */ h(int i) {
        this.f281842a = i;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f281842a) {
            case 0:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_autopay_setup_success_message_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_autopay_setup_success_message_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 1:
                return new g0(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_linking_akahu_in_progress_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_linking_akahu_in_progress_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
            case 2:
                return new g0(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_unlinking_akahu_in_progress_title, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382);
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                vr4.i iVar = (vr4.i) obj2;
                if (iVar instanceof vr4.g) {
                    vr4.g gVar = (vr4.g) iVar;
                    return new j0((Clause) gVar.f291483a, (Clause) gVar.f291484b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                }
                if (!(iVar instanceof vr4.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                vr4.h hVar = (vr4.h) iVar;
                return new g0(hVar.f291485a, hVar.f291486b, null, null, null, null, null, null, false, null, false, null, 16380);
            case 7:
                return null;
            case 8:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.defi.accounts.impl.R$string.defi_accounts_creation_status_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 9:
                return null;
            case 10:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return null;
            case 11:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new j0((Clause) new TextLocalisedClause(R.string.card_order_waiting_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 12:
                return null;
            case 13:
                return new j0((Clause) new TextLocalisedClause(R$string.credit_application_offer_document_loading_ready_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582);
            case 14:
                return null;
            case 15:
                return null;
            default:
                return null;
        }
    }
}
