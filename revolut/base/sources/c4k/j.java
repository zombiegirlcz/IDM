package c4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import e4k.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferNote.StructuredNote f21313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21314c;

    public /* synthetic */ j(TransferNote.StructuredNote structuredNote, String str, int i) {
        this.f21312a = i;
        this.f21313b = structuredNote;
        this.f21314c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f21312a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, TransferNote.StructuredNote.a(this.f21313b, this.f21314c, null, 2), null, 6);
            default:
                x updateState = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                TransferNote.StructuredNote structuredNoteA = TransferNote.StructuredNote.a(this.f21313b, this.f21314c, null, 2);
                BankTransferData bankTransferData = updateState.f122647c;
                return x.a(updateState, null, bankTransferData != null ? BankTransferData.a(bankTransferData, 0L, null, null, null, structuredNoteA, null, null, null, null, null, null, null, null, 1048543) : null, null, 0, null, null, null, false, 1019);
        }
    }
}
