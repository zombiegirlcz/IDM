package ff4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OfferContentScreen f134718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(OfferContentScreen offerContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134718w = offerContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f134718w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f134718w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OfferContentScreen offerContentScreen = this.f134718w;
        switch (i) {
            case 0:
                dx4.l lVar = (dx4.l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(offerContentScreen.d(), lVar);
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = aVar2.d;
                if (obj3 instanceof dx4.l) {
                    c8g.c.i(offerContentScreen.e3(), (dx4.l) obj3);
                } else {
                    ((b0) offerContentScreen.e3()).Z1(aVar2.f275446b, aVar2.f275445a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
