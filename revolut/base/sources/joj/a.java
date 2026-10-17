package joj;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LayeredImage f177144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f177145b;

    static {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        f177144a = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48);
        f177145b = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_sim_card, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48);
    }
}
