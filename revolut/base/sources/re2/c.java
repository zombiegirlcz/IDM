package re2;

import aw0.f4;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r4k.x;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SwishTransactionLimitScreen f253488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SwishTransactionLimitScreen swishTransactionLimitScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253488w = swishTransactionLimitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f253488w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f253488w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SwishTransactionLimitScreen swishTransactionLimitScreen = this.f253488w;
        switch (i) {
            case 0:
                f4 focusData = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) swishTransactionLimitScreen.R.getValue();
                Intrinsics.h(focusData);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                iVar.f253497q.b(focusData);
                break;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) swishTransactionLimitScreen.R.getValue();
                String amount = charSequence.toString();
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                iVar2.H2(iVar2.f253499s, new x(iVar2, amount, 27));
                break;
        }
        return Unit.f186387a;
    }
}
