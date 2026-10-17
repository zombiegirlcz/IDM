package hcf;

import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.db;
import com.revolut.core.ui_kit.delegates.wa;
import com.revolut.core.ui_kit.delegates.ya;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trading_add_ons.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lbf.p;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static List a(a aVar, p addOn) {
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        List listC = u.c(new PlanTileDelegate.Model("PLAN_HEADER_TILE_ID", new db(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_title_trading_pro, null, null, 14)), new ya(new TextLocalisedClause(addOn.a() ? R$string.price_plan_add_ons_add_on_status_active : R$string.price_plan_add_ons_add_on_status_not_active, null, null, 14), !addOn.a() ? wa.INACTIVE : wa.ACTIVE), bVar.c(addOn), null, new CdnImage("trading_pro_banner", "mobile/pricing_plan_add_ons/trading_pro", null, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, Constants.TAG_F4), 1704));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
