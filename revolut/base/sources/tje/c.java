package tje;

import ahe.h0;
import android.os.Parcelable;
import bn2.p;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import xv5.g;
import y4d.i;
import y4d.j;
import y4d.l;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f271634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lje.b f271635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f271636c;
    public final g d;

    public c(p backgroundsInteractor, lje.b cryptoCurrencyDisplayInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, g cryptoCommodityStorageInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCurrencyDisplayInteractor, "cryptoCurrencyDisplayInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityStorageInteractor, "cryptoCommodityStorageInteractor");
        this.f271634a = backgroundsInteractor;
        this.f271635b = cryptoCurrencyDisplayInteractor;
        this.f271636c = cryptoCommodityBaseCurrencyInteractor;
        this.d = cryptoCommodityStorageInteractor;
    }

    @Override // y4d.l
    public final Object a(xi0.b bVar, xb4.g gVar) {
        Object objA = nim.a.a(this.d.a(bVar), gVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // y4d.l
    public final j b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_controller_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_controller_disclaimer_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_controller_disclaimer_description, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new j(textLocalisedClause, new i(textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)), new i(new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_hint_title, null, null, 14), new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_hint_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    @Override // y4d.l
    public final Flow c() {
        return ta6.a.h(this.f271634a.g(RetailBackgroundKey.CryptoHome.f63825b), e.b(xv5.c.b(this.f271636c)), this.f271635b.a(), new h0(4, 7, null));
    }
}
