package beb;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.restaurants.impl.R$string;
import ip0.gu;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dec.q f14734a;

    public b0(dec.q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f14734a = paymentMethodsCommonMapper;
    }

    public static ArrayList a() {
        return yp0.b.h(zhm.u.c(b()), new gu("CONFIRM_RESERVATION_PAYMENT_DETAILS_HEADER", 0, 0, 30), null, 0, 126);
    }

    public static sa b() {
        return new sa("CONFIRM_RESERVATION_PAYMENT_ERROR", (Clause) new TextLocalisedClause(R$string.retail_restaurants_common_error_generic_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), zhm.u.c(new ActionsView.Item("CONFIRM_RESERVATION_PAYMENT_RETRY", null, false, null, null, new TextLocalisedClause(R$string.retail_restaurants_common_actions_try_again, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPink), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
    }
}
