package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f122629c;

    public /* synthetic */ q0(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, String str, int i) {
        this.f122627a = i;
        this.f122628b = aVar;
        this.f122629c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TransferNote transferNoteC;
        Set setKeySet;
        x updateState = (x) obj2;
        switch (this.f122627a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = this.f122628b;
                BankTransferData bankTransferDataG2 = aVar.G2();
                String str = this.f122629c;
                BankTransferData bankTransferDataA = BankTransferData.a(bankTransferDataG2, 0L, null, null, null, new TransferNote.SimpleNote(str), null, null, null, null, null, null, null, null, 1048543);
                i0 i0Var = ((x) aVar.t2()).i;
                if (i0Var != null) {
                    return x.a(updateState, null, bankTransferDataA, null, 0, null, null, i0.a(i0Var, str), false, 763);
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar2 = this.f122628b;
                TransferNote transferNote = aVar2.G2().f;
                boolean z = transferNote instanceof TransferNote.SimpleNote;
                String str2 = this.f122629c;
                if (z) {
                    transferNoteC = new TransferNote.SimpleNote(str2);
                } else {
                    String str3 = null;
                    if (transferNote instanceof TransferNote.NewZealandNote) {
                        transferNoteC = TransferNote.NewZealandNote.a((TransferNote.NewZealandNote) transferNote, null, null, str2, 3);
                    } else {
                        if (!(transferNote instanceof TransferNote.StructuredNote)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TransferNote.StructuredNote structuredNote = (TransferNote.StructuredNote) transferNote;
                        Map mapB = structuredNote.b();
                        if (mapB != null && (setKeySet = mapB.keySet()) != null) {
                            str3 = (String) zhm.d0.a0(setKeySet);
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        transferNoteC = structuredNote.c(structuredNote.f101984a, str3, new TransferNote.StructuredNote.ReferenceValue(str2, str2));
                    }
                }
                BankTransferData bankTransferDataA2 = BankTransferData.a(aVar2.G2(), 0L, null, null, null, transferNoteC, null, null, null, null, null, null, null, null, 1048543);
                i0 i0Var2 = ((x) aVar2.t2()).i;
                if (i0Var2 != null) {
                    return x.a(updateState, null, bankTransferDataA2, null, 0, null, null, i0.a(i0Var2, str2), false, 763);
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
