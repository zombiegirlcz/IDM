package no7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import jki.p;
import kl7.m2;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f217943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mo7.a f217944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f217945r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, CarConfirmationScreenContract$InputData inputData, tl7.f bottomDialog, mo7.a carPopupFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(carPopupFactory, "carPopupFactory");
        this.f217943p = bottomDialog;
        this.f217944q = carPopupFactory;
        this.f217945r = new f(inputData.f75551a, null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f217945r;
    }

    public final void y2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (!Intrinsics.f(id10, "CAR_ITEM_ID")) {
            if (Intrinsics.f(id10, "ESTIMATED_VALUE_ITEM_ID")) {
                Y1(new EstimatedCarValuePickerScreen(new EstimatedCarValuePickerScreenContract$InputData(null)), ModalDestination.Style.POPUP.f98311a, new z(this, 18));
                return;
            }
            return;
        }
        InsurableCar car = ((f) t2()).f217934a;
        this.f217944q.getClass();
        Intrinsics.checkNotNullParameter(car, "car");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_title, null, null, 14);
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_field_make, null, null, 14);
        String str = car.f75228c;
        m2 m2Var = car.f75229g;
        Integer num = car.f75230h;
        eVarB.add(new yl7.c(textLocalisedClause2, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        eVarB.add(new yl7.c(new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_field_model, null, null, 14), new TextClause(car.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        s0 s0Var = car.f;
        if (s0Var != null) {
            eVarB.add(new yl7.c(new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_field_fuel_type, null, null, 14), new TextLocalisedClause(xl7.h.f(s0Var), null, null, 14)));
        }
        if (num != null) {
            eVarB.add(new yl7.c(new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_field_engine_capacity, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_engine_capacity_cubic_centimetres, u.c(num), null, 12)));
        }
        if (m2Var != null) {
            eVarB.add(new yl7.c(new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_car_details_field_transmission_type, null, null, 14), new TextLocalisedClause(xl7.h.g(m2Var), null, null, 14)));
        }
        this.f217943p.x(yl7.d.a(textLocalisedClause, u.a(eVarB)));
    }
}
