package mae;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.j f204007a;

    public k(m3j.j beneficiaryAvatarMapper, vb8.b juniorAllowanceRecurringPaymentUiMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentUiMapper, "juniorAllowanceRecurringPaymentUiMapper");
        this.f204007a = beneficiaryAvatarMapper;
    }

    public final Image a(qua.p subscription) {
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        f5j.a aVar = subscription.f249329r;
        vua.a aVar2 = subscription.f249330s;
        if (aVar != null) {
            return this.f204007a.b(aVar);
        }
        if (aVar2 == null && !ofm.q.w(subscription)) {
            fva.j jVar = subscription.O;
            if (jVar != null && jVar.f138401a) {
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_status_clock_arrows;
                int i2 = R$attr.uikit_colorWhite;
                return companion.d(i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 2.0f, 2.0f, fValueOf);
            }
            if (ofm.q.E(subscription)) {
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                int i3 = R$drawable.uikit_icn_24_revert_left;
                int i5 = R$attr.uikit_colorWhite;
                return companion2.d(i3, R$attr.uikit_colorAccent, i5, Integer.valueOf(i5), 2.0f, 2.0f, fValueOf);
            }
            if (!qua.u.K(subscription) && !qua.u.J(subscription)) {
                return null;
            }
            LayeredImage.Companion companion3 = LayeredImage.INSTANCE;
            ApmUpi.f61828c.getClass();
            int i6 = R$drawable.uikit_icn_24_upi;
            int i21 = R$attr.uikit_colorForeground;
            int i22 = R$attr.uikit_colorBackground;
            return LayeredImage.Companion.f(companion3, i6, i22, i22, Integer.valueOf(i21), 4.0f, 3.0f, null, 64);
        }
        return h5k.a.e();
    }
}
