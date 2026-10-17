package e0a;

import com.revolut.feature.payments.api.PaymentsToggles$GiphySendIdInsteadOfUrl;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h9i.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f121542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.a f121543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h9i.c cVar, b0 b0Var, zm3.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f121542w = b0Var;
        this.f121543x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, this.f121542w, this.f121543x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        MessageType sticker;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h9i.c cVar = this.v;
            boolean z = cVar instanceof h9i.a;
            b0 b0Var = this.f121542w;
            if (z) {
                if (((jte.d) b0Var.f121480q).c(PaymentsToggles$GiphySendIdInsteadOfUrl.f79149c)) {
                    h9i.a aVar2 = (h9i.a) cVar;
                    sticker = new MessageType.GiphyGifId(aVar2.f150327a, aVar2.f150328b);
                } else {
                    sticker = new MessageType.Gif(((h9i.a) cVar).f150327a);
                }
            } else {
                if (!(cVar instanceof h9i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                sticker = new MessageType.Sticker(((h9i.b) cVar).f150329a);
            }
            this.u = 1;
            if (b0.Z2(b0Var, sticker, this.f121543x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
