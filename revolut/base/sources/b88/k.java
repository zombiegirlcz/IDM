package b88;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.y;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f13128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f13129x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f13128w = nVar;
        this.f13129x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f13128w, this.f13129x, continuation, 0);
            default:
                return new k(this.f13128w, this.f13129x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f13129x;
                n nVar = this.f13128w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    y yVarD = rd0.e.d(mo3.a.g(nVar.f13138t.a(str, w4l.h.f294642c), null, new b6d.a(10), 1), h0.f322473a);
                    this.v = 1;
                    obj2 = vkm.q.x(yVarD, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nVar.C2(new f(str, ((SavingsProductData) d0.b0((List) obj2)).f86683a.f86617a));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = this.f13128w;
                    k kVar = new k(nVar2, this.f13129x, null, 0);
                    this.v = 1;
                    if (nVar2.p2(this, kVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
