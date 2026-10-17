package ri4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends jki.g implements i {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.e f254548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.c f254549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hz3.c f254550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final GiveConsentScreenContract$InputData f254551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f254552t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hw3.e creditApplicationConfigInteractor, hw3.c spousalConsentPartnerInteractor, hz3.c creditApplicationCommandsFactory, GiveConsentScreenContract$InputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(spousalConsentPartnerInteractor, "spousalConsentPartnerInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f254548p = creditApplicationConfigInteractor;
        this.f254549q = spousalConsentPartnerInteractor;
        this.f254550r = creditApplicationCommandsFactory;
        this.f254551s = inputData;
        this.f254552t = new e(new Data(null, null, true, 3, null), new GiveConsentConfiguration(null, null, null, null));
    }

    public static final void y2(n nVar, it3.d dVar) {
        yji.l.a1(nVar, nVar.X1(new y0("STATUS_DIALOG_RESPONSE_SENT_ID", new j0((Clause) new TextLocalisedClause(R$string.credit_application_family_credit_spouse_consent_result_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_application_family_credit_spouse_consent_result_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new r5e.e(nVar, dVar, null, 27), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new l(this, null, 0), new whi.b(6));
        yji.l.b1(this, rd0.e.b(this.f254549q.f(this.f254551s.f68476a.d)), null, new r5e.e(this, null, 26), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f254552t;
    }
}
