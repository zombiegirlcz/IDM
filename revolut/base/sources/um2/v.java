package um2;

import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import um2.c;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ ThemeCustomisationController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ThemeCustomisationController themeCustomisationController, Continuation continuation) {
        super(2, continuation);
        this.u = themeCustomisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.c3(c.a.f281185a);
        return Unit.f186387a;
    }
}
