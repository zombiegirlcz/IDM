package y54;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        ResourceImage resourceImage;
        ResourceImage resourceImage2;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wi0.b bVar = domainState.f310982a;
        BirthCity birthCity = domainState.f310983b;
        TextClause textClause = new TextClause(birthCity.b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = birthCity.f66302b;
        if (d0.W(str)) {
            wi0.b.Companion.getClass();
            textLocalisedClause = Intrinsics.f(bVar, wi0.b.f297760n0) ? new TextLocalisedClause(R$string.birth_place_city_search_hint, null, null, 14) : new TextLocalisedClause(R$string.birth_place_provide_city_placeholder, null, null, 14);
        } else {
            textLocalisedClause = null;
        }
        wi0.b.Companion.getClass();
        wi0.b bVar2 = wi0.b.f297760n0;
        if (Intrinsics.f(bVar, bVar2)) {
            if (str.length() == 0) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
                resourceImage2 = resourceImage;
            } else {
                resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            }
        } else if (str.length() == 0) {
            resourceImage2 = null;
        } else {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross_circled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            resourceImage2 = resourceImage;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INPUT_CITY", textClause, null, textLocalisedClause, false, null, false, null, null, null, null, null, resourceImage2, false, null, null, false, false, false, false, null, 0, null, null, !Intrinsics.f(bVar, bVar2), !Intrinsics.f(bVar, bVar2), null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, 2046812148, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new k(Intrinsics.f(bVar, bVar2) ? new TextLocalisedClause(R$string.birth_place_city_title, null, null, 14) : new TextLocalisedClause(R$string.birth_place_provide_city_title, null, null, 14), u.c(model), !d0.W(str));
    }
}
