package v4a;

import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import jq9.v;
import jq9.w;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f286009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f286009w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f286009w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f286009w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f286009w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            default:
                l lVar4 = new l(this.f286009w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f286009w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f5j.a aVar2 = (f5j.a) iVar.g();
                if (aVar2 != null) {
                    mVar.z2(new v(aVar2));
                }
                break;
            case 1:
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                CardOwnerWithStats cardOwnerWithStats = (CardOwnerWithStats) iVar2.g();
                if (cardOwnerWithStats != null) {
                    mVar.z2(new w(cardOwnerWithStats));
                }
                break;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.x2(new a82.n(((Boolean) pair.f186385a).booleanValue(), ((Boolean) pair.f186386b).booleanValue(), 12));
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = pair2.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                mVar.x2(new uyh.w((m3a.c) pair2.f186386b, 7, mVar, (Data) obj3));
                break;
        }
        return Unit.f186387a;
    }
}
