package u67;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private a() {
    }

    public static TextDelegate.Model a() {
        m70.a.c(t0.f186434a);
        return new TextDelegate.Model("ID_GIRO_LOGO_FOOTER", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(null, new CdnImage("logo_light", "mobile/payments/giro", null, new ImageTransformations(null, null, null, null, null, null, 26, 63), null, "logo_dark", Constants.TAG_GPI_VERSION), 1), null, null, 0, 0, 0, 0, 2036);
    }
}
