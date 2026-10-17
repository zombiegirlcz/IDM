package y2k;

import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f310671p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NewZealandTransferNoteScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f310671p = new e(inputData.f102012a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f310671p;
    }
}
