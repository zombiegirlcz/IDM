package u82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import iuf.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f278088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278088w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f278088w, continuation, 0);
            case 1:
                return new k(this.f278088w, continuation, 1);
            default:
                return new k(this.f278088w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m mVar = this.f278088w;
                Continuation continuation = null;
                if (i == 0) {
                    o.b(obj2);
                    lic.a aVar2 = new lic.a(mVar, 16);
                    y yVar = new y(mVar, 25);
                    j jVar = new j(mVar, continuation, 0);
                    this.v = 1;
                    obj2 = n14.k.P(mVar.X(), null, aVar2, yVar, jVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (!(eVar instanceof nii.c)) {
                    if (!(eVar instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) ((nii.d) eVar).f216133a;
                    if (multibancoWithdrawalCode == null) {
                        return null;
                    }
                    mVar.C2(new v62.i(multibancoWithdrawalCode));
                    return Unit.f186387a;
                }
                t82.g gVar = mVar.f278091p;
                n1 result = ((nii.c) eVar).f216124b;
                tyl.a onFinish = new tyl.a(mVar, 12);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(onFinish, "onFinish");
                ((j72.b) gVar.f268811b).Z2(result, onFinish);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    m mVar2 = this.f278088w;
                    j jVar2 = new j(mVar2, null, 1);
                    this.v = 1;
                    if (mVar2.p2(this, jVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                m mVar3 = this.f278088w;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = q.x(mVar3.f278092q.Z2(mVar3.J2()), this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (((hrf.h) obj2).b()) {
                    this.v = 2;
                    mVar3.l2(new k(mVar3, null, 0), new yi5.b(26));
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                }
                return Unit.f186387a;
        }
    }
}
