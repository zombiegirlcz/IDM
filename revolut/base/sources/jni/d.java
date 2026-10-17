package jni;

import cli.y;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.otp.input.flow.code.OtpCodeInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OtpCodeInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OtpCodeInputScreen otpCodeInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = otpCodeInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.v.Q.getValue();
        Intrinsics.h(model);
        s sVar = (s) lVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        y yVar = sVar.v;
        if (!((e) ((j2) yVar.f22677a).getValue()).f176788g) {
            String str = model.f52603a;
            int iHashCode = str.hashCode();
            if (iHashCode == -1891390643) {
                if (str.equals("LIST_ID_DEBUG_APPLY_CODE")) {
                    String str2 = ((e) ((j2) yVar.f22677a).getValue()).e;
                    if (str2 != null) {
                        sVar.H2(yVar, new jb8.a(str2, 7));
                    }
                }
                throw new IllegalStateException(a10.b.s("Click ", str, " is not processed"));
            }
            if (iHashCode == -483960510) {
                if (str.equals("LIST_ID_CHOOSE_ANOTHER_METHOD")) {
                    sVar.C2(f.f176789a);
                }
                throw new IllegalStateException(a10.b.s("Click ", str, " is not processed"));
            }
            if (iHashCode == 1547471123 && str.equals("LIST_ID_RESEND_BUTTON")) {
                sVar.H2(yVar, new jn2.a(9));
                sVar.C2(new g(sVar.o.d));
            }
            throw new IllegalStateException(a10.b.s("Click ", str, " is not processed"));
        }
        return Unit.f186387a;
    }
}
