package yc0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zc0.e3;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements k {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f312429a;

    public m(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f312429a = dateProvider;
    }

    @Override // yc0.k
    public final rp0.y d(FormScreen screen, DateInputItem item, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(item, "item");
        LocalDate localDate2 = localDate == null ? item.d : localDate;
        rp0.l lVar = rp0.l.WINDOW;
        rp0.t tVar = new rp0.t(uj3.b.n(screen), uj3.b.k(screen), null, 28);
        g5 g5Var = new g5(item.f63380a, localDate2 == null ? ((l80.f) this.f312429a).e() : localDate2, localDate2, true, null, null, null, null, null, null, 0, 0, 1048560);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        Clause clauseJ = uj3.b.j(screen);
        e3 e3Var = localDate2 != null ? new e3(item.f63380a, localDate2) : null;
        boolean z = localDate2 != null;
        int i = R$attr.uikit_dp16;
        return new rp0.y(zhm.v.k(g5Var, new LargeActionButtonDelegate.Model("DateInput_DatePicker", defaultFilledButton, null, clauseJ, z, null, e3Var, i, R$attr.uikit_dp32, i, i, 352)), tVar, lVar, 0, null, null, "BACKEND_SCREEN_DELEGATES_KEY", null, null, null, 3800);
    }
}
