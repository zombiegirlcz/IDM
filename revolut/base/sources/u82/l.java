package u82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public t82.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f278089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f278090x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(1, continuation);
        this.f278090x = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f278090x, this.v, continuation);
            default:
                return new l(this.f278090x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        t82.a aVarJ2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f278089w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                t82.f fVar = this.f278090x.o;
                t82.a aVar2 = this.v;
                this.f278089w = 1;
                l72.i iVar = fVar.f268809c;
                aVar2.getClass();
                Object objB = iVar.b(new dj0.d(aVar2.f268799b, w62.a.f295373a), this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f278089w;
                m mVar = this.f278090x;
                if (i2 == 0) {
                    o.b(obj2);
                    aVarJ2 = mVar.J2();
                    this.v = aVarJ2;
                    this.f278089w = 1;
                    obj2 = m.I2(mVar, aVarJ2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return (MultibancoWithdrawalCode) obj2;
                    }
                    aVarJ2 = this.v;
                    o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                l lVar = new l(mVar, aVarJ2, null);
                this.v = null;
                this.f278089w = 2;
                obj2 = q.t(mVar, lVar, this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                return (MultibancoWithdrawalCode) obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t82.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f278090x = mVar;
        this.v = aVar;
    }
}
