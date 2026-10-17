package ivb;

import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import efm.h0;
import efm.w;
import ip0.yc0;
import is2.t;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements o, p, kfm.i, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f168813b;

    public /* synthetic */ i(Function function, int i) {
        this.f168812a = i;
        this.f168813b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f168812a;
        Function function = this.f168813b;
        switch (i) {
            case 10:
                int i2 = ZoomableFullScreenVideoView.C;
                ((t) function).invoke(obj2);
                break;
            case 20:
                ((j2g.p) function).invoke(obj2);
                break;
            default:
                ((j4e.b) function).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f168812a) {
            case 0:
                ik3.a aVar = (ik3.a) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fvb.f) aVar.invoke(p0);
            case 1:
                iui.a aVar2 = (iui.a) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar2.invoke(p0);
            case 2:
            case 7:
            case 10:
            case 20:
            default:
                j1.e eVar = (j1.e) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar.invoke(p0);
            case 3:
                t tVar = (t) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) tVar.invoke(p0);
            case 4:
                iwk.b bVar = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar.invoke(p0);
            case 5:
                yc0 yc0Var = (yc0) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) yc0Var.invoke(p0);
            case 6:
                ix0.l lVar = (ix0.l) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) lVar.invoke(p0);
            case 8:
                ix0.l lVar2 = (ix0.l) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) lVar2.invoke(p0);
            case 9:
                iwk.b bVar2 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cue.d) bVar2.invoke(p0);
            case 11:
                is6.t tVar2 = (is6.t) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) tVar2.invoke(p0);
            case 12:
                iwk.b bVar3 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pei.a) bVar3.invoke(p0);
            case 13:
                iwk.b bVar4 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (iyf.d) bVar4.invoke(p0);
            case 14:
                iwk.b bVar5 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar5.invoke(p0);
            case 15:
                iwk.b bVar6 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (iyf.c) bVar6.invoke(p0);
            case 16:
                iwk.b bVar7 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (jyf.a) bVar7.invoke(p0);
            case 17:
                iwk.b bVar8 = (iwk.b) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TravelExperiencesBooking) bVar8.invoke(p0);
            case 18:
                is6.t tVar3 = (is6.t) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) tVar3.invoke(p0);
            case 19:
                j1.e eVar2 = (j1.e) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar2.invoke(p0);
            case 21:
                j2i.a aVar3 = (j2i.a) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar3.invoke(p0);
            case 22:
                j2i.a aVar4 = (j2i.a) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar4.invoke(p0);
            case 23:
                is6.t tVar4 = (is6.t) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) tVar4.invoke(p0);
            case 24:
                j1.e eVar3 = (j1.e) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) eVar3.invoke(p0);
            case 25:
                j1.e eVar4 = (j1.e) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar4.invoke(p0);
            case 26:
                g48.h hVar = (g48.h) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar.invoke(p0);
            case 27:
                j1.e eVar5 = (j1.e) this.f168813b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        yc0 yc0Var = (yc0) this.f168813b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) yc0Var.invoke(p0)).booleanValue();
    }

    @Override // kfm.i
    public Object apply(Object p0, Object p17, Object p2, Object p3) {
        b3.a aVar = (b3.a) this.f168813b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        return (CharSequence) aVar.invoke(p0, p17, p2, p3);
    }
}
