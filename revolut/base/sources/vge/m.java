package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f288945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f288947y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x xVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f288945w = xVar;
        this.f288946x = productAccountDescriptor$Value;
        this.f288947y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f288945w, this.f288946x, this.f288947y, continuation);
        mVar.v = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            x xVar = this.f288945w;
            ProductAccount productAccountL = ((t2) xVar.f289051c).l(x.b(xVar, this.f288946x, this.f288947y));
            ProductAccount.ValueItem valueItem = productAccountL instanceof ProductAccount.ValueItem ? (ProductAccount.ValueItem) productAccountL : null;
            if (valueItem != null) {
                g gVar = new g(zi0.c.P(valueItem, false, null, 3), null);
                this.v = null;
                this.u = 1;
                if (flowCollector.emit(gVar, this) == aVar) {
                    return aVar;
                }
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
