package fb6;

import ba6.a0;
import ba6.c0;
import ba6.d0;
import ba6.e0;
import ba6.f0;
import ba6.j0;
import ba6.l0;
import ba6.u;
import ba6.z;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$InputData;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sa6.t;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a f133458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f133459x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f133458w = aVar;
        this.f133459x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f133458w, this.f133459x, continuation, 0);
            default:
                return new q(this.f133458w, this.f133459x, continuation, 1);
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
        q qVar;
        switch (this.u) {
            case 0:
                com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar = this.f133458w;
                DonateWithPointsContract$InputData donateWithPointsContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    d dVar = (d) ((j2) aVar.f72003t.f22677a).getValue();
                    l0 l0Var = (l0) zi0.c.I(dVar.f133445a);
                    j0 j0Var = (j0) l0Var.f13951b.get(dVar.f133446b);
                    aa6.c cVar = aVar.f72000q;
                    qVar = this;
                    obj2 = ((t) cVar).d(donateWithPointsContract$InputData.f71996c, new a0(new z(l0Var.f13950a, j0Var.f13937b, j0Var.f13936a)), this.f133459x, u.REGULAR, qVar);
                    if (obj2 == aVar2) {
                        return aVar2;
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
                    qVar = this;
                }
                f0 f0Var = (f0) obj2;
                if (f0Var instanceof c0) {
                    for (dj0.d dVar2 : ((c0) f0Var).f13923a.e) {
                        if (Intrinsics.f(dVar2.f115083b, donateWithPointsContract$InputData.f71994a)) {
                            aVar.f72002s.getClass();
                            yji.l.a1(aVar, aVar.X1(sc6.b.a(dVar2)), null, null, new r(aVar, null, 4), 3);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (f0Var instanceof d0) {
                    aVar.C2(new g((d0) f0Var));
                } else {
                    if (!(f0Var instanceof e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.v = 2;
                    if (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a.I2(aVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar4 = this.f133458w;
                    q qVar2 = new q(aVar4, this.f133459x, null, 0);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "DONATE_BUTTON_TAG", qVar2, this) == aVar3) {
                        return aVar3;
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
