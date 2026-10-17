package t87;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f268857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3h.f f268858b;

    public l(o chartBuilder, e3h.f chartMapper) {
        Intrinsics.checkNotNullParameter(chartBuilder, "chartBuilder");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        this.f268857a = chartBuilder;
        this.f268858b = chartMapper;
    }

    public static PercentageClause b(float f) {
        return new PercentageClause(f, PercentageClause.Format.Default.f57910a, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
    }

    public final ArrayList a(eel.c cVar, List list) {
        List listC = u.c(new FullScreenStateDelegate.Model("CHARTS_ERROR_LIST_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31172));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return d0.F0(((i4h.d) this.f268858b).b(cVar, list, Integer.valueOf(list.indexOf(cVar))), listC);
    }
}
