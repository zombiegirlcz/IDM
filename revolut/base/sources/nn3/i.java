package nn3;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.zj;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static PlainTextDelegate.Model a(Clause clause) {
        if (clause == null) {
            return null;
        }
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_EMPTY_STATE_ADDITIONAL_INFO", (Clause) null, clause, (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static FullScreenStateDelegate.Model b(Clause clause, Clause clause2, CdnImage cdnImage) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_STATE", clause, clause2, new ComplexImage.Regular(cdnImage), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
