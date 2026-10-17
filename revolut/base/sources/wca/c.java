package wca;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TokenVerificationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TokenVerificationScreen tokenVerificationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tokenVerificationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.P;
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53531a;
        if (Intrinsics.f(str, "countdown")) {
            l lVar = (l) r06.getValue();
            lVar.getClass();
            lVar.l2(new k(lVar, null, 0), new yi5.b(26));
        } else if (Intrinsics.f(str, "debug_code")) {
            Object obj3 = model.f53534g;
            String inputText = obj3 instanceof String ? (String) obj3 : null;
            if (inputText != null) {
                l lVar2 = (l) r06.getValue();
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(inputText, "inputText");
                lVar2.H2(lVar2.f296378r, new wb3.k(inputText, 1));
            }
        }
        return Unit.f186387a;
    }
}
