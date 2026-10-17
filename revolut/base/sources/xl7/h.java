package xl7;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import java.util.List;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final TextLocalisedClause a(long j2, long j3) {
        int i = R$string.car_insurance_common_estimated_value_from_x_to_y;
        long j5 = 100;
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306272g;
        return new TextLocalisedClause(i, v.k(n.g(new dj0.d(j2 * j5, bVar), null, null, 3), n.g(new dj0.d(j3 * j5, bVar), null, null, 3)), null, 12);
    }

    public static final CompositeClause b(InsurableCar insurableCar, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(insurableCar, "<this>");
        TextClause textClause = new TextClause(String.valueOf(insurableCar.e), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        s0 s0Var = insurableCar.f;
        Object[] elements = {textClause, s0Var != null ? new TextLocalisedClause(f(s0Var), null, null, 14) : null, (!z || (str = insurableCar.f75227b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
    }

    public static final TextClause c(InsurableCar insurableCar) {
        Intrinsics.checkNotNullParameter(insurableCar, "<this>");
        return new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(insurableCar.f75228c, " ", insurableCar.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final CompositeClause d(CarVariation carVariation) {
        int i;
        Intrinsics.checkNotNullParameter(carVariation, "<this>");
        String str = carVariation.f75194c;
        TextLocalisedClause textLocalisedClause = null;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Integer num = carVariation.f;
        TextLocalisedClause textLocalisedClause2 = num != null ? new TextLocalisedClause(R$string.car_insurance_common_engine_capacity_cubic_centimetres, u.c(Integer.valueOf(num.intValue())), null, 12) : null;
        Integer num2 = carVariation.e;
        TextLocalisedClause textLocalisedClause3 = num2 != null ? new TextLocalisedClause(R$string.car_insurance_common_doors, u.c(Integer.valueOf(num2.intValue())), null, 12) : null;
        kl7.c cVar = carVariation.d;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            int i2 = g.f306948c[cVar.ordinal()];
            if (i2 == 1) {
                i = R$string.car_insurance_common_car_body_type_cabriolet;
            } else if (i2 == 2) {
                i = R$string.car_insurance_common_car_body_type_coupe;
            } else if (i2 == 3) {
                i = R$string.car_insurance_common_car_body_type_estate;
            } else if (i2 == 4) {
                i = R$string.car_insurance_common_car_body_type_hatchback;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.car_insurance_common_car_body_type_saloon;
            }
            textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        }
        Object[] elements = {textClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static final TextLocalisedClause e(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        switch (g.d[o0Var.ordinal()]) {
            case 1:
                return a(0L, 1000L);
            case 2:
                return a(1000L, 5000L);
            case 3:
                return a(5000L, 25000L);
            case 4:
                return a(25000L, 50000L);
            case 5:
                return a(50000L, 75000L);
            case 6:
                return a(75000L, 100000L);
            case 7:
                int i = R$string.car_insurance_common_estimated_value_over_x;
                xi0.b.Companion.getClass();
                return new TextLocalisedClause(i, u.c(n.g(new dj0.d(10000000L, xi0.b.f306272g), null, null, 3)), null, 12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int f(s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        switch (g.f306946a[s0Var.ordinal()]) {
            case 1:
                return R$string.car_insurance_common_fuel_type_diesel;
            case 2:
                return R$string.car_insurance_common_fuel_type_electric;
            case 3:
                return R$string.car_insurance_common_fuel_type_hydrogen;
            case 4:
                return R$string.car_insurance_common_fuel_type_lpg;
            case 5:
                return R$string.car_insurance_common_fuel_type_petrol;
            case 6:
                return R$string.car_insurance_common_fuel_type_hybrid;
            case 7:
                return R$string.car_insurance_common_fuel_type_ethanol_petrol;
            case 8:
                return R$string.car_insurance_common_fuel_type_petrol_electric;
            case 9:
                return R$string.car_insurance_common_fuel_type_petrol_gas;
            case 10:
                return R$string.car_insurance_common_fuel_type_diesel_electric;
            case 11:
                return R$string.car_insurance_common_fuel_type_diesel_plug_in_electric;
            case 12:
                return R$string.car_insurance_common_fuel_type_petrol_plugin_electric;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int g(m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        int i = g.f306947b[m2Var.ordinal()];
        if (i == 1) {
            return R$string.car_insurance_common_transmission_type_automatic;
        }
        if (i == 2) {
            return R$string.car_insurance_common_transmission_type_manual;
        }
        throw new NoWhenBranchMatchedException();
    }
}
