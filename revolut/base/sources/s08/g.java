package s08;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import efm.w;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.q;
import m1c.v1;
import rnb.u;
import yhm.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f258884b;

    public /* synthetic */ g(int i, Function1 function1) {
        this.f258883a = i;
        this.f258884b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((f) this.f258884b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f258883a) {
            case 0:
                f fVar = (f) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r) fVar.invoke(p0);
            case 1:
            default:
                ryd.i iVar = (ryd.i) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar.invoke(p0);
            case 2:
                ryd.k kVar = (ryd.k) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar.invoke(p0);
            case 3:
                ryd.k kVar2 = (ryd.k) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RevPointsTransaction) kVar2.invoke(p0);
            case 4:
                ryd.i iVar2 = (ryd.i) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) iVar2.invoke(p0);
            case 5:
                s1c.a aVar = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SpareChangeRefundQuote) aVar.invoke(p0);
            case 6:
                s1c.a aVar2 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v1) aVar2.invoke(p0);
            case 7:
                s1c.a aVar3 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v1) aVar3.invoke(p0);
            case 8:
                ryd.k kVar3 = (ryd.k) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SpareChangeCalculations) kVar3.invoke(p0);
            case 9:
                s1c.a aVar4 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SpareChangeRefund) aVar4.invoke(p0);
            case 10:
                s1c.a aVar5 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar5.invoke(p0);
                return Boolean.TRUE;
            case 11:
                s1c.a aVar6 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) aVar6.invoke(p0);
            case 12:
                s1c.a aVar7 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar7.invoke(p0);
            case 13:
                u uVar = (u) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AgentInfo) uVar.invoke(p0);
            case 14:
                s20.b bVar = (s20.b) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) bVar.invoke(p0);
            case 15:
                s1c.a aVar8 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) aVar8.invoke(p0);
            case 16:
                s1c.a aVar9 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar9.invoke(p0);
            case 17:
                s1c.a aVar10 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar10.invoke(p0);
            case 18:
                rsl.p pVar = (rsl.p) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) pVar.invoke(p0);
            case 19:
                s1c.a aVar11 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar11.invoke(p0);
            case 20:
                s2i.d dVar = (s2i.d) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
            case 21:
                s2i.d dVar2 = (s2i.d) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar2.invoke(p0);
            case 22:
                s1c.a aVar12 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b2i.b) aVar12.invoke(p0);
            case 23:
                s2i.d dVar3 = (s2i.d) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar3.invoke(p0);
            case 24:
                s2i.e eVar = (s2i.e) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b2i.b) eVar.invoke(p0);
            case 25:
                ryd.i iVar3 = (ryd.i) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar3.invoke(p0);
            case 26:
                s1c.a aVar13 = (s1c.a) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g93.b) aVar13.invoke(p0);
            case 27:
                rvc.k kVar4 = (rvc.k) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) kVar4.invoke(p0);
            case 28:
                c18.c cVar = (c18.c) this.f258884b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) cVar.invoke(p0);
        }
    }
}
