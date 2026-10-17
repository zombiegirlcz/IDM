package cie;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f24525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ActionsView.Item f24526x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, ActionsView.Item item, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f24525w = productAccountDescriptor$Value;
        this.f24526x = item;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v0(this.v, this.f24525w, this.f24526x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            the.a aVar2 = this.v.v;
            ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f24525w;
            ProductId f89727a = productAccountDescriptor$Value.getF89727a();
            ActionsView.Item item = this.f24526x;
            sfe.m mVar = new sfe.m(item.f58316a, productAccountDescriptor$Value.getF89728b(), item.f58324n);
            this.u = 1;
            if (aVar2.a(f89727a, mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
