package y4c;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.revolut_x_balances.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt5.f f310872a;

    public k(vr5.c revolutXFiatBalancesDetailsMapper, pt5.f activityWidgetMapper) {
        Intrinsics.checkNotNullParameter(revolutXFiatBalancesDetailsMapper, "revolutXFiatBalancesDetailsMapper");
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
        this.f310872a = activityWidgetMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f310862b;
        xi0.b bVar = domainState.f310861a;
        ArrayList arrayListE0 = d0.E0(pt5.f.a(this.f310872a, domainState.f310863c), (List) iii.c.f(data, new y4b.b(1), new y13.a(15), new x0b.h(this, 24)));
        l71.d dVar = (l71.d) domainState.e.getContent();
        List listC = (dVar != null ? dVar.a() : null) == UserCompanyRegion.GB ? u.c(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.crypto_revx_fiat_pocket_details_footer_uk, null, null, 14), "REVOLUT_X_FIAT_UK_BANKING_DISCLAIMER")) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        return new g(d0.E0(listC, arrayListE0), new e(new CurrencyClause(bVar, null, null, 6), new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), domainState.d));
    }
}
