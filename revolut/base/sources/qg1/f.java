package qg1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f245624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedRevolutCardWrapper f245625c;

    public /* synthetic */ f(k kVar, SharedRevolutCardWrapper sharedRevolutCardWrapper, int i) {
        this.f245623a = i;
        this.f245624b = kVar;
        this.f245625c = sharedRevolutCardWrapper;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f245623a) {
            case 0:
                int i = R$string.xpay_card_security_success_dialog_card_frozen;
                this.f245624b.f245631s.getClass();
                return new j0((Clause) new TextLocalisedClause(i, u.c(lw2.b.a(this.f245625c)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            default:
                int i2 = R$string.xpay_card_security_success_dialog_card_terminated;
                this.f245624b.f245631s.getClass();
                return new j0((Clause) new TextLocalisedClause(i2, u.c(lw2.b.a(this.f245625c)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
        }
    }
}
