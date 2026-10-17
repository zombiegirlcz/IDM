package qni;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OtpEmailNoEmailReceivedBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OtpEmailNoEmailReceivedBottomSheet otpEmailNoEmailReceivedBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = otpEmailNoEmailReceivedBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.T;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52613a;
        if (Intrinsics.f(str, "LIST_ID_NO_EMAIL_DIALOG_RESEND")) {
            i iVar = (i) r06.getValue();
            if (((d) ((j2) iVar.f247957p.f22677a).getValue()).f247953b) {
                iVar.C2(f.f247956a);
            }
        } else if (Intrinsics.f(str, "LIST_ID_NO_EMAIL_DIALOG_CHOOSE_ANOTHER_METHOD")) {
            ((i) r06.getValue()).C2(e.f247955a);
        }
        return Unit.f186387a;
    }
}
