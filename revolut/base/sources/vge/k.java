package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288933w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x xVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
        this.f288933w = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, this.f288933w, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ProductAccount.ValueItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = this.v;
        bn2.p pVar = xVar.e;
        ProductAccountMetadata f89505g = valueItem.getF89505g();
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f288933w;
        return nim.a.u(new j(productAccountDescriptor$Value, xVar, valueItem, null), nim.a.v(pVar.g(age.b.e(productAccountDescriptor$Value, f89505g)), new vdl.a(xVar, valueItem, 24)));
    }
}
