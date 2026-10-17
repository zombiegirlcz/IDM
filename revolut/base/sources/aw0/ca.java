package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ca extends ea {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GlyphImage f10263g;

    public ca() {
        this(new GlyphImage(R$drawable.uikit_icn_24_lock_opened, null, null, 6));
    }

    @Override // aw0.ea
    public final GlyphImage a() {
        return this.f10263g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ca) && Intrinsics.f(this.f10263g, ((ca) obj2).f10263g);
    }

    public final int hashCode() {
        return this.f10263g.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(GlyphImage icon) {
        super(R$attr.uikit_colorGreyTone20, R$attr.uikit_colorTransparent, Integer.valueOf(R$attr.uikit_colorGreyTone10), 2.0f, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone10);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f10263g = icon;
    }
}
