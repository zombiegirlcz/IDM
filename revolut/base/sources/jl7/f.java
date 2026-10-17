package jl7;

import com.revolut.feature.insurance_car.impl.data.model.CarManualInput;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import hl7.d5;
import hl7.m0;
import java.time.ZonedDateTime;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175621a = r0.k(new Pair("DIESEL", s0.DIESEL), new Pair("ELECTRIC", s0.ELECTRIC), new Pair("HYDROGEN", s0.HYDROGEN), new Pair("LPG", s0.LPG), new Pair("PETROL", s0.PETROL), new Pair("HYBRID", s0.HYBRID), new Pair("ETHANOL_PETROL", s0.ETHANOL_PETROL), new Pair("PETROL_ELECTRIC", s0.PETROL_ELECTRIC), new Pair("PETROL_GAS", s0.PETROL_GAS), new Pair("DIESEL_ELECTRIC", s0.DIESEL_ELECTRIC), new Pair("DIESEL_PLUG_IN_ELECTRIC", s0.DIESEL_PLUG_IN_ELECTRIC), new Pair("PETROL_PLUG_IN_ELECTRIC", s0.PETROL_PLUG_IN_ELECTRIC));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f175622b = r0.k(new Pair("AUTOMATIC", m2.AUTOMATIC), new Pair("MANUAL", m2.MANUAL));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f175623c = r0.k(new Pair("CABRIOLET", kl7.c.CABRIOLET), new Pair("COUPE", kl7.c.COUPE), new Pair("ESTATE", kl7.c.ESTATE), new Pair("HATCHBACK", kl7.c.HATCHBACK), new Pair("SALOON", kl7.c.SALOON));
    public static final Object d = r0.k(new Pair("LESS_THAN_1000", o0.LESS_THAN_1000), new Pair("FROM_1000_TO_5000", o0.FROM_1000_TO_5000), new Pair("FROM_5000_TO_25000", o0.FROM_5000_TO_25000), new Pair("FROM_25000_TO_50000", o0.FROM_25000_TO_50000), new Pair("FROM_50000_TO_75000", o0.FROM_50000_TO_75000), new Pair("FROM_75000_TO_100000", o0.FROM_75000_TO_100000), new Pair("MORE_THAN_100000", o0.MORE_THAN_100000));

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    public static final InsurableCar a(m0 m0Var) {
        m2 m2Var;
        s0 s0Var;
        CarManualInput carManualInput;
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTime2;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String str = m0Var.f153200a;
        String str2 = m0Var.f153201b;
        String str3 = m0Var.f153202c;
        int i = m0Var.d;
        String str4 = m0Var.e;
        if (str4 != null) {
            s0Var = (s0) u1.v(str4, f175621a);
            m2Var = null;
        } else {
            m2Var = null;
            s0Var = null;
        }
        String str5 = m0Var.f153203g;
        String str6 = m0Var.f;
        m2 m2Var2 = str6 != null ? (m2) u1.v(str6, f175622b) : m2Var;
        Integer num = m0Var.f153204h;
        Boolean bool = m0Var.i;
        Boolean bool2 = m0Var.f153205j;
        d5 d5Var = m0Var.k;
        if (d5Var != null) {
            Intrinsics.checkNotNullParameter(d5Var, "<this>");
            String str7 = d5Var.f153062a;
            wi0.a aVar = wi0.b.Companion;
            String str8 = d5Var.f153064c;
            aVar.getClass();
            carManualInput = new CarManualInput(str7, wi0.a.a(str8), d5Var.d, d5Var.e, d5Var.f, d5Var.f153065g, d5Var.f153066h, d5Var.i);
        } else {
            carManualInput = null;
        }
        Boolean bool3 = m0Var.f153206l;
        String str9 = m0Var.f153207m;
        o0 o0Var = str9 != null ? (o0) u1.v(str9, d) : null;
        String str10 = m0Var.f153208n;
        if (str10 != null) {
            Intrinsics.checkNotNullParameter(str10, "<this>");
            zonedDateTime = ZonedDateTime.parse(str10);
        } else {
            zonedDateTime = null;
        }
        String str11 = m0Var.o;
        if (str11 != null) {
            Intrinsics.checkNotNullParameter(str11, "<this>");
            zonedDateTime2 = ZonedDateTime.parse(str11);
        } else {
            zonedDateTime2 = null;
        }
        return new InsurableCar(str, str5, str2, str3, i, s0Var, m2Var2, num, bool, bool2, carManualInput, bool3, o0Var, zonedDateTime, zonedDateTime2);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public static final m0 b(InsurableCar insurableCar) {
        String strG;
        String str;
        d5 d5Var;
        String strG2;
        Intrinsics.checkNotNullParameter(insurableCar, "<this>");
        String str2 = insurableCar.f75226a;
        String str3 = insurableCar.f75228c;
        String str4 = insurableCar.d;
        int i = insurableCar.e;
        s0 s0Var = insurableCar.f;
        String strG3 = s0Var != null ? u1.g(s0Var, f175621a) : null;
        String str5 = insurableCar.f75227b;
        m2 m2Var = insurableCar.f75229g;
        if (m2Var != null) {
            Intrinsics.checkNotNullParameter(m2Var, "<this>");
            strG = u1.g(m2Var, f175622b);
        } else {
            strG = null;
        }
        Integer num = insurableCar.f75230h;
        Boolean bool = insurableCar.i;
        Boolean bool2 = insurableCar.f75231j;
        CarManualInput carManualInput = insurableCar.k;
        if (carManualInput != null) {
            int i2 = insurableCar.e;
            Intrinsics.checkNotNullParameter(carManualInput, "<this>");
            str = strG3;
            d5Var = new d5(carManualInput.f75187a, i2, carManualInput.f75188b.f297794a, carManualInput.f75189c, carManualInput.d, carManualInput.e, carManualInput.f, carManualInput.f75190g, carManualInput.f75191h);
        } else {
            str = strG3;
            d5Var = null;
        }
        Boolean bool3 = insurableCar.f75232l;
        o0 o0Var = insurableCar.f75233m;
        if (o0Var != null) {
            Intrinsics.checkNotNullParameter(o0Var, "<this>");
            strG2 = u1.g(o0Var, d);
        } else {
            strG2 = null;
        }
        ZonedDateTime zonedDateTime = insurableCar.f75234n;
        String strR = zonedDateTime != null ? cp5.c.R(zonedDateTime) : null;
        ZonedDateTime zonedDateTime2 = insurableCar.o;
        return new m0(str2, str3, str4, i, str, strG, str5, num, bool, bool2, d5Var, bool3, strG2, strR, zonedDateTime2 != null ? cp5.c.R(zonedDateTime2) : null);
    }
}
