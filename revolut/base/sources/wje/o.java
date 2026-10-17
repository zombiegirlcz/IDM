package wje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.settings.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f298078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.tab.crypto.impl.ui.settings.a aVar, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f298078w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f298078w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            xv5.g gVar = this.v.f89803r;
            Object obj3 = this.f298078w.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
            pfm.r rVarA = gVar.a((xi0.b) obj3);
            this.u = 1;
            if (nim.a.a(rVarA, this) == aVar) {
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
