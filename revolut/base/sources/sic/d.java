package sic;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements kgc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f263538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f263539b;

    public d(b backgroundDrawableMapper) {
        Intrinsics.checkNotNullParameter(backgroundDrawableMapper, "backgroundDrawableMapper");
        this.f263538a = backgroundDrawableMapper;
        List listK = v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorGreyTone50), 0.1f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_gift_legacy, new Color.Solid(R$attr.uikit_colorGreyTone50), 10.0f, 10.0f, 10.0f, 10.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64));
        Float fValueOf = Float.valueOf(40.0f);
        this.f263539b = new LayeredImage(listK, fValueOf, fValueOf, 8);
    }

    public final Image a(int i, String str) {
        int iAbs = Math.abs(i);
        Lazy lazy = this.f263538a.f263536a;
        int iIntValue = ((Number) ((List) lazy.getValue()).get(iAbs % ((List) lazy.getValue()).size())).intValue();
        return str != null ? new UrlImage(str, null, null, null, 0L, null, Integer.valueOf(iIntValue), null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, false, 507774) : new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }
}
