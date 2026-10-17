package ldi;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import rfm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f194140b;

    public /* synthetic */ i(k kVar) {
        this.f194140b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f194139a) {
            case 0:
                lk0.g gVar = (lk0.g) this.f194140b.f194144b.f();
                if (gVar != null) {
                    u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            default:
                k kVar = this.f194140b;
                lcc.c cVar = new lcc.c(kVar, 1);
                RevPointsTransactionPageParams revPointsTransactionPageParams = new RevPointsTransactionPageParams(0, null, null, null, f1.REVPOINTS_POCKET, null, null, null, null, 495);
                lbh.a aVar = new lbh.a(18);
                return new lk0.d(cVar, new i(kVar), new laj.b(kVar, 13), revPointsTransactionPageParams, aVar, new lbh.a(17), yk0.d.a());
        }
    }

    public /* synthetic */ i(k kVar, yk0.d dVar) {
        this.f194140b = kVar;
    }
}
