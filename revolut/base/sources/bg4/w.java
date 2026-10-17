package bg4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a f15119b;

    public /* synthetic */ w(com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar, int i) {
        this.f15118a = i;
        this.f15119b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f15118a;
        com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar = this.f15119b;
        switch (i) {
            case 0:
                h content = (h) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                dj0.d dVar = content.f15102a.f11386g;
                xi0.b bVar = content.f15103b.i.f115083b;
                xi0.b bVar2 = dVar.f115083b;
                if (!Intrinsics.f(bVar, bVar2)) {
                    return nim.a.v(aVar.f68173q.b(bVar, dVar.f115082a, new k6c.e(bVar2)), new bek.a(7));
                }
                od0.i.Companion.getClass();
                return zi0.c.i(od0.i.f224256b);
            case 1:
                az3.a configuration = (az3.a) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                dj0.d dVar2 = configuration.f11386g;
                q7c.g gVar = aVar.f68172p;
                u6c.n nVar = new u6c.n(null, null, u6c.t.CREDIT_ONBOARDING, Long.valueOf(dVar2.f115082a), dVar2.f115083b, false, null, null, 995);
                k6c.a aVar2 = k6c.b.Companion;
                return nim.a.v(nim.a.v(gVar.b(nVar, w4l.i.f294643c), new bek.a(8)), new b9i.f(configuration, 23));
            default:
                w6c.e outputData = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof w6c.c) {
                    aVar.H2(aVar.f68175s, new x(outputData, 0));
                } else if (!(outputData instanceof w6c.a) && !(outputData instanceof w6c.b) && !(outputData instanceof w6c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
