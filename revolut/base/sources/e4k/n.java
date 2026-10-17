package e4k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ BankTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BankTransferAmountScreen bankTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bankTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.u.T2();
        TransferNote transferNote = aVar2.G2().f;
        TransferNote.NewZealandNote newZealandNote = transferNote instanceof TransferNote.NewZealandNote ? (TransferNote.NewZealandNote) transferNote : null;
        if (newZealandNote == null) {
            TransferNote.NewZealandNote.INSTANCE.getClass();
            newZealandNote = TransferNote.NewZealandNote.d;
        }
        yji.l.g2(aVar2, new NewZealandTransferNoteScreen(new NewZealandTransferNoteScreenContract$InputData(newZealandNote)), null, new o0(aVar2, 2), 1);
        return Unit.f186387a;
    }
}
