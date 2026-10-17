package nni;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheet;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OtpResendMethodsBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OtpResendMethodsBottomSheet otpResendMethodsBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = otpResendMethodsBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        mni.b bVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.T.getValue();
        String listId = model.f53228a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -2015510278:
                if (listId.equals("RESEND_ACTION_LIST_ID_WHATSAPP")) {
                    bVar = mni.b.WHATSAPP;
                    eVar.C2(new d(bVar));
                    return Unit.f186387a;
                }
                break;
            case -1416738436:
                if (listId.equals("RESEND_ACTION_LIST_ID_TELEPHONE")) {
                    bVar = mni.b.TELEPHONE;
                    eVar.C2(new d(bVar));
                    return Unit.f186387a;
                }
                break;
            case 1306712273:
                if (listId.equals("RESEND_ACTION_LIST_ID_SMS")) {
                    bVar = mni.b.SMS;
                    eVar.C2(new d(bVar));
                    return Unit.f186387a;
                }
                break;
            case 1607099668:
                if (listId.equals("RESEND_ACTION_LIST_ID_EMAIL")) {
                    bVar = mni.b.EMAIL;
                    eVar.C2(new d(bVar));
                    return Unit.f186387a;
                }
                break;
        }
        throw new IllegalStateException(a10.b.s("Action with id ", listId, " is not supported"));
    }
}
