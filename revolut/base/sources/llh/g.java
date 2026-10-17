package llh;

import ard.t;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import efm.h0;
import efm.w;
import he3.p;
import java.util.List;
import java.util.Map;
import kfm.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l9k.v;
import li8.n;
import pfm.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f196816b;

    public /* synthetic */ g(int i, Function1 function1) {
        this.f196815a = i;
        this.f196816b = function1;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object p0) {
        int i = this.f196815a;
        Function1 function1 = this.f196816b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((n) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((t) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((v) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((j) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((j) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p) ((lmd.f) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((kwg.e) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yld.e) ((n) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((llb.e) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lmd.f) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((llb.e) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((j) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lmd.f) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lmd.f) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((j) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((ja3.d) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((llb.e) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((n) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yld.j) ((llb.e) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((llb.e) function1).invoke(p0);
            case 22:
                KProperty[] kPropertyArr = PlanSwitchToAnnualScreen.Q;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((llb.e) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PersonalisationGalleryTileModel) ((lk4.g) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lp8.c) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((l3d.a) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((loc.a) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((j) function1).invoke(p0);
                return m.f235744a;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lp8.c) function1).invoke(p0);
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((loc.a) function1).invoke(p0);
        }
    }
}
