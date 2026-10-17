package ma1;

import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class v implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f203910b;

    public /* synthetic */ v(int i, Function1 function1) {
        this.f203909a = i;
        this.f203910b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f203909a) {
            case 2:
                ((m9l.d) this.f203910b).invoke(obj2);
                break;
            case 3:
            default:
                ((mei.b) this.f203910b).invoke(obj2);
                break;
            case 4:
                ((lu6.p) this.f203910b).invoke(obj2);
                break;
            case 5:
                ((w) this.f203910b).invoke(obj2);
                break;
            case 6:
                ((w) this.f203910b).invoke(obj2);
                break;
            case 7:
                ((w) this.f203910b).invoke(obj2);
                break;
            case 8:
                ((w) this.f203910b).invoke(obj2);
                break;
            case 9:
                ((lul.d) this.f203910b).invoke(obj2);
                break;
            case 10:
                ((z) this.f203910b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f203909a) {
            case 0:
                m9l.d dVar = (m9l.d) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fa1.l) dVar.invoke(p0);
            case 1:
                li8.n nVar = (li8.n) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) nVar.invoke(p0);
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 19:
            case 23:
            case 26:
            default:
                md0.c cVar = (md0.c) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar.invoke(p0);
            case 3:
                m9l.d dVar2 = (m9l.d) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fa1.l) dVar2.invoke(p0);
            case 11:
                lrk.h hVar = (lrk.h) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar.invoke(p0);
            case 12:
                m9l.d dVar3 = (m9l.d) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar3.invoke(p0);
            case 13:
                m98.k kVar = (m98.k) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar.invoke(p0);
            case 14:
                ma2.s sVar = (ma2.s) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) sVar.invoke(p0);
            case 15:
                li8.n nVar2 = (li8.n) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LineChartResizableTileDelegate.Model) nVar2.invoke(p0);
            case 16:
                ma2.s sVar2 = (ma2.s) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) sVar2.invoke(p0);
            case 17:
                ja3.d dVar4 = (ja3.d) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) dVar4.invoke(p0);
            case 18:
                m98.k kVar2 = (m98.k) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) kVar2.invoke(p0);
            case 20:
                ma2.s sVar3 = (ma2.s) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar3.invoke(p0);
            case 21:
                imk.e eVar = (imk.e) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar.invoke(p0);
            case 22:
                md9.h hVar2 = (md9.h) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar2.invoke(p0);
            case 24:
                md0.c cVar2 = (md0.c) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) cVar2.invoke(p0);
            case 25:
                md0.c cVar3 = (md0.c) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar3.invoke(p0);
            case 27:
                ma2.s sVar4 = (ma2.s) this.f203910b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar4.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f203909a;
        Function1 function1 = this.f203910b;
        switch (i) {
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((m9l.d) function1).invoke(p0)).booleanValue();
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((md0.c) function1).invoke(p0)).booleanValue();
            default:
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mh4.x) function1).invoke(p0)).booleanValue();
        }
    }
}
