package dyf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f121102a;

    public f(c travelBookingListItemMapper) {
        Intrinsics.checkNotNullParameter(travelBookingListItemMapper, "travelBookingListItemMapper");
        this.f121102a = travelBookingListItemMapper;
    }

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_BLOCK_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static List b(boolean z, lxf.a aVar) {
        if (!z) {
            return f0.f322471a;
        }
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("PAST_OR_CANCELLED_BOOKINGS_BUTTON_ID", aVar.f200569g, 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
