package hp2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements dli.b {
    public final BankAccountSwitchingStartDateSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f61.a f154395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f154396q;

    public j(n stateMapper, BankAccountSwitchingStartDateSelectionScreenContract$InputData inputData, f61.a datePickerConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(datePickerConfigInteractor, "datePickerConfigInteractor");
        this.o = inputData;
        this.f154395p = datePickerConfigInteractor;
        this.f154396q = mra.d.b(this, new f(inputData.f63984a, null, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new gvc.m(this, null, 23), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f154396q;
    }
}
