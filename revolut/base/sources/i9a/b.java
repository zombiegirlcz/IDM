package i9a;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.PixAuthorisationConfirmScreen;
import gim.i;
import i6j.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ PixAuthorisationConfirmScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixAuthorisationConfirmScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.u.L.getValue();
        gVar.H2(gVar.o, new p(18));
        return Unit.f186387a;
    }
}
