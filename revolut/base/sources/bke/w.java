package bke;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f16372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
        this.f16372w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, this.f16372w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            xv5.g gVar = this.v.C;
            Object obj3 = this.f16372w.u;
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
