package w4l;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import ua2.r;
import vvc.s;
import w38.v;
import w3c.n;
import wbg.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements o, kfm.g, kfm.i, kfm.c, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f294631b;

    public /* synthetic */ c(Function function, int i) {
        this.f294630a = i;
        this.f294631b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f294630a) {
            case 2:
                ((a) this.f294631b).invoke(obj2);
                break;
            case 3:
                ((a) this.f294631b).invoke(obj2);
                break;
            case 4:
                ((v) this.f294631b).invoke(obj2);
                break;
            case 22:
                ((wd3.a) this.f294631b).invoke(obj2);
                break;
            default:
                ((wf0.p) this.f294631b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f294630a;
        Function function = this.f294631b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((b) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((b) function).invoke(p0);
            case 2:
            case 3:
            case 4:
            case 8:
            case 16:
            case 22:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((wd3.a) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((n) function).invoke(p0);
                return Boolean.TRUE;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((hta.a) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((wa3.b) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wa3.a) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((w6h.f) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wa3.a) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ra3.b) ((wa3.b) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((v) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((r) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((u0) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((w6h.f) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pd5.d) ((wd3.a) function).invoke(p0);
            case 21:
                SharedAlertsScreen.Companion aVar = SharedAlertsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wed.c) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((wd3.a) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zf0.c) ((wb3.k) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((v) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wf0.p) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        wd3.a aVar = (wd3.a) this.f294631b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        s sVar = (s) this.f294631b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (lbf.p) sVar.invoke(p0, p17);
    }

    @Override // kfm.i
    public Object apply(Object p0, Object p17, Object p2, Object p3) {
        dr0.w wVar = (dr0.w) this.f294631b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        return (w5k.a) wVar.invoke(p0, p17, p2, p3);
    }
}
