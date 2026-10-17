package jl7;

import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import com.revolut.feature.insurance_car.impl.data.model.FailedPaymentDetails;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.PaymentAmount;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.insurance_car.impl.data.model.RenewalDetails;
import hl7.d0;
import hl7.h6;
import hl7.l7;
import hl7.q3;
import hl7.y8;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kl7.f1;
import kl7.l1;
import kl7.m1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175630a = r0.k(new Pair("ACTIVE", m1.ACTIVE), new Pair("CANCELLED", m1.CANCELLED), new Pair("CANCELLING", m1.CANCELLING), new Pair("INACTIVE", m1.INACTIVE), new Pair("INITIALISING", m1.INITIALISING), new Pair("LAPSED", m1.LAPSED));

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final Policy a(l7 l7Var) {
        String str;
        CancellationDetails cancellationDetails;
        FailedPaymentDetails failedPaymentDetails;
        InsurableCar insurableCar;
        m1 m1Var;
        RenewalDetails renewalDetails;
        RenewalDetails.Status status;
        l1 l1Var;
        Intrinsics.checkNotNullParameter(l7Var, "<this>");
        String str2 = l7Var.f153187a;
        InsurableCar insurableCarA = f.a(l7Var.f153188b);
        m1 m1Var2 = (m1) u1.v(l7Var.f153189c, f175630a);
        if (m1Var2 == null) {
            return null;
        }
        String str3 = l7Var.d;
        String str4 = l7Var.e;
        String str5 = l7Var.f;
        Intrinsics.checkNotNullParameter(str5, "<this>");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(str5);
        Intrinsics.checkNotNullExpressionValue(zonedDateTime, "toDateTime(...)");
        String str6 = l7Var.f153190g;
        Intrinsics.checkNotNullParameter(str6, "<this>");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(str6);
        Intrinsics.checkNotNullExpressionValue(zonedDateTime2, "toDateTime(...)");
        String str7 = l7Var.f153191h;
        LocalDate localDate = str7 != null ? LocalDate.parse(str7) : null;
        LocalDate localDate2 = LocalDate.parse(l7Var.i);
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        d0 d0Var = l7Var.f153192j;
        if (d0Var != null) {
            Object obj2 = e.f175620a;
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            ZonedDateTime zonedDateTime3 = ZonedDateTime.parse(d0Var.f153055a);
            Intrinsics.checkNotNullExpressionValue(zonedDateTime3, "parse(...)");
            String str8 = d0Var.f153056b;
            str = str2;
            if (str8 == null || (l1Var = (l1) u1.v(str8, e.f175620a)) == null) {
                l1Var = l1.NONE;
            }
            cancellationDetails = new CancellationDetails(zonedDateTime3, l1Var, d0Var.f153057c, d0Var.d);
        } else {
            str = str2;
            cancellationDetails = null;
        }
        q3 q3Var = l7Var.k;
        if (q3Var != null) {
            Intrinsics.checkNotNullParameter(q3Var, "<this>");
            LocalDate localDate3 = LocalDate.parse(q3Var.f153265a);
            Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
            failedPaymentDetails = new FailedPaymentDetails(q3Var.f153266b, localDate3);
        } else {
            failedPaymentDetails = null;
        }
        y8 y8Var = l7Var.f153193l;
        if (y8Var != null) {
            Intrinsics.checkNotNullParameter(y8Var, "<this>");
            String str9 = y8Var.f153381a;
            String str10 = y8Var.f153382b;
            RenewalDetails.Status[] statusArrValues = RenewalDetails.Status.values();
            int length = statusArrValues.length;
            insurableCar = insurableCarA;
            int i = 0;
            while (true) {
                if (i >= length) {
                    m1Var = m1Var2;
                    status = null;
                    break;
                }
                RenewalDetails.Status status2 = statusArrValues[i];
                int i2 = i;
                m1Var = m1Var2;
                if (a0.z(status2.name(), str10, true)) {
                    status = status2;
                    break;
                }
                i = i2 + 1;
                m1Var2 = m1Var;
            }
            if (status == null) {
                status = RenewalDetails.Status.OFFERED;
            }
            renewalDetails = new RenewalDetails(str9, status);
        } else {
            insurableCar = insurableCarA;
            m1Var = m1Var2;
            renewalDetails = null;
        }
        h6 h6Var = l7Var.f153194m;
        Intrinsics.checkNotNullParameter(h6Var, "<this>");
        String str11 = h6Var.f153128a;
        Object obj3 = j.f175628a;
        Intrinsics.checkNotNullParameter(str11, "<this>");
        f1 f1Var = (f1) u1.v(str11, j.f175628a);
        if (f1Var != null) {
            return new Policy(str, insurableCar, m1Var, str3, str4, zonedDateTime, zonedDateTime2, localDate, localDate2, cancellationDetails, failedPaymentDetails, renewalDetails, new PaymentAmount(f1Var, h6Var.f153129b), l7Var.f153195n, l7Var.o);
        }
        throw new IllegalStateException("frequency can not be null");
    }
}
