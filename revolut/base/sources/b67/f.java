package b67;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ct6.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f12543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12544b;

    public f(w clauseFactory, gr6.e freelancerAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        this.f12543a = freelancerAvailabilityInteractor;
        this.f12544b = v.k("ITEM_ID_TOOLBOX_PERKS", "ITEM_ID_TOOLBOX_TAX_HUB", "ITEM_ID_TOOLBOX_TAX_POCKET", "ITEM_ID_TOOLBOX_PRODUCTS", "ITEM_ID_TOOLBOX_HARDWARE", "ITEM_ID_TOOLBOX_REVOLUT_READER", "ITEM_ID_TOOLBOX_INVITE_FRIENDS", "ITEM_ID_TOOLBOX_PLUGINS", "ITEM_ID_TOOLBOX_SETTINGS", "ITEM_ID_TOOLBOX_LEARN", "ITEM_ID_TOOLBOX_BRANDING", "ITEM_ID_TOOLBOX_INVOICE_SETTINGS", "ITEM_ID_TOOLBOX_POCKET", "ITEM_ID_TOOLBOX_ANALYTICS");
    }

    public static LayeredImage a(int i) {
        return LayeredImage.Companion.p(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, 24.0f);
    }
}
