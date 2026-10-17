package dj8;

import aw0.n6;
import com.revolut.feature.junior_payment_links.impl.ui.screen.consent.JuniorPaymentLinksConsentScreen;
import cq6.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ti8.e;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorPaymentLinksConsentScreen f115129w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(JuniorPaymentLinksConsentScreen juniorPaymentLinksConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115129w = juniorPaymentLinksConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f115129w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f115129w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorPaymentLinksConsentScreen juniorPaymentLinksConsentScreen = this.f115129w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar = (c) juniorPaymentLinksConsentScreen.T.getValue();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                cVar.n2(new k(cVar, null, 21), new whi.b(6));
                break;
            default:
                n6 model2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar2 = (c) juniorPaymentLinksConsentScreen.T.getValue();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                cVar2.C2(e.f271448a);
                break;
        }
        return Unit.f186387a;
    }
}
