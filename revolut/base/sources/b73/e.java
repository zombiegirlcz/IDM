package b73;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f12870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f12872c;

    public e(Data domainContent, Data ownersFirstNamesContent, String str) {
        Intrinsics.checkNotNullParameter(domainContent, "domainContent");
        Intrinsics.checkNotNullParameter(ownersFirstNamesContent, "ownersFirstNamesContent");
        this.f12870a = domainContent;
        this.f12871b = str;
        this.f12872c = ownersFirstNamesContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f12870a, eVar.f12870a) && Intrinsics.f(this.f12871b, eVar.f12871b) && Intrinsics.f(this.f12872c, eVar.f12872c);
    }

    public final int hashCode() {
        int iHashCode = this.f12870a.hashCode() * 31;
        String str = this.f12871b;
        return this.f12872c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
