package ikh;

import a83.o0;
import android.os.Parcelable;
import bn2.p;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t38.e;
import x8h.k;
import xb4.g;
import xi0.b;
import y4d.i;
import y4d.j;
import y4d.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f161971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f161972b;

    public a(p backgroundsInteractor, k displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.f161971a = backgroundsInteractor;
        this.f161972b = displayCurrencyInteractor;
    }

    @Override // y4d.l
    public final Object a(b bVar, g gVar) throws Throwable {
        Object objD = this.f161972b.d(bVar, gVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    @Override // y4d.l
    public final j b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_currency_changer_fullscreen_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_currency_changer_fullscreen_disclaimer_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_currency_changer_fullscreen_disclaimer_description, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new j(textLocalisedClause, new i(textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)), new i(new TextLocalisedClause(R$string.wealth_invest_currency_changer_tooltip_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_currency_changer_tooltip_description, null, null, 14), new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    @Override // y4d.l
    public final Flow c() {
        return new e(this.f161971a.g(RetailBackgroundKey.InvestHome.f63830b), 24, this.f161972b.c(), new o0(3, 8, null));
    }
}
