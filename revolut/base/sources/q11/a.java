package q11;

import com.revolut.data.network.models.transfer.TransferDto;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import prf.b;
import prf.c;
import qk.d;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final String a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof b) {
            return null;
        }
        if (dVar instanceof prf.d) {
            return ((prf.d) dVar).f239005b;
        }
        if (dVar instanceof c) {
            return ((c) dVar).f239004c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(TransferAppSource transferAppSource) {
        Intrinsics.checkNotNullParameter(transferAppSource, "<this>");
        if (transferAppSource instanceof TransferAppSource.AIR_WIDGET) {
            return ((TransferAppSource.AIR_WIDGET) transferAppSource).f92296a;
        }
        if ((transferAppSource instanceof TransferAppSource.BANK_TRANSFER) || (transferAppSource instanceof TransferAppSource.DEFAULT) || (transferAppSource instanceof TransferAppSource.USERNAME) || (transferAppSource instanceof TransferAppSource.PAYMENT_LINK)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransferDto.FundingSourceDto c(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof b) {
            return new TransferDto.FundingSourceDto(((b) dVar).f239001b, null, null, 6, null);
        }
        if (dVar instanceof prf.d) {
            return new TransferDto.FundingSourceDto(null, ((prf.d) dVar).f239006c, null, 5, null);
        }
        if (dVar instanceof c) {
            return new TransferDto.FundingSourceDto(null, null, ((c) dVar).f239003b, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ibl.a d(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof b) {
            return new ibl.a(((b) dVar).f239001b, null, null, 6);
        }
        if (dVar instanceof prf.d) {
            prf.d dVar2 = (prf.d) dVar;
            return new ibl.a(null, null, new ibl.b(dVar2.f239006c, dVar2.f239005b), 3);
        }
        if (dVar instanceof c) {
            return new ibl.a(null, ((c) dVar).f239003b, null, 5);
        }
        throw new NoWhenBranchMatchedException();
    }
}
