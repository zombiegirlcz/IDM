package pni;

import android.content.Intent;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.otp.input.flow.email.OtpEmailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ OtpEmailScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OtpEmailScreen otpEmailScreen, Continuation continuation) {
        super(2, continuation);
        this.u = otpEmailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.d();
        if (((l) ((j2) xVar.f237829s.f22677a).getValue()).c()) {
            xVar.C2(new n(true));
        } else {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.APP_EMAIL");
            intent.addFlags(268435456);
            xVar.C1(new ExternalDestination.ByIntent(intent, null));
        }
        return Unit.f186387a;
    }
}
