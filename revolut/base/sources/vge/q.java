package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f288977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ProductAccountDescriptor$Value productAccountDescriptor$Value, x xVar, Continuation continuation) {
        super(2, continuation);
        this.f288976w = productAccountDescriptor$Value;
        this.f288977x = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f288977x, this.f288976w, continuation);
            default:
                return new q(this.f288976w, this.f288977x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vkm.y yVarD = rd0.e.d(mo3.a.g(new tnb.k(this.f288977x.g(this.f288976w), 25), null, new vea.b(16), 1), zhm.h0.f322473a);
                this.v = 1;
                Object objZ = vkm.q.z(yVarD, this);
                return objZ == aVar ? aVar : objZ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f288976w;
                String id10 = productAccountDescriptor$Value.getF89727a().getId();
                Intrinsics.checkNotNullParameter(id10, "id");
                vkm.y yVarD2 = rd0.e.d(((k49.b) this.f288977x.f289055l).b(new j49.i(id10, productAccountDescriptor$Value.getF89728b().f89729a)), zhm.h0.f322473a);
                this.v = 1;
                Object objZ2 = vkm.q.z(yVarD2, this);
                return objZ2 == aVar2 ? aVar2 : objZ2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation) {
        super(2, continuation);
        this.f288977x = xVar;
        this.f288976w = productAccountDescriptor$Value;
    }
}
