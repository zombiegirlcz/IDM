package vq9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LayeredImage f291363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f291364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LayeredImage f291365c;
    public static final LayeredImage d;
    public static final LayeredImage e;
    public static final LayeredImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LayeredImage f291366g;

    static {
        h5k.a.e();
        f291363a = new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorBackground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccent), 4.0f, 4.0f, 4.0f, 4.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_arrow_send, Integer.valueOf(R$attr.uikit_colorBackground), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        f291364b = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_16_cross_circle, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
        f291365c = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_16_time, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
        d = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_statement, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
        e = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 8.0f, null, null, 48);
        f = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_logout_door, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 8.0f, null, null, 48);
        f291366g = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_envelope, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
    }

    private j() {
    }
}
