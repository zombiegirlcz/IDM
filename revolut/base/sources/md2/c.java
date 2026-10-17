package md2;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ IDealStartRegistrationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IDealStartRegistrationScreen iDealStartRegistrationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = iDealStartRegistrationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.u.O.getValue();
        IDealStartRegistrationScreenContract$InputData iDealStartRegistrationScreenContract$InputData = gVar.o;
        int i = f.f204471a[iDealStartRegistrationScreenContract$InputData.f62858a.ordinal()];
        if (i == 1) {
            gVar.B2();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar.C2(new jd2.e(iDealStartRegistrationScreenContract$InputData.f62859b));
        }
        return Unit.f186387a;
    }
}
