package cp7;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationForm f107889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationForm f107890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f107891c;
    public final Address d;
    public final boolean e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f107892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f107893h;

    public e(ApplicationForm other, ApplicationForm currentForm, Address address, Address address2, boolean z) {
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(other, "initialForm");
        Intrinsics.checkNotNullParameter(currentForm, "currentForm");
        this.f107889a = other;
        this.f107890b = currentForm;
        this.f107891c = address;
        this.d = address2;
        this.e = z;
        Intrinsics.checkNotNullParameter(currentForm, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        InsurableCar insurableCar = currentForm.f75168c;
        InsurableCar insurableCar2 = other.f75168c;
        Survey survey = other.d;
        boolean z6 = !Intrinsics.f(insurableCar, insurableCar2);
        Survey survey2 = currentForm.d;
        boolean z11 = !Intrinsics.f(survey2 != null ? survey2.f75314a : null, survey != null ? survey.f75314a : null);
        if ((survey2 != null ? survey2.f : null) != (survey != null ? survey.f : null)) {
            z3 = z11;
            z4 = true;
        } else {
            z3 = z11;
            z4 = false;
        }
        boolean z12 = !Intrinsics.f(survey2 != null ? survey2.f75315b : null, survey != null ? survey.f75315b : null);
        boolean z29 = !Intrinsics.f(survey2 != null ? survey2.f75316c : null, survey != null ? survey.f75316c : null);
        boolean z31 = !Intrinsics.f(survey2 != null ? survey2.d : null, survey != null ? survey.d : null);
        boolean z41 = !Intrinsics.f(survey2 != null ? survey2.e : null, survey != null ? survey.e : null);
        boolean z49 = !Intrinsics.f(currentForm.e, other.e);
        boolean z54 = !Intrinsics.f(currentForm.f75167b, other.f75167b);
        boolean z74 = !Intrinsics.f(currentForm.f, other.f);
        boolean z83 = z3;
        a aVar = new a(z6, z83, z4, z12, z29, z31, z41, z49, z54, z74);
        this.f = aVar;
        boolean z89 = !Intrinsics.f(address2, address);
        this.f107892g = z89;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Boolean[] elements = {Boolean.valueOf(z6), Boolean.valueOf(z83), Boolean.valueOf(z4), Boolean.valueOf(z12), Boolean.valueOf(z29), Boolean.valueOf(z31), Boolean.valueOf(z41), Boolean.valueOf(z49), Boolean.valueOf(z54), Boolean.valueOf(z74), Boolean.valueOf(z89)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.E(elements).iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (((Boolean) it8.next()).booleanValue() && (i = i + 1) < 0) {
                v.r();
                throw null;
            }
        }
        this.f107893h = i;
    }

    public static e a(e eVar, ApplicationForm applicationForm, Address address, Address address2, int i) {
        ApplicationForm initialForm = eVar.f107889a;
        if ((i & 2) != 0) {
            applicationForm = eVar.f107890b;
        }
        ApplicationForm currentForm = applicationForm;
        if ((i & 4) != 0) {
            address = eVar.f107891c;
        }
        Address address3 = address;
        if ((i & 8) != 0) {
            address2 = eVar.d;
        }
        boolean z = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(initialForm, "initialForm");
        Intrinsics.checkNotNullParameter(currentForm, "currentForm");
        return new e(initialForm, currentForm, address3, address2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f107889a, eVar.f107889a) && Intrinsics.f(this.f107890b, eVar.f107890b) && Intrinsics.f(this.f107891c, eVar.f107891c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f107890b.hashCode() + (this.f107889a.hashCode() * 31)) * 31;
        Address address = this.f107891c;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (address2 != null ? address2.hashCode() : 0)) * 31);
    }
}
