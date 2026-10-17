package w97;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.c;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import o97.h;
import o97.m0;
import o97.y;
import t97.d;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final IconDelegate.Model a(p97.a aVar, m0 sourceIdentifier) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        String strName = ((d) aVar.f234280a).name();
        Clause clause = aVar.d;
        if (clause == null) {
            clause = aVar.f234282c;
        }
        Clause clause2 = clause;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = aVar.f234281b;
        int i2 = R$attr.uikit_colorAccentNeutral;
        Color.Solid solid = new Color.Solid(i2);
        Color.ModifiedColor backgroundColor = new Color.ModifiedColor(new Color.Solid(i2), 0.1f);
        companion.getClass();
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        float f = (2 * 8.0f) + 24.0f;
        return new IconDelegate.Model(strName, new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rect_background, backgroundColor, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (c) null, 124), new LayeredImage.Layer.Drawable(i, solid, 8.0f, 8.0f, 8.0f, 8.0f, (c) null, 64)), Float.valueOf(f), Float.valueOf(f), (Clause) null), clause2, null, null, null, new y(sourceIdentifier, aVar, null, 60), new AnalyticsContext(h.a(sourceIdentifier, ((d) aVar.f234280a).b())), 192);
    }
}
