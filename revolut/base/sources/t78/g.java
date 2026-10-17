package t78;

import com.revolut.feature.junior_savings.api.navigation.JuniorSavingFeatureConfig;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.vaults.common.SavingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ x88.b u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x88.b bVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        x88.b bVar = this.u;
        boolean z = bVar.f303298b;
        String str = bVar.f303297a;
        i iVar = this.v;
        return !z ? iVar.A2(new SavingsAccountCreationFlow$Destination(new SavingsAccountCreationFlow$Filter.ProductId(bVar.f303299c), new SavingAccountType.Junior(str), 12)) : iVar.A2(new JuniorSavingFeatureConfig.JuniorSavingsListDestination(str));
    }
}
