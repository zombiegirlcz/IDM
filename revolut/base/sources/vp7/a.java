package vp7;

import android.os.Parcelable;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import java.time.LocalDate;
import java.util.List;
import kl7.n1;
import kl7.p1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final aim.e a(b bVar, TextLocalisedClause textLocalisedClause, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        aim.e eVarB = u.b();
        if (textLocalisedClause != null) {
            eVarB.add(new ListSubheaderDelegate.Model(a0.d.h(i, "CLAIM_SUBHEADER_ITEM"), (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, z ? R$attr.uikit_dp12 : R$attr.uikit_dp24, z ? R$attr.uikit_dp12 : R$attr.uikit_dp4, 0, 0, 53242));
        }
        String strH = a0.d.h(i, "CLAIM_DATE_ITEM");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_question_claim_details_claim_date, null, null, 14);
        LocalDate localDate = bVar.f291113a;
        InputTextDelegate.Model model = new InputTextDelegate.Model(strH, localDate != null ? xl7.n.e(localDate, new TimeClause.Format.MonthAndYear((ka) null, 3)) : null, textLocalisedClause2, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, new n1(i, p1.CLAIM_DATE), null, null, 0, 0, 0, 0, -33554440, 65023);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.add(model);
        String str = i + "CLAIM_TYPE_ITEM";
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_question_claim_details_claim_type, null, null, 14);
        Answer.ClaimType claimType = bVar.f291114b;
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model(str, claimType != null ? xl7.d.e(claimType) : null, textLocalisedClause3, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, new n1(i, p1.CLAIM_TYPE), null, null, 0, 0, 0, 0, -8, 65023));
        yp0.b.r(modelA, 0, 0, 0, 0, 15);
        eVarB.add(modelA);
        List listB = xl7.f.b(new TextLocalisedClause(R$string.car_insurance_question_claim_details_fully_settled_subheader_singular, null, null, 14), null, new n1(i, p1.CLAIM_NOT_SETTLED), bVar.f291115c != null ? Boolean.valueOf(!r0.booleanValue()) : null, null, 18);
        yp0.b.k(listB, 0, 0, 0, 0, 31);
        a0.x(listB, eVarB);
        int i2 = R$string.car_insurance_question_claim_details_exceed_amount_subheader_singular;
        Survey.INSTANCE.getClass();
        List listB2 = xl7.f.b(new TextLocalisedClause(i2, u.c(xl7.n.g(Survey.f75313g, null, null, 3)), null, 12), null, new n1(i, p1.CLAIM_EXCEEDS_AMOUNT), bVar.d, null, 18);
        yp0.b.k(listB2, 0, 0, 0, 0, 31);
        a0.x(listB2, eVarB);
        aim.e eVarA = u.a(eVarB);
        if (z) {
            yp0.b.k(eVarA, R$attr.uikit_dp0, R$attr.uikit_dp12, 0, 0, 28);
        }
        return eVarA;
    }
}
