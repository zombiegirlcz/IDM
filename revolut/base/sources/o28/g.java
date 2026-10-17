package o28;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.api.UCubeLibPaymentServiceListener;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nvg.b0;
import nzj.n;
import o17.x;
import o29.q;
import o3l.i;
import o3l.k;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements o, p, kfm.c, kfm.g, ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f221545b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f221544a = i;
        this.f221545b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((i) this.f221545b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f221544a;
        Object obj2 = this.f221545b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 1:
            case 3:
            case 14:
            case 20:
            case 21:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((o3k.a) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((o29.p) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((o29.p) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((b0) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((o29.p) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((neg.q) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h19.g) ((x) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((x) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((x) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((neg.q) obj2).invoke(p0);
            case 16:
                KProperty[] kPropertyArr = TravelExperiencesDatesSelectionScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (DateTime) ((o2g.f) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((o2g.f) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e3k.d) ((g3k.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((i) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((k) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((k) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b0) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((o2g.f) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((o2g.f) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((o2g.f) obj2).invoke(p0);
        }
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        UCubeAPI.a((UCubeLibPaymentServiceListener) this.f221545b, taskEvent, objArr);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f221544a) {
            case 1:
                x xVar = (x) this.f221545b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) xVar.invoke(p0)).booleanValue();
            case 2:
            default:
                o2g.f fVar = (o2g.f) this.f221545b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar.invoke(p0)).booleanValue();
            case 3:
                x xVar2 = (x) this.f221545b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) xVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        nz7.g gVar = (nz7.g) this.f221545b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (CharSequence) gVar.invoke(p0, p17);
    }
}
