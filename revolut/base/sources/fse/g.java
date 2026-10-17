package fse;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        n6 n6Var;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = f0.f322471a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.ds_verification_success_return_to_merchant_title_v2, u.c(domainState.f137666a.k), null, 12), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_cart, null, null, 6)), null, false, 26);
        if (domainState.f137667b) {
            List listK = v.k(new TextClause(domainState.f137666a.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_link_external, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28));
            m70.a.t(t0.f186434a);
            n6Var = new n6(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020);
        } else {
            n6Var = new n6(new TextLocalisedClause(R$string.ds_verification_success_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020);
        }
        return new cii.b(new aw0.e(false, null, null, n6Var, null, null, 55), f0Var, aVar);
    }
}
