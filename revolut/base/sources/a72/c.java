package a72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoCardService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f1752w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f1752w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            MultibancoCardService multibancoCardService = this.v.f1753a;
            e72.d dVar = new e72.d(this.f1752w);
            wj0.b bVar = new wj0.b("apm_product_mbway_card_issue");
            this.u = 1;
            obj2 = multibancoCardService.postCard(dVar, bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        MultibancoRegistrationStatus multibancoRegistrationStatusA = d72.a.a((e72.g) obj2);
        MultibancoRegistrationStatus.Registered registered = multibancoRegistrationStatusA instanceof MultibancoRegistrationStatus.Registered ? (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatusA : null;
        if (registered != null) {
            return registered;
        }
        throw new IllegalStateException("MultibancoCardService only support Registered state");
    }
}
