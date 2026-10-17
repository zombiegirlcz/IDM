package zac;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        String str;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AddShippingTrackingScreenContract$TrackingRequest addShippingTrackingScreenContract$TrackingRequest = domainState.d;
        boolean z = domainState.f320650c;
        if (addShippingTrackingScreenContract$TrackingRequest instanceof AddShippingTrackingScreenContract$TrackingRequest.Add) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_title, null, null, 14);
        } else {
            if (!(addShippingTrackingScreenContract$TrackingRequest instanceof AddShippingTrackingScreenContract$TrackingRequest.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_edit_title, null, null, 14);
        }
        AddShippingTrackingScreenContract$TrackingRequest addShippingTrackingScreenContract$TrackingRequest2 = domainState.d;
        if (addShippingTrackingScreenContract$TrackingRequest2 instanceof AddShippingTrackingScreenContract$TrackingRequest.Add) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_add_tracking, null, null, 14);
        } else {
            if (!(addShippingTrackingScreenContract$TrackingRequest2 instanceof AddShippingTrackingScreenContract$TrackingRequest.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_update, null, null, 14);
        }
        String str2 = domainState.f320648a;
        boolean z3 = z && d0.W(str2);
        InputTextDelegate.Model model = new InputTextDelegate.Model("TRACKING_NUMBER_INPUT_LIST_ID", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_tracking_number, null, null, 14), null, false, null, false, z3 ? new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_tracking_number_required, null, null, 14) : null, null, null, null, null, null, false, null, null, z3, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -131208, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        DeliveryCarrier deliveryCarrier = domainState.f320649b;
        boolean z4 = z && deliveryCarrier == null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_carrier, null, null, 14);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("CARRIER_INPUT_LIST_ID", (deliveryCarrier == null || (str = deliveryCarrier.f84655b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause3, null, false, null, false, z4 ? new TextLocalisedClause(R$string.revolut_pay_add_shipping_tracking_carrier_required, null, null, 14) : null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, z4 ? Integer.valueOf(R$attr.uikit_colorStatusDanger) : null, (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, null, z4, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33693832, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new l(textLocalisedClause, textLocalisedClause2, v.k(model, model2));
    }
}
