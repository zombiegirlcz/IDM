package ei3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import ha3.s;
import ha3.x;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f126376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CheckoutOrder f126377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f126378y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, AccountId accountId, CheckoutOrder checkoutOrder, Continuation continuation) {
        super(2, continuation);
        this.f126376w = mVar;
        this.f126378y = accountId;
        this.f126377x = checkoutOrder;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f126376w, this.f126378y, this.f126377x, continuation);
            default:
                return new j(this.f126376w, this.f126377x, this.f126378y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String id10;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                CheckoutOrder checkoutOrder = this.f126377x;
                m mVar = this.f126376w;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    hi3.a aVar2 = mVar.f126385a;
                    String strJ = m.j(this.f126378y);
                    Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
                    pi3.d dVar = checkoutOrder.d;
                    String str = dVar != null ? dVar.f236389b : null;
                    pi3.e eVar = checkoutOrder.e;
                    String[] elements = {str, eVar != null ? eVar.f236401c : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    this.v = 1;
                    if (((hi3.i) aVar2).b(this, strJ, listL) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                pi3.d dVar2 = checkoutOrder.d;
                if (dVar2 != null && (id10 = dVar2.f236388a) != null) {
                    x xVar = (x) mVar.e;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    pfm.h hVarN = pd.b.n(p0.f264003c, new s(xVar, id10, continuation, 3));
                    this.v = 2;
                    if (nim.a.a(hVarN, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Serializable serializableD = m.d(this.f126376w, this.f126377x, this.f126378y, this);
                return serializableD == aVar3 ? aVar3 : serializableD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, CheckoutOrder checkoutOrder, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.f126376w = mVar;
        this.f126377x = checkoutOrder;
        this.f126378y = accountId;
    }
}
