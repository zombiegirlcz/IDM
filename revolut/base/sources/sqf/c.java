package sqf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sek.q;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReferenceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReferenceScreen referenceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = referenceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.f92218a0.getValue();
        String reference = textData.f52598b.toString();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(reference, "reference");
        gVar.l2(new q(gVar, reference, null, 17), new yi5.b(26));
        return Unit.f186387a;
    }
}
