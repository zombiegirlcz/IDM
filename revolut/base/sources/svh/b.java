package svh;

import android.util.SparseIntArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f265867a = new b();

    private b() {
    }

    public static LayeredImage a() {
        LayeredImage.Layer.Drawable drawable = new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_40_oval_background, Integer.valueOf(R$attr.uikit_colorAccent), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124);
        SparseIntArray sparseIntArray = vw0.a.f292608a;
        Float f = null;
        return new LayeredImage(v.k(drawable, new LayeredImage.Layer.Drawable(vw0.a.a(R$drawable.uikit_icn_24_coins), Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), f, f, 14);
    }
}
