package o82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.registration.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoRegistrationTerms f222911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar, MultibancoRegistrationTerms multibancoRegistrationTerms, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f222911w = multibancoRegistrationTerms;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f222911w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarB = pre.c.b(aVar2.f62627q, this.f222911w.getTermsId());
            this.u = 1;
            if (nim.a.a(rVarB, this) != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        l72.c cVar = aVar2.f62626p;
        String str = aVar2.o.f62623b;
        this.u = 2;
        a72.c cVar2 = new a72.c((a72.d) ((l72.d) cVar).f192506b, str, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
