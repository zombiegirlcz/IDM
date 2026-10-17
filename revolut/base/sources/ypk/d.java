package ypk;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vf0.h;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f315941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f315942c;
    public final /* synthetic */ xi0.b d;

    public /* synthetic */ d(g gVar, xi0.b bVar, xi0.b bVar2, int i) {
        this.f315940a = i;
        this.f315941b = gVar;
        this.f315942c = bVar;
        this.d = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f315940a) {
            case 0:
                qta.f chartPeriod = (qta.f) obj2;
                Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
                g gVar = this.f315941b;
                c cVar = gVar.f315949n;
                boolean z = gVar.f315947l.f103730g;
                xi0.b bVar = this.f315942c;
                xi0.b bVar2 = this.d;
                return z ? cVar.b(chartPeriod, bVar2, bVar) : cVar.b(chartPeriod, bVar, bVar2);
            case 1:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                Data data = (Data) hVar.f288433a;
                Data data2 = (Data) hVar.f288434b;
                qta.f fVar = (qta.f) hVar.f288435c;
                TrendViewDelegate.a aVar = (TrendViewDelegate.a) hVar.d;
                o9j.b bVar3 = this.f315941b.o;
                n9l.a aVar2 = (n9l.a) data.getContent();
                Double dValueOf = aVar2 != null ? Double.valueOf(aVar2.f213663c) : null;
                Intrinsics.h(fVar);
                Intrinsics.h(data2);
                return zi0.c.P(((u9j.e) bVar3).d(this.f315942c, this.d, dValueOf, fVar, aVar, data2, null, null), false, null, 3);
            default:
                qta.f chartPeriod2 = (qta.f) obj2;
                Intrinsics.checkNotNullParameter(chartPeriod2, "chartPeriod");
                g gVar2 = this.f315941b;
                c cVar2 = gVar2.f315949n;
                boolean z3 = gVar2.f315947l.f103730g;
                xi0.b bVar4 = this.f315942c;
                xi0.b bVar5 = this.d;
                return z3 ? cVar2.b(chartPeriod2, bVar5, bVar4) : cVar2.b(chartPeriod2, bVar4, bVar5);
        }
    }
}
