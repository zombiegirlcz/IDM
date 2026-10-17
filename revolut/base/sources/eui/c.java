package eui;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import cui.q;
import gs2.t;
import gui.k;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f129615a;

    public c(n8b.a countryInteractor, k revPointsMenuItemMapper) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(revPointsMenuItemMapper, "revPointsMenuItemMapper");
        this.f129615a = countryInteractor;
    }

    public final q a(Data revPointsAccount, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        return new q((NavBarMenuItem) iii.c.f(revPointsAccount, new t(17), new gug.c(2), new fq7.k(28)), bVar != null ? new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14) : null, bVar != null ? new TextLocalisedClause(R$string.asft_checkout_header_subtitle, u.c(((o8b.c) this.f129615a).b(bVar.f297794a)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8) : null);
    }
}
