package pni;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.otp.input.flow.email.OtpEmailScreen;
import com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ OtpEmailScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OtpEmailScreen otpEmailScreen, Continuation continuation) {
        super(2, continuation);
        this.u = otpEmailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.d();
        OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = xVar.o;
        cli.y yVar = xVar.f237829s;
        int i = v.f237824a[((l) ((j2) yVar.f22677a).getValue()).f237817c.ordinal()];
        if (i == 1 || i == 2) {
            k kVar = ((l) ((j2) yVar.f22677a).getValue()).f237816b;
            xVar.C2(new o(kVar instanceof i ? ((i) kVar).f237813a : 0L, otpEmailScreenContract$InputData.f));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            xVar.C2(new p(otpEmailScreenContract$InputData.d));
        }
        return Unit.f186387a;
    }
}
