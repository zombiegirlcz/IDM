package cw6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerInvoiceNumberSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerInvoiceNumberSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        boolean zF = Intrinsics.f(str, "LIST_ID_INPUT_PREFIX");
        FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen = this.v;
        if (zF) {
            i iVarE3 = freelancerInvoiceNumberSettingsScreen.R2();
            String prefix = charSequence.toString();
            l lVar = (l) iVarE3;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            lVar.H2(lVar.f109555t, new c86.c(prefix, 18));
        } else if (Intrinsics.f(str, "LIST_ID_INPUT_NUMBER")) {
            i iVarE32 = freelancerInvoiceNumberSettingsScreen.R2();
            String number = charSequence.toString();
            l lVar2 = (l) iVarE32;
            lVar2.getClass();
            Intrinsics.checkNotNullParameter(number, "number");
            lVar2.H2(lVar2.f109555t, new c86.c(number, 19));
        }
        return Unit.f186387a;
    }
}
