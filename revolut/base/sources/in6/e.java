package in6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitution f162668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho3.a f162669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162670c;

    public e(ExternalInstitution institution, ho3.a aVar, String str) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f162668a = institution;
        this.f162669b = aVar;
        this.f162670c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162668a, eVar.f162668a) && Intrinsics.f(this.f162669b, eVar.f162669b) && Intrinsics.f(this.f162670c, eVar.f162670c);
    }

    public final int hashCode() {
        int iHashCode = this.f162668a.hashCode() * 31;
        ho3.a aVar = this.f162669b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f162670c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
