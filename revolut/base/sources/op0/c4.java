package op0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.vh;
import ip0.r40;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.y3 f227211b;

    public /* synthetic */ c4(com.revolut.core.ui_kit.delegates.widgets.y3 y3Var, int i) {
        this.f227210a = i;
        this.f227211b = y3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        x3 x3Var;
        switch (this.f227210a) {
            case 0:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                x3 x3Var2 = this.f227211b.u;
                if (x3Var2 != null) {
                    Intrinsics.h(model);
                    x3Var2.invoke(model);
                }
                break;
            case 1:
                vh vhVar = (vh) obj2;
                x3 x3Var3 = this.f227211b.f55563y;
                if (x3Var3 != null) {
                    Intrinsics.h(vhVar);
                    x3Var3.invoke(vhVar);
                }
                break;
            case 2:
                g6 g6Var = (g6) obj2;
                x3 x3Var4 = this.f227211b.z;
                if (x3Var4 != null) {
                    Intrinsics.h(g6Var);
                    x3Var4.invoke(g6Var);
                }
                break;
            case 3:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                x3 x3Var5 = this.f227211b.v;
                if (x3Var5 != null) {
                    Intrinsics.h(model2);
                    x3Var5.invoke(model2);
                }
                break;
            case 4:
                r40 r40Var = (r40) obj2;
                x3 x3Var6 = this.f227211b.f55561w;
                if (x3Var6 != null) {
                    Intrinsics.h(r40Var);
                    x3Var6.invoke(r40Var);
                }
                break;
            default:
                SmallActionButtonDelegate.Model model3 = (SmallActionButtonDelegate.Model) obj2;
                if (Intrinsics.f(model3.f53337a, "widget_footer") && (x3Var = this.f227211b.f55562x) != null) {
                    x3Var.invoke(model3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
