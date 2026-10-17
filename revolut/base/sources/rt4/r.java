package rt4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rd3.x;
import rnd.d0;
import tx0.x1;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f257170a;
        return new j(new NavBarLargeCentred.Model(new com.revolut.core.ui_kit.views.navbar.l(sx4.f.b(3, null, null, dVar), x1.DEFAULT), sx4.f.b(3, null, null, dVar), new TextLocalisedClause(R$string.credit_card_limit_hub_approved_limit_screen_header_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_card_limit_hub_approved_limit_screen_header_description, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 976), (List) iii.c.f(domainState.f257171b, new rsl.c(14), new d0(26), new x(this, 11)));
    }
}
