package kq5;

import android.os.Parcelable;
import aw0.f;
import aw0.g;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.x0;
import kotlin.jvm.internal.Intrinsics;
import kp0.q;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f188332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ap5.b f188333m;

    public e(c dialogProvider, ap5.b cryptoWithdrawInteractor) {
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        this.f188332l = dialogProvider;
        this.f188333m = cryptoWithdrawInteractor;
    }

    public final void Z2(CryptoAddress beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f188332l.getClass();
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_delete_alert_title, null, null, 14), null, null, null, false, 30);
        g gVar = new g(new n6(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_delete_alert_primary_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_details_delete_alert_secondary_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25);
        x0 value = x0.Crypto;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        N2(new ActionsBottomSheetController(new dii.a(aVar, gVar, new AnalyticsProduct.Business(value), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new q(this, beneficiary, 2));
    }
}
