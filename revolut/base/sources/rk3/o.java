package rk3;

import com.revolut.feature.confirmation_code.data.OtpTask;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.confirmation_code.ui.otp.a f254743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f254744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f254745y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.confirmation_code.ui.otp.a aVar, CoroutineScope coroutineScope, String str, Continuation continuation) {
        super(1, continuation);
        this.f254743w = aVar;
        this.f254744x = coroutineScope;
        this.f254745y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f254744x, this.f254743w, this.f254745y, continuation);
            default:
                return new o(this.f254743w, this.f254744x, this.f254745y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        String str = this.f254745y;
        com.revolut.feature.confirmation_code.ui.otp.a aVar = this.f254743w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        m.Companion companion = yhm.m.INSTANCE;
                        pk3.a aVar3 = aVar.f65964p;
                        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = aVar.o;
                        OtpTask otpTask = eSignOtpScreenContract$InputData.f65952b;
                        h1 h1Var = eSignOtpScreenContract$InputData.k;
                        this.v = 1;
                        if (aVar3.b(otpTask, str, h1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (yhm.m.a(objA) != null) {
                    aVar.H2(aVar.v, new rj7.b(6));
                }
                yhm.o.b(objA);
                aVar.C2(h.f254735a);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    o oVar = new o(this.f254744x, aVar, str, (Continuation) null);
                    this.v = 1;
                    if (aVar.p2(this, oVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CoroutineScope coroutineScope, com.revolut.feature.confirmation_code.ui.otp.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f254744x = coroutineScope;
        this.f254743w = aVar;
        this.f254745y = str;
    }
}
