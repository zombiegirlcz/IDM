package fhj;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.esim.impl.R$string;
import ec8.q;
import fg8.i0;
import ip0.y7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f135256a;

    public j(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f135256a = featureToggleInteractor;
    }

    public final qv0.i a(EsimUserPocket esimUserPocket, Data data) {
        if (((jte.d) this.f135256a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c)) {
            EsimCheckoutPrice esimCheckoutPrice = (EsimCheckoutPrice) data.getContent();
            if (!pd.b.j(esimCheckoutPrice != null ? Boolean.valueOf(Intrinsics.f(esimCheckoutPrice.f100197b.f115083b, esimCheckoutPrice.f100198c.f115083b)) : null)) {
                return (qv0.i) iii.c.f(data, new fg8.g(this, 7), new i0(8), new q(this, esimUserPocket, 25));
            }
        }
        return null;
    }

    public final y7 b(dj0.d dVar, boolean z) {
        TextLocalisedClause textLocalisedClause;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_checkout_total_title, null, null, 14);
        } else {
            textLocalisedClause = ((jte.d) this.f135256a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c) ? new TextLocalisedClause(R$string.esim_checkout_summary_total, null, null, 14) : new TextLocalisedClause(R$string.esim_checkout_summary_pay_now, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        int i = R$attr.uikit_dp8;
        return new y7("ID_TOTAL_DUE_ITEM", moneyClause, textLocalisedClause2, null, 0, null, i, i, 1656);
    }

    public final List c(List list) {
        if (!((jte.d) this.f135256a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c)) {
            yp0.b.k(list, R$attr.uikit_dp16, 0, 0, 0, 30);
            return list;
        }
        if (list.size() > 1) {
            return yp0.b.g(list, new ListSubheaderDelegate.Model("paymentSummarySubheaderItemId", (Image) null, (Clause) new TextLocalisedClause(R$string.esim_checkout_payment_summary_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp16, 0, 122);
        }
        yp0.b.k(list, R$attr.uikit_dp16, 0, 0, 0, 30);
        return list;
    }
}
