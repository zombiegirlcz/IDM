package cfg;

import aw0.d0;
import aw0.o9;
import cfi.h;
import cfi.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.yi;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import ip0.eo0;
import ip0.go0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f23689a;

    public b(p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f23689a = featureInteractor;
    }

    public final VoucherSmallTileDelegate.Model a(cfi.a experience, boolean z, d0 d0Var) {
        yi yiVar;
        i iVar;
        h hVar;
        Intrinsics.checkNotNullParameter(experience, "experience");
        if (!z || (hVar = (iVar = experience.e).d) == null) {
            yiVar = null;
        } else {
            dj0.d dVarH = pyd.c.H(iVar.f23713b, hVar.f23710b);
            MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
            o9 o9Var = o9.NON_SENSITIVE;
            yiVar = new yi(nub.a.l(hVar.f23709a, o9Var, nub.d.f219277a, null, BitmapDescriptorFactory.HUE_RED, 58), new MoneyClause(dVarH, defaults, null, o9Var, 4));
        }
        MoneyClause moneyClause = yiVar == null ? new MoneyClause(experience.e.f23713b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : null;
        String strQ = j6.a.q("SUGGESTED_EXPERIENCES_VOUCHER_ITEM_ID_", experience.f23692a);
        TextClause textClause = new TextClause(experience.f23694c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        eo0 eo0Var = d0Var != null ? new eo0(d0Var) : null;
        String str = (String) zhm.d0.d0(experience.d);
        Image urlImage = str != null ? new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282) : new CdnImage("balloons", "mobile/stays/top_destinations/baloons", null, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 475), null, null, Constants.TAG_F4);
        this.f23689a.getClass();
        return new VoucherSmallTileDelegate.Model(strQ, new zi(urlImage, go0.PROGRESSIVE_BLUR), textClause, null, null, moneyClause, null, yiVar, null, null, null, false, eo0Var, null, experience, 245464);
    }
}
