package zr4;

import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstalmentDetailsScreen f324554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InstalmentDetailsScreen instalmentDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324554w = instalmentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f324554w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f324554w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f324554w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(obj2, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        InstalmentDetailsScreen instalmentDetailsScreen = this.f324554w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD3 = instalmentDetailsScreen.d3();
                yx4.a aVar2 = yx4.b.Companion;
                Intrinsics.h(obj3);
                aVar2.getClass();
                ((com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a) mVarD3).J2(yx4.a.a(obj3));
                break;
            case 1:
                Object obj4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD32 = instalmentDetailsScreen.d3();
                yx4.a aVar4 = yx4.b.Companion;
                Intrinsics.h(obj4);
                aVar4.getClass();
                ((com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a) mVarD32).J2(yx4.a.a(obj4));
                break;
            default:
                Object obj5 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD33 = instalmentDetailsScreen.d3();
                yx4.a aVar6 = yx4.b.Companion;
                Intrinsics.h(obj5);
                aVar6.getClass();
                ((com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a) mVarD33).J2(yx4.a.a(obj5));
                break;
        }
        return Unit.f186387a;
    }
}
