package lca;

import android.os.Parcelable;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.kompot.common.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.z;
import ofm.q;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f193810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f193811c;

    public /* synthetic */ i(n nVar, Parcelable parcelable, int i) {
        this.f193809a = i;
        this.f193810b = nVar;
        this.f193811c = parcelable;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f193809a) {
            case 0:
                l lVar = (l) this.f193810b;
                PixTransferNavigation$InputData.ApmTransfer apmTransfer = (PixTransferNavigation$InputData.ApmTransfer) this.f193811c;
                return ((uca.c) lVar.f193816m).c((Throwable) obj2, ((vca.g) lVar.f193817n).a(apmTransfer.f80526a.f62141b)).f216244b;
            default:
                nzh.c cVar = (nzh.c) this.f193810b;
                CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) this.f193811c;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "it");
                rzh.b bVar = cVar.f221066l;
                xi0.b currency = kyh.k.d(cryptoOrderDraft).f96683a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(currency, "currency");
                ServerError serverErrorA = bVar.f258680a.a(error);
                if (serverErrorA == null) {
                    if ((error instanceof ServerErrorException) || (error instanceof HandledNetworkException)) {
                        return null;
                    }
                    return rzh.b.a(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14));
                }
                int i = serverErrorA.f51362a;
                v60.c cVarB = ((ao0.a) bVar.f258681b).b(Integer.valueOf(i));
                TextLocalisedClause textLocalisedClauseO = cVarB != null ? q.O(cVarB) : new TextLocalisedClause(R$string.common_error_state_title, null, null, 14);
                if (i == 10800) {
                    return new z(new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_status_title_transaction_unsuccessful, null, null, 14), new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_status_description_crypto_not_allowed, null, null, 14), new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
                }
                switch (i) {
                    case 1507:
                        return new z(new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_1507, u.c(new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
                    case 1508:
                    case 1509:
                        if (bVar.f258682c.s(error)) {
                            return null;
                        }
                        return rzh.b.a(textLocalisedClauseO);
                    default:
                        return rzh.b.a(textLocalisedClauseO);
                }
        }
    }
}
