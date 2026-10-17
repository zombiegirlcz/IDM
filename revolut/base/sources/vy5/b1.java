package vy5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ cc7.l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(cc7.l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b1 b1Var = new b1(this.v, continuation);
        b1Var.u = obj2;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b1) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = (w) this.v.f22957n;
        Intrinsics.h(model);
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        e eVar = obj3 instanceof e ? (e) obj3 : null;
        if (eVar != null) {
            j60.a.v(wVar.o, true, null, 2);
            Object obj4 = eVar.f293148b;
            Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.pockets.api.ui.PocketPickerParcel.RealPocket");
            wVar.T2(new n(wVar, eVar, ((ida.d) obj4).f160458a.f163163a, null), new yi5.b(27));
        }
        return Unit.f186387a;
    }
}
