package hje;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.data.model.Data;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import fvk.q;
import java.util.ArrayList;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f152734b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f152733a = i;
        this.f152734b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f152733a) {
            case 16:
                ((hng.j) this.f152734b).invoke(obj2);
                break;
            case 17:
            default:
                ((hng.j) this.f152734b).invoke(obj2);
                break;
            case 18:
                ((hng.j) this.f152734b).invoke(obj2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v45, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.util.ArrayList] */
    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        ?? arrayList;
        int i = this.f152733a;
        Object obj2 = this.f152734b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((d) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((hhd.n) obj2).invoke(p0);
                return Boolean.TRUE;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((h8b.b) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hg4.a) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((hhd.n) obj2).invoke(p0);
                return Boolean.TRUE;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((hhd.n) obj2).invoke(p0);
                return Boolean.TRUE;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((gae.a) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hg4.a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g31.e) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((h8b.b) obj2).invoke(p0);
            case 10:
            case 13:
            case 16:
            case 18:
            case 19:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hp5.a) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((hm3.b) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l71.d) ((hmc.a) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zlg.n) ((hmc.a) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (co3.a) ((hmc.a) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (do3.n) ((hmc.a) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((hg4.a) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((g31.e) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((aed.c) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((q) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hof.a) ((g31.e) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((hmc.a) obj2).invoke(p0);
            case 27:
                CorporateEventsHomeScreen corporateEventsHomeScreen = (CorporateEventsHomeScreen) obj2;
                CorporateEventsHomeScreen.Companion aVar = CorporateEventsHomeScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "it");
                t60.a aVarQ = ((t60.g) ((t60.b) corporateEventsHomeScreen.l0.getValue())).Q();
                int i2 = aVarQ.d;
                int i3 = aVarQ.f268122c;
                RecyclerView.Adapter adapter = corporateEventsHomeScreen.f3().getAdapter();
                z4l.j jVar = adapter instanceof z4l.j ? (z4l.j) adapter : null;
                if (jVar == null || !aVarQ.a()) {
                    arrayList = f0.f322471a;
                } else {
                    arrayList = new ArrayList();
                    int iG = kotlin.ranges.f.g(i2, 0, jVar.getItemCount() - 1);
                    if (i3 <= iG) {
                        int i5 = i3;
                        while (true) {
                            arrayList.add(jVar.a(i5));
                            if (i5 != iG) {
                                i5++;
                            }
                        }
                    }
                }
                return new hp3.p(i3, i2, arrayList);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f152733a;
        Object obj2 = this.f152734b;
        switch (i) {
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hmc.a) obj2).invoke(p0)).booleanValue();
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hmc.a) obj2).invoke(p0)).booleanValue();
            case 26:
                CorporateEventsHomeScreen.Companion aVar = CorporateEventsHomeScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hg4.a) obj2).invoke(p0)).booleanValue();
            default:
                CorporateEventsHomeScreen.Companion aVar2 = CorporateEventsHomeScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hmc.a) obj2).invoke(p0)).booleanValue();
        }
    }
}
