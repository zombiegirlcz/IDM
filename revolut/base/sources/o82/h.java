package o82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.registration.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoRegistrationTerms f222909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar, MultibancoRegistrationTerms multibancoRegistrationTerms, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f222909w = multibancoRegistrationTerms;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f222909w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        this.u = 1;
        com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar2 = this.v;
        Object objB0 = u0.b0(aVar2.X(), "REG_TERMS_CTA_BUTTON_TAG", new j(aVar2, this.f222909w, null), this);
        return objB0 == aVar ? aVar : objB0;
    }
}
