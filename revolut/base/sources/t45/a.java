package t45;

import com.revolut.data.model.Data;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreen;
import com.revolut.kompot.common.ParcelableDestination;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t73.y2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements kfm.g, o, p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f267893b;

    public /* synthetic */ a(Function function, int i) {
        this.f267892a = i;
        this.f267893b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((su0.c) this.f267893b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f267892a;
        Function function = this.f267893b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((t3b.g) function).invoke(p0);
                break;
            case 2:
            case 7:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                KProperty[] kPropertyArr = TravelFlightsDatesSelectionScreen.P;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                int i2 = OrderAutomationsScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Data) ((y2) function).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f267892a;
        Function function = this.f267893b;
        switch (i) {
            case 2:
                KProperty[] kPropertyArr = ConsentScreen.f76523d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((t3b.g) function).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((t73.d) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        qce.b bVar = (qce.b) this.f267893b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (ParcelableDestination) bVar.invoke(p0, p17);
    }
}
