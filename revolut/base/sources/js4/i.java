package js4;

import cam.q;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178130a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a f178131b;

    public /* synthetic */ i(com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar) {
        this.f178131b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        int i = this.f178130a;
        com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar = this.f178131b;
        switch (i) {
            case 0:
                yp4.d result = (yp4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    aVar.J2(result.f315784a.intValue());
                    objA = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                return Unit.f186387a;
            default:
                zx4.d result2 = (zx4.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof zx4.b) {
                    aVar.l2(new q(aVar.I2().f178122b.f68796a, 6, aVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ i(com.revolut.kompot.navigable.vc.modal.a aVar, com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar2) {
        this.f178131b = aVar2;
    }
}
