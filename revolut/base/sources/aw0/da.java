package aw0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class da extends ea {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GlyphImage f10284g;

    public da() {
        this(new GlyphImage(R$drawable.uikit_icn_24_check, null, null, 6));
    }

    @Override // aw0.ea
    public final GlyphImage a() {
        return this.f10284g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof da) && Intrinsics.f(this.f10284g, ((da) obj2).f10284g);
    }

    public final int hashCode() {
        return this.f10284g.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public da(GlyphImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        int i = R$attr.uikit_colorOnAccentNeutral;
        int i2 = R$attr.uikit_colorGreyTone50;
        super(i, i2, null, BitmapDescriptorFactory.HUE_RED, i2, i2);
        this.f10284g = icon;
    }
}
