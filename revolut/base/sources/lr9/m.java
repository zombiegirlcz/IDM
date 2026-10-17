package lr9;

import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements kfm.o, kfm.g, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f199463b;

    public /* synthetic */ m(Function function, int i) {
        this.f199462a = i;
        this.f199463b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f199462a;
        Function function = this.f199463b;
        switch (i) {
            case 13:
                MultiTargetFanChartView.Companion companion = MultiTargetFanChartView.INSTANCE;
                ((lt0.o) function).invoke(obj2);
                break;
            default:
                ((lrk.h) function).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f199462a;
        Function function = this.f199463b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((lk4.g) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((lk4.g) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((loc.a) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((k) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mq9.c) ((loc.a) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((lra.b) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((lra.c) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((lra.c) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((lra.b) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lra.b) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((lk4.g) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((lk4.g) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lsj.b) ((loc.a) function).invoke(p0);
            case 13:
            case 19:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((lu5.o) function).invoke(p0);
            case 14:
                ReactionsKeyboardCategoryFragment.Companion aVar = ReactionsKeyboardCategoryFragment.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((lu0.c) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ja3.d) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((lv9.c) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((l1.e) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((l3d.f) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((lv9.c) function).invoke(p0);
                return Boolean.TRUE;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((lv9.c) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((l1.e) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((lul.d) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((lsl.d) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (av3.j) ((lv9.c) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((lv9.c) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((lv9.c) function).invoke(p0);
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        lnk.o oVar = (lnk.o) this.f199463b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) oVar.invoke(p0, p17);
    }
}
