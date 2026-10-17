package hu1;

import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BlikCodeScreen f155523w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(BlikCodeScreen blikCodeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155523w = blikCodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f155523w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f155523w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((BlikContact) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((my0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BlikCodeScreen blikCodeScreen = this.f155523w;
        switch (i) {
            case 0:
                BlikContact blikContact = (BlikContact) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e0) blikCodeScreen.T2()).B2(blikContact);
                break;
            default:
                my0.a actionData = (my0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarT2 = blikCodeScreen.T2();
                Intrinsics.h(actionData);
                e0 e0Var = (e0) qVarT2;
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(actionData, "actionData");
                String str = actionData.f210276b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (Intrinsics.f(str, "COPY_BLIK_CODE_LIST_ID")) {
                    e0Var.l2(new a0(e0Var, objArr2 == true ? 1 : 0, 0), new yi5.b(26));
                } else if (Intrinsics.f(str, "REFRESH_BLIK_CODE_LIST_ID")) {
                    e0Var.l2(new a0(e0Var, objArr == true ? 1 : 0, 2), new yi5.b(26));
                } else {
                    Object obj3 = actionData.f210277c;
                    a aVar3 = obj3 instanceof a ? (a) obj3 : null;
                    if (aVar3 != null) {
                        e0Var.A2(aVar3);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
