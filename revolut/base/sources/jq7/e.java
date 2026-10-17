package jq7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import xl7.n;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {
    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new PlainTextDelegate.Model("GUIDE_DESCRIPTION", (Clause) null, (Clause) new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), new ListCellDelegate.Model("GUIDE_GENERATE_INTERVAL", new j8(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 16, null, 95), (Clause) null, 190)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_generate_interval, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4088), new ListCellDelegate.Model("GUIDE_MIN_DISTANCE_GENERATE", new j8(new ResourceImage(R$drawable.uikit_icn_24_driving_licence, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 16, null, 95), (Clause) null, 190)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_min_distance_generate, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4088));
        yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new c(d0.E0(yp0.b.g(v.k(new RowDelegate.Model("GUIDE_SPEED", n.i(R$drawable.uikit_icn_24_limit, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_speed, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_speed_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("GUIDE_BREAKING", n.i(R$drawable.uikit_icn_24_minus_circle, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_braking, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_braking_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("GUIDE_ACCELERATING", n.i(R$drawable.uikit_icn_24_turbo_transfer, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_acceleration, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_acceleration_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("GUIDE_CORNERING", n.i(R$drawable.uikit_icn_24_arrow_navigation, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_corners, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_corners_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("GUIDE_ENVIRONMENT", n.i(R$drawable.uikit_icn_24_globe, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_environment, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_environment_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("GUIDE_FACTORS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_smart_driving_guide_five_factors, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), listK));
    }
}
