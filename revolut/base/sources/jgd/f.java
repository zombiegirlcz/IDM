package jgd;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedConverterScreen f173966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SharedConverterScreen sharedConverterScreen, Continuation continuation) {
        super(2, continuation);
        this.f173966w = sharedConverterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f173966w, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVarT2 = this.f173966w.T2();
            Intrinsics.h(vhVar);
            this.v = null;
            this.u = 1;
            x xVar = (x) nVarT2;
            xVar.getClass();
            if (pu7.a.B(xVar.k, "onActionClicked", new r(vhVar, xVar, null), this) == aVar) {
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
