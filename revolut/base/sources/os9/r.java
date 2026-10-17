package os9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks9.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f229278w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f229278w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f229278w, continuation, 0);
            default:
                return new r(this.f229278w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                u uVar = this.f229278w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ks9.h hVar = uVar.f229285r;
                    PaymentGroup group = uVar.z2().f229270a;
                    f0 f0Var = (f0) hVar;
                    f0Var.getClass();
                    Intrinsics.checkNotNullParameter(group, "group");
                    pfm.r rVarE = ((mr9.a) f0Var.f189325l).e(group.f79285a);
                    this.v = 1;
                    if (nim.a.a(rVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                uVar.v2(m.f229274a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                u uVar2 = this.f229278w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    rfm.f0 f0VarA = uVar2.f229284q.a(uVar2.z2().f229270a);
                    this.v = 1;
                    obj2 = nim.a.b(f0VarA, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list = (List) obj2;
                Intrinsics.h(list);
                PaymentGroup paymentGroup = uVar2.z2().f229270a;
                wi0.b bVarY = do3.q.y(uVar2.z2().f229271b);
                yji.l.j2(uVar2, uVar2.u.a(list, paymentGroup.f79285a, paymentGroup.f79290j.f79507b, bVarY), null, null, 3);
                return Unit.f186387a;
        }
    }
}
