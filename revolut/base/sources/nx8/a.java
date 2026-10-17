package nx8;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.k9;
import lw0.c;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static dii.a a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(R$string.video_conference_interrupted_subtitle, null, null, 14), new c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24);
        h hVar = new h(false, new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
        k9 k9Var = k9.KYC;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }

    public static /* synthetic */ dii.a b(a aVar, TextLocalisedClause textLocalisedClause) {
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.video_conference_interrupted_action_retry, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.video_conference_interrupted_action_not_now, null, null, 14);
        aVar.getClass();
        return a(textLocalisedClause, textLocalisedClause2, textLocalisedClause3);
    }

    public static y0 c() {
        return new y0("VIDEO_CALL_COMPLETED_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.video_conference_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4);
    }
}
