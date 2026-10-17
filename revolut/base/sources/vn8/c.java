package vn8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f290770c;
    public final Integer d;
    public final List e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f290771g;

    public c(String str, int i, int i2, Integer num, int i3) {
        this(str, i, i2, (i3 & 8) != 0 ? null : num, f0.f322471a, null, null);
    }

    public final Integer a(JuniorBankingProfile juniorProfile) {
        Object next;
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Iterator it8 = this.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Boolean) ((d) next).f290772a.invoke(juniorProfile)).booleanValue()) {
                break;
            }
        }
        d dVar = (d) next;
        return dVar != null ? Integer.valueOf(dVar.f290773b) : this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f290768a, cVar.f290768a) && this.f290769b == cVar.f290769b && this.f290770c == cVar.f290770c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f290771g, cVar.f290771g);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f290770c, j6.a.b(this.f290769b, this.f290768a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        int iD = p.a.d((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        Integer num2 = this.f;
        int iHashCode = (iD + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f290771g;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public c(String id10, int i, int i2, Integer num, List descriptionPricedOverrides, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptionPricedOverrides, "descriptionPricedOverrides");
        this.f290768a = id10;
        this.f290769b = i;
        this.f290770c = i2;
        this.d = num;
        this.e = descriptionPricedOverrides;
        this.f = num2;
        this.f290771g = num3;
    }
}
