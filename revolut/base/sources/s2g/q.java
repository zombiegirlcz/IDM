package s2g;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f259322b;

    public /* synthetic */ q(w wVar, int i) {
        this.f259321a = i;
        this.f259322b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259321a) {
            case 0:
                q3g.e output = (q3g.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ryd.i iVar = new ryd.i(output, 15);
                w wVar = this.f259322b;
                wVar.x2(iVar);
                wVar.y2();
                return Unit.f186387a;
            case 1:
                o3g.g output2 = (o3g.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                k kVar = new k(output2.f221810a);
                w wVar2 = this.f259322b;
                wVar2.v2(kVar);
                wVar2.x2(new j2g.q(output2, 2));
                wVar2.y2();
                return Unit.f186387a;
            default:
                pfm.h hVar = new pfm.h(new rzc.b(this.f259322b, (lk0.g) obj2, 3), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
        }
    }
}
