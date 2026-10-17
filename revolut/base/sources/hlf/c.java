package hlf;

import android.os.Parcelable;
import aw0.g;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import elf.s0;
import fof.f;
import grl.k9;
import hl7.ma;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fof.d f153457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rm5.a f153458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ibj.a f153459n;
    public final Lazy o;

    public c(fof.d cryptoTfrMeshVerificationBannerProvider, rm5.a cancelTfrValidationInteractor, ibj.a cryptoDepositsRepository) {
        Intrinsics.checkNotNullParameter(cryptoTfrMeshVerificationBannerProvider, "cryptoTfrMeshVerificationBannerProvider");
        Intrinsics.checkNotNullParameter(cancelTfrValidationInteractor, "cancelTfrValidationInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsRepository, "cryptoDepositsRepository");
        this.f153457l = cryptoTfrMeshVerificationBannerProvider;
        this.f153458m = cancelTfrValidationInteractor;
        this.f153459n = cryptoDepositsRepository;
        this.o = j.b(new ma(1));
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!((Set) this.o.getValue()).contains(str) || !(obj2 instanceof f)) {
            return Boolean.FALSE;
        }
        this.f153457l.getClass();
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transaction_details_crypto_tfr_validation_cancel_popup_title, null, null, 14), new TextLocalisedClause(R$string.transaction_details_crypto_tfr_validation_cancel_popup_description, null, null, 14), null, null, false, 28);
        g gVar = new g(new n6(new TextLocalisedClause(R$string.transaction_details_crypto_tfr_validation_cancel_popup_negative_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.transaction_details_crypto_tfr_validation_cancel_popup_possitive_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CryptoTfrCancelValidation_LoadingTag", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h8b.b(this, (f) obj2, 28));
        return Boolean.TRUE;
    }
}
