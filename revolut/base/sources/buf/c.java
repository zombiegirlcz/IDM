package buf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferRequestApprovalData f18784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManualTransferData f18785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18786c;
    public final b d;
    public final Clause e;
    public final ManualTransferRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18787g;

    public c(TransferRequestApprovalData transferRequestApprovalData, ManualTransferData manualTransferData, d extraData, b buttonsState, Clause clause, ManualTransferRecipient manualTransferRecipient, boolean z) {
        Intrinsics.checkNotNullParameter(transferRequestApprovalData, "transferRequestApprovalData");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        this.f18784a = transferRequestApprovalData;
        this.f18785b = manualTransferData;
        this.f18786c = extraData;
        this.d = buttonsState;
        this.e = clause;
        this.f = manualTransferRecipient;
        this.f18787g = z;
    }

    public static c a(c cVar, TransferRequestApprovalData transferRequestApprovalData, ManualTransferData manualTransferData, d dVar, b bVar, Clause clause, ManualTransferRecipient manualTransferRecipient, boolean z, int i) {
        if ((i & 1) != 0) {
            transferRequestApprovalData = cVar.f18784a;
        }
        TransferRequestApprovalData transferRequestApprovalData2 = transferRequestApprovalData;
        if ((i & 2) != 0) {
            manualTransferData = cVar.f18785b;
        }
        ManualTransferData manualTransferData2 = manualTransferData;
        if ((i & 4) != 0) {
            dVar = cVar.f18786c;
        }
        d extraData = dVar;
        if ((i & 8) != 0) {
            bVar = cVar.d;
        }
        b buttonsState = bVar;
        if ((i & 16) != 0) {
            clause = cVar.e;
        }
        Clause clause2 = clause;
        if ((i & 32) != 0) {
            manualTransferRecipient = cVar.f;
        }
        ManualTransferRecipient manualTransferRecipient2 = manualTransferRecipient;
        if ((i & 64) != 0) {
            z = cVar.f18787g;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(transferRequestApprovalData2, "transferRequestApprovalData");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        return new c(transferRequestApprovalData2, manualTransferData2, extraData, buttonsState, clause2, manualTransferRecipient2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18784a, cVar.f18784a) && Intrinsics.f(this.f18785b, cVar.f18785b) && Intrinsics.f(this.f18786c, cVar.f18786c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f18787g == cVar.f18787g;
    }

    public final int hashCode() {
        int iHashCode = this.f18784a.hashCode() * 31;
        ManualTransferData manualTransferData = this.f18785b;
        int iHashCode2 = (this.d.hashCode() + ((this.f18786c.hashCode() + ((iHashCode + (manualTransferData == null ? 0 : manualTransferData.hashCode())) * 31)) * 31)) * 31;
        Clause clause = this.e;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        ManualTransferRecipient manualTransferRecipient = this.f;
        return Boolean.hashCode(this.f18787g) + ((iHashCode3 + (manualTransferRecipient != null ? manualTransferRecipient.hashCode() : 0)) * 31);
    }
}
