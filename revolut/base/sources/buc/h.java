package buc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;
import grl.k9;
import nii.u0;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    public static y0 a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_location_error_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_location_error_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_location_error_action_locate_manually, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_location_error_action_go_back, null, null, 14);
        k9 k9Var = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new y0(null, new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, u0.SOFT_FAIL, null, null, 28116), false, 5);
    }
}
