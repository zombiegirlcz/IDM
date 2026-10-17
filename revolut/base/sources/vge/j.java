package vge;

import com.revolut.feature.tab.accounts.api.model.AccountBackground;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ ProductAccount.ValueItem A;
    public ProductId u;
    public ld6.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f288926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288927y;
    public final /* synthetic */ x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ProductAccountDescriptor$Value productAccountDescriptor$Value, x xVar, ProductAccount.ValueItem valueItem, Continuation continuation) {
        super(2, continuation);
        this.f288927y = productAccountDescriptor$Value;
        this.z = xVar;
        this.A = valueItem;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f288927y, this.z, this.A, continuation);
        jVar.f288926x = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((AccountBackground) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ProductId productId;
        ld6.b bVar;
        AccountBackground accountBackground = (AccountBackground) this.f288926x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f288925w;
        x xVar = this.z;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f288927y;
        if (i == 0) {
            yhm.o.b(obj2);
            ProductId f89727a = productAccountDescriptor$Value.getF89727a();
            ProductId f89727a2 = productAccountDescriptor$Value.getF89727a();
            this.f288926x = accountBackground;
            this.u = f89727a;
            this.f288925w = 1;
            Serializable serializableA = x.a(xVar, this.A, f89727a2, this);
            if (serializableA != aVar) {
                productId = f89727a;
                obj2 = serializableA;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ld6.b bVar2 = this.v;
            productId = this.u;
            yhm.o.b(obj2);
            bVar = bVar2;
            return new AccountContent(productId, this.A, accountBackground, ((Boolean) obj2).booleanValue(), bVar);
        }
        productId = this.u;
        yhm.o.b(obj2);
        ld6.b bVar3 = (ld6.b) obj2;
        z2 z2Var = xVar.d;
        this.f288926x = accountBackground;
        this.u = productId;
        this.v = bVar3;
        this.f288925w = 2;
        Boolean boolE = ((t3) z2Var).e(productAccountDescriptor$Value);
        if (boolE != aVar) {
            bVar = bVar3;
            obj2 = boolE;
            return new AccountContent(productId, this.A, accountBackground, ((Boolean) obj2).booleanValue(), bVar);
        }
        return aVar;
    }
}
