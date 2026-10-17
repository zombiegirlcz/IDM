package jc4;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback;
import ft3.h1;
import gim.i;
import hw3.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b f172706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ IllionFlowCallback f172707x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar, IllionFlowCallback illionFlowCallback, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f172706w = bVar;
        this.f172707x = illionFlowCallback;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f172706w, this.f172707x, continuation, 0);
            default:
                return new f(this.f172706w, this.f172707x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar = this.f172706w;
                if (i == 0) {
                    o.b(obj2);
                    b0 b0Var = bVar.f67794q;
                    h1 h1VarF = w0.F(bVar.f67793p.f67790a);
                    this.v = 1;
                    obj2 = b0Var.a(this.f172707x, h1VarF, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                it3.d dVar = (it3.d) obj2;
                if (dVar != null) {
                    this.v = 2;
                    if (t.N2(bVar, dVar, this, 2) == aVar) {
                        return aVar;
                    }
                } else {
                    bVar.P2();
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar2 = this.f172706w;
                    f fVar = new f(bVar2, this.f172707x, null, 0);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "PROMPT_BUTTON_TAG_PRIMARY", fVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
