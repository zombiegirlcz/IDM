package xl7;

import aw0.k1;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.qn;
import java.time.LocalDate;
import java.util.List;
import kl7.k0;
import kl7.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final ReferralContactDelegate.Model a(r rVar, int i) {
        TextClause textClause;
        int i2;
        LayeredImage layeredImageB;
        Float fValueOf = Float.valueOf(28.0f);
        String strQ = j6.a.q("SMART_DRIVING_SCORE_DATA_POINT_ITEM_", rVar.name());
        int[] iArr = k.f306950a;
        switch (iArr[rVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                textClause = new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                break;
            case 7:
                textClause = new TextClause(a0.d.v(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2, "%d:%02d", "format(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (q.f306954a[rVar.ordinal()]) {
            case 1:
                i2 = R$string.car_insurance_smart_driving_driving_score_speed;
                break;
            case 2:
                i2 = R$string.car_insurance_smart_driving_driving_score_braking;
                break;
            case 3:
                i2 = R$string.car_insurance_smart_driving_driving_score_acceleration;
                break;
            case 4:
                i2 = R$string.car_insurance_smart_driving_driving_score_corners;
                break;
            case 5:
                i2 = R$string.car_insurance_smart_driving_driving_score_environment;
                break;
            case 6:
                i2 = R$string.car_insurance_smart_driving_driving_score_trips;
                break;
            case 7:
                i2 = R$string.car_insurance_smart_driving_driving_score_duration;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ProgressStyle progressStyleC = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        switch (iArr[rVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int iB = b(rVar);
                int i3 = R$attr.uikit_colorAccent;
                layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, iB, Integer.valueOf(i3), R$attr.uikit_colorAccent_10, 10.0f, fValueOf, null, 32);
                break;
            case 6:
            case 7:
                int iB2 = b(rVar);
                int i5 = R$attr.uikit_colorIndigo;
                layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, iB2, Integer.valueOf(i5), R$attr.uikit_colorIndigo_10, 10.0f, fValueOf, null, 32);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[rVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                progressStyleC = ProgressStyle.Companion.c(ProgressStyle.INSTANCE, i, R$attr.uikit_colorAccent);
                break;
            case 6:
            case 7:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ReferralContactDelegate.Model model = new ReferralContactDelegate.Model(strQ, layeredImageB, textClause, textLocalisedClause, null, null, null, null, progressStyleC, null, null, 507888);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static final int b(r rVar) {
        switch (k.f306950a[rVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_limit;
            case 2:
                return R$drawable.uikit_icn_24_minus_circle;
            case 3:
                return R$drawable.uikit_icn_24_turbo_transfer;
            case 4:
                return R$drawable.uikit_icn_24_arrow_navigation;
            case 5:
                return R$drawable.uikit_icn_24_globe;
            case 6:
                return R$drawable.uikit_icn_24_location_pin;
            case 7:
                return R$drawable.uikit_icn_24_time;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final qn c() {
        Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
        return new qn(new k1(new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.car_insurance_smart_driving_score_history_description, null, null, 14), null, 28), new TextLocalisedClause(R$string.car_insurance_smart_driving_score_history_error_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public static final TextClause d(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        l0 l0Var = k0Var.f185348c;
        Integer numValueOf = l0Var != null ? Integer.valueOf(l0Var.f185353a) : null;
        if (numValueOf != null) {
            return new TextClause(String.valueOf(numValueOf.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
        return new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final CompositeClause e(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        LocalDate localDate = k0Var.f185346a;
        ka kaVar = ka.SHORT;
        List listK = v.k(n.e(localDate, new TimeClause.Format.DayAndMonth(kaVar)), n.e(k0Var.f185347b, new TimeClause.Format.DayAndMonth(kaVar)));
        Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
        return new CompositeClause(listK, new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
