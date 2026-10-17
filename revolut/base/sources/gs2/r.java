package gs2;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends jki.g implements o {
    public final nhf.a A;
    public final i B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlockedPaymentsListScreenContract$Input f146293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ur2.c f146294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g9e.a f146295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ffk.t f146296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f146297t;
    public final a u;
    public final com.revolut.domain.interactors.transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nr2.a f146298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jla.h f146299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f146300y;
    public final v67.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, BlockedPaymentsListScreenContract$Input input, ur2.c blockedMerchantsInteractor, g9e.a subscriptionListPresentationModel, ffk.t pricingPlanInteractor, j60.a bottomExpandableDialogControllerExtension, a limitsBottomDialogProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, nr2.a blockedMerchantTransactionFilterProvider, jla.h productCatalogueInteractor, gte.a featureToggleInteractor, v67.b giroFeatureChecker, nhf.a unitedWalletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionListPresentationModel, "subscriptionListPresentationModel");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(limitsBottomDialogProvider, "limitsBottomDialogProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(blockedMerchantTransactionFilterProvider, "blockedMerchantTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(giroFeatureChecker, "giroFeatureChecker");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f146293p = input;
        this.f146294q = blockedMerchantsInteractor;
        this.f146295r = subscriptionListPresentationModel;
        this.f146296s = pricingPlanInteractor;
        this.f146297t = bottomExpandableDialogControllerExtension;
        this.u = limitsBottomDialogProvider;
        this.v = transactionsInteractor;
        this.f146298w = blockedMerchantTransactionFilterProvider;
        this.f146299x = productCatalogueInteractor;
        this.f146300y = featureToggleInteractor;
        this.z = giroFeatureChecker;
        this.A = unitedWalletInteractor;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        Data data6 = new Data(null, null, true, 3, null);
        k71.q.Companion.getClass();
        this.B = new i(data2, data, data3, data4, data5, data6, false, k71.p.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs2.r.I1():void");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }

    public final efm.r y2(b9e.b bVar) {
        qua.z xVar;
        ContentUser contentUser = this.f146293p.f64257a;
        if (Intrinsics.f(contentUser, ContentUser.Self.f64237b)) {
            xVar = qua.y.f249342a;
        } else {
            if (!(contentUser instanceof ContentUser.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            String id10 = ((ContentUser.Junior) contentUser).d;
            Intrinsics.checkNotNullParameter(id10, "id");
            xVar = new qua.x(id10);
        }
        return g9e.a.c(this.f146295r, bVar, null, xVar, 53);
    }

    public final void z2(Object obj2) {
        if (!(obj2 instanceof ContentUser.Junior)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj2, "Expected junior parcel, but got "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.blocked_payments_blocked_categories_sheet_title, null, null, 14), new TextLocalisedClause(R$string.blocked_payments_blocked_categories_sheet_subtitle, zhm.u.c(((ContentUser.Junior) obj2).f64236c), null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.blocked_payments_merchants_limits_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        yji.l.j2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
