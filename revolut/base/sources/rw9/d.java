package rw9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.net.ConnectException;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import m1c.q1;
import org.reactivestreams.Publisher;
import rd3.x;
import rrd.l;
import yhm.r;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements o, kfm.g, kfm.h, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f257857b;

    public /* synthetic */ d(Function function, int i) {
        this.f257856a = i;
        this.f257857b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        x xVar = (x) this.f257857b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (r) xVar.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f257856a;
        Function function = this.f257857b;
        switch (i) {
            case 2:
                int i2 = MaskedTextInputEditText.f59117y;
                ((l) function).invoke(obj2);
                break;
            case 16:
                ((rxb.a) function).invoke(obj2);
                break;
            default:
                ((rxb.b) function).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f257856a) {
            case 0:
                rsl.p pVar = (rsl.p) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) pVar.invoke(p0);
            case 1:
                ru6.r rVar = (ru6.r) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) rVar.invoke(p0);
            case 2:
            case 4:
            case 13:
            case 16:
            case 17:
            default:
                rxb.b bVar = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) bVar.invoke(p0);
            case 3:
                rx7.h hVar = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Clause) hVar.invoke(p0);
            case 5:
                rx7.h hVar2 = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 6:
                rx7.h hVar3 = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar3.invoke(p0);
            case 7:
                rx7.h hVar4 = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar4.invoke(p0);
            case 8:
                ru6.r rVar2 = (ru6.r) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sx7.b) rVar2.invoke(p0);
            case 9:
                rx7.h hVar5 = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) hVar5.invoke(p0);
            case 10:
                rx7.h hVar6 = (rx7.h) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar6.invoke(p0);
            case 11:
                rxb.a aVar = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar.invoke(p0);
            case 12:
                rxb.a aVar2 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar2.invoke(p0);
            case 14:
                rxb.b bVar2 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ConnectException) bVar2.invoke(p0);
            case 15:
                rxb.a aVar3 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 18:
                rxb.b bVar3 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar3.invoke(p0);
            case 19:
                rxb.b bVar4 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar4.invoke(p0);
            case 20:
                rxb.b bVar5 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q1) bVar5.invoke(p0);
            case 21:
                rxb.d dVar = (rxb.d) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
            case 22:
                rxb.b bVar6 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar6.invoke(p0);
            case 23:
                rxb.a aVar4 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RevPointsTransaction) aVar4.invoke(p0);
            case 24:
                rxb.d dVar2 = (rxb.d) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar2.invoke(p0);
            case 25:
                rxb.a aVar5 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) aVar5.invoke(p0);
            case 26:
                rxb.b bVar7 = (rxb.b) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q1) bVar7.invoke(p0);
            case 27:
                rxb.a aVar6 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar6.invoke(p0);
            case 28:
                rxb.a aVar7 = (rxb.a) this.f257857b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) aVar7.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        ru6.r rVar = (ru6.r) this.f257857b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) rVar.invoke(p0)).booleanValue();
    }
}
