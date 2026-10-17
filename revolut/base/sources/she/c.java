package she;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s56.d0;
import skm.e0;
import vge.x;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f263465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f263465w = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f263465w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            vge.d dVar = this.v.f263466a;
            this.u = 1;
            x xVar = (x) dVar;
            xVar.getClass();
            ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f263465w;
            Object objO = e0.o(new d0(xVar, productAccountDescriptor$Value, xVar.h(productAccountDescriptor$Value.getF89727a()), (Continuation) null, 15), this);
            if (objO != obj3) {
                objO = Unit.f186387a;
            }
            if (objO == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
