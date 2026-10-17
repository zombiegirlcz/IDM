package n0f;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.topup_screen.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        wi0.b bVar = domainState.f211022a;
        CountryImage countryImage = bVar != null ? new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14) : null;
        String str = domainState.f211023b;
        if (str == null) {
            str = "";
        }
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LIST_ID_COUNTRY_DROPDOWN", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.topup_mcy_select_visit_country_placeholder, null, null, 14), false, null, false, null, null, countryImage, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1036, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        eVarB.add(new TextDelegate.Model(R$attr.uikit_dp32, 0, 956, new TextLocalisedClause(R$string.topup_mcy_select_visit_country_country_dropdown_footer, null, null, 14), "LIST_ID_COUNTRY_DROPDOWN_FOOTER"));
        return new l(u.a(eVarB), domainState.f211022a != null);
    }
}
