package a5h;

import ael.d0;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth.assetdetails.ui.api.navigation.InstrumentRatingsFeatureConfig$Destination;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends k3h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3h.e f1399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b5h.b f1400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f1401n;
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c4h.c f1402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k3h.d f1403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f1404r;

    public f(k3h.e inputData, b5h.b ratingsWidgetDialogProvider, d0 stocksInteractor, ybl.b instrumentTickerInteractor, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ratingsWidgetDialogProvider, "ratingsWidgetDialogProvider");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f1399l = inputData;
        this.f1400m = ratingsWidgetDialogProvider;
        this.f1401n = stocksInteractor;
        this.o = instrumentTickerInteractor;
        this.f1402p = stockOnboardingInteractor;
        k3h.d dVar = new k3h.d(inputData.f180740b, null, null);
        this.f1403q = dVar;
        this.f1404r = pyd.c.a(this, dVar);
    }

    @Override // yji.n
    public final void H2() {
        V2(new a01.e(this, null, 7), new yi5.b(29));
    }

    @Override // k3h.b
    public final void Z2(k3h.f parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        A2(new InstrumentRatingsFeatureConfig$Destination.InstrumentCreditRatingsDestination(parcel.f180741a, parcel.f180742b));
    }

    @Override // k3h.b
    public final void b3(k3h.f parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        wdh.a ratingsProvider = parcel.f180741a;
        this.f1400m.getClass();
        Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
        if (b5h.a.f12521a[ratingsProvider.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_bonds_ratings_widget_info_dialog_title_fitch, null, null, 14), new TextLocalisedClause(R$string.trading_bonds_ratings_widget_info_dialog_description_fitch, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), null, null, 55);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f1404r;
    }
}
