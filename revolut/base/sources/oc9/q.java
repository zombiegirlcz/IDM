package oc9;

import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ QesTermsScreen f224157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(QesTermsScreen qesTermsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224157w = qesTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f224157w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f224157w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        QesTermsScreen qesTermsScreen = this.f224157w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                QesTermsScreen.Companion aVar2 = QesTermsScreen.INSTANCE;
                qesTermsScreen.f3(zBooleanValue);
                break;
            default:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = qesTermsScreen.d();
                Intrinsics.h(data);
                b0 b0Var = (b0) xVarE3;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                b0Var.n2(new i0(data, b0Var, (Continuation) null), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
