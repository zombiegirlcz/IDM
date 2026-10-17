package com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.unlimited_profiles;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUnlimitedCountryProfile;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData;
import jii.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import rxi.a;
import rxi.b;
import rxi.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/modals/unlimited_profiles/AirportLoungesUnlimitedProfileSwitchScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lrxi/a;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesUnlimitedProfileSwitchScreen extends SimpleViewController<a> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AirportLoungesUnlimitedProfileSwitchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData N;
    public final int O;
    public final h P;
    public final c Q;
    public final c R;

    public AirportLoungesUnlimitedProfileSwitchScreen(AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData unlimitedProfileSwitchData) {
        Intrinsics.checkNotNullParameter(unlimitedProfileSwitchData, "unlimitedProfileSwitchData");
        this.N = unlimitedProfileSwitchData;
        this.O = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.P = s.t(this, b.f);
        c cVar = new c();
        this.Q = cVar;
        this.R = cVar;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData airportLoungesHomeScreenContract$UnlimitedProfileSwitchData = this.N;
        AirportLoungesUnlimitedCountryProfile airportLoungesUnlimitedCountryProfile = airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99086c;
        String str = airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99084a;
        String str2 = airportLoungesHomeScreenContract$UnlimitedProfileSwitchData.f99085b;
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.airport_lounges_home_switch_profile_banner_title, null, null, 14), airportLoungesUnlimitedCountryProfile != null ? new TextLocalisedClause(R$string.airport_lounges_home_switch_profile_banner_subtitle, v.k(str2, str, airportLoungesUnlimitedCountryProfile.f98929a, airportLoungesUnlimitedCountryProfile.f98930b), null, 12) : new TextLocalisedClause(R$string.airport_lounges_home_switch_profile_banner_subtitle_multiple, v.k(str2, str, str2), null, 12), null, null, false, 28));
        d3().f174545b.setText(new TextLocalisedClause(R$string.airport_lounges_home_switch_profile_banner_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(d3().f174545b.o), new rlh.c(this, null, 23), 3);
    }

    public final o d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }
}
