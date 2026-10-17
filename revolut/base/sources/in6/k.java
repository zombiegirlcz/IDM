package in6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f162676b;

    public /* synthetic */ k(l lVar, int i) {
        this.f162675a = i;
        this.f162676b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f162675a) {
            case 0:
                this.f162676b.C2(h.f162673a);
                break;
            case 1:
                l lVar = this.f162676b;
                lVar.f162678q.getClass();
                yji.l.b1(lVar, lVar.X1(new y0("AIS_COMPLETED_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.external_institutions_penny_topup_account_initiation_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, new iaf.d(lVar, null, 14), 3);
                break;
            default:
                this.f162676b.C2(g.f162672a);
                break;
        }
        return Unit.f186387a;
    }
}
