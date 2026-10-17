package gxi;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u6c.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f147749w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147749w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f147749w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f147749w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f147749w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            default:
                f fVar4 = new f(this.f147749w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f147749w;
        switch (i) {
            case 0:
                dj0.d monetaryAmount = (dj0.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) gVar.f147750l;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
                q7c.g gVar2 = iVar.f147753a;
                n nVar = new n(null, null, iVar.f147755c, Long.valueOf(monetaryAmount.f115082a), monetaryAmount.f115083b, false, null, null, 995);
                k6c.a aVar2 = k6c.b.Companion;
                return com.revolut.data.database.models.openbanking.d.x("CheckoutRevPayInteractorImpl", "Failed to obtain default payment pocket via PaymentMethodsInteractor", nim.a.v(gVar2.b(nVar, w4l.i.f294643c), new gwe.d(iVar, 6)));
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                o7.d.x(gVar.e3(), data, null, 2);
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e userPocket = (e) pair.f186385a;
                dj0.d monetaryAmount2 = (dj0.d) pair.f186386b;
                i iVar2 = (i) gVar.f147750l;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(userPocket, "userPocket");
                Intrinsics.checkNotNullParameter(monetaryAmount2, "monetaryAmount");
                xi0.b bVar = userPocket.f147748a.i.f115083b;
                xi0.b bVar2 = monetaryAmount2.f115083b;
                xi0.b bVar3 = monetaryAmount2.f115083b;
                long j2 = monetaryAmount2.f115082a;
                if (Intrinsics.f(bVar, bVar2)) {
                    return zi0.c.i(new CheckoutRevPayControllerExtensionContract$CheckoutPrice(null, monetaryAmount2, monetaryAmount2));
                }
                xi0.b bVar4 = userPocket.f147748a.i.f115083b;
                akg.n nVarV = nim.a.v(iVar2.f147754b.a(j2, bVar4, bVar3), new ar3.a(11, monetaryAmount2));
                Pair[] elements = {new Pair("CheckoutRevPayInteractorImpl", "Failed to retrieve converted price while polling quote"), new Pair("User pocket currency", bVar4.f306286a), new Pair("Original payment price", j2 + " " + bVar3.f306286a)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return rd0.e.n(nVarV, kotlin.collections.d.y0(elements));
            default:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                o7.d.x(gVar.e3(), null, data2, 1);
                return Unit.f186387a;
        }
    }
}
