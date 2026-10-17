package h0l;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult;
import d7j.n0;
import efm.h0;
import gvi.s;
import gzg.a0;
import h3a.q;
import h3l.i;
import h8b.l;
import java.util.List;
import java.util.Map;
import kfm.n;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements o, p, n, kfm.h, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f148434b;

    public /* synthetic */ g(Function function, int i) {
        this.f148433a = i;
        this.f148434b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        gzb.d dVar = (gzb.d) this.f148434b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (m3a.b) dVar.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((gwe.d) this.f148434b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f148433a) {
            case 0:
                gwe.d dVar = (gwe.d) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar.invoke(p0);
            case 1:
                s sVar = (s) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar.invoke(p0);
            case 2:
                gwe.d dVar2 = (gwe.d) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) dVar2.invoke(p0);
            case 3:
            case 5:
            case 6:
            case 14:
            default:
                gwc.h hVar = (gwc.h) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 4:
                b2.a aVar = (b2.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 7:
                a0 a0Var = (a0) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) a0Var.invoke(p0);
            case 8:
                h3d.a aVar2 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) aVar2.invoke(p0);
            case 9:
                s sVar2 = (s) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar2.invoke(p0);
            case 10:
                h3d.a aVar3 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar3.invoke(p0);
            case 11:
                i iVar = (i) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar.invoke(p0);
            case 12:
                i iVar2 = (i) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar2.invoke(p0);
            case 13:
                h3d.a aVar4 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar4.invoke(p0);
            case 15:
                h3d.a aVar5 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar5.invoke(p0);
            case 16:
                s sVar3 = (s) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) sVar3.invoke(p0);
            case 17:
                h3d.a aVar6 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) aVar6.invoke(p0);
            case 18:
                h3d.a aVar7 = (h3d.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) aVar7.invoke(p0);
            case 19:
                h5i.b bVar = (h5i.b) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar.invoke(p0);
            case 20:
                gqh.a aVar8 = (gqh.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h61.a) aVar8.invoke(p0);
            case 21:
                return (wi0.b) ((h5i.b) this.f148434b).invoke(p0);
            case 22:
                s sVar4 = (s) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar4.invoke(p0);
            case 23:
                h56.a aVar9 = (h56.a) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar9.invoke(p0);
                return Boolean.TRUE;
            case 24:
                h5i.b bVar2 = (h5i.b) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StackDestination) bVar2.invoke(p0);
            case 25:
                n0 n0Var = (n0) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CommodityExchangeResult.Success) n0Var.invoke(p0);
            case 26:
                gwc.h hVar2 = (gwc.h) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
        }
    }

    @Override // kfm.n
    public Object f(Object p0, Object p17, Object p2, Object p3, Object p42, Object p510, Object p66, Object p74, Object p82) {
        q qVar = (q) this.f148434b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        Intrinsics.checkNotNullParameter(p510, "p5");
        Intrinsics.checkNotNullParameter(p66, "p6");
        Intrinsics.checkNotNullParameter(p74, "p7");
        Intrinsics.checkNotNullParameter(p82, "p8");
        return (m3a.c) qVar.invoke(p0, p17, p2, p3, p42, p510, p66, p74, p82);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f148433a) {
            case 3:
                a0 a0Var = (a0) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) a0Var.invoke(p0)).booleanValue();
            case 27:
                h5i.b bVar = (h5i.b) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar.invoke(p0)).booleanValue();
            default:
                l lVar = (l) this.f148434b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) lVar.invoke(p0)).booleanValue();
        }
    }
}
