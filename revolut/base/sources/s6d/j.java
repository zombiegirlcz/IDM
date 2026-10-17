package s6d;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f260240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f260241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260242c;
    public final k6d.j d;
    public final Address e;
    public final String f;

    public j(Data brandingSettingsData, boolean z, List allowedPaymentMethods, k6d.j jVar, Address address, String dataId) {
        Intrinsics.checkNotNullParameter(brandingSettingsData, "brandingSettingsData");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        this.f260240a = brandingSettingsData;
        this.f260241b = z;
        this.f260242c = allowedPaymentMethods;
        this.d = jVar;
        this.e = address;
        this.f = dataId;
    }

    public static j a(j jVar, Data data, boolean z, List list, k6d.j jVar2, Address address, String str, int i) {
        jVar.getClass();
        if ((i & 2) != 0) {
            data = jVar.f260240a;
        }
        Data brandingSettingsData = data;
        if ((i & 4) != 0) {
            z = jVar.f260241b;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            list = jVar.f260242c;
        }
        List allowedPaymentMethods = list;
        if ((i & 16) != 0) {
            jVar2 = jVar.d;
        }
        k6d.j jVar3 = jVar2;
        if ((i & 32) != 0) {
            address = jVar.e;
        }
        Address address2 = address;
        if ((i & 64) != 0) {
            str = jVar.f;
        }
        String dataId = str;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(brandingSettingsData, "brandingSettingsData");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new j(brandingSettingsData, z3, allowedPaymentMethods, jVar3, address2, dataId);
    }

    public final String c() {
        k6d.c cVar;
        k6d.h hVar = (k6d.h) this.f260240a.getContent();
        if (hVar == null || (cVar = hVar.f181689h) == null) {
            return null;
        }
        return cVar.f181683b;
    }

    public final String e() {
        k6d.h hVar = (k6d.h) this.f260240a.getContent();
        String str = hVar != null ? hVar.f181686b : null;
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f260240a, jVar.f260240a) && this.f260241b == jVar.f260241b && Intrinsics.f(this.f260242c, jVar.f260242c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final String f() {
        k6d.c cVar;
        k6d.h hVar = (k6d.h) this.f260240a.getContent();
        if (hVar == null || (cVar = hVar.i) == null) {
            return null;
        }
        return cVar.f181683b;
    }

    public final boolean g() {
        k6d.h hVar = (k6d.h) this.f260240a.getContent();
        if (hVar != null) {
            return hVar.f181688g;
        }
        return false;
    }

    public final boolean h() {
        k6d.h hVar = (k6d.h) this.f260240a.getContent();
        if (hVar != null) {
            return hVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(kii.e.c(this.f260240a, Boolean.hashCode(false) * 31, 31), 31, this.f260241b), 31, this.f260242c);
        k6d.j jVar = this.d;
        int iHashCode = (iD + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Address address = this.e;
        return this.f.hashCode() + ((iHashCode + (address != null ? address.hashCode() : 0)) * 31);
    }
}
