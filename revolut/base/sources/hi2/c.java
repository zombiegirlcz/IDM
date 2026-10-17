package hi2;

import aw0.f4;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreateRequestLinkScreen f152451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreateRequestLinkScreen createRequestLinkScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152451w = createRequestLinkScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f152451w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f152451w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreateRequestLinkScreen createRequestLinkScreen = this.f152451w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = createRequestLinkScreen.d();
                String amount = charSequence.toString();
                nVarE3.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                nVarE3.H2(nVarE3.f152469t, new h8b.b(new k(nVarE3, amount, 1), nVarE3, 22));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = createRequestLinkScreen.d();
                Intrinsics.h(focusData);
                nVarE32.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                nVarE32.f152466q.b(focusData);
                break;
        }
        return Unit.f186387a;
    }
}
