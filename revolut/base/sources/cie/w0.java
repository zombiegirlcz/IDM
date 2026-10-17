package cie;

import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vge.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f24530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24529w = dVar;
        this.f24530x = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w0(this.f24529w, this.f24530x, continuation, 0);
            case 1:
                return new w0(this.f24529w, this.f24530x, continuation, 1);
            default:
                return new w0(this.f24529w, this.f24530x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24529w;
                TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = dVar.f89707p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = tabAccountsScreenContract$InputData.f89676a;
                    if (productAccountDescriptor$Value != null) {
                        ((t3) dVar.f89710s).t(productAccountDescriptor$Value, tge.b.SWITCHED);
                    }
                    the.a aVar2 = dVar.v;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value2 = this.f24530x;
                    ProductId f89727a = productAccountDescriptor$Value2.getF89727a();
                    sfe.p pVar = new sfe.p(productAccountDescriptor$Value2.getF89728b(), tabAccountsScreenContract$InputData.f89677b);
                    this.v = 1;
                    if (aVar2.a(f89727a, pVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    the.a aVar4 = this.f24529w.v;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value3 = this.f24530x;
                    ProductId f89727a2 = productAccountDescriptor$Value3.getF89727a();
                    sfe.j jVar = new sfe.j(productAccountDescriptor$Value3.getF89728b());
                    this.v = 1;
                    if (aVar4.a(f89727a2, jVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    the.a aVar6 = this.f24529w.v;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value4 = this.f24530x;
                    ProductId f89727a3 = productAccountDescriptor$Value4.getF89727a();
                    sfe.k kVar = new sfe.k(productAccountDescriptor$Value4.getF89728b());
                    this.v = 1;
                    if (aVar6.a(f89727a3, kVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
