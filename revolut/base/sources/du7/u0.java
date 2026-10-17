package du7;

import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f117859g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117862c;
    public final String d;
    public final List e;
    public final SchemeInsurancePortal f;

    public u0(String type, String str, String str2, String str3, List list, SchemeInsurancePortal schemeInsurancePortal, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        list = (i & 16) != 0 ? null : list;
        schemeInsurancePortal = (i & 32) != 0 ? null : schemeInsurancePortal;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f117860a = type;
        this.f117861b = str;
        this.f117862c = str2;
        this.d = str3;
        this.e = list;
        this.f = schemeInsurancePortal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f117860a, u0Var.f117860a) && Intrinsics.f(this.f117861b, u0Var.f117861b) && Intrinsics.f(this.f117862c, u0Var.f117862c) && Intrinsics.f(this.d, u0Var.d) && Intrinsics.f(this.e, u0Var.e) && Intrinsics.f(this.f, u0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f117860a.hashCode() * 31;
        String str = this.f117861b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117862c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        SchemeInsurancePortal schemeInsurancePortal = this.f;
        return iHashCode5 + (schemeInsurancePortal != null ? schemeInsurancePortal.hashCode() : 0);
    }

    public /* synthetic */ u0(int i, String str, String str2, String str3, String str4, List list, SchemeInsurancePortal schemeInsurancePortal) {
        if (1 != (i & 1)) {
            qlm.j1.f(s0.f117834a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117860a = str;
        if ((i & 2) == 0) {
            this.f117861b = null;
        } else {
            this.f117861b = str2;
        }
        if ((i & 4) == 0) {
            this.f117862c = null;
        } else {
            this.f117862c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = schemeInsurancePortal;
        }
    }
}
