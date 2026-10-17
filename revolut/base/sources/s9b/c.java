package s9b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.global_accounts.impl.management.ui.CountryProfilesManagementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ CountryProfilesManagementScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CountryProfilesManagementScreen countryProfilesManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.u = countryProfilesManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) ((h) this.u.Q.getValue());
        pVar.H2(pVar.f261170x, new s8h.h(5));
        pVar.f261169w.a();
        return Unit.f186387a;
    }
}
