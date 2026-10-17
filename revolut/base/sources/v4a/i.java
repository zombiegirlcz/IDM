package v4a;

import com.revolut.data.model.Data;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import v2e.x;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f286007b;

    public /* synthetic */ i(int i, Function1 function1) {
        this.f286006a = i;
        this.f286007b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f286006a) {
            case 3:
                ((h) this.f286007b).invoke(obj2);
                break;
            case 7:
                ((v25.k) this.f286007b).invoke(obj2);
                break;
            case 8:
                ((v25.k) this.f286007b).invoke(obj2);
                break;
            case 18:
                ((v60.f) this.f286007b).invoke(obj2);
                break;
            case 19:
                ((v60.f) this.f286007b).invoke(obj2);
                break;
            case 20:
                ((v60.f) this.f286007b).invoke(obj2);
                break;
            case 22:
                ((v6e.c) this.f286007b).invoke(obj2);
                break;
            default:
                ((v6l.j) this.f286007b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f286006a;
        Function1 function1 = this.f286007b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((v2g.i) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((v2g.i) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((h) function1).invoke(p0);
            case 3:
            case 7:
            case 8:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((v6e.d) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((h) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((h) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((v25.k) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((v2g.i) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((v2g.i) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((v1.m) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((v1.m) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((uz7.d) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((v1.m) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((uz7.d) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((uz7.d) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v58.j) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((x) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v6e.d) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((v6e.c) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((v6e.c) function1).invoke(p0);
            case 26:
                KProperty[] kPropertyArr = OrderSettingsScreen.Q;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((v6e.d) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p5l.c) ((v6l.a) function1).invoke(p0);
        }
    }
}
