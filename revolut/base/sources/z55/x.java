package z55;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.i implements Function2 {
    public com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a f319517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f319518x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f319517w = aVar;
        this.f319518x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.f319517w, this.f319518x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar3 = this.f319517w;
            she.g gVar = aVar3.z;
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(this.f319518x, null), ProductId.CURRENCY);
            this.u = aVar3;
            this.v = 1;
            zfe.f fVar = zfe.g.Companion;
            Object objC = gVar.c(main, null, this);
            if (objC == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        return aVar.C1((aii.u) obj2);
    }
}
