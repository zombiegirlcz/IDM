package im3;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.impl.R$string;
import eii.l;
import grl.k9;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements dl3.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final eii.c a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CONTACT_DETAILS_DELETE_CHAT_DIALOG_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55);
        List listK = v.k(new l((Clause) new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_items_history_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_items_history_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new GlyphImage(R$drawable.uikit_icn_24_chat, null, null, 6), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new l((Clause) new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_items_transactions_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_chat_bottom_sheet_delete_chat_items_transactions_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new GlyphImage(R$drawable.uikit_icn_24_eye, null, null, 6), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
        k9 k9Var = k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new eii.c(aVar, eVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null);
    }
}
