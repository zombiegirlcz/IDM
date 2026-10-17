package aw0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ba extends ea {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GlyphImage f10250g;

    public ba() {
        this(new GlyphImage(R$drawable.uikit_icn_24_cross, null, null, 6));
    }

    @Override // aw0.ea
    public final GlyphImage a() {
        return this.f10250g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ba) && Intrinsics.f(this.f10250g, ((ba) obj2).f10250g);
    }

    public final int hashCode() {
        return this.f10250g.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(GlyphImage icon) {
        super(R$attr.uikit_colorOnAccentNeutral, R$attr.uikit_colorGreyTone20, null, BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone10);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f10250g = icon;
    }
}
