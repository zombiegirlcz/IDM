package d7a;

import android.os.Build;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.paynow.impl.screens.qr.a f111911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.paynow.impl.screens.qr.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f111911w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f111911w, continuation, 0);
            default:
                return new q(this.f111911w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.paynow.impl.screens.qr.a aVar2 = this.f111911w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    dj0.d dVar = aVar2.o.f80299a;
                    this.v = 1;
                    if (com.revolut.feature.paynow.impl.screens.qr.a.J2(aVar2, dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                        aVar2.H2(aVar2.f80309y, new p(w.I((do3.n) obj2), 0));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                d0 d0VarF = aVar2.f80308x.f(false);
                this.v = 2;
                obj2 = nim.a.b(d0VarF, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                aVar2.H2(aVar2.f80309y, new p(w.I((do3.n) obj2), 0));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.paynow.impl.screens.qr.a aVar4 = this.f111911w;
                    i80.a aVar5 = ((e) ((j2) aVar4.f80309y.f22677a).getValue()).f111898b;
                    if (aVar5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aVar4.v.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.v = 1;
                        if (com.revolut.feature.paynow.impl.screens.qr.a.I2(aVar4, aVar5, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        this.v = 2;
                        if (aVar4.L2(aVar5, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
