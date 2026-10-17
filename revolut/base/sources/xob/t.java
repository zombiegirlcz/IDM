package xob;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xo8.i0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.details.a f307783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.retail.savings.impl.ui.details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307783w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f307783w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f307783w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            default:
                t tVar3 = new t(this.f307783w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((qib.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((pcd.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.savings.impl.ui.details.a aVar = this.f307783w;
        switch (i) {
            case 0:
                qib.i iVar = (qib.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ugc.a aVar3 = aVar.H;
                String challengeId = iVar.f246692b;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                tjb.g gVar = (tjb.g) aVar3.f279998b;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(gVar.e.b(challengeId, loadingStrategy), new i0(7));
            case 1:
                pcd.s sVar = (pcd.s) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ijb.a aVar5 = aVar.f83368q;
                String strE = sVar.e();
                if (strE == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return xam.a.h(new wo2.l(aVar, sVar, (Continuation) null, 13), ijb.a.b(aVar5, strE));
            default:
                Data data = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.K, new xl9.m(data, 11));
                return Unit.f186387a;
        }
    }
}
