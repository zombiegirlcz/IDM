package o82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ku1.v;
import n14.k;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.registration.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoRegistrationTerms f222910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar, MultibancoRegistrationTerms multibancoRegistrationTerms, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f222910w = multibancoRegistrationTerms;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f222910w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = new v(9);
            h hVar = new h(aVar2, this.f222910w, null);
            this.u = 1;
            obj2 = k.Q(aVar2, null, null, vVar, hVar, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (eVar instanceof nii.d) {
            aVar2.C2(new e((MultibancoRegistrationStatus.Registered) ((nii.d) eVar).f216133a));
        } else {
            if (!(eVar instanceof nii.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.C2(d.f222906a);
        }
        return Unit.f186387a;
    }
}
