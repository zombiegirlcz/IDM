package pa8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f234437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f234438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f234439c;

    public e(Data juniorProfile, Data taxResidencies, Data tinRequiredAgeData) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(tinRequiredAgeData, "tinRequiredAgeData");
        this.f234437a = juniorProfile;
        this.f234438b = taxResidencies;
        this.f234439c = tinRequiredAgeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f234437a, eVar.f234437a) && Intrinsics.f(this.f234438b, eVar.f234438b) && Intrinsics.f(this.f234439c, eVar.f234439c);
    }

    public final int hashCode() {
        return this.f234439c.hashCode() + kii.e.c(this.f234438b, this.f234437a.hashCode() * 31, 31);
    }
}
