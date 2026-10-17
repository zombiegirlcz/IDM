package bai;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ AcceptBankTermsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AcceptBankTermsScreen acceptBankTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = acceptBankTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_retail_user_declarations.bank_terms.a aVar2 = (com.revolut.feature_retail_user_declarations.bank_terms.a) this.u.R2();
        if (((i) ((j2) aVar2.f97492t.f22677a).getValue()).f14101b.f14097a) {
            aVar2.H2(aVar2.f97492t, new b96.a(18));
        } else {
            oki.h.v2(aVar2.f97491s, AcceptBankTermsScreenContract$ModalStep.BasicAccountDialog.f97487a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
