package rxb;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f258116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionPageParams f258117c;

    public /* synthetic */ d(l lVar, RevPointsTransactionPageParams revPointsTransactionPageParams, int i) {
        this.f258115a = i;
        this.f258116b = lVar;
        this.f258117c = revPointsTransactionPageParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258115a) {
            case 0:
                Boolean isHistoryFetched = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isHistoryFetched, "isHistoryFetched");
                boolean zBooleanValue = isHistoryFetched.booleanValue();
                l lVar = this.f258116b;
                RevPointsTransactionPageParams revPointsTransactionPageParams = this.f258117c;
                if (zBooleanValue) {
                    lVar.e.set(true);
                    return lVar.b(revPointsTransactionPageParams).map(new rw9.d(new b(6), 26));
                }
                return r.merge(lVar.f258132h.switchMap(new rw9.d(new d(lVar, revPointsTransactionPageParams, 1), 24)), lVar.e().C());
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                l lVar2 = this.f258116b;
                RevPointsTransactionPageParams revPointsTransactionPageParams2 = this.f258117c;
                return lVar2.b(revPointsTransactionPageParams2).map(new f(6, new ldi.j(revPointsTransactionPageParams2, 2)));
        }
    }
}
