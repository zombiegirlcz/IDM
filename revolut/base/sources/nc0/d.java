package nc0;

import a9j.k;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import fc0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc0.h1;
import rfm.o;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f214109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f214110c;

    public /* synthetic */ d(f fVar, e eVar, int i) {
        this.f214108a = i;
        this.f214109b = fVar;
        this.f214110c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        SelectionStyle selectionStyle;
        Set set;
        switch (this.f214108a) {
            case 0:
                f fVar = this.f214109b;
                e eVar = this.f214110c;
                List preselectedTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(preselectedTransactions, "preselectedTransactions");
                i iVar = fVar.f214116c;
                h1 h1Var = eVar.f214111a;
                String str = h1Var.f244437a;
                String str2 = h1Var.f244438b;
                long j2 = eVar.f214112b;
                String str3 = h1Var.d;
                String str4 = h1Var.e;
                Set set2 = h1Var.f;
                if (set2 == null) {
                    set2 = h0.f322473a;
                }
                return nim.a.w(rd0.e.c(iVar.a(str, str2, str3, j2, str4, set2, w4l.i.f294643c), g.f186406a), new lsl.d(preselectedTransactions, 26));
            case 1:
                f fVar2 = this.f214109b;
                e eVar2 = this.f214110c;
                Data loadedData = (Data) obj2;
                Intrinsics.checkNotNullParameter(loadedData, "loadedData");
                return new sfm.b(new o(new k(fVar2, 21, eVar2, loadedData)), new nae.a(new n45.b(loadedData, fVar2, 29), 21), 1);
            default:
                f fVar3 = this.f214109b;
                e eVar3 = this.f214110c;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                gc0.d dVar = fVar3.f214115b;
                e eVar4 = fVar3.d;
                if (eVar4 == null || (set = eVar4.d) == null) {
                    arrayList = 0;
                } else {
                    Set set3 = set;
                    arrayList = new ArrayList(w.t(set3, 10));
                    Iterator it8 = set3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((SelectedTransaction) it8.next()).f63604a);
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                Set setI1 = d0.i1((Iterable) arrayList);
                e eVar5 = fVar3.d;
                if (eVar5 == null || (selectionStyle = eVar5.f214111a.f244439c) == null) {
                    selectionStyle = eVar3.f214111a.f244439c;
                }
                return dVar.a(data, setI1, selectionStyle);
        }
    }
}
