package w56;

import aw0.n6;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeFiSendReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(DeFiSendReviewScreen deFiSendReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deFiSendReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeFiSendReviewScreen deFiSendReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                deFiSendReviewScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = deFiSendReviewScreen.R2();
                i56.e eVar = (i56.e) ((g) ((j2) pVarE3.f294716t.f22677a).getValue()).f294702b.getContent();
                Continuation continuation = null;
                if (eVar == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiSendReviewScreenModel", "Attempting to submit transfer while quote signature is missing", null, h0Var);
                } else {
                    pVarE3.n2(new w3k.i(pVarE3, eVar, continuation, 9), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
