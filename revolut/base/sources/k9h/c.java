package k9h;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.k;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements k0h.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adh.c f182336a;

    public c(adh.c instrumentToRowMapper) {
        Intrinsics.checkNotNullParameter(instrumentToRowMapper, "instrumentToRowMapper");
        this.f182336a = instrumentToRowMapper;
    }

    public static ListSubheaderDelegate.Model a(k kVar, boolean z) {
        return new ListSubheaderDelegate.Model(j6.a.q("COLLECTIONS_SUBHEADER_LIST_ID_", kVar.d()), (Image) null, (Clause) new TextClause(kVar.e(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, z, false, (Clause) new TextLocalisedClause(R$string.wealth_view_all, null, null, 14), true, (Object) new k0h.d(kVar.c()), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259874);
    }
}
