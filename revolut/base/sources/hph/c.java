package hph;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f154535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ooh.d f154536b;

    public c(f01.c uiKitResources, ooh.d instrumentGroupMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(instrumentGroupMapper, "instrumentGroupMapper");
        this.f154535a = uiKitResources;
        this.f154536b = instrumentGroupMapper;
    }

    public final LayeredImage a(ScreenerCollection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int iA = this.f154535a.a(collection.f105155b);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        return companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }
}
