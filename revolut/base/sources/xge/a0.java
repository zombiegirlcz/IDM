package xge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductSpaceIdentifier f305692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ su9.c f305693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pie.v f305694y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ProductSpaceIdentifier productSpaceIdentifier, su9.c cVar, pie.v vVar, Continuation continuation) {
        super(2, continuation);
        this.f305692w = productSpaceIdentifier;
        this.f305693x = cVar;
        this.f305694y = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.f305692w, this.f305693x, this.f305694y, continuation);
        a0Var.v = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        Data data = (Data) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Pair pair = (Pair) data.getContent();
            if (pair != null && (list = (List) pair.f186386b) != null && !data.getLoading()) {
                ProductSpaceIdentifier productSpaceIdentifier = this.f305692w;
                if (productSpaceIdentifier.f89741a != ProductSpaceIdentifier.Favourites.f89744c.f89741a) {
                    b0 b0Var = (b0) this.f305693x.f265694b;
                    this.v = null;
                    this.u = 1;
                    if (((g0) b0Var).e(productSpaceIdentifier, this.f305694y, list, this) == aVar) {
                        return aVar;
                    }
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
