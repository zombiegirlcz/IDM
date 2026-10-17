package p30;

import b94.r;
import com.revolut.data.model.Data;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivity;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.f;
import efm.h0;
import efm.w;
import java.util.Stack;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p4c.u;
import p4i.j;
import p54.k;
import p5a.m;
import p5e.h;
import rp0.y;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements o, p, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f232553b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f232552a = i;
        this.f232553b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f232552a) {
            case 8:
                ((j) this.f232553b).invoke(obj2);
                break;
            case 9:
            default:
                ((j) this.f232553b).invoke(obj2);
                break;
            case 10:
                ((j) this.f232553b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f232552a;
        Function1 function1 = this.f232553b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((a) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((a) function1).invoke(p0);
            case 2:
                int i2 = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p4i.b) ((u) function1).invoke(p0);
            case 3:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) ((m) function1).invoke(p0);
            case 4:
                int i3 = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p4i.b) ((u) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p4i.b) ((u) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((oxd.m) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((j) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((j) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Stack) ((u) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Stack) ((j) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.f) ((oxd.m) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((u) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((u) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oxd.m) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((k) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((k) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((r) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((u) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((m) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((h) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((h) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f232552a;
        Function1 function1 = this.f232553b;
        switch (i) {
            case 3:
                int i2 = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((u) function1).invoke(p0)).booleanValue();
    }
}
