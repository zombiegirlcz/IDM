package vea;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId f288198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f288199x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AccountId accountId, io3.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f288198w = accountId;
        this.f288199x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f288198w, this.f288199x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductId productId;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            zfe.e eVar = this.v.f;
            AccountId accountId = this.f288198w;
            if (accountId instanceof AccountId.Joint) {
                productId = ProductId.JOINT;
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                productId = ProductId.CURRENCY;
            }
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(this.f288199x.f163145a, null), productId);
            MainScreenTab mainScreenTab = ibb.c.f160140a;
            this.u = 1;
            obj2 = ((cge.e) eVar).b(main, mainScreenTab, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return new o97.d((aii.u) obj2);
    }
}
