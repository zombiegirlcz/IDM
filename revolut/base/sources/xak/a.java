package xak;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C1690a Companion = new C1690a();

    /* JADX INFO: renamed from: xak.a$a, reason: collision with other inner class name */
    public static final class C1690a {
        private C1690a() {
        }
    }

    public static dii.a a(PendingPaymentBottomSheetInputData flowInputData) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        lw0.a aVar = new lw0.a(flowInputData.f102419a, flowInputData.f102420b, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_cart, null, null, 6)), null, false, 24);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, flowInputData.f102421c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
