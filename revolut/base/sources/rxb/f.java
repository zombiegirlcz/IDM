package rxb;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.statements.api.models.StatementUrlState;
import efm.h0;
import efm.n;
import efm.w;
import java.net.ConnectException;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.q1;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements p, kfm.g, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f258121b;

    public /* synthetic */ f(int i, Function1 function1) {
        this.f258120a = i;
        this.f258121b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f258120a) {
            case 1:
                ((a) this.f258121b).invoke(obj2);
                break;
            default:
                ((rrd.l) this.f258121b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f258120a) {
            case 2:
                a aVar = (a) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 3:
            case 11:
            case 13:
            case 19:
            default:
                rsl.p pVar = (rsl.p) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) pVar.invoke(p0);
            case 4:
                b bVar = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ConnectException) bVar.invoke(p0);
            case 5:
                b bVar2 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) bVar2.invoke(p0);
            case 6:
                ldi.j jVar = (ldi.j) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q1) jVar.invoke(p0);
            case 7:
                b bVar3 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RevPointsTransaction) bVar3.invoke(p0);
            case 8:
                b bVar4 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RevPointsTransaction) bVar4.invoke(p0);
            case 9:
                a aVar2 = (a) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) aVar2.invoke(p0);
            case 10:
                g gVar = (g) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) gVar.invoke(p0);
            case 12:
                g gVar2 = (g) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) gVar2.invoke(p0);
            case 14:
                a aVar3 = (a) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar3.invoke(p0);
            case 15:
                ry2.c cVar = (ry2.c) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar.invoke(p0);
            case 16:
                ry2.c cVar2 = (ry2.c) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar2.invoke(p0);
            case 17:
                rrd.l lVar = (rrd.l) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar.invoke(p0);
            case 18:
                ry7.f fVar = (ry7.f) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar.invoke(p0);
            case 20:
                rrd.l lVar2 = (rrd.l) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) lVar2.invoke(p0);
            case 21:
                rrd.l lVar3 = (rrd.l) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StatementUrlState) lVar3.invoke(p0);
            case 22:
                b bVar5 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StatementUrlState.Ready) bVar5.invoke(p0);
            case 23:
                rvc.k kVar = (rvc.k) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ryd.o) kVar.invoke(p0);
            case 24:
                b bVar6 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) bVar6.invoke(p0);
            case 25:
                ryd.d dVar = (ryd.d) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar.invoke(p0);
            case 26:
                ryd.e eVar = (ryd.e) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar.invoke(p0);
            case 27:
                ryd.d dVar2 = (ryd.d) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar2.invoke(p0);
            case 28:
                js7.c cVar3 = (js7.c) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f258120a) {
            case 0:
                b bVar = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar.invoke(p0)).booleanValue();
            case 3:
                b bVar2 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar2.invoke(p0)).booleanValue();
            case 11:
                b bVar3 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar3.invoke(p0)).booleanValue();
            default:
                b bVar4 = (b) this.f258121b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar4.invoke(p0)).booleanValue();
        }
    }
}
