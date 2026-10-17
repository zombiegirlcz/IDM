package tsf;

import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import elm.f;
import gim.i;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements csf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kye.e f274119a;

    public a(kye.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274119a = repository;
    }

    public final Object a(ttf.b bVar, TransferReasonCategory transferReasonCategory, Set set, TransferReasonsRequest transferReasonsRequest, i iVar) {
        TransferReasonsRequest.ForTransferWithIdentification forTransferWithIdentification = transferReasonsRequest instanceof TransferReasonsRequest.ForTransferWithIdentification ? (TransferReasonsRequest.ForTransferWithIdentification) transferReasonsRequest : null;
        lsf.a aVar = new lsf.a(this.f274119a, bVar, transferReasonCategory, set, forTransferWithIdentification != null ? forTransferWithIdentification.d : null, null);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, aVar, iVar);
    }
}
