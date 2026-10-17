package vha;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.common.ModalDestination;
import et6.i2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends gim.i implements Function1 {
    public q0 u;
    public jr6.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f289408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f289409y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, ProductAccountId productAccountId, Continuation continuation) {
        super(1, continuation);
        this.f289408x = q0Var;
        this.f289409y = productAccountId;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m0(this.f289408x, this.f289409y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q0 q0Var;
        Object objZ;
        jr6.m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f289407w;
        if (i == 0) {
            yhm.o.b(obj2);
            q0Var = this.f289408x;
            jr6.m mVar2 = q0Var.f289416m;
            this.u = q0Var;
            this.v = mVar2;
            this.f289407w = 1;
            ProductAccountId productAccountId = this.f289409y;
            String str = productAccountId.f89729a;
            sha.b.Companion.getClass();
            if (Intrinsics.f(str, sha.a.f263448b)) {
                objZ = null;
            } else {
                objZ = vkm.q.z(new v0b.b(mo3.a.g(((i2) q0Var.C).c(w4l.h.f294642c), null, new vgg.a0(8), 1), productAccountId, 9), this);
            }
            if (objZ == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = objZ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.v;
            q0Var = this.u;
            yhm.o.b(obj2);
        }
        yji.n.P2(q0Var, jr6.m.a(mVar, (xi0.b) obj2, null, 2), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
