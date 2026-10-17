package ro7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import java.util.ArrayList;
import java.util.List;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.r;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f255930a;

    public p(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f255930a = countryInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v16 */
    /* JADX WARN: Type inference failed for: r42v17, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Integer num;
        String str;
        Integer num2;
        ?? r110;
        o0 o0Var;
        int i;
        String str2;
        ?? textClause;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str3 = domainState.f255913a;
        Integer num3 = domainState.f255918j;
        o0 o0Var2 = domainState.i;
        CarVariation carVariation = domainState.f255917h;
        wi0.b bVar = domainState.f255914b;
        m2 m2Var = domainState.f255916g;
        s0 s0Var = domainState.e;
        String str4 = domainState.d;
        String str5 = domainState.f255915c;
        Integer num4 = domainState.f;
        CellDetailsDelegate.Model model = null;
        if (str3 != null) {
            num = num3;
            str = str5;
            o0Var = o0Var2;
            num2 = num4;
            i = 14;
            r110 = 0;
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("REGISTRATION_NUMBER_ITEM", new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_car_registration, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            yp0.b.l(model2, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, null, false, 60);
            model = model2;
        } else {
            num = num3;
            str = str5;
            num2 = num4;
            r110 = 0;
            o0Var = o0Var2;
            i = 14;
        }
        List listL = v.l(model);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("COUNTRY_ITEM", bVar != null ? new TextClause(((o8b.c) this.f255930a).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_country_of_registration, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model("CAR_MAKE_ITEM", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_make, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_model, r110, r110, i);
        if (str4 != null) {
            str2 = str4;
            textClause = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            str2 = str4;
            textClause = r110;
        }
        List<InputTextDelegate.Model> listK = v.k(modelA, modelA2, r.a(new InputTextDelegate.Model("CAR_MODEL_ITEM", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, str != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), r.a(new InputTextDelegate.Model("FUEL_TYPE_ITEM", s0Var != null ? new TextLocalisedClause(xl7.h.f(s0Var), r110, r110, i) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_fuel_type, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, str2 != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), r.a(new InputTextDelegate.Model("YEAR_MADE_ITEM", num2 != null ? new TextClause(String.valueOf(num2.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_year_made, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, s0Var != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), r.a(new InputTextDelegate.Model("TRANSMISSION_ITEM", m2Var != null ? new TextLocalisedClause(xl7.h.g(m2Var), r110, r110, i) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_transmission, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, num2 != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), r.a(new InputTextDelegate.Model("VARIATION_ITEM", carVariation != null ? xl7.h.d(carVariation) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_style, r110, r110, i), null, null, null, null, false, null, false, m2Var != null, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -17039368, 131071)), r.a(new InputTextDelegate.Model("ESTIMATED_VALUE_ITEM", o0Var != null ? xl7.h.e(o0Var) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_estimated_car_value, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), r.a(new InputTextDelegate.Model("PURCHASE_YEAR_ITEM", num != null ? new TextClause(String.valueOf(num.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r110, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_purchase_year, r110, r110, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, num2 != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262152, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        for (InputTextDelegate.Model model3 : listK) {
            yp0.b.r(model3, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, 12);
            arrayList.add(model3);
        }
        ArrayList arrayListE0 = d0.E0(arrayList, listL);
        boolean z = (bVar == null || str == null || str2 == null || s0Var == null || num2 == null || m2Var == null || carVariation == null || o0Var == null || num == null) ? false : true;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_car_manual_input_subtitle, r110, r110, i);
        String str6 = domainState.f255913a;
        ?? r62 = textLocalisedClause2;
        if (str6 != null) {
            r62 = textLocalisedClause2;
            if (!kotlin.text.d0.W(str6)) {
                r62 = r110;
            }
        }
        return new j(r62, arrayListE0, z);
    }
}
