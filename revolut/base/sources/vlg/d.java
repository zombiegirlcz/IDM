package vlg;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import uyh.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SendChecksRecipientScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SendChecksRecipientScreen sendChecksRecipientScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sendChecksRecipientScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        s sVar = (s) kVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        sVar.H2(sVar.f290446q, new w(listId, 18, sVar, text));
        return Unit.f186387a;
    }
}
