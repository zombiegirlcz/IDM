package y25;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.n;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import y2e.l;
import y7k.g0;
import y99.m;
import y99.x;
import y99.y;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements o, p, kfm.c, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f310592b;

    public /* synthetic */ c(Function function, int i) {
        this.f310591a = i;
        this.f310592b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((g0) this.f310592b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f310591a;
        Function function = this.f310592b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((b) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((y1.a) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g2e.a) ((l) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xyc.j) function).invoke(p0);
            case 5:
            case 11:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((x) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y1.a) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) ((d) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((xwd.o) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((y1.a) function).invoke(p0);
            case 10:
                KProperty[] kPropertyArr = AskAiScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y66.p) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((y66.p) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y66.p) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((m) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xwd.o) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y66.p) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((m) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m89.a) ((y66.p) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((m) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) ((y) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((y) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) ((x) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((meb.f) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((y) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((y) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z95.b) ((x) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((x) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        d dVar = (d) this.f310592b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) dVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        u3a.p pVar = (u3a.p) this.f310592b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Data) pVar.invoke(p0, p17);
    }
}
