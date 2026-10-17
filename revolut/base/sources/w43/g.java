package w43;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import h93.f0;
import h93.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ boolean A;
    public int u;
    public final /* synthetic */ SelectPaymentMethodInputData.UseCase v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f294504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f294505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f294506y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectPaymentMethodInputData.UseCase useCase, i iVar, xi0.b bVar, List list, List list2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = useCase;
        this.f294504w = iVar;
        this.f294505x = bVar;
        this.f294506y = list;
        this.z = list2;
        this.A = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f294504w, this.f294505x, this.f294506y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i93.d dVar;
        i93.c cVar;
        i93.c cVar2;
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
        SelectPaymentMethodInputData.UseCase useCase = this.v;
        boolean z = (useCase instanceof SelectPaymentMethodInputData.UseCase.OrderNewCard) && ((SelectPaymentMethodInputData.UseCase.OrderNewCard) useCase).f65247c;
        AccountId f65249b = useCase.getF65249b();
        f0 f0VarA = d43.a.a(useCase);
        List listB = (f0VarA == null || (cVar2 = f0VarA.f150113g) == null) ? null : cVar2.b();
        if (listB == null) {
            listB = zhm.f0.f322471a;
        }
        List list = listB;
        f0 f0VarA2 = d43.a.a(useCase);
        if (f0VarA2 != null) {
            i93.c cVar3 = f0VarA2.f150113g;
            dVar = cVar3 != null ? cVar3.f159553h : null;
        } else {
            dVar = null;
        }
        f0 f0VarA3 = d43.a.a(useCase);
        List list2 = (f0VarA3 == null || (cVar = f0VarA3.f150113g) == null) ? null : cVar.f159552g;
        if (list2 == null) {
            list2 = zhm.f0.f322471a;
        }
        List list3 = list2;
        boolean zA = useCase.a();
        f0 f0VarA4 = d43.a.a(useCase);
        l0 l0Var = f0VarA4 != null ? f0VarA4.G : null;
        this.u = 1;
        Object objA = i.a(this.f294504w, f65249b, this.f294505x, this.f294506y, this.z, list, dVar, list3, this.A, zA, z, l0Var, this);
        return objA == aVar ? aVar : objA;
    }
}
