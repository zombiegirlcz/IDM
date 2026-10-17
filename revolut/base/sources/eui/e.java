package eui;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public static CellDetailsDelegate.Model a(dj0.d dVar, dj0.d dVar2) {
        return new CellDetailsDelegate.Model("list_id_original_price", new t0((Clause) new TextLocalisedClause(R$string.asft_checkout_price_title, null, null, 14), (Image) null, 0, false, 30), ivi.b.a(dVar), dVar2 != null ? new TextLocalisedClause(R$string.asft_checkout_price_each, u.c(ivi.b.a(dVar2)), null, 12) : null, null, null, null, 0, null, false, false, null, null, 32752);
    }
}
