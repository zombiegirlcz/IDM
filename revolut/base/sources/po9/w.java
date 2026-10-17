package po9;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import efm.h0;
import java.util.List;
import k4l.a0;
import k4l.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pij.d1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f237940b;

    public /* synthetic */ w(int i, Function1 function1) {
        this.f237939a = i;
        this.f237940b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f237939a;
        Function1 function1 = this.f237940b;
        switch (i) {
            case 1:
                ((d1) function1).invoke(obj2);
                break;
            case 10:
                KProperty[] kPropertyArr = AddMoneyScreen.j0;
                ((ccb.b) function1).invoke(obj2);
                break;
            default:
                ((n68.w) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f237939a;
        Function1 function1 = this.f237940b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t) ((pig.y) function1).invoke(p0);
            case 1:
            case 10:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a0) ((pqg.v) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pof.d) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pof.d) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (WelcomeAppearance) ((pj3.b) function1).invoke(p0);
            case 5:
                int i2 = ChallengeEditFrequencyDatePickerScreen.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((pnh.a0) function1).invoke(p0);
                return pp8.f.f238297a;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((pnh.a0) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((ppk.a) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((ppk.a) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((b2.a) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zbb.f) ((pnh.a0) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pqg.o) ((pqg.u) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((pqg.v) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((pqg.u) function1).invoke(p0);
            case 15:
                return (RecurringTransferFlowContract$FlowInput) ((pqg.u) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((pre.a) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((njf.e) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pre.b) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((arg.a) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((arg.a) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pre.b) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((arg.a) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((njf.e) function1).invoke(p0);
            case 24:
                return (InvestOrder) ((pqg.v) function1).invoke(p0);
            case 25:
                return (List) ((fsl.v) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((pqg.v) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e0) ((pqg.v) function1).invoke(p0);
        }
    }
}
