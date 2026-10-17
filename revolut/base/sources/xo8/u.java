package xo8;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements kfm.o, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f307731b;

    public /* synthetic */ u(int i, Function1 function1) {
        this.f307730a = i;
        this.f307731b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f307730a;
        Function1 function1 = this.f307731b;
        switch (i) {
            case 4:
                ((xng.l) function1).invoke(obj2);
                break;
            case 9:
                ((xr3.r) function1).invoke(obj2);
                break;
            case 16:
                ((xra.a) function1).invoke(obj2);
                break;
            case 19:
                ((xng.l) function1).invoke(obj2);
                break;
            case 21:
                ((xrk.b) function1).invoke(obj2);
                break;
            default:
                KProperty[] kPropertyArr = AdjustAnalyticsController.V;
                ((xng.l) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f307730a;
        Function1 function1 = this.f307731b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((t) function1).invoke(p0);
            case 1:
                ScheduleTransferScreen.Companion aVar = ScheduleTransferScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((i0) function1).invoke(p0);
            case 2:
                ScheduleTransferScreen.Companion aVar2 = ScheduleTransferScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((i0) function1).invoke(p0);
            case 3:
            case 4:
            case 9:
            case 16:
            case 19:
            case 21:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((xpe.c) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((xq3.l) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((xng.l) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) ((i0) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((i0) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (it3.d) ((xr3.r) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((xpe.c) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xpe.c) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((xra.a) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fqa.n) ((i0) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((i0) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((xra.a) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((xlb.o) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((i0) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((xrk.b) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((xrk.b) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((xrk.b) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((wtl.f) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (oq9.o) ((bs9.d0) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f307730a;
        i0 i0Var = (i0) this.f307731b;
        switch (i) {
            case 3:
                KProperty[] kPropertyArr = RateDetailsScreen.f103723e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) i0Var.invoke(p0)).booleanValue();
    }
}
