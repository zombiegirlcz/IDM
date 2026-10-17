package yi4;

import android.os.Parcelable;
import cli.k;
import cli.n;
import cli.y;
import cli.z;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.screen.StatusDialogScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.k9;
import hs3.o;
import hs3.x1;
import hs3.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.u1;
import nii.w1;
import nii.y0;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements z {
    public final StatusDialogScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f314237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f314238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f314239r;

    public g(n stateMapper, StatusDialogScreenContract$InputData inputData, hw3.c creditActionPathInteractor, b statusDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditActionPathInteractor, "creditActionPathInteractor");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        this.o = inputData;
        this.f314237p = creditActionPathInteractor;
        this.f314238q = statusDialogProvider;
        this.f314239r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y0 y0Var;
        y1 statusDialogMetadata = this.o.f68489a;
        this.f314238q.getClass();
        Intrinsics.checkNotNullParameter(statusDialogMetadata, "statusDialogMetadata");
        x1 x1Var = statusDialogMetadata.f154976b;
        o oVar = statusDialogMetadata.d;
        String str = statusDialogMetadata.f154977c;
        String str2 = statusDialogMetadata.f154975a;
        int i = a.f314232a[x1Var.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_status_dialog_title, u.c(str2), null, 12);
            TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_description, u.c(str), null, 12) : null;
            TextLocalisedClause textLocalisedClause3 = oVar != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_primary_button, u.c(oVar.f154922a), null, 12) : null;
            k9 k9Var = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            y0Var = new y0(null, new l0(textLocalisedClause, textLocalisedClause2, null, textLocalisedClause3, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 884), false, 5);
        } else if (i == 2) {
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_status_dialog_title, u.c(str2), null, 12);
            TextLocalisedClause textLocalisedClause5 = str != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_description, u.c(str), null, 12) : null;
            TextLocalisedClause textLocalisedClause6 = oVar != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_primary_button, u.c(oVar.f154922a), null, 12) : null;
            k9 k9Var2 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            y0Var = new y0(null, new nii.z(textLocalisedClause4, textLocalisedClause5, textLocalisedClause6, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, null, null, null, 32244), false, 5);
        } else if (i == 3) {
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_application_status_dialog_title, u.c(str2), null, 12);
            TextLocalisedClause textLocalisedClause8 = str != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_description, u.c(str), null, 12) : null;
            TextLocalisedClause textLocalisedClause9 = oVar != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_primary_button, u.c(oVar.f154922a), null, 12) : null;
            k9 k9Var3 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            y0Var = new y0(null, new g0(textLocalisedClause7, textLocalisedClause8, null, textLocalisedClause9, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), false, null, 15860), false, 5);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.credit_application_status_dialog_title, u.c(str2), null, 12);
            TextLocalisedClause textLocalisedClause11 = str != null ? new TextLocalisedClause(R$string.credit_application_status_dialog_description, u.c(str), null, 12) : null;
            u1 w1Var = oVar != null ? new w1(6, new TextLocalisedClause(R$string.credit_application_status_dialog_primary_button, u.c(oVar.f154922a), null, 12), null) : u1.b.f216225a;
            k9 k9Var4 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            y0Var = new y0(null, new j0((Clause) textLocalisedClause10, (Clause) textLocalisedClause11, (StatusDialogDescriptionProgress) null, (Parcelable) null, w1Var, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4012), false, 5);
        }
        l.a1(this, X1(y0Var), null, null, new wo2.l(this, statusDialogMetadata, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314239r;
    }
}
