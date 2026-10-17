package qx6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1373a Companion = new C1373a();

    /* JADX INFO: renamed from: qx6.a$a, reason: collision with other inner class name */
    public static final class C1373a {
        private C1373a() {
        }
    }

    public static RowDelegate.Model a(a aVar, String str, int i, int i2) {
        aVar.getClass();
        return new RowDelegate.Model(str, LayeredImage.Companion.b(LayeredImage.INSTANCE, i2, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, Float.valueOf(20.0f), null, 32), null, null, new TextLocalisedClause(i, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1056964460);
    }

    public final RowDelegate.Model b(FreelancerInvoice freelancerInvoice) {
        xi0.b bVar = freelancerInvoice.i;
        xi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, xi0.b.f306278p)) {
            return null;
        }
        return a(this, "ACTION_ID_DUPLICATE", R$string.freelancer_common_action_duplicate, R$drawable.uikit_icn_24_copy);
    }
}
