package rpi;

import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rnb.u;
import rnd.d0;
import rrd.l;
import ru5.n;
import ru6.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements kfm.g, p, o, kfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f256389b;

    public /* synthetic */ d(Function function, int i) {
        this.f256388a = i;
        this.f256389b = function;
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        ((d0) this.f256389b).invoke(obj2, obj3);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f256388a;
        Function function = this.f256389b;
        switch (i) {
            case 2:
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
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
            case 9:
            case 20:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((e) function).invoke(p0);
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
                KProperty[] kPropertyArr = CategoryBudgetScreen.f101521e0;
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
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                ActivityScreen.Companion aVar = ActivityScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (efm.f) ((n) function).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f256388a;
        Function function = this.f256389b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mqi.b) function).invoke(p0)).booleanValue();
            case 8:
                KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((e) function).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((r) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f256388a) {
            case 0:
                ((rlh.d0) this.f256389b).invoke(obj2);
                break;
            case 9:
                ((u) this.f256389b).invoke(obj2);
                break;
            default:
                ((l) this.f256389b).invoke(obj2);
                break;
        }
    }
}
