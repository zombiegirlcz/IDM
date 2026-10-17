package al6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6156b;

    public /* synthetic */ d(String str, int i) {
        this.f6155a = i;
        this.f6156b = str;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f6155a) {
            case 0:
                tg6.a it8 = (tg6.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new g0(new TextLocalisedClause(R$string.pse_topup_success_title, u.c(this.f6156b), null, 12), new TextLocalisedClause(R$string.pse_topup_success_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
            case 1:
                String str = this.f6156b;
                return new j0((Clause) (str != null ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchant_block_success_title, u.c(str), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchant_block_success_title_no_name, null, null, 14)), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            default:
                String str2 = this.f6156b;
                return new j0((Clause) (str2 != null ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscription_block_success_title, u.c(str2), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscription_block_success_title_no_name, null, null, 14)), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
        }
    }
}
