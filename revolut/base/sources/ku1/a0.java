package ku1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import nii.m0;
import nii.t1;
import nii.u1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c02.j f189594b;

    public /* synthetic */ a0(e0 e0Var, c02.j jVar, int i) {
        this.f189593a = i;
        this.f189594b = jVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i = this.f189593a;
        c02.j jVar = this.f189594b;
        switch (i) {
            case 0:
                q qVar = e0.Companion;
                int i2 = r.f189622a[jVar.f20115b.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_success_payment, null, null, 14);
                } else if (i2 == 3) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_success_withdraw, null, null, 14);
                } else {
                    if (i2 != 4 && i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_success_refund, null, null, 14);
                }
                return new nii.j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            default:
                q qVar2 = e0.Companion;
                int i3 = r.f189622a[jVar.f20115b.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_rejected, null, null, 14);
                } else if (i3 == 3) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_rejected_withdraw, null, null, 14);
                } else {
                    if (i3 != 4 && i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause2 = new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_rejected_refund, null, null, 14);
                }
                return new nii.j0((Clause) textLocalisedClause2, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (nii.h0) null, (ResourceImage) null, 3550);
        }
    }
}
