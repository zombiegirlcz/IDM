package m0g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDates;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import efm.h0;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m18.n;
import m1i.i0;
import m1i.w;
import m1i.x;
import myf.i;
import r1i.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f201145b;

    public /* synthetic */ d(int i, Function1 function1) {
        this.f201144a = i;
        this.f201145b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f201144a) {
            case 7:
                ((m1i.p) this.f201145b).invoke(obj2);
                break;
            case 8:
                ((m1i.p) this.f201145b).invoke(obj2);
                break;
            default:
                ((m1i.p) this.f201145b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f201144a;
        Function1 function1 = this.f201145b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TravelExperienceAvailabilityDates) ((lyd.b) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((lyd.b) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((lu5.o) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((lul.d) function1).invoke(p0);
            case 4:
                MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((n) function1).invoke(p0);
            case 5:
                MarketOrderActivity.Companion companion2 = MarketOrderActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((n) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((m1i.p) function1).invoke(p0);
            case 7:
            case 8:
            case 9:
            case 19:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m1i.g) ((n) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((m1i.p) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((n) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((w) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lul.d) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((w) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ja3.d) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) ((n) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) ((n) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((i0) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) ((n) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) ((n) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        n nVar = (n) this.f201145b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) nVar.invoke(p0)).booleanValue();
    }
}
