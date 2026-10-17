package jc6;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.donations.impl.R$string;
import ieg.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc6.b f172737a;

    public t(lc6.b editItemMapper) {
        Intrinsics.checkNotNullParameter(editItemMapper, "editItemMapper");
        this.f172737a = editItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        String str;
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f172715c, new j7b.l(23), new j7b.m(12), new z(this, domainState, 23));
        ba6.l lVar = (ba6.l) domainState.f172714b.getContent();
        boolean z = false;
        UrlImage urlImage = (lVar == null || (str = lVar.f) == null) ? null : new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_common_action_confirm, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        dj0.d currencyPocketBalance = domainState.e;
        nqi.c donateMoneyInputState = domainState.d;
        ((lc6.c) this.f172737a).getClass();
        Intrinsics.checkNotNullParameter(currencyPocketBalance, "currencyPocketBalance");
        Intrinsics.checkNotNullParameter(donateMoneyInputState, "donateMoneyInputState");
        if (donateMoneyInputState.f218471a.f115082a <= currencyPocketBalance.f115082a && donateMoneyInputState.f218472b.length() > 0 && !donateMoneyInputState.f218471a.k()) {
            z = true;
        }
        return new m(list, urlImage, new aw0.e(false, null, null, new n6(textLocalisedClause, defaultFilledButton, null, null, z, null, null, 988), null, null, 55));
    }
}
