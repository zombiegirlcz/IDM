package rsk;

import ael.d0;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date.CallDateWidgetContract$WidgetParcel;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f257113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f257114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qrk.d f257115n;
    public final ssk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f257116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c4h.c f257117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f257118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vki.a f257119s;

    public j(d inputData, d0 stocksInteractor, qrk.d widgetDismissStatusInteractor, ssk.a callDateWidgetDialogProvider, ybl.b instrumentTickerInteractor, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(widgetDismissStatusInteractor, "widgetDismissStatusInteractor");
        Intrinsics.checkNotNullParameter(callDateWidgetDialogProvider, "callDateWidgetDialogProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f257113l = inputData;
        this.f257114m = stocksInteractor;
        this.f257115n = widgetDismissStatusInteractor;
        this.o = callDateWidgetDialogProvider;
        this.f257116p = instrumentTickerInteractor;
        this.f257117q = stockOnboardingInteractor;
        c cVar = new c(null);
        this.f257118r = cVar;
        this.f257119s = pyd.c.a(this, cVar);
    }

    @Override // yji.n
    public final void H2() {
        V2(new rbh.k(this, null, 18), new yi5.b(29));
    }

    @Override // rsk.b
    public final void Z2(CallDateWidgetContract$WidgetParcel widgetParcel) {
        Intrinsics.checkNotNullParameter(widgetParcel, "parcel");
        this.o.getClass();
        Intrinsics.checkNotNullParameter(widgetParcel, "widgetParcel");
        int i = R$string.trading_bonds_callability_dialog_title;
        LocalDate localDate = widgetParcel.f103815b;
        long jP = ebm.a.P(localDate);
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, u.c(new TimeClause(jP, dateMedium, null, null, 12)), null, 12), new TextLocalisedClause(R$string.trading_bonds_callability_dialog_description, v.k(new TimeClause(ebm.a.P(localDate), dateMedium, null, null, 12), new MoneyClause(widgetParcel.f103816c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), null, null, 55);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f257119s;
    }
}
