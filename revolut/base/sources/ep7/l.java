package ep7;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.ak0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kl7.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        int i;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List list = domainState.f128095c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            tf tfVar = null;
            if (!it8.hasNext()) {
                a0.x(arrayList, eVarB);
                eVarB.add(new TextDelegate.Model("FOOTER_ID", new TextLocalisedClause(R$string.car_insurance_eligibility_questions_footer_text, u.c(new TextLocalisedClause(R$string.car_insurance_eligibility_questions_footer_action, null, new Click(30, (Integer) null, (Object) null, "FOOTER_ACTION_ITEM", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                return new i(u.a(eVarB), domainState.f128094b ? new TextLocalisedClause(R$string.car_insurance_eligibility_questions_action_button_title, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
            }
            n0 n0Var = (n0) it8.next();
            if (domainState.f128093a) {
                switch (n.f128105a[n0Var.ordinal()]) {
                    case 1:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_disqualifications;
                        break;
                    case 2:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_convictions;
                        break;
                    case 3:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_refused_car_insurance;
                        break;
                    case 4:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_increased_excess;
                        break;
                    case 5:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_driver_disability;
                        break;
                    case 6:
                        i = R$string.car_insurance_eligibility_questions_multiple_drivers_residence_in_ireland;
                        break;
                    case 7:
                        i = R$string.car_insurance_eligibility_questions_common_current_insurance_expired;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                switch (n.f128105a[n0Var.ordinal()]) {
                    case 1:
                        i = R$string.car_insurance_eligibility_questions_single_driver_disqualifications;
                        break;
                    case 2:
                        i = R$string.car_insurance_eligibility_questions_single_driver_convictions;
                        break;
                    case 3:
                        i = R$string.car_insurance_eligibility_questions_single_driver_refused_car_insurance;
                        break;
                    case 4:
                        i = R$string.car_insurance_eligibility_questions_single_driver_increased_excess;
                        break;
                    case 5:
                        i = R$string.car_insurance_eligibility_questions_single_driver_driver_disability;
                        break;
                    case 6:
                        i = R$string.car_insurance_eligibility_questions_single_driver_residence_in_ireland;
                        break;
                    case 7:
                        i = R$string.car_insurance_eligibility_questions_common_current_insurance_expired;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            Boolean bool = (Boolean) domainState.d.get(n0Var);
            if (m.f128104a[n0Var.ordinal()] == 1) {
                tfVar = new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
            }
            List listB = xl7.f.b(textLocalisedClause, null, n0Var, bool, tfVar, 2);
            yp0.b.k(listB, 0, 0, 0, 0, 31);
            a0.x(listB, arrayList);
        }
    }
}
