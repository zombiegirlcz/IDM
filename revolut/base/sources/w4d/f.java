package w4d;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends oki.h implements z {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DisplayAmountToggleControllerContract$InputData f294545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f294546q;

    public f(n stateMapper, j interactor, DisplayAmountToggleControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f294545p = inputData;
        ((nr4.b) interactor).getClass();
        this.f294546q = mra.d.b(this, new c(new g(new TextLocalisedClause(R$string.credit_card_settings_display_amount_toggle_title, null, null, 14)), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        DisplayAmountToggleControllerContract$InputData displayAmountToggleControllerContract$InputData = this.f294545p;
        l.a1(this, ((nr4.b) this.o).a(displayAmountToggleControllerContract$InputData.f86025a, displayAmountToggleControllerContract$InputData.f86026b), null, null, new vrl.d(this, null, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294546q;
    }
}
