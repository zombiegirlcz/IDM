package rzb;

import au0.o0;
import au0.u0;
import au0.z0;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(z0 z0Var, o0 o0Var) {
        return u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new CdnImage("rev_points_opt_in_header", "mobile/rev_points", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (s8) null, (Color.SolidRes) null, 14), z0Var, o0Var, null));
    }
}
