package ao7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.time.ZonedDateTime;
import java.util.List;
import kl7.a1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        int i;
        int i2;
        InputTextDelegate.Model model;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a1 a1Var = domainState.f7906a;
        ZonedDateTime zonedDateTime = domainState.d;
        ZonedDateTime zonedDateTime2 = domainState.f7908c;
        boolean z = domainState.f7907b;
        int[] iArr = p.f7924a;
        switch (iArr[a1Var.ordinal()]) {
            case 1:
                i = !z ? R$string.car_insurance_mta_date_title_add_permanent_driver : R$string.car_insurance_mta_date_title_add_temporary_driver;
                break;
            case 2:
                i = R$string.car_insurance_mta_date_title_replace_car;
                break;
            case 3:
            case 4:
                i = R$string.car_insurance_mta_date_title_add_temporary_car;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException(("unexpected mtaType: " + a1Var).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        if (z) {
            switch (iArr[a1Var.ordinal()]) {
                case 1:
                    i2 = R$string.car_insurance_mta_date_subtitle_temporary_driver;
                    break;
                case 2:
                case 5:
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException(("unexpected mtaType: " + a1Var).toString());
                case 3:
                case 4:
                    i2 = R$string.car_insurance_mta_date_subtitle_temporary_car;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = R$string.car_insurance_mta_date_subtitle_permanent;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        aim.e eVarB = u.b();
        if (zonedDateTime == null) {
            model = new InputTextDelegate.Model("DATE_SELECTOR_ITEM", xl7.n.f(zonedDateTime2, null, false, 7), new TextLocalisedClause(R$string.car_insurance_mta_date_cells_start_date, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.r(model, 0, 0, 0, 0, 15);
        } else {
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("DATE_RANGE_ITEM", xl7.n.a(zonedDateTime2, zonedDateTime, false), new TextLocalisedClause(R$string.car_insurance_mta_date_cells_driving_period, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            model = model2;
        }
        eVarB.add(model);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_mta_date_cells_start_time, null, null, 14);
        TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("START_TIME_ITEM", xl7.n.f(zonedDateTime2, timeDefault, false, 6), textLocalisedClause3, null, false, null, false, new TextLocalisedClause(R$string.car_insurance_mta_date_min_delay_warning, null, null, 14), null, null, null, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558664, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        eVarB.add(model3);
        if (zonedDateTime != null) {
            InputTextDelegate.Model model4 = new InputTextDelegate.Model("END_TIME_ITEM", xl7.n.f(zonedDateTime, timeDefault, false, 6), new TextLocalisedClause(R$string.car_insurance_mta_date_cells_end_time, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.r(model4, 0, 0, 0, 0, 15);
            eVarB.add(model4);
        }
        return new j(u.a(eVarB), textLocalisedClause, textLocalisedClause2);
    }
}
