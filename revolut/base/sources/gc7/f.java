package gc7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.home_feed.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f142369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f142370b;

    public f(o itemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f142369a = itemMapper;
        this.f142370b = dateProvider;
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i) {
        return new RowDelegate.Model.MainImage.Image40(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_40_oval_background, new Color.Solid(R$attr.uikit_colorAccentNeutral_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, new Color.Solid(R$attr.uikit_colorAccentNeutral), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
    }

    public static RowDelegate.Model b() {
        return new RowDelegate.Model("scheduled_payment_widget_credit_card_autopay", a(R$drawable.uikit_icn_24_calendar_recurring), new TextLocalisedClause(R$string.scheduled_payments_widget_action_credit_autopay_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.scheduled_payments_widget_action_credit_autopay_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    public static List c(boolean z, boolean z3, boolean z4) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        RowDelegate.Model model3 = null;
        if (z3) {
            model = new RowDelegate.Model("scheduled_payment_widget_schedule_payment", a(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.scheduled_payments_widget_action_schedule_transfer_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.scheduled_payments_widget_action_schedule_transfer_bank_account_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        } else {
            model = null;
        }
        if (z) {
            model2 = new RowDelegate.Model("scheduled_payment_widget_find_subscription", a(R$drawable.uikit_icn_24_payments_recurring), new TextLocalisedClause(R$string.scheduled_payments_widget_action_find_subscription_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.scheduled_payments_widget_action_find_subscription_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        } else {
            model2 = null;
        }
        if (z4) {
            model3 = new RowDelegate.Model("scheduled_payment_widget_boleto_finder", a(R$drawable.uikit_icn_24_documents_pair), new TextLocalisedClause(R$string.scheduled_payments_widget_action_boleto_finder_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.scheduled_payments_widget_action_boleto_finder_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        }
        RowDelegate.Model[] elements = {model, model2, model3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.widgets_catalogue_upcomingPayments_title, null, null, 14);
    }
}
