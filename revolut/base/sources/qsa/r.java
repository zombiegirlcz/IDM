package qsa;

import cli.y;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f248783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Continuation continuation, u uVar) {
        super(2, continuation);
        this.u = i;
        this.f248783w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(0, continuation, this.f248783w);
            default:
                return new r(1, continuation, this.f248783w);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f248783w;
        switch (i) {
            case 0:
                y yVar = uVar.C;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PushToCardTransferData pushToCardTransferData = ((i) ((j2) yVar.f22677a).getValue()).f248770b;
                    bsf.c cVar = new bsf.c(pushToCardTransferData.f81528b, pushToCardTransferData.f81529c, pushToCardTransferData.e, pushToCardTransferData.f81531h, ((i) ((j2) yVar.f22677a).getValue()).f248769a);
                    bsf.i iVar = uVar.B;
                    this.v = 1;
                    obj2 = iVar.b3(cVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bsf.h hVar = (bsf.h) obj2;
                if (Intrinsics.f(hVar, bsf.g.f18201a)) {
                    int i3 = jli.h.f175850a;
                } else {
                    if (!(hVar instanceof bsf.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uVar.H2(yVar, new qpb.a(new l9k.q((bsf.f) hVar, 1), uVar, 6));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q qVar = new q(2, null, uVar);
                this.v = 1;
                Object objB = pu7.a.B(uVar.k, "onSubmitClicked", qVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
