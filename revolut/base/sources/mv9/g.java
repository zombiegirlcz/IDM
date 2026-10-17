package mv9;

import dv9.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f209182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f209183c;

    public /* synthetic */ g(k kVar, l lVar, int i) {
        this.f209181a = i;
        this.f209182b = kVar;
        this.f209183c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b aVar;
        switch (this.f209181a) {
            case 0:
                dv9.j eligibility = (dv9.j) obj2;
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                if (eligibility.f118070a) {
                    k kVar = this.f209182b;
                    pv9.k kVar2 = kVar.f209189c;
                    l lVar = this.f209183c;
                    String recipientCode = lVar.f118076a;
                    String str = eligibility.f118071b;
                    sv9.c cVar = (sv9.c) kVar2;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(recipientCode, "recipientCode");
                    rfm.j jVar = new rfm.j(w.H0(cVar.f265857a.f(false), ((pv9.d) cVar.f265858b).j()), new sp5.h(21, new s06.e(cVar, 16, recipientCode, str)), 2);
                    Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                    aVar = new pfm.a(jVar, new h(2, new g(kVar, lVar, 1)), 3);
                } else {
                    aVar = m.f235744a;
                }
                return aVar.D(eligibility);
            default:
                iv9.a message = (iv9.a) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar3 = this.f209182b;
                pfm.h hVar = new pfm.h(new ly2.d(null, 8, kVar3, message), 2);
                pfm.h hVar2 = new pfm.h(new la8.j(kVar3, this.f209183c, 18), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = hVar.e(hVar2);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return w.g0(aVarE);
        }
    }
}
