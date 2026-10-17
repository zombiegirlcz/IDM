package km2;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import efm.h0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kpi.c;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f185683b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f185682a = i;
        this.f185683b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f185682a) {
            case 1:
                ((kn.c) this.f185683b).invoke(obj2);
                break;
            case 2:
                ((kn.c) this.f185683b).invoke(obj2);
                break;
            case 3:
                ((k79.b) this.f185683b).invoke(obj2);
                break;
            case 10:
                ((koe.r) this.f185683b).invoke(obj2);
                break;
            case 11:
                ((koe.r) this.f185683b).invoke(obj2);
                break;
            case 12:
                ((koe.r) this.f185683b).invoke(obj2);
                break;
            case 13:
                ((koe.r) this.f185683b).invoke(obj2);
                break;
            case 14:
                ((koe.r) this.f185683b).invoke(obj2);
                break;
            case 26:
                ((kog.k) this.f185683b).invoke(obj2);
                break;
            default:
                ((kp0.q) this.f185683b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f185682a;
        Function1 function1 = this.f185683b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((kkk.u) function1).invoke(p0);
            case 1:
            case 2:
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 20:
            case 21:
            case 22:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((kpj.a) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((knd.a) function1).invoke(p0);
                return Boolean.TRUE;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((kob.b) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((ke7.v) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((koe.r) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((kof.g) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ChatBubbleDelegate.Model) ((kog.k) function1).invoke(p0);
            case 18:
                int i2 = ChatSmartTileSendMoneyDelegate.f53892m;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ChatSmartTileSendMoneyDelegate.Model) ((kog.k) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((kp5.a) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qzi.a) ((kpj.a) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (arj.a) ((kpj.a) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (arj.a) ((kpj.a) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qzi.a) ((kpj.a) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f185682a;
        Function1 function1 = this.f185683b;
        switch (i) {
            case 5:
                KProperty[] kPropertyArr = PlanSingleOfferScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                c.a aVar = kpi.c.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((knd.a) function1).invoke(p0)).booleanValue();
    }
}
