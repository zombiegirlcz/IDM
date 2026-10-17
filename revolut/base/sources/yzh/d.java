package yzh;

import android.os.Parcelable;
import aw0.ka;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import eli.j;
import ibd.e;
import ix0.d0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import qua.p;
import rea.m;
import wsg.n;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f318110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xua.a f318111n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f318112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rzh.b f318113q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m pocketDetailsInteractor, xua.a recurringPaymentInteractor, j twoFaErrorHandler, n walletInteractor, rzh.b orderFlowStatusDialogConfigurationProvider) {
        super(orderFlowStatusDialogConfigurationProvider);
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f318110m = pocketDetailsInteractor;
        this.f318111n = recurringPaymentInteractor;
        this.o = twoFaErrorHandler;
        this.f318112p = walletInteractor;
        this.f318113q = orderFlowStatusDialogConfigurationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ed, code lost:
    
        if (r2 != r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // nzh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r71, gim.c r72) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yzh.d.b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    @Override // nzh.c
    public final j0 c3(Object obj2, CryptoOrderDraft draft) {
        Object timeClause;
        Date date;
        p recurringPayment = (p) obj2;
        Intrinsics.checkNotNullParameter(recurringPayment, "result");
        Intrinsics.checkNotNullParameter(draft, "draft");
        xi0.b pocketCurrency = draft.f96690b.f96683a;
        this.f318113q.getClass();
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        e eVar = recurringPayment.f249314a;
        boolean zM = edl.a.m(eVar.e);
        int i = R$string.cryptobuysell_recurring_buy_order_success_title;
        Long l2 = recurringPayment.f249323j;
        long time = 0;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        String str = recurringPayment.i;
        aVar.getClass();
        MoneyClause moneyClause = new MoneyClause(new dj0.d(jLongValue, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
        CurrencyClause currencyClauseA = d0.a(pocketCurrency, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254));
        hua.a aVar2 = hua.c.Companion;
        Period period = eVar.f160151b;
        aVar2.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause((jli.e.b(period) ? hua.c.DAILY : jli.e.f(period) ? hua.c.WEEKLY : hua.c.MONTHLY).b(), null, null, 14);
        if (zM) {
            timeClause = new TextLocalisedClause(R$string.cryptobuysell_recurring_buy_order_frequency_today, null, null, 14);
        } else {
            LocalDate localDate = eVar.e;
            if (localDate != null && (date = localDate.toDate()) != null) {
                time = date.getTime();
            }
            timeClause = new TimeClause(time, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        }
        return new j0((Clause) new TextLocalisedClause(i, v.k(moneyClause, currencyClauseA, textLocalisedClause, timeClause), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }
}
