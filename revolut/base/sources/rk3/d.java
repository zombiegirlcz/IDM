package rk3;

import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.d8;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ESignOtpScreen f254728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ESignOtpScreen eSignOtpScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254728w = eSignOtpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f254728w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f254728w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((d8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ESignOtpScreen eSignOtpScreen = this.f254728w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = eSignOtpScreen.e3();
                Intrinsics.h(str);
                ((com.revolut.feature.confirmation_code.ui.otp.a) jVarE3).I2(str);
                break;
            default:
                d8 d8Var = (d8) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = eSignOtpScreen.e3();
                String listId = d8Var.f209649a;
                com.revolut.feature.confirmation_code.ui.otp.a aVar3 = (com.revolut.feature.confirmation_code.ui.otp.a) jVarE32;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                String str2 = ((e) ((j2) aVar3.v.f22677a).getValue()).e;
                if (str2 != null) {
                    aVar3.I2(str2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
