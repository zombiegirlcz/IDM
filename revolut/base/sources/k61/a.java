package k61;

import com.revolut.data.network.models.moneyrequest.RedeemTransferLinkRequestDto;
import efm.r;
import i31.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    static t a(a aVar, String transferLinkId) {
        i iVar = (i) aVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        l lVar = (l) iVar.f181611a;
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        efm.b bVarRedeemTransferLink = lVar.f158085b.redeemTransferLink(transferLinkId, new RedeemTransferLinkRequestDto(null));
        pfm.h hVar = new pfm.h(new hc7.a(lVar, transferLinkId, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarRedeemTransferLink.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        t tVarL = w.g0(aVarE).l(new d(iVar, 0));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    static r b(a aVar, xi0.b targetCurrency, wi0.b bVar, gk3.i transferType, String str, String str2, Long l2, prf.a aVar2, prf.a aVar3, int i) {
        c7l.e eVar;
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            aVar2 = null;
        }
        if ((i & 128) != 0) {
            aVar3 = null;
        }
        i iVar = (i) aVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        f7l.a aVar4 = iVar.e;
        int i2 = h.f181609a[transferType.ordinal()];
        if (i2 == 1) {
            eVar = c7l.e.TRANSFER_LINK;
        } else if (i2 == 2) {
            eVar = c7l.e.BANK_TRANSFER;
        } else if (i2 == 3) {
            eVar = c7l.e.INTERNAL_TRANSFER;
        } else if (i2 == 4) {
            eVar = c7l.e.WALLET_TRANSFER;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = c7l.e.CARD_TRANSFER;
        }
        return nim.a.w(aVar4.f(targetCurrency, bVar, eVar, str, str2, l2, i.j(aVar2), i.j(aVar3)), new c(iVar, 0));
    }
}
